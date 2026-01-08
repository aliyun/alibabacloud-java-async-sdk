// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCustomAudienceResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomAudienceResponseBody</p>
 */
public class ListCustomAudienceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListCustomAudienceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomAudienceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListCustomAudienceResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListCustomAudienceResponseBody build() {
            return new ListCustomAudienceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomAudienceResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomAudienceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdAccountId")
        private String adAccountId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CustomAudienceId")
        private String customAudienceId;

        @com.aliyun.core.annotation.NameInMap("CustomAudienceName")
        private String customAudienceName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PageId")
        private String pageId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TokenTotal")
        private Long tokenTotal;

        @com.aliyun.core.annotation.NameInMap("TokenType")
        private String tokenType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UploadType")
        private String uploadType;

        private Data(Builder builder) {
            this.adAccountId = builder.adAccountId;
            this.createTime = builder.createTime;
            this.customAudienceId = builder.customAudienceId;
            this.customAudienceName = builder.customAudienceName;
            this.description = builder.description;
            this.pageId = builder.pageId;
            this.status = builder.status;
            this.tokenTotal = builder.tokenTotal;
            this.tokenType = builder.tokenType;
            this.updateTime = builder.updateTime;
            this.uploadType = builder.uploadType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return adAccountId
         */
        public String getAdAccountId() {
            return this.adAccountId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customAudienceId
         */
        public String getCustomAudienceId() {
            return this.customAudienceId;
        }

        /**
         * @return customAudienceName
         */
        public String getCustomAudienceName() {
            return this.customAudienceName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return pageId
         */
        public String getPageId() {
            return this.pageId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tokenTotal
         */
        public Long getTokenTotal() {
            return this.tokenTotal;
        }

        /**
         * @return tokenType
         */
        public String getTokenType() {
            return this.tokenType;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return uploadType
         */
        public String getUploadType() {
            return this.uploadType;
        }

        public static final class Builder {
            private String adAccountId; 
            private Long createTime; 
            private String customAudienceId; 
            private String customAudienceName; 
            private String description; 
            private String pageId; 
            private String status; 
            private Long tokenTotal; 
            private String tokenType; 
            private Long updateTime; 
            private String uploadType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.adAccountId = model.adAccountId;
                this.createTime = model.createTime;
                this.customAudienceId = model.customAudienceId;
                this.customAudienceName = model.customAudienceName;
                this.description = model.description;
                this.pageId = model.pageId;
                this.status = model.status;
                this.tokenTotal = model.tokenTotal;
                this.tokenType = model.tokenType;
                this.updateTime = model.updateTime;
                this.uploadType = model.uploadType;
            } 

            /**
             * AdAccountId.
             */
            public Builder adAccountId(String adAccountId) {
                this.adAccountId = adAccountId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomAudienceId.
             */
            public Builder customAudienceId(String customAudienceId) {
                this.customAudienceId = customAudienceId;
                return this;
            }

            /**
             * CustomAudienceName.
             */
            public Builder customAudienceName(String customAudienceName) {
                this.customAudienceName = customAudienceName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(String pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TokenTotal.
             */
            public Builder tokenTotal(Long tokenTotal) {
                this.tokenTotal = tokenTotal;
                return this;
            }

            /**
             * TokenType.
             */
            public Builder tokenType(String tokenType) {
                this.tokenType = tokenType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UploadType.
             */
            public Builder uploadType(String uploadType) {
                this.uploadType = uploadType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
