// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListSecretsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecretsResponseBody</p>
 */
public class ListSecretsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListSecretsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretsResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSecretsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Code of the request</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>message</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2F270C0B-7D6A-5DA7-93E2-******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSecretsResponseBody build() {
            return new ListSecretsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("gatewayType")
        private String gatewayType;

        @com.aliyun.core.annotation.NameInMap("kmsConfig")
        private KMSConfig kmsConfig;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("referenceCount")
        private Integer referenceCount;

        @com.aliyun.core.annotation.NameInMap("secretId")
        private String secretId;

        @com.aliyun.core.annotation.NameInMap("secretSource")
        private String secretSource;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        private Items(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.gatewayType = builder.gatewayType;
            this.kmsConfig = builder.kmsConfig;
            this.name = builder.name;
            this.referenceCount = builder.referenceCount;
            this.secretId = builder.secretId;
            this.secretSource = builder.secretSource;
            this.status = builder.status;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return gatewayType
         */
        public String getGatewayType() {
            return this.gatewayType;
        }

        /**
         * @return kmsConfig
         */
        public KMSConfig getKmsConfig() {
            return this.kmsConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return referenceCount
         */
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        /**
         * @return secretId
         */
        public String getSecretId() {
            return this.secretId;
        }

        /**
         * @return secretSource
         */
        public String getSecretSource() {
            return this.secretSource;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private String gatewayType; 
            private KMSConfig kmsConfig; 
            private String name; 
            private Integer referenceCount; 
            private String secretId; 
            private String secretSource; 
            private String status; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.createTimestamp = model.createTimestamp;
                this.gatewayType = model.gatewayType;
                this.kmsConfig = model.kmsConfig;
                this.name = model.name;
                this.referenceCount = model.referenceCount;
                this.secretId = model.secretId;
                this.secretSource = model.secretSource;
                this.status = model.status;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * <p>Unix timestamp when the secret was created</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>Gateway type associated with the secret</p>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
                return this;
            }

            /**
             * <p>KMS configuration object</p>
             */
            public Builder kmsConfig(KMSConfig kmsConfig) {
                this.kmsConfig = kmsConfig;
                return this;
            }

            /**
             * <p>Name of the secret</p>
             * 
             * <strong>example:</strong>
             * <p>test-secret</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Number of resources referencing this secret</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * <p>Source of the ID</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * <p>Source of the secret</p>
             * 
             * <strong>example:</strong>
             * <p>KMS</p>
             */
            public Builder secretSource(String secretSource) {
                this.secretSource = secretSource;
                return this;
            }

            /**
             * <p>Current status of the secret</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Unix timestamp when the secret was last updated</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>Array of secret details</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>Page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Number of items per page</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of records matching the query</p>
             * 
             * <strong>example:</strong>
             * <p>104</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
