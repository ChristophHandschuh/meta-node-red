# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Low-code programming for event-driven applications"
HOMEPAGE = "http://nodered.org"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/@mapbox/node-pre-gyp/LICENSE
#   node_modules/@node-red/editor-client/public/vendor/ace/LICENSE
#   node_modules/@node-red/editor-client/public/vendor/monaco/dist/css.worker.js.LICENSE.txt
#   node_modules/@node-red/editor-client/public/vendor/monaco/dist/editor.js.LICENSE.txt
#   node_modules/@node-red/editor-client/public/vendor/monaco/dist/html.worker.js.LICENSE.txt
#   node_modules/@node-red/editor-client/public/vendor/monaco/dist/json.worker.js.LICENSE.txt
#   node_modules/@node-red/editor-client/public/vendor/monaco/dist/ts.worker.js.LICENSE.txt
#   node_modules/abbrev/LICENSE
#   node_modules/are-we-there-yet/LICENSE.md
#   node_modules/argparse/LICENSE
#   node_modules/bcryptjs/LICENSE
#   node_modules/bl/LICENSE.md
#   node_modules/cheerio-select/LICENSE
#   node_modules/colors/MIT-LICENSE.txt
#   node_modules/css-select/LICENSE
#   node_modules/css-what/LICENSE
#   node_modules/domelementtype/LICENSE
#   node_modules/domhandler/LICENSE
#   node_modules/domutils/LICENSE
#   node_modules/entities/LICENSE
#   node_modules/fs.realpath/LICENSE
#   node_modules/glob/LICENSE
#   node_modules/lodash.clonedeep/LICENSE
#   node_modules/minizlib/LICENSE
#   node_modules/mqtt-packet/LICENSE.md
#   node_modules/mqtt/LICENSE.md
#   node_modules/multer/node_modules/readable-stream/LICENSE
#   node_modules/multer/node_modules/string_decoder/LICENSE
#   node_modules/node-addon-api/LICENSE.md
#   node_modules/nth-check/LICENSE
#   node_modules/readable-stream/LICENSE
#   node_modules/sax/LICENSE
#   node_modules/string_decoder/LICENSE
#   node_modules/tough-cookie/LICENSE
#   node_modules/typedarray/LICENSE
#   node_modules/uri-js/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "0BSD & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & ISC & MIT & Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=014f1a23c3da49aa929b21a96808ab22 \
                    file://node_modules/@babel/runtime/LICENSE;md5=b1d0cd283a346e919abb3beeb018279d \
                    file://node_modules/@mapbox/node-pre-gyp/LICENSE;md5=7e13c3cf883a44ebcc74a8f568c0f6fb \
                    file://node_modules/@node-red/editor-api/LICENSE;md5=014f1a23c3da49aa929b21a96808ab22 \
                    file://node_modules/@node-red/editor-client/LICENSE;md5=014f1a23c3da49aa929b21a96808ab22 \
                    file://node_modules/@node-red/editor-client/public/vendor/ace/LICENSE;md5=794d11c5219c59c9efa2487c2b4066b2 \
                    file://node_modules/@node-red/editor-client/public/vendor/monaco/dist/LICENSE;md5=f54bb2c6fe5e92709d134914191197a3 \
                    file://node_modules/@node-red/editor-client/public/vendor/monaco/dist/css.worker.js.LICENSE.txt;md5=19d04d3eb985ef659c0628e55d5eb9fc \
                    file://node_modules/@node-red/editor-client/public/vendor/monaco/dist/editor.js.LICENSE.txt;md5=b61e862cbca5f3263c1b17baa2ae620d \
                    file://node_modules/@node-red/editor-client/public/vendor/monaco/dist/html.worker.js.LICENSE.txt;md5=19d04d3eb985ef659c0628e55d5eb9fc \
                    file://node_modules/@node-red/editor-client/public/vendor/monaco/dist/json.worker.js.LICENSE.txt;md5=19d04d3eb985ef659c0628e55d5eb9fc \
                    file://node_modules/@node-red/editor-client/public/vendor/monaco/dist/theme/LICENSE;md5=280545e7ad0c4af4a6c0e737934a23b2 \
                    file://node_modules/@node-red/editor-client/public/vendor/monaco/dist/ts.worker.js.LICENSE.txt;md5=19d04d3eb985ef659c0628e55d5eb9fc \
                    file://node_modules/@node-red/nodes/LICENSE;md5=014f1a23c3da49aa929b21a96808ab22 \
                    file://node_modules/@node-red/registry/LICENSE;md5=014f1a23c3da49aa929b21a96808ab22 \
                    file://node_modules/@node-red/runtime/LICENSE;md5=014f1a23c3da49aa929b21a96808ab22 \
                    file://node_modules/@node-red/util/LICENSE;md5=014f1a23c3da49aa929b21a96808ab22 \
                    file://node_modules/@sindresorhus/is/license;md5=d5f2a6dd0192dcc7c833e50bb9017337 \
                    file://node_modules/@szmarczak/http-timer/LICENSE;md5=78fd36a7284eb85369521bcb6e863186 \
                    file://node_modules/@types/cacheable-request/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/http-cache-semantics/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/keyv/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/node/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/responselike/LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5 \
                    file://node_modules/abbrev/LICENSE;md5=e9c0b639498fbe60d17b10099aba77c0 \
                    file://node_modules/accepts/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/acorn-walk/LICENSE;md5=33e8b86a084578431a31c72608f226b8 \
                    file://node_modules/acorn/LICENSE;md5=6e381572c3ee395547475a1464db5060 \
                    file://node_modules/agent-base/node_modules/debug/LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0 \
                    file://node_modules/agent-base/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/ajv/LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926 \
                    file://node_modules/ansi-colors/LICENSE;md5=442b5b961878bc805832d1d24572f62d \
                    file://node_modules/ansi-regex/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/append-field/LICENSE;md5=5c090f9df283eefdcea00b2f0766ca6c \
                    file://node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/are-we-there-yet/LICENSE.md;md5=1750b360daee1aa920366e344c1b0c57 \
                    file://node_modules/argparse/LICENSE;md5=203a6dbc802ee896020a47161e759642 \
                    file://node_modules/array-flatten/LICENSE;md5=44088ba57cb871a58add36ce51b8de08 \
                    file://node_modules/async-mutex/LICENSE;md5=2bed63242f12f0617c19f2f6ceafab6f \
                    file://node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://node_modules/axios/LICENSE;md5=61ca8e74b70ea19443b95af4bd607999 \
                    file://node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/base64-js/LICENSE;md5=ea9187ca93cdc4f71219d1675712e908 \
                    file://node_modules/basic-auth/LICENSE;md5=42fffe6fe0b70501d52150ebb52113df \
                    file://node_modules/bcrypt/LICENSE;md5=4665b5424ab734549385bae891f8d35d \
                    file://node_modules/bcryptjs/LICENSE;md5=d99a4f4253fea793a1256aef626aa6e5 \
                    file://node_modules/bl/LICENSE.md;md5=455bc3781a009cf9a615e8622138814c \
                    file://node_modules/body-parser/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/body-parser/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/buffer-from/LICENSE;md5=46513463e8f7d9eb671a243f0083b2c6 \
                    file://node_modules/buffer/LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0 \
                    file://node_modules/busboy/LICENSE;md5=df3ad145c2acbfc4f246fa834a6675c7 \
                    file://node_modules/bytes/LICENSE;md5=013e95467eddb048f19a6f5b42820f86 \
                    file://node_modules/cacheable-lookup/LICENSE;md5=23a0ab677f942ddc394168925c5a9328 \
                    file://node_modules/cacheable-request/LICENSE;md5=9a2baa6947d5018096b83508bd94026e \
                    file://node_modules/call-bind/LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5 \
                    file://node_modules/cheerio-select/LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11 \
                    file://node_modules/cheerio/LICENSE;md5=476b795003456b2ff8c5a905d5829955 \
                    file://node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/cli-table/LICENSE;md5=7426c3e07cd555a7113d8e4740f8bf6a \
                    file://node_modules/clone-response/LICENSE;md5=9a2baa6947d5018096b83508bd94026e \
                    file://node_modules/clone/LICENSE;md5=411e33109fa516d190d232100fdc7f8e \
                    file://node_modules/color-support/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/colors/MIT-LICENSE.txt;md5=5bc6c72caa0dcc082d24a52a6ae12112 \
                    file://node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/commist/LICENSE;md5=3f047b8c72633e56a5d2bddc7feaa719 \
                    file://node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/console-control-strings/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/content-disposition/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/content-disposition/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/content-type/LICENSE;md5=f4b767f006864f81a4901347fe4efdab \
                    file://node_modules/cookie-parser/LICENSE;md5=720bd7b9472a2297cd6820c73c71cf3e \
                    file://node_modules/cookie-parser/node_modules/cookie/LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca \
                    file://node_modules/cookie/LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca \
                    file://node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/cors/LICENSE;md5=947eb5e695dade432a500b12c510de85 \
                    file://node_modules/cronosjs/LICENSE;md5=364202e8ebc58122042346798591bff7 \
                    file://node_modules/css-select/LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11 \
                    file://node_modules/css-what/LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/decompress-response/license;md5=d5f2a6dd0192dcc7c833e50bb9017337 \
                    file://node_modules/decompress-response/node_modules/mimic-response/license;md5=d5f2a6dd0192dcc7c833e50bb9017337 \
                    file://node_modules/defer-to-connect/LICENSE;md5=78fd36a7284eb85369521bcb6e863186 \
                    file://node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/delegates/License;md5=039225978c07bc42e8c0ef2f72b81c09 \
                    file://node_modules/denque/LICENSE;md5=f49b524d140e2dcf1b437d9185172531 \
                    file://node_modules/depd/LICENSE;md5=ebc30494fd072dc98368da73e1821715 \
                    file://node_modules/destroy/LICENSE;md5=d5eb22cf6cc99e645b98b28ee3503ddf \
                    file://node_modules/detect-libc/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://node_modules/dom-serializer/LICENSE;md5=ba3390a22fe1d127f3522ac8ef1bd1a0 \
                    file://node_modules/domelementtype/LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11 \
                    file://node_modules/domhandler/LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11 \
                    file://node_modules/domutils/LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11 \
                    file://node_modules/duplexify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/ee-first/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/emoji-regex/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/encodeurl/LICENSE;md5=272621efa0ff4f18a73221e49ab60654 \
                    file://node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/enquirer/LICENSE;md5=62927f9e287cbc1dbddd9c8f208b7cdb \
                    file://node_modules/entities/LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11 \
                    file://node_modules/escape-html/LICENSE;md5=f8746101546eeb9e4f6de64bb8bdf595 \
                    file://node_modules/etag/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/express-session/LICENSE;md5=23efdb85883c5cc9b6cc5b0456666a2b \
                    file://node_modules/express-session/node_modules/cookie/LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca \
                    file://node_modules/express-session/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/express/LICENSE;md5=5513c00a5c36cd361da863dd9aa8875d \
                    file://node_modules/express/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/fast-deep-equal/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/finalhandler/LICENSE;md5=462b10b32bb9175b97944aabef4aa171 \
                    file://node_modules/follow-redirects/LICENSE;md5=2913574e921aefe1275cd5864b4f9b66 \
                    file://node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/forwarded/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/fresh/LICENSE;md5=373c2cf0978b37e434394a43b4cbbdb4 \
                    file://node_modules/fs-extra/LICENSE;md5=ea817882455c03503f7d014a8f54f095 \
                    file://node_modules/fs-minipass/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/function-bind/LICENSE;md5=e7417c1a8ad83f88bcac21ad440d48b2 \
                    file://node_modules/gauge/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/get-intrinsic/LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5 \
                    file://node_modules/get-stream/license;md5=d5f2a6dd0192dcc7c833e50bb9017337 \
                    file://node_modules/glob/LICENSE;md5=c727d36f28f2762b1011dd483aa1a191 \
                    file://node_modules/got/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/graceful-fs/LICENSE;md5=163972d49c2f7a3d3b687aeb48e9e3c9 \
                    file://node_modules/has-proto/LICENSE;md5=d237eac07663bde2409de740ba75ec97 \
                    file://node_modules/has-symbols/LICENSE;md5=afee57a289508ed4df3456667778aaf6 \
                    file://node_modules/has-unicode/LICENSE;md5=2bab5b1c26e9c44fc4e489bb98cfb196 \
                    file://node_modules/has/LICENSE-MIT;md5=d000afc3c9ff3501a5610197db76a246 \
                    file://node_modules/hash-sum/license;md5=06049b6eb5e43aafd8fe7c733d033646 \
                    file://node_modules/help-me/LICENSE;md5=6c5e18034ed4abefcb9ac97254596680 \
                    file://node_modules/hpagent/LICENSE;md5=6b1a33a7ee2baee18174a3db1ec2138f \
                    file://node_modules/htmlparser2/LICENSE;md5=10e03952c97f225d4229d7524619eb7f \
                    file://node_modules/http-cache-semantics/LICENSE;md5=7b7cd412797b9e24e3c58eff96661bf9 \
                    file://node_modules/http-errors/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/http2-wrapper/LICENSE;md5=78fd36a7284eb85369521bcb6e863186 \
                    file://node_modules/https-proxy-agent/node_modules/debug/LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0 \
                    file://node_modules/https-proxy-agent/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/i18next/LICENSE;md5=5104d4d3d0668e37c3e33810f72e4f32 \
                    file://node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/ieee754/LICENSE;md5=56c3be003027d64d24ca6b69a2612f2f \
                    file://node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/ipaddr.js/LICENSE;md5=88f60a4b6e44cb849b5d907a7664c0ef \
                    file://node_modules/is-fullwidth-code-point/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/is-utf8/LICENSE;md5=10d1495ba46609e55e586ab71fa81f45 \
                    file://node_modules/js-sdsl/LICENSE;md5=767604b1ed08213fd284407d38e9eec2 \
                    file://node_modules/js-yaml/LICENSE;md5=effd621a9bf5d72d6a7e6ef819bf3afb \
                    file://node_modules/json-buffer/LICENSE;md5=f26ea3f2a31273ebd199d933804f5e8b \
                    file://node_modules/json-schema-traverse/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/jsonata/LICENSE;md5=0a2fefbb55a84675607e8efd57183e99 \
                    file://node_modules/jsonfile/LICENSE;md5=423f377ade95936f6fe009b1c137bfdb \
                    file://node_modules/leven/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/lodash.clonedeep/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/lowercase-keys/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/make-dir/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/make-dir/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/media-typer/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/memorystore/LICENSE;md5=3c97a7f1928df131f083f488a42c41b7 \
                    file://node_modules/memorystore/node_modules/debug/LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0 \
                    file://node_modules/memorystore/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/merge-descriptors/LICENSE;md5=aaf57ba8c5c9bf256fea7e943991a81a \
                    file://node_modules/methods/LICENSE;md5=c16a7dd9f946172f07086576d135d9d3 \
                    file://node_modules/mime-db/LICENSE;md5=175b28b58359f8b4a969c9ab7c828445 \
                    file://node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/mime/LICENSE;md5=8e8ea2ad138ce468f8570a0edbadea65 \
                    file://node_modules/mimic-response/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/minipass/LICENSE;md5=78e0c554693f15c5d2e74a90dfef3816 \
                    file://node_modules/minipass/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/minizlib/LICENSE;md5=d8a0ca0c46bfa01db064fa836f550966 \
                    file://node_modules/minizlib/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/moment-timezone/LICENSE;md5=f51212467d7a94e1583a4cff9492bd80 \
                    file://node_modules/moment/LICENSE;md5=397bb5fedab22612d8d69f1458a9321e \
                    file://node_modules/mqtt-packet/LICENSE.md;md5=622e77e45833bb4f785aebc7e41c0bdb \
                    file://node_modules/mqtt-packet/node_modules/debug/LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0 \
                    file://node_modules/mqtt-packet/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/mqtt/LICENSE.md;md5=261aa46f11e9a7bdbea1dea7eb8bcb6c \
                    file://node_modules/mqtt/node_modules/debug/LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0 \
                    file://node_modules/mqtt/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/mqtt/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/mqtt/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/multer/LICENSE;md5=039580279923334e9eaeb656c54e6039 \
                    file://node_modules/multer/node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/multer/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/multer/node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/mustache/LICENSE;md5=33fa3c7f27611cfb1191e5aa2bb107b1 \
                    file://node_modules/mute-stream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/negotiator/LICENSE;md5=6417a862a5e35c17c904d9dda2cbd499 \
                    file://node_modules/node-addon-api/LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a \
                    file://node_modules/node-fetch/LICENSE.md;md5=89fabe2fb10f72e48c2b3be506237d1e \
                    file://node_modules/node-red-admin/LICENSE;md5=2ee41112a44fe7014dce33e26468ba93 \
                    file://node_modules/node-watch/LICENSE;md5=45f58283bc015e07b9cd1378c52bec29 \
                    file://node_modules/nopt/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/normalize-url/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npmlog/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/nth-check/LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11 \
                    file://node_modules/number-allocator/LICENSE;md5=ceff88c0907db57b52716bb46eeaaa2a \
                    file://node_modules/number-allocator/node_modules/debug/LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0 \
                    file://node_modules/number-allocator/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/oauth2orize/LICENSE;md5=a8bb4f4cb5363bb836b78892cd0afc31 \
                    file://node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/object-inspect/LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f \
                    file://node_modules/on-finished/LICENSE;md5=1b1f7f9cec194121fdf616b971df7a7b \
                    file://node_modules/on-headers/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/p-cancelable/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/parse5-htmlparser2-tree-adapter/LICENSE;md5=179850e04995d6fceaf64f2dd2a851b0 \
                    file://node_modules/parse5/LICENSE;md5=179850e04995d6fceaf64f2dd2a851b0 \
                    file://node_modules/parseurl/LICENSE;md5=e7842ed4f188e53e53c3e8d9c4807e89 \
                    file://node_modules/passport-http-bearer/LICENSE;md5=f694b9c022a5bf0f2c3976a047fed39c \
                    file://node_modules/passport-oauth2-client-password/LICENSE;md5=95ca2874231d1b4d06ca94c35aa604f7 \
                    file://node_modules/passport-strategy/LICENSE;md5=f694b9c022a5bf0f2c3976a047fed39c \
                    file://node_modules/passport/LICENSE;md5=c938fd0af4a4585702899b6a50a928f2 \
                    file://node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/path-to-regexp/LICENSE;md5=44088ba57cb871a58add36ce51b8de08 \
                    file://node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/proxy-addr/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/pseudomap/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/psl/LICENSE;md5=2425d288296fae32e27553694ff40294 \
                    file://node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/qs/LICENSE.md;md5=b289135779dd930509ae81e6041690c0 \
                    file://node_modules/quick-lru/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/random-bytes/LICENSE;md5=65cf5baa33cf259f107bbfc965d9f8a0 \
                    file://node_modules/range-parser/LICENSE;md5=d4246fb961a4f121eef5ffca47f0b010 \
                    file://node_modules/raw-body/LICENSE;md5=f22163d3bc6b4bc1bbbdf654fe30af5b \
                    file://node_modules/raw-body/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/read/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/regenerator-runtime/LICENSE;md5=57a79768a3b1e4d0f3a3787048a96356 \
                    file://node_modules/reinterval/LICENSE;md5=c65ef22a386436c433298ca42418c200 \
                    file://node_modules/require-from-string/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/resolve-alpn/LICENSE;md5=f3d086f7c83cdc609b9f5d6057d7c1e4 \
                    file://node_modules/responselike/LICENSE;md5=ebe53e6698981352da17c09ed915f13f \
                    file://node_modules/rfdc/LICENSE;md5=fc2ea1f4c58a804909742c8eadede5ea \
                    file://node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/sax/LICENSE;md5=326d5674181c4bb210e424772c60fa80 \
                    file://node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/semver/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/semver/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/send/LICENSE;md5=5f1a8369a899b128aaa8a59d60d00b40 \
                    file://node_modules/send/node_modules/mime/LICENSE;md5=8e8ea2ad138ce468f8570a0edbadea65 \
                    file://node_modules/send/node_modules/ms/license.md;md5=2b8bc52ae6b7ba58e1629deabd53986f \
                    file://node_modules/serve-static/LICENSE;md5=27b1707520b14d0bc890f4e75cd387b0 \
                    file://node_modules/set-blocking/LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35 \
                    file://node_modules/setprototypeof/LICENSE;md5=4846f1626304c2c0f806a539bbc7d54a \
                    file://node_modules/side-channel/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/split2/LICENSE;md5=a3b84061387696c9678867c878a6bbc3 \
                    file://node_modules/statuses/LICENSE;md5=36e2bc837ce69a98cc33a9e140d457e5 \
                    file://node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/streamsearch/LICENSE;md5=cbf7b3097b1484b7e6c118fc1d31f877 \
                    file://node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/string_decoder/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/strip-ansi/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/tar/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/tar/node_modules/mkdirp/LICENSE;md5=f653359cc2be3ff55aa601d58d84c808 \
                    file://node_modules/tar/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/toidentifier/LICENSE;md5=1a261071a044d02eb6f2bb47f51a3502 \
                    file://node_modules/tough-cookie/LICENSE;md5=7189377a5215f1211b70cf2b9754841e \
                    file://node_modules/tough-cookie/node_modules/universalify/LICENSE;md5=a734c6ad6e37a515025ac5e8e90ef786 \
                    file://node_modules/tslib/CopyrightNotice.txt;md5=cb391e9e435b114c07bee8f6754c4f98 \
                    file://node_modules/tslib/LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6 \
                    file://node_modules/type-is/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/type-is/node_modules/media-typer/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/uglify-js/LICENSE;md5=00b45202695de5cd110bd3c2927a0da2 \
                    file://node_modules/uid-safe/LICENSE;md5=6a3e6caad2780f696f4884e98789e866 \
                    file://node_modules/uid2/LICENSE;md5=dd54d0741106ff4193bcecb833f6e350 \
                    file://node_modules/universalify/LICENSE;md5=a734c6ad6e37a515025ac5e8e90ef786 \
                    file://node_modules/unpipe/LICENSE;md5=934ab86a8ab081ea0326add08d550739 \
                    file://node_modules/uri-js/LICENSE;md5=3b55dad4a98748003b5b423477713da1 \
                    file://node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/utils-merge/LICENSE;md5=1cf0906082187f374cb9a63c54eb782c \
                    file://node_modules/uuid/LICENSE.md;md5=353e680cdafd96bf30131cbb7b14a6e8 \
                    file://node_modules/vary/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/webidl-conversions/LICENSE.md;md5=44d86433f305935cb0c3d3cd320e7a34 \
                    file://node_modules/whatwg-url/LICENSE.txt;md5=5ab9113efe10eeab888f7502d1c2e894 \
                    file://node_modules/wide-align/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/ws/LICENSE;md5=95833e8f03687308b0584a377b9e12b0 \
                    file://node_modules/xml2js/LICENSE;md5=d9fc599c8d9e6f8665063862aac66dfc \
                    file://node_modules/xmlbuilder/LICENSE;md5=f2836c06c74eca0f4565de06fe9900b0 \
                    file://node_modules/xtend/LICENSE;md5=66787c5cd698a0b30b358c7e30f500ca \
                    file://node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/agent-base/README.md;md5=dbe7cc0e18a5ea985d912037b4b52370 \
                    file://node_modules/boolbase/README.md;md5=48c1ef3558d25499a96a3d66baed5d9c \
                    file://node_modules/cookie-signature/Readme.md;md5=57ae8b42de3dd0c1f22d5f4cf191e15a \
                    file://node_modules/https-proxy-agent/README.md;md5=e12766dc96cd30a6103008d06c45ef01 \
                    file://node_modules/isarray/README.md;md5=e7424a48d45a2e04d52c15e786681063 \
                    file://node_modules/keyv/README.md;md5=db121f5e2f581330e048a72fad3c7c54 \
                    file://node_modules/pause/Readme.md;md5=01a259e8ee7455ffbf3042a40b34bf2a"

SRC_URI = " \
    npm://registry.npmjs.org/;package=node-red;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    file://${BPN}.service \
    "

S = "${WORKDIR}/npm"

inherit npm

LICENSE:${PN} = "Apache-2.0"
LICENSE:${PN}-babel-runtime = "MIT"
LICENSE:${PN}-mapbox-node-pre-gyp = "Unknown"
LICENSE:${PN}-node-red-editor-api = "Apache-2.0"
LICENSE:${PN}-node-red-editor-client = "Apache-2.0 & MIT & Unknown"
LICENSE:${PN}-node-red-nodes = "Apache-2.0"
LICENSE:${PN}-node-red-registry = "Apache-2.0"
LICENSE:${PN}-node-red-runtime = "Apache-2.0"
LICENSE:${PN}-node-red-util = "Apache-2.0"
LICENSE:${PN}-sindresorhus-is = "MIT"
LICENSE:${PN}-szmarczak-http-timer = "MIT"
LICENSE:${PN}-types-cacheable-request = "MIT"
LICENSE:${PN}-types-http-cache-semantics = "MIT"
LICENSE:${PN}-types-keyv = "MIT"
LICENSE:${PN}-types-node = "MIT"
LICENSE:${PN}-types-responselike = "MIT"
LICENSE:${PN}-abbrev = "Unknown"
LICENSE:${PN}-accepts = "MIT"
LICENSE:${PN}-acorn = "MIT"
LICENSE:${PN}-acorn-walk = "MIT"
LICENSE:${PN}-agent-base-debug = "MIT"
LICENSE:${PN}-agent-base-ms = "MIT"
LICENSE:${PN}-agent-base = "Unknown"
LICENSE:${PN}-ajv = "MIT"
LICENSE:${PN}-ansi-colors = "MIT"
LICENSE:${PN}-ansi-regex = "MIT"
LICENSE:${PN}-append-field = "MIT"
LICENSE:${PN}-aproba = "ISC"
LICENSE:${PN}-are-we-there-yet = "Unknown"
LICENSE:${PN}-argparse = "Unknown"
LICENSE:${PN}-array-flatten = "MIT"
LICENSE:${PN}-async-mutex = "MIT"
LICENSE:${PN}-asynckit = "MIT"
LICENSE:${PN}-axios = "MIT"
LICENSE:${PN}-balanced-match = "MIT"
LICENSE:${PN}-base64-js = "MIT"
LICENSE:${PN}-basic-auth = "MIT"
LICENSE:${PN}-bcrypt = "MIT"
LICENSE:${PN}-bcryptjs = "Unknown"
LICENSE:${PN}-bl = "Unknown"
LICENSE:${PN}-body-parser-iconv-lite = "MIT"
LICENSE:${PN}-body-parser = "MIT"
LICENSE:${PN}-boolbase = "Unknown"
LICENSE:${PN}-brace-expansion = "MIT"
LICENSE:${PN}-buffer = "MIT"
LICENSE:${PN}-buffer-from = "MIT"
LICENSE:${PN}-busboy = "MIT"
LICENSE:${PN}-bytes = "MIT"
LICENSE:${PN}-cacheable-lookup = "MIT"
LICENSE:${PN}-cacheable-request = "MIT"
LICENSE:${PN}-call-bind = "MIT"
LICENSE:${PN}-cheerio = "MIT"
LICENSE:${PN}-cheerio-select = "Unknown"
LICENSE:${PN}-chownr = "ISC"
LICENSE:${PN}-cli-table = "MIT"
LICENSE:${PN}-clone = "MIT"
LICENSE:${PN}-clone-response = "MIT"
LICENSE:${PN}-color-support = "ISC"
LICENSE:${PN}-colors = "Unknown"
LICENSE:${PN}-combined-stream = "MIT"
LICENSE:${PN}-commist = "MIT"
LICENSE:${PN}-concat-map = "MIT"
LICENSE:${PN}-concat-stream = "MIT"
LICENSE:${PN}-console-control-strings = "ISC"
LICENSE:${PN}-content-disposition-safe-buffer = "MIT"
LICENSE:${PN}-content-disposition = "MIT"
LICENSE:${PN}-content-type = "MIT"
LICENSE:${PN}-cookie = "MIT"
LICENSE:${PN}-cookie-parser-cookie = "MIT"
LICENSE:${PN}-cookie-parser = "MIT"
LICENSE:${PN}-cookie-signature = "Unknown"
LICENSE:${PN}-core-util-is = "MIT"
LICENSE:${PN}-cors = "MIT"
LICENSE:${PN}-cronosjs = "ISC"
LICENSE:${PN}-css-select = "Unknown"
LICENSE:${PN}-css-what = "Unknown"
LICENSE:${PN}-debug = "MIT"
LICENSE:${PN}-decompress-response-mimic-response = "MIT"
LICENSE:${PN}-decompress-response = "MIT"
LICENSE:${PN}-defer-to-connect = "MIT"
LICENSE:${PN}-delayed-stream = "MIT"
LICENSE:${PN}-delegates = "MIT"
LICENSE:${PN}-denque = "Apache-2.0"
LICENSE:${PN}-depd = "MIT"
LICENSE:${PN}-destroy = "MIT"
LICENSE:${PN}-detect-libc = "Apache-2.0"
LICENSE:${PN}-dom-serializer = "MIT"
LICENSE:${PN}-domelementtype = "Unknown"
LICENSE:${PN}-domhandler = "Unknown"
LICENSE:${PN}-domutils = "Unknown"
LICENSE:${PN}-duplexify = "MIT"
LICENSE:${PN}-ee-first = "MIT"
LICENSE:${PN}-emoji-regex = "MIT"
LICENSE:${PN}-encodeurl = "MIT"
LICENSE:${PN}-end-of-stream = "MIT"
LICENSE:${PN}-enquirer = "MIT"
LICENSE:${PN}-entities = "Unknown"
LICENSE:${PN}-escape-html = "MIT"
LICENSE:${PN}-etag = "MIT"
LICENSE:${PN}-express-safe-buffer = "MIT"
LICENSE:${PN}-express = "MIT"
LICENSE:${PN}-express-session-cookie = "MIT"
LICENSE:${PN}-express-session-safe-buffer = "MIT"
LICENSE:${PN}-express-session = "MIT"
LICENSE:${PN}-fast-deep-equal = "MIT"
LICENSE:${PN}-finalhandler = "MIT"
LICENSE:${PN}-follow-redirects = "MIT"
LICENSE:${PN}-form-data = "MIT"
LICENSE:${PN}-forwarded = "MIT"
LICENSE:${PN}-fresh = "MIT"
LICENSE:${PN}-fs-extra = "MIT"
LICENSE:${PN}-fs-minipass = "ISC"
LICENSE:${PN}-fsrealpath = "Unknown"
LICENSE:${PN}-function-bind = "MIT"
LICENSE:${PN}-gauge = "ISC"
LICENSE:${PN}-get-intrinsic = "MIT"
LICENSE:${PN}-get-stream = "MIT"
LICENSE:${PN}-glob = "Unknown"
LICENSE:${PN}-got = "MIT"
LICENSE:${PN}-graceful-fs = "ISC"
LICENSE:${PN}-has = "MIT"
LICENSE:${PN}-has-proto = "MIT"
LICENSE:${PN}-has-symbols = "MIT"
LICENSE:${PN}-has-unicode = "ISC"
LICENSE:${PN}-hash-sum = "MIT"
LICENSE:${PN}-help-me = "MIT"
LICENSE:${PN}-hpagent = "MIT"
LICENSE:${PN}-htmlparser2 = "MIT"
LICENSE:${PN}-http-cache-semantics = "BSD-2-Clause"
LICENSE:${PN}-http-errors = "MIT"
LICENSE:${PN}-http2-wrapper = "MIT"
LICENSE:${PN}-https-proxy-agent-debug = "MIT"
LICENSE:${PN}-https-proxy-agent-ms = "MIT"
LICENSE:${PN}-https-proxy-agent = "Unknown"
LICENSE:${PN}-i18next = "MIT"
LICENSE:${PN}-iconv-lite = "MIT"
LICENSE:${PN}-ieee754 = "BSD-3-Clause"
LICENSE:${PN}-inflight = "ISC"
LICENSE:${PN}-inherits = "ISC"
LICENSE:${PN}-ipaddrjs = "MIT"
LICENSE:${PN}-is-fullwidth-code-point = "MIT"
LICENSE:${PN}-is-utf8 = "MIT"
LICENSE:${PN}-isarray = "Unknown"
LICENSE:${PN}-js-sdsl = "MIT"
LICENSE:${PN}-js-yaml = "MIT"
LICENSE:${PN}-json-buffer = "MIT"
LICENSE:${PN}-json-schema-traverse = "MIT"
LICENSE:${PN}-json-stringify-safe = "ISC"
LICENSE:${PN}-jsonata = "MIT"
LICENSE:${PN}-jsonfile = "MIT"
LICENSE:${PN}-keyv = "Unknown"
LICENSE:${PN}-leven = "MIT"
LICENSE:${PN}-lodashclonedeep = "Unknown"
LICENSE:${PN}-lowercase-keys = "MIT"
LICENSE:${PN}-lru-cache = "ISC"
LICENSE:${PN}-make-dir-semver = "ISC"
LICENSE:${PN}-make-dir = "MIT"
LICENSE:${PN}-media-typer = "MIT"
LICENSE:${PN}-memorystore-debug = "MIT"
LICENSE:${PN}-memorystore-ms = "MIT"
LICENSE:${PN}-memorystore = "MIT"
LICENSE:${PN}-merge-descriptors = "MIT"
LICENSE:${PN}-methods = "MIT"
LICENSE:${PN}-mime = "MIT"
LICENSE:${PN}-mime-db = "MIT"
LICENSE:${PN}-mime-types = "MIT"
LICENSE:${PN}-mimic-response = "MIT"
LICENSE:${PN}-minimatch = "ISC"
LICENSE:${PN}-minimist = "MIT"
LICENSE:${PN}-minipass-yallist = "ISC"
LICENSE:${PN}-minipass = "ISC"
LICENSE:${PN}-minizlib-yallist = "ISC"
LICENSE:${PN}-minizlib = "Unknown"
LICENSE:${PN}-mkdirp = "MIT"
LICENSE:${PN}-moment = "MIT"
LICENSE:${PN}-moment-timezone = "MIT"
LICENSE:${PN}-mqtt-debug = "MIT"
LICENSE:${PN}-mqtt-lru-cache = "ISC"
LICENSE:${PN}-mqtt-ms = "MIT"
LICENSE:${PN}-mqtt-yallist = "ISC"
LICENSE:${PN}-mqtt = "Unknown"
LICENSE:${PN}-mqtt-packet-debug = "MIT"
LICENSE:${PN}-mqtt-packet-ms = "MIT"
LICENSE:${PN}-mqtt-packet = "Unknown"
LICENSE:${PN}-ms = "MIT"
LICENSE:${PN}-multer-concat-stream = "MIT"
LICENSE:${PN}-multer-readable-stream = "Unknown"
LICENSE:${PN}-multer-stringdecoder = "Unknown"
LICENSE:${PN}-multer = "MIT"
LICENSE:${PN}-mustache = "MIT"
LICENSE:${PN}-mute-stream = "ISC"
LICENSE:${PN}-negotiator = "MIT"
LICENSE:${PN}-node-addon-api = "Unknown"
LICENSE:${PN}-node-fetch = "MIT"
LICENSE:${PN}-node-red-admin = "Apache-2.0"
LICENSE:${PN}-node-watch = "MIT"
LICENSE:${PN}-nopt = "ISC"
LICENSE:${PN}-normalize-url = "MIT"
LICENSE:${PN}-npmlog = "ISC"
LICENSE:${PN}-nth-check = "Unknown"
LICENSE:${PN}-number-allocator-debug = "MIT"
LICENSE:${PN}-number-allocator-ms = "MIT"
LICENSE:${PN}-number-allocator = "MIT"
LICENSE:${PN}-oauth2orize = "MIT"
LICENSE:${PN}-object-assign = "MIT"
LICENSE:${PN}-object-inspect = "MIT"
LICENSE:${PN}-on-finished = "MIT"
LICENSE:${PN}-on-headers = "MIT"
LICENSE:${PN}-once = "ISC"
LICENSE:${PN}-p-cancelable = "MIT"
LICENSE:${PN}-parse5 = "MIT"
LICENSE:${PN}-parse5-htmlparser2-tree-adapter = "MIT"
LICENSE:${PN}-parseurl = "MIT"
LICENSE:${PN}-passport = "MIT"
LICENSE:${PN}-passport-http-bearer = "MIT"
LICENSE:${PN}-passport-oauth2-client-password = "MIT"
LICENSE:${PN}-passport-strategy = "MIT"
LICENSE:${PN}-path-is-absolute = "MIT"
LICENSE:${PN}-path-to-regexp = "MIT"
LICENSE:${PN}-pause = "Unknown"
LICENSE:${PN}-process-nextick-args = "MIT"
LICENSE:${PN}-proxy-addr = "MIT"
LICENSE:${PN}-pseudomap = "ISC"
LICENSE:${PN}-psl = "MIT"
LICENSE:${PN}-pump = "MIT"
LICENSE:${PN}-punycode = "MIT"
LICENSE:${PN}-qs = "BSD-3-Clause"
LICENSE:${PN}-quick-lru = "MIT"
LICENSE:${PN}-random-bytes = "MIT"
LICENSE:${PN}-range-parser = "MIT"
LICENSE:${PN}-raw-body-iconv-lite = "MIT"
LICENSE:${PN}-raw-body = "MIT"
LICENSE:${PN}-read = "ISC"
LICENSE:${PN}-readable-stream = "Unknown"
LICENSE:${PN}-regenerator-runtime = "MIT"
LICENSE:${PN}-reinterval = "MIT"
LICENSE:${PN}-require-from-string = "MIT"
LICENSE:${PN}-resolve-alpn = "MIT"
LICENSE:${PN}-responselike = "MIT"
LICENSE:${PN}-rfdc = "MIT"
LICENSE:${PN}-rimraf = "ISC"
LICENSE:${PN}-safe-buffer = "MIT"
LICENSE:${PN}-safer-buffer = "MIT"
LICENSE:${PN}-sax = "Unknown"
LICENSE:${PN}-semver-lru-cache = "ISC"
LICENSE:${PN}-semver-yallist = "ISC"
LICENSE:${PN}-semver = "ISC"
LICENSE:${PN}-send-mime = "MIT"
LICENSE:${PN}-send-ms = "MIT"
LICENSE:${PN}-send = "MIT"
LICENSE:${PN}-serve-static = "MIT"
LICENSE:${PN}-set-blocking = "ISC"
LICENSE:${PN}-setprototypeof = "ISC"
LICENSE:${PN}-side-channel = "MIT"
LICENSE:${PN}-signal-exit = "ISC"
LICENSE:${PN}-split2 = "ISC"
LICENSE:${PN}-statuses = "MIT"
LICENSE:${PN}-stream-shift = "MIT"
LICENSE:${PN}-streamsearch = "MIT"
LICENSE:${PN}-stringdecoder-safe-buffer = "MIT"
LICENSE:${PN}-stringdecoder = "Unknown"
LICENSE:${PN}-string-width = "MIT"
LICENSE:${PN}-strip-ansi = "MIT"
LICENSE:${PN}-tar-mkdirp = "MIT"
LICENSE:${PN}-tar-yallist = "ISC"
LICENSE:${PN}-tar = "ISC"
LICENSE:${PN}-toidentifier = "MIT"
LICENSE:${PN}-tough-cookie-universalify = "MIT"
LICENSE:${PN}-tough-cookie = "Unknown"
LICENSE:${PN}-tr46 = "Unknown"
LICENSE:${PN}-tslib = "0BSD"
LICENSE:${PN}-type-is-media-typer = "MIT"
LICENSE:${PN}-type-is = "MIT"
LICENSE:${PN}-typedarray = "Unknown"
LICENSE:${PN}-uglify-js = "BSD-2-Clause"
LICENSE:${PN}-uid-safe = "MIT"
LICENSE:${PN}-uid2 = "MIT"
LICENSE:${PN}-universalify = "MIT"
LICENSE:${PN}-unpipe = "MIT"
LICENSE:${PN}-uri-js = "Unknown"
LICENSE:${PN}-util-deprecate = "MIT"
LICENSE:${PN}-utils-merge = "MIT"
LICENSE:${PN}-uuid = "MIT"
LICENSE:${PN}-vary = "MIT"
LICENSE:${PN}-webidl-conversions = "BSD-2-Clause"
LICENSE:${PN}-whatwg-url = "MIT"
LICENSE:${PN}-wide-align = "ISC"
LICENSE:${PN}-wrappy = "ISC"
LICENSE:${PN}-ws = "MIT"
LICENSE:${PN}-xml2js = "MIT"
LICENSE:${PN}-xmlbuilder = "MIT"
LICENSE:${PN}-xtend = "MIT"
LICENSE:${PN}-yallist = "ISC"


do_install:append() {   
    # Service Systemd
    install -d ${D}${systemd_unitdir}/system/
    install -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_unitdir}/system/

    # Remove tmp files from npm install
    rm -rf ${D}/${libdir}/node_modules/${BPN}/node_modules/bcrypt/build-tmp-napi-v3
    rm -rf ${D}/${libdir}/node_modules/${BPN}/node_modules/bcrypt/node-addon-api
}

inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "${BPN}.service"

FILES:${PN} += "\
    ${systemd_unitdir} \
"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
