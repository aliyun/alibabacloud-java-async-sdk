// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link QueryProductPageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductPageResponseBody</p>
 */
public class QueryProductPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private QueryProductPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(QueryProductPageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public QueryProductPageResponseBody build() {
            return new QueryProductPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryProductPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductPageResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeLicenseCount")
        private Long activeLicenseCount;

        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("licenseCount")
        private Long licenseCount;

        @com.aliyun.core.annotation.NameInMap("maxQps")
        private Integer maxQps;

        @com.aliyun.core.annotation.NameInMap("productKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("productSecret")
        private String productSecret;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("tokenCount")
        private Long tokenCount;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("usedToken")
        private Long usedToken;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private DataData(Builder builder) {
            this.activeLicenseCount = builder.activeLicenseCount;
            this.apiKey = builder.apiKey;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.licenseCount = builder.licenseCount;
            this.maxQps = builder.maxQps;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.productSecret = builder.productSecret;
            this.tenantId = builder.tenantId;
            this.tokenCount = builder.tokenCount;
            this.updateTime = builder.updateTime;
            this.usedToken = builder.usedToken;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return activeLicenseCount
         */
        public Long getActiveLicenseCount() {
            return this.activeLicenseCount;
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return licenseCount
         */
        public Long getLicenseCount() {
            return this.licenseCount;
        }

        /**
         * @return maxQps
         */
        public Integer getMaxQps() {
            return this.maxQps;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productSecret
         */
        public String getProductSecret() {
            return this.productSecret;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tokenCount
         */
        public Long getTokenCount() {
            return this.tokenCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return usedToken
         */
        public Long getUsedToken() {
            return this.usedToken;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long activeLicenseCount; 
            private String apiKey; 
            private String createTime; 
            private String description; 
            private Long licenseCount; 
            private Integer maxQps; 
            private String productKey; 
            private String productName; 
            private String productSecret; 
            private String tenantId; 
            private Long tokenCount; 
            private String updateTime; 
            private Long usedToken; 
            private String userId; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.activeLicenseCount = model.activeLicenseCount;
                this.apiKey = model.apiKey;
                this.createTime = model.createTime;
                this.description = model.description;
                this.licenseCount = model.licenseCount;
                this.maxQps = model.maxQps;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.productSecret = model.productSecret;
                this.tenantId = model.tenantId;
                this.tokenCount = model.tokenCount;
                this.updateTime = model.updateTime;
                this.usedToken = model.usedToken;
                this.userId = model.userId;
            } 

            /**
             * activeLicenseCount.
             */
            public Builder activeLicenseCount(Long activeLicenseCount) {
                this.activeLicenseCount = activeLicenseCount;
                return this;
            }

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * licenseCount.
             */
            public Builder licenseCount(Long licenseCount) {
                this.licenseCount = licenseCount;
                return this;
            }

            /**
             * maxQps.
             */
            public Builder maxQps(Integer maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * productKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * productSecret.
             */
            public Builder productSecret(String productSecret) {
                this.productSecret = productSecret;
                return this;
            }

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * tokenCount.
             */
            public Builder tokenCount(Long tokenCount) {
                this.tokenCount = tokenCount;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * usedToken.
             */
            public Builder usedToken(Long usedToken) {
                this.usedToken = usedToken;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryProductPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<DataData> data;

        @com.aliyun.core.annotation.NameInMap("pageIndex")
        private Integer pageIndex;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Data(Builder builder) {
            this.data = builder.data;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 
            private Integer pageIndex; 
            private Integer pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.pageIndex = model.pageIndex;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * pageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
