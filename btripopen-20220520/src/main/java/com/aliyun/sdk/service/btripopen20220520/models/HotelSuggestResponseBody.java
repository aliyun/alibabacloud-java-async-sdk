// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelSuggestResponseBody} extends {@link TeaModel}
 *
 * <p>HotelSuggestResponseBody</p>
 */
public class HotelSuggestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private HotelSuggestResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelSuggestResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public HotelSuggestResponseBody build() {
            return new HotelSuggestResponseBody(this);
        } 

    } 

    public static class PopularInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("display_name")
        private String displayName;

        private PopularInfos(Builder builder) {
            this.displayName = builder.displayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopularInfos create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        public static final class Builder {
            private String displayName; 

            /**
             * display_name.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            public PopularInfos build() {
                return new PopularInfos(this);
            } 

        } 

    }
    public static class PopularSuggestInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("popular_infos")
        private java.util.List < PopularInfos> popularInfos;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private PopularSuggestInfos(Builder builder) {
            this.icon = builder.icon;
            this.popularInfos = builder.popularInfos;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopularSuggestInfos create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return popularInfos
         */
        public java.util.List < PopularInfos> getPopularInfos() {
            return this.popularInfos;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String icon; 
            private java.util.List < PopularInfos> popularInfos; 
            private String title; 

            /**
             * icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * popular_infos.
             */
            public Builder popularInfos(java.util.List < PopularInfos> popularInfos) {
                this.popularInfos = popularInfos;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public PopularSuggestInfos build() {
                return new PopularSuggestInfos(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("guess_suggest_infos")
        private java.util.List < KeywordSuggestInfo > guessSuggestInfos;

        @com.aliyun.core.annotation.NameInMap("keyword_suggest_infos")
        private java.util.List < KeywordSuggestInfo > keywordSuggestInfos;

        @com.aliyun.core.annotation.NameInMap("popular_suggest_infos")
        private java.util.List < PopularSuggestInfos> popularSuggestInfos;

        @com.aliyun.core.annotation.NameInMap("tips")
        private String tips;

        private Module(Builder builder) {
            this.guessSuggestInfos = builder.guessSuggestInfos;
            this.keywordSuggestInfos = builder.keywordSuggestInfos;
            this.popularSuggestInfos = builder.popularSuggestInfos;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return guessSuggestInfos
         */
        public java.util.List < KeywordSuggestInfo > getGuessSuggestInfos() {
            return this.guessSuggestInfos;
        }

        /**
         * @return keywordSuggestInfos
         */
        public java.util.List < KeywordSuggestInfo > getKeywordSuggestInfos() {
            return this.keywordSuggestInfos;
        }

        /**
         * @return popularSuggestInfos
         */
        public java.util.List < PopularSuggestInfos> getPopularSuggestInfos() {
            return this.popularSuggestInfos;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        public static final class Builder {
            private java.util.List < KeywordSuggestInfo > guessSuggestInfos; 
            private java.util.List < KeywordSuggestInfo > keywordSuggestInfos; 
            private java.util.List < PopularSuggestInfos> popularSuggestInfos; 
            private String tips; 

            /**
             * guess_suggest_infos.
             */
            public Builder guessSuggestInfos(java.util.List < KeywordSuggestInfo > guessSuggestInfos) {
                this.guessSuggestInfos = guessSuggestInfos;
                return this;
            }

            /**
             * keyword_suggest_infos.
             */
            public Builder keywordSuggestInfos(java.util.List < KeywordSuggestInfo > keywordSuggestInfos) {
                this.keywordSuggestInfos = keywordSuggestInfos;
                return this;
            }

            /**
             * popular_suggest_infos.
             */
            public Builder popularSuggestInfos(java.util.List < PopularSuggestInfos> popularSuggestInfos) {
                this.popularSuggestInfos = popularSuggestInfos;
                return this;
            }

            /**
             * tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
