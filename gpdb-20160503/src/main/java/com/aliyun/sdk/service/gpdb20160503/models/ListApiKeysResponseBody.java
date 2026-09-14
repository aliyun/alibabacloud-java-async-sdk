// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListApiKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiKeysResponseBody</p>
 */
public class ListApiKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListApiKeysResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiKeysResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListApiKeysResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of API keys.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of records to return in this query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListApiKeysResponseBody build() {
            return new ListApiKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiKeysResponseBody</p>
     */
    public static class AuthServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        private AuthServices(Builder builder) {
            this.serviceId = builder.serviceId;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthServices create() {
            return builder().build();
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private String serviceId; 
            private String serviceType; 

            private Builder() {
            } 

            private Builder(AuthServices model) {
                this.serviceId = model.serviceId;
                this.serviceType = model.serviceType;
            } 

            /**
             * <p>The service IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>agdb-xxxxxx</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>memory</li>
             * <li>drama</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>memory</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public AuthServices build() {
                return new AuthServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiKeysResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthServices")
        private java.util.List<AuthServices> authServices;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("KeyPrefix")
        private String keyPrefix;

        private Items(Builder builder) {
            this.authServices = builder.authServices;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.keyId = builder.keyId;
            this.keyName = builder.keyName;
            this.keyPrefix = builder.keyPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return authServices
         */
        public java.util.List<AuthServices> getAuthServices() {
            return this.authServices;
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
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return keyPrefix
         */
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public static final class Builder {
            private java.util.List<AuthServices> authServices; 
            private String createTime; 
            private String description; 
            private String keyId; 
            private String keyName; 
            private String keyPrefix; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.authServices = model.authServices;
                this.createTime = model.createTime;
                this.description = model.description;
                this.keyId = model.keyId;
                this.keyName = model.keyName;
                this.keyPrefix = model.keyPrefix;
            } 

            /**
             * <p>The service IDs.</p>
             */
            public Builder authServices(java.util.List<AuthServices> authServices) {
                this.authServices = authServices;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-09T04:54:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>my first api key</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxxxxxxx</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The name of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>my first api key</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * <p>The prefix of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-12345****</p>
             */
            public Builder keyPrefix(String keyPrefix) {
                this.keyPrefix = keyPrefix;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
