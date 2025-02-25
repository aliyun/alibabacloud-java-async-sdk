// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageListLabsResponseBody} extends {@link TeaModel}
 *
 * <p>PageListLabsResponseBody</p>
 */
public class PageListLabsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Labs")
    private java.util.List < Labs> labs;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private PageListLabsResponseBody(Builder builder) {
        this.code = builder.code;
        this.labs = builder.labs;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageListLabsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return labs
     */
    public java.util.List < Labs> getLabs() {
        return this.labs;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Labs> labs; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Labs.
         */
        public Builder labs(java.util.List < Labs> labs) {
            this.labs = labs;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public PageListLabsResponseBody build() {
            return new PageListLabsResponseBody(this);
        } 

    } 

    public static class Labs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("SubTitle")
        private String subTitle;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Labs(Builder builder) {
            this.duration = builder.duration;
            this.id = builder.id;
            this.introduction = builder.introduction;
            this.subTitle = builder.subTitle;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labs create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return subTitle
         */
        public String getSubTitle() {
            return this.subTitle;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long duration; 
            private Long id; 
            private String introduction; 
            private String subTitle; 
            private String title; 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Introduction.
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * SubTitle.
             */
            public Builder subTitle(String subTitle) {
                this.subTitle = subTitle;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Labs build() {
                return new Labs(this);
            } 

        } 

    }
}
