// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link CreateAgenticSqlExecuteCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgenticSqlExecuteCredentialResponseBody</p>
 */
public class CreateAgenticSqlExecuteCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateAgenticSqlExecuteCredentialResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticSqlExecuteCredentialResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateAgenticSqlExecuteCredentialResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The temporary credential information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_PARAMETER</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34E01EDD-6A16-4CF0-9541-C644D1BE01AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.                                 </li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateAgenticSqlExecuteCredentialResponseBody build() {
            return new CreateAgenticSqlExecuteCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgenticSqlExecuteCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgenticSqlExecuteCredentialResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("AccessSecret")
        private String accessSecret;

        @com.aliyun.core.annotation.NameInMap("CatalogName")
        private String catalogName;

        @com.aliyun.core.annotation.NameInMap("CatalogUuid")
        private String catalogUuid;

        @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
        private String databaseUuid;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("MaxConnectTimes")
        private Long maxConnectTimes;

        @com.aliyun.core.annotation.NameInMap("QualifiedName")
        private String qualifiedName;

        private Data(Builder builder) {
            this.accessKey = builder.accessKey;
            this.accessSecret = builder.accessSecret;
            this.catalogName = builder.catalogName;
            this.catalogUuid = builder.catalogUuid;
            this.databaseUuid = builder.databaseUuid;
            this.expireTime = builder.expireTime;
            this.maxConnectTimes = builder.maxConnectTimes;
            this.qualifiedName = builder.qualifiedName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return accessSecret
         */
        public String getAccessSecret() {
            return this.accessSecret;
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
        }

        /**
         * @return catalogUuid
         */
        public String getCatalogUuid() {
            return this.catalogUuid;
        }

        /**
         * @return databaseUuid
         */
        public String getDatabaseUuid() {
            return this.databaseUuid;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return maxConnectTimes
         */
        public Long getMaxConnectTimes() {
            return this.maxConnectTimes;
        }

        /**
         * @return qualifiedName
         */
        public String getQualifiedName() {
            return this.qualifiedName;
        }

        public static final class Builder {
            private String accessKey; 
            private String accessSecret; 
            private String catalogName; 
            private String catalogUuid; 
            private String databaseUuid; 
            private String expireTime; 
            private Long maxConnectTimes; 
            private String qualifiedName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessKey = model.accessKey;
                this.accessSecret = model.accessSecret;
                this.catalogName = model.catalogName;
                this.catalogUuid = model.catalogUuid;
                this.databaseUuid = model.databaseUuid;
                this.expireTime = model.expireTime;
                this.maxConnectTimes = model.maxConnectTimes;
                this.qualifiedName = model.qualifiedName;
            } 

            /**
             * <p>The AccessKey of the credential.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_xxxxxxxx</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The AccessKey secret of the credential. This value is returned only once when the credential is created. Keep it secure.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxx</p>
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1xxxxxxxx</p>
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * <p>The UUID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>9f8e7d6c-xxxx-xxxx-xxxx-1a2b3c4d5e6f</p>
             */
            public Builder catalogUuid(String catalogUuid) {
                this.catalogUuid = catalogUuid;
                return this;
            }

            /**
             * <p>The UUID of the database. If the credential is at the instance level, this value is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>6c4e8a2b-xxxx-xxxx-xxxx-0f1d2e3c4b5a</p>
             */
            public Builder databaseUuid(String databaseUuid) {
                this.databaseUuid = databaseUuid;
                return this;
            }

            /**
             * <p>The expiration time of the credential. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-13 12:00:00</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The total number of connections supported by the credential.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxConnectTimes(Long maxConnectTimes) {
                this.maxConnectTimes = maxConnectTimes;
                return this;
            }

            /**
             * <p>The fully qualified name of the database. If the credential is at the instance level, this value is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder qualifiedName(String qualifiedName) {
                this.qualifiedName = qualifiedName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
