// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayUserTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayUserTotalResponseBody</p>
 */
public class DescribePlayUserTotalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserPlayStatisTotals")
    private UserPlayStatisTotals userPlayStatisTotals;

    private DescribePlayUserTotalResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userPlayStatisTotals = builder.userPlayStatisTotals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayUserTotalResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userPlayStatisTotals
     */
    public UserPlayStatisTotals getUserPlayStatisTotals() {
        return this.userPlayStatisTotals;
    }

    public static final class Builder {
        private String requestId; 
        private UserPlayStatisTotals userPlayStatisTotals; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserPlayStatisTotals.
         */
        public Builder userPlayStatisTotals(UserPlayStatisTotals userPlayStatisTotals) {
            this.userPlayStatisTotals = userPlayStatisTotals;
            return this;
        }

        public DescribePlayUserTotalResponseBody build() {
            return new DescribePlayUserTotalResponseBody(this);
        } 

    } 

    public static class UV extends TeaModel {
        @NameInMap("Android")
        private String android;

        @NameInMap("Flash")
        private String flash;

        @NameInMap("HTML5")
        private String HTML5;

        @NameInMap("iOS")
        private String iOS;

        private UV(Builder builder) {
            this.android = builder.android;
            this.flash = builder.flash;
            this.HTML5 = builder.HTML5;
            this.iOS = builder.iOS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UV create() {
            return builder().build();
        }

        /**
         * @return android
         */
        public String getAndroid() {
            return this.android;
        }

        /**
         * @return flash
         */
        public String getFlash() {
            return this.flash;
        }

        /**
         * @return HTML5
         */
        public String getHTML5() {
            return this.HTML5;
        }

        /**
         * @return iOS
         */
        public String getIOS() {
            return this.iOS;
        }

        public static final class Builder {
            private String android; 
            private String flash; 
            private String HTML5; 
            private String iOS; 

            /**
             * Android.
             */
            public Builder android(String android) {
                this.android = android;
                return this;
            }

            /**
             * Flash.
             */
            public Builder flash(String flash) {
                this.flash = flash;
                return this;
            }

            /**
             * HTML5.
             */
            public Builder HTML5(String HTML5) {
                this.HTML5 = HTML5;
                return this;
            }

            /**
             * iOS.
             */
            public Builder iOS(String iOS) {
                this.iOS = iOS;
                return this;
            }

            public UV build() {
                return new UV(this);
            } 

        } 

    }
    public static class VV extends TeaModel {
        @NameInMap("Android")
        private String android;

        @NameInMap("Flash")
        private String flash;

        @NameInMap("HTML5")
        private String HTML5;

        @NameInMap("iOS")
        private String iOS;

        private VV(Builder builder) {
            this.android = builder.android;
            this.flash = builder.flash;
            this.HTML5 = builder.HTML5;
            this.iOS = builder.iOS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VV create() {
            return builder().build();
        }

        /**
         * @return android
         */
        public String getAndroid() {
            return this.android;
        }

        /**
         * @return flash
         */
        public String getFlash() {
            return this.flash;
        }

        /**
         * @return HTML5
         */
        public String getHTML5() {
            return this.HTML5;
        }

        /**
         * @return iOS
         */
        public String getIOS() {
            return this.iOS;
        }

        public static final class Builder {
            private String android; 
            private String flash; 
            private String HTML5; 
            private String iOS; 

            /**
             * Android.
             */
            public Builder android(String android) {
                this.android = android;
                return this;
            }

            /**
             * Flash.
             */
            public Builder flash(String flash) {
                this.flash = flash;
                return this;
            }

            /**
             * HTML5.
             */
            public Builder HTML5(String HTML5) {
                this.HTML5 = HTML5;
                return this;
            }

            /**
             * iOS.
             */
            public Builder iOS(String iOS) {
                this.iOS = iOS;
                return this;
            }

            public VV build() {
                return new VV(this);
            } 

        } 

    }
    public static class UserPlayStatisTotal extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("PlayDuration")
        private String playDuration;

        @NameInMap("PlayRange")
        private String playRange;

        @NameInMap("UV")
        private UV UV;

        @NameInMap("VV")
        private VV VV;

        private UserPlayStatisTotal(Builder builder) {
            this.date = builder.date;
            this.playDuration = builder.playDuration;
            this.playRange = builder.playRange;
            this.UV = builder.UV;
            this.VV = builder.VV;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPlayStatisTotal create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return playDuration
         */
        public String getPlayDuration() {
            return this.playDuration;
        }

        /**
         * @return playRange
         */
        public String getPlayRange() {
            return this.playRange;
        }

        /**
         * @return UV
         */
        public UV getUV() {
            return this.UV;
        }

        /**
         * @return VV
         */
        public VV getVV() {
            return this.VV;
        }

        public static final class Builder {
            private String date; 
            private String playDuration; 
            private String playRange; 
            private UV UV; 
            private VV VV; 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * PlayDuration.
             */
            public Builder playDuration(String playDuration) {
                this.playDuration = playDuration;
                return this;
            }

            /**
             * PlayRange.
             */
            public Builder playRange(String playRange) {
                this.playRange = playRange;
                return this;
            }

            /**
             * UV.
             */
            public Builder UV(UV UV) {
                this.UV = UV;
                return this;
            }

            /**
             * VV.
             */
            public Builder VV(VV VV) {
                this.VV = VV;
                return this;
            }

            public UserPlayStatisTotal build() {
                return new UserPlayStatisTotal(this);
            } 

        } 

    }
    public static class UserPlayStatisTotals extends TeaModel {
        @NameInMap("UserPlayStatisTotal")
        private java.util.List < UserPlayStatisTotal> userPlayStatisTotal;

        private UserPlayStatisTotals(Builder builder) {
            this.userPlayStatisTotal = builder.userPlayStatisTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPlayStatisTotals create() {
            return builder().build();
        }

        /**
         * @return userPlayStatisTotal
         */
        public java.util.List < UserPlayStatisTotal> getUserPlayStatisTotal() {
            return this.userPlayStatisTotal;
        }

        public static final class Builder {
            private java.util.List < UserPlayStatisTotal> userPlayStatisTotal; 

            /**
             * UserPlayStatisTotal.
             */
            public Builder userPlayStatisTotal(java.util.List < UserPlayStatisTotal> userPlayStatisTotal) {
                this.userPlayStatisTotal = userPlayStatisTotal;
                return this;
            }

            public UserPlayStatisTotals build() {
                return new UserPlayStatisTotals(this);
            } 

        } 

    }
}
