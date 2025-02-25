// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBizTypeSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBizTypeSettingResponseBody</p>
 */
public class DescribeBizTypeSettingResponseBody extends TeaModel {
    @NameInMap("Ad")
    private Ad ad;

    @NameInMap("Antispam")
    private Antispam antispam;

    @NameInMap("Live")
    private Live live;

    @NameInMap("Porn")
    private Porn porn;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Terrorism")
    private Terrorism terrorism;

    private DescribeBizTypeSettingResponseBody(Builder builder) {
        this.ad = builder.ad;
        this.antispam = builder.antispam;
        this.live = builder.live;
        this.porn = builder.porn;
        this.requestId = builder.requestId;
        this.terrorism = builder.terrorism;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBizTypeSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return ad
     */
    public Ad getAd() {
        return this.ad;
    }

    /**
     * @return antispam
     */
    public Antispam getAntispam() {
        return this.antispam;
    }

    /**
     * @return live
     */
    public Live getLive() {
        return this.live;
    }

    /**
     * @return porn
     */
    public Porn getPorn() {
        return this.porn;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return terrorism
     */
    public Terrorism getTerrorism() {
        return this.terrorism;
    }

    public static final class Builder {
        private Ad ad; 
        private Antispam antispam; 
        private Live live; 
        private Porn porn; 
        private String requestId; 
        private Terrorism terrorism; 

        /**
         * Ad.
         */
        public Builder ad(Ad ad) {
            this.ad = ad;
            return this;
        }

        /**
         * Antispam.
         */
        public Builder antispam(Antispam antispam) {
            this.antispam = antispam;
            return this;
        }

        /**
         * Live.
         */
        public Builder live(Live live) {
            this.live = live;
            return this;
        }

        /**
         * Porn.
         */
        public Builder porn(Porn porn) {
            this.porn = porn;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Terrorism.
         */
        public Builder terrorism(Terrorism terrorism) {
            this.terrorism = terrorism;
            return this;
        }

        public DescribeBizTypeSettingResponseBody build() {
            return new DescribeBizTypeSettingResponseBody(this);
        } 

    } 

    public static class Ad extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private Ad(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ad create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public Ad build() {
                return new Ad(this);
            } 

        } 

    }
    public static class Antispam extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private Antispam(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Antispam create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public Antispam build() {
                return new Antispam(this);
            } 

        } 

    }
    public static class Live extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private Live(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Live create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public Live build() {
                return new Live(this);
            } 

        } 

    }
    public static class Porn extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private Porn(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Porn create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public Porn build() {
                return new Porn(this);
            } 

        } 

    }
    public static class Terrorism extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private Terrorism(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terrorism create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public Terrorism build() {
                return new Terrorism(this);
            } 

        } 

    }
}
