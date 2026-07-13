// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link CreateWorkerBootstrapTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkerBootstrapTokenResponseBody</p>
 */
public class CreateWorkerBootstrapTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateWorkerBootstrapTokenResponseBody(Builder builder) {
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

    public static CreateWorkerBootstrapTokenResponseBody create() {
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

        private Builder(CreateWorkerBootstrapTokenResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public CreateWorkerBootstrapTokenResponseBody build() {
            return new CreateWorkerBootstrapTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkerBootstrapTokenResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWorkerBootstrapTokenResponseBody</p>
     */
    public static class Cms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("LicenseKey")
        private String licenseKey;

        @com.aliyun.core.annotation.NameInMap("Workspace")
        private String workspace;

        private Cms(Builder builder) {
            this.endpoint = builder.endpoint;
            this.licenseKey = builder.licenseKey;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cms create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return licenseKey
         */
        public String getLicenseKey() {
            return this.licenseKey;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String endpoint; 
            private String licenseKey; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Cms model) {
                this.endpoint = model.endpoint;
                this.licenseKey = model.licenseKey;
                this.workspace = model.workspace;
            } 

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * LicenseKey.
             */
            public Builder licenseKey(String licenseKey) {
                this.licenseKey = licenseKey;
                return this;
            }

            /**
             * Workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Cms build() {
                return new Cms(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerBootstrapTokenResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWorkerBootstrapTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BootstrapToken")
        private String bootstrapToken;

        @com.aliyun.core.annotation.NameInMap("Cms")
        private Cms cms;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("TokenFingerprint")
        private String tokenFingerprint;

        private Data(Builder builder) {
            this.bootstrapToken = builder.bootstrapToken;
            this.cms = builder.cms;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.networkType = builder.networkType;
            this.tokenFingerprint = builder.tokenFingerprint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bootstrapToken
         */
        public String getBootstrapToken() {
            return this.bootstrapToken;
        }

        /**
         * @return cms
         */
        public Cms getCms() {
            return this.cms;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return tokenFingerprint
         */
        public String getTokenFingerprint() {
            return this.tokenFingerprint;
        }

        public static final class Builder {
            private String bootstrapToken; 
            private Cms cms; 
            private String instanceId; 
            private String name; 
            private String networkType; 
            private String tokenFingerprint; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bootstrapToken = model.bootstrapToken;
                this.cms = model.cms;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.networkType = model.networkType;
                this.tokenFingerprint = model.tokenFingerprint;
            } 

            /**
             * BootstrapToken.
             */
            public Builder bootstrapToken(String bootstrapToken) {
                this.bootstrapToken = bootstrapToken;
                return this;
            }

            /**
             * Cms.
             */
            public Builder cms(Cms cms) {
                this.cms = cms;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * TokenFingerprint.
             */
            public Builder tokenFingerprint(String tokenFingerprint) {
                this.tokenFingerprint = tokenFingerprint;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
