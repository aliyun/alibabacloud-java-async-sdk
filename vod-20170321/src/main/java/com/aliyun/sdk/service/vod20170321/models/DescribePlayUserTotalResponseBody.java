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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The daily playback statistics.
         */
        public Builder userPlayStatisTotals(UserPlayStatisTotals userPlayStatisTotals) {
            this.userPlayStatisTotals = userPlayStatisTotals;
            return this;
        }

        public DescribePlayUserTotalResponseBody build() {
            return new DescribePlayUserTotalResponseBody(this);
        } 

    } 

    public static class Uv extends TeaModel {
        @NameInMap("Android")
        private String android;

        @NameInMap("Flash")
        private String flash;

        @NameInMap("HTML5")
        private String HTML5;

        @NameInMap("iOS")
        private String iOS;

        private Uv(Builder builder) {
            this.android = builder.android;
            this.flash = builder.flash;
            this.HTML5 = builder.HTML5;
            this.iOS = builder.iOS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Uv create() {
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
             * The total number of unique visitors who use ApsaraVideo Player SDK for Android.
             */
            public Builder android(String android) {
                this.android = android;
                return this;
            }

            /**
             * The total number of unique visitors who use the Flash player.
             */
            public Builder flash(String flash) {
                this.flash = flash;
                return this;
            }

            /**
             * The total number of unique visitors who use the HTML5 player.
             */
            public Builder HTML5(String HTML5) {
                this.HTML5 = HTML5;
                return this;
            }

            /**
             * The total number of unique visitors who use ApsaraVideo Player SDK for iOS.
             */
            public Builder iOS(String iOS) {
                this.iOS = iOS;
                return this;
            }

            public Uv build() {
                return new Uv(this);
            } 

        } 

    }
    public static class Vv extends TeaModel {
        @NameInMap("Android")
        private String android;

        @NameInMap("Flash")
        private String flash;

        @NameInMap("HTML5")
        private String HTML5;

        @NameInMap("iOS")
        private String iOS;

        private Vv(Builder builder) {
            this.android = builder.android;
            this.flash = builder.flash;
            this.HTML5 = builder.HTML5;
            this.iOS = builder.iOS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vv create() {
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
             * The total number of video views played by using ApsaraVideo Player SDK for Android.
             */
            public Builder android(String android) {
                this.android = android;
                return this;
            }

            /**
             * The total number of video views played by using the Flash player.
             */
            public Builder flash(String flash) {
                this.flash = flash;
                return this;
            }

            /**
             * The total number of video views played by using the HTML5 player.
             */
            public Builder HTML5(String HTML5) {
                this.HTML5 = HTML5;
                return this;
            }

            /**
             * The total number of video views played by using ApsaraVideo Player SDK for iOS.
             */
            public Builder iOS(String iOS) {
                this.iOS = iOS;
                return this;
            }

            public Vv build() {
                return new Vv(this);
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
        private Uv uv;

        @NameInMap("VV")
        private Vv vv;

        private UserPlayStatisTotal(Builder builder) {
            this.date = builder.date;
            this.playDuration = builder.playDuration;
            this.playRange = builder.playRange;
            this.uv = builder.uv;
            this.vv = builder.vv;
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
         * @return uv
         */
        public Uv getUv() {
            return this.uv;
        }

        /**
         * @return vv
         */
        public Vv getVv() {
            return this.vv;
        }

        public static final class Builder {
            private String date; 
            private String playDuration; 
            private String playRange; 
            private Uv uv; 
            private Vv vv; 

            /**
             * The date. The date is displayed in the *yyyy-MM-dd* format.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * The total playback duration. Unit: milliseconds.
             */
            public Builder playDuration(String playDuration) {
                this.playDuration = playDuration;
                return this;
            }

            /**
             * The distribution of the playback duration.
             */
            public Builder playRange(String playRange) {
                this.playRange = playRange;
                return this;
            }

            /**
             * The total number of unique visitors.
             */
            public Builder uv(Uv uv) {
                this.uv = uv;
                return this;
            }

            /**
             * The total number of video views.
             */
            public Builder vv(Vv vv) {
                this.vv = vv;
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
