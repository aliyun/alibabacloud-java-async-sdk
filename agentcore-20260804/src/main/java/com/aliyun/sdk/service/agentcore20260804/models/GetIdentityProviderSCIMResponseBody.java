// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetIdentityProviderSCIMResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderSCIMResponseBody</p>
 */
public class GetIdentityProviderSCIMResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetIdentityProviderSCIMResponseBody(Builder builder) {
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

    public static GetIdentityProviderSCIMResponseBody create() {
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
    public Integer getHttpStatusCode() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderSCIMResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>If the request fails, handle the error based on the HTTP status code and the message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result structure. For details, see the response fields of this operation. The response of an asynchronous write operation indicates that the request is accepted, but does not guarantee that the background task is completed.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The processing status of the current request. This is not equivalent to the final result of the background task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request acceptance or error message. For the results of an asynchronous task, check the corresponding query operation.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Used to associate the current call with troubleshooting. Retain this parameter when a failure occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>request-example</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the current request is successful. A value of true indicates that the current request is processed successfully. For asynchronous writes, you still need to continue querying the task results.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetIdentityProviderSCIMResponseBody build() {
            return new GetIdentityProviderSCIMResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderSCIMResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderSCIMResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Configuration(Builder builder) {
            this.baseUrl = builder.baseUrl;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String baseUrl; 
            private String status; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.baseUrl = model.baseUrl;
                this.status = model.status;
            } 

            /**
             * <p>The URL configured for the external provisioning system. The presence of a URL does not mean that the external configuration is complete or that AC synchronization is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/scim/v2">https://example.com/scim/v2</a></p>
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * <p>The receiving status of AgentIdentity. Valid values:</p>
             * <ul>
             * <li>Enabled: SCIM receiving is enabled.</li>
             * <li>Disabled: SCIM receiving is disabled.
             * This is not equivalent to the expected value of syncEnabled for AC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderSCIMResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderSCIMResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configuration")
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("operationStatus")
        private String operationStatus;

        @com.aliyun.core.annotation.NameInMap("syncEnabled")
        private Boolean syncEnabled;

        private Data(Builder builder) {
            this.configuration = builder.configuration;
            this.operationStatus = builder.operationStatus;
            this.syncEnabled = builder.syncEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public Configuration getConfiguration() {
            return this.configuration;
        }

        /**
         * @return operationStatus
         */
        public String getOperationStatus() {
            return this.operationStatus;
        }

        /**
         * @return syncEnabled
         */
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public static final class Builder {
            private Configuration configuration; 
            private String operationStatus; 
            private Boolean syncEnabled; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configuration = model.configuration;
                this.operationStatus = model.operationStatus;
                this.syncEnabled = model.syncEnabled;
            } 

            /**
             * <p>The actual SAML configuration is read back on demand only in GetIdentityProvider. SCIM queries and preparations return the actual receiving status and URL.</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>Independent of the SAML logon binding status. Valid values:</p>
             * <ul>
             * <li>PENDING: Waiting to be executed.</li>
             * <li>RUNNING: Being executed.</li>
             * <li>PAUSED: Paused.</li>
             * <li>SUCCESS: Succeeded.</li>
             * <li>FAILED: Failed.</li>
             * <li>CANCELED: Canceled.
             * If there are no tasks, null is returned or this parameter is not returned. This parameter only indicates the most recent SCIM switch and the first full import task when it is enabled. It does not indicate credential issuance, external provisioning connection tests, or the health of continuous incremental synchronization. The client polls this operation when the status is PENDING or RUNNING.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * <p>Specifies whether local synchronization is expected. Do not set this parameter to true during CustomSSO initialization. You can only update this parameter by calling UpdateIdentityProviderSCIM. Determine the result based on operationStatus.</p>
             */
            public Builder syncEnabled(Boolean syncEnabled) {
                this.syncEnabled = syncEnabled;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
