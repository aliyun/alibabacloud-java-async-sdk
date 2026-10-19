// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAgenticDBTenantApiKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticDBTenantApiKeysResponseBody</p>
 */
public class DescribeAgenticDBTenantApiKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAgenticDBTenantApiKeysResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgenticDBTenantApiKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAgenticDBTenantApiKeysResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of API keys.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C3D4E5F6-A7B8-9012-CDEF-123456789012</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAgenticDBTenantApiKeysResponseBody build() {
            return new DescribeAgenticDBTenantApiKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAgenticDBTenantApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBTenantApiKeysResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKeyId")
        private String apiKeyId;

        @com.aliyun.core.annotation.NameInMap("ApiKeyMasked")
        private String apiKeyMasked;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        private Items(Builder builder) {
            this.apiKeyId = builder.apiKeyId;
            this.apiKeyMasked = builder.apiKeyMasked;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.expireTime = builder.expireTime;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.tenantName = builder.tenantName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return apiKeyId
         */
        public String getApiKeyId() {
            return this.apiKeyId;
        }

        /**
         * @return apiKeyMasked
         */
        public String getApiKeyMasked() {
            return this.apiKeyMasked;
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
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        public static final class Builder {
            private String apiKeyId; 
            private String apiKeyMasked; 
            private String createTime; 
            private String description; 
            private String expireTime; 
            private String status; 
            private String tenantId; 
            private String tenantName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.apiKeyId = model.apiKeyId;
                this.apiKeyMasked = model.apiKeyMasked;
                this.createTime = model.createTime;
                this.description = model.description;
                this.expireTime = model.expireTime;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.tenantName = model.tenantName;
            } 

            /**
             * <p>The resource ID of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>ak-71304e39c7e841a1</p>
             */
            public Builder apiKeyId(String apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * <p>The masked API key value.</p>
             * 
             * <strong>example:</strong>
             * <p>pagc_key_cGFnYy1icDFhMmIz****</p>
             */
            public Builder apiKeyMasked(String apiKeyMasked) {
                this.apiKeyMasked = apiKeyMasked;
                return this;
            }

            /**
             * <p>The time when the API key was created.</p>
             * <p>The time is in ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-10T10:30:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>MCP server token</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the API key expires.</p>
             * <p>The time is in ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
             * 
             * <strong>example:</strong>
             * <p>2027-01-01T00:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The status of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the tenant to which the API key belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>t-4b83e0da66674951</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The name of the tenant to which the API key belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-saas-app</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
