// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link CreateAPIKeyCredentialProviderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAPIKeyCredentialProviderResponseBody</p>
 */
public class CreateAPIKeyCredentialProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("APIKeyCredentialProvider")
    private APIKeyCredentialProvider APIKeyCredentialProvider;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAPIKeyCredentialProviderResponseBody(Builder builder) {
        this.APIKeyCredentialProvider = builder.APIKeyCredentialProvider;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAPIKeyCredentialProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APIKeyCredentialProvider
     */
    public APIKeyCredentialProvider getAPIKeyCredentialProvider() {
        return this.APIKeyCredentialProvider;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private APIKeyCredentialProvider APIKeyCredentialProvider; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAPIKeyCredentialProviderResponseBody model) {
            this.APIKeyCredentialProvider = model.APIKeyCredentialProvider;
            this.requestId = model.requestId;
        } 

        /**
         * APIKeyCredentialProvider.
         */
        public Builder APIKeyCredentialProvider(APIKeyCredentialProvider APIKeyCredentialProvider) {
            this.APIKeyCredentialProvider = APIKeyCredentialProvider;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAPIKeyCredentialProviderResponseBody build() {
            return new CreateAPIKeyCredentialProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAPIKeyCredentialProviderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAPIKeyCredentialProviderResponseBody</p>
     */
    public static class APIKeyCredentialProvider extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("APIKeyCredentialProviderName")
        private String APIKeyCredentialProviderName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CredentialProviderArn")
        private String credentialProviderArn;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private APIKeyCredentialProvider(Builder builder) {
            this.APIKeyCredentialProviderName = builder.APIKeyCredentialProviderName;
            this.createTime = builder.createTime;
            this.credentialProviderArn = builder.credentialProviderArn;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static APIKeyCredentialProvider create() {
            return builder().build();
        }

        /**
         * @return APIKeyCredentialProviderName
         */
        public String getAPIKeyCredentialProviderName() {
            return this.APIKeyCredentialProviderName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialProviderArn
         */
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String APIKeyCredentialProviderName; 
            private String createTime; 
            private String credentialProviderArn; 
            private String description; 

            private Builder() {
            } 

            private Builder(APIKeyCredentialProvider model) {
                this.APIKeyCredentialProviderName = model.APIKeyCredentialProviderName;
                this.createTime = model.createTime;
                this.credentialProviderArn = model.credentialProviderArn;
                this.description = model.description;
            } 

            /**
             * APIKeyCredentialProviderName.
             */
            public Builder APIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
                this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CredentialProviderArn.
             */
            public Builder credentialProviderArn(String credentialProviderArn) {
                this.credentialProviderArn = credentialProviderArn;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public APIKeyCredentialProvider build() {
                return new APIKeyCredentialProvider(this);
            } 

        } 

    }
}
