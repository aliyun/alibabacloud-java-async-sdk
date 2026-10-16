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
 * {@link GetSpecificIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpecificIdentityProviderResponseBody</p>
 */
public class GetSpecificIdentityProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpecificIdentityProviderConfiguration")
    private SpecificIdentityProviderConfiguration specificIdentityProviderConfiguration;

    private GetSpecificIdentityProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.specificIdentityProviderConfiguration = builder.specificIdentityProviderConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpecificIdentityProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return specificIdentityProviderConfiguration
     */
    public SpecificIdentityProviderConfiguration getSpecificIdentityProviderConfiguration() {
        return this.specificIdentityProviderConfiguration;
    }

    public static final class Builder {
        private String requestId; 
        private SpecificIdentityProviderConfiguration specificIdentityProviderConfiguration; 

        private Builder() {
        } 

        private Builder(GetSpecificIdentityProviderResponseBody model) {
            this.requestId = model.requestId;
            this.specificIdentityProviderConfiguration = model.specificIdentityProviderConfiguration;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The identity provider configuration information.</p>
         */
        public Builder specificIdentityProviderConfiguration(SpecificIdentityProviderConfiguration specificIdentityProviderConfiguration) {
            this.specificIdentityProviderConfiguration = specificIdentityProviderConfiguration;
            return this;
        }

        public GetSpecificIdentityProviderResponseBody build() {
            return new GetSpecificIdentityProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSpecificIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetSpecificIdentityProviderResponseBody</p>
     */
    public static class SpecificIdentityProviderConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IDPMetadata")
        private String IDPMetadata;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
        private String identityProviderType;

        @com.aliyun.core.annotation.NameInMap("SSOStatus")
        private String SSOStatus;

        private SpecificIdentityProviderConfiguration(Builder builder) {
            this.IDPMetadata = builder.IDPMetadata;
            this.identityProviderType = builder.identityProviderType;
            this.SSOStatus = builder.SSOStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificIdentityProviderConfiguration create() {
            return builder().build();
        }

        /**
         * @return IDPMetadata
         */
        public String getIDPMetadata() {
            return this.IDPMetadata;
        }

        /**
         * @return identityProviderType
         */
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        /**
         * @return SSOStatus
         */
        public String getSSOStatus() {
            return this.SSOStatus;
        }

        public static final class Builder {
            private String IDPMetadata; 
            private String identityProviderType; 
            private String SSOStatus; 

            private Builder() {
            } 

            private Builder(SpecificIdentityProviderConfiguration model) {
                this.IDPMetadata = model.IDPMetadata;
                this.identityProviderType = model.identityProviderType;
                this.SSOStatus = model.SSOStatus;
            } 

            /**
             * <p>The IdP metadata content.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;corpId&quot;:&quot;dingxxxxxxxxxx&quot;,&quot;appKey&quot;:&quot;dingxxxxxxxxxx&quot;,&quot;syncCallbackStatus&quot;:&quot;Enabled&quot;}</p>
             */
            public Builder IDPMetadata(String IDPMetadata) {
                this.IDPMetadata = IDPMetadata;
                return this;
            }

            /**
             * <p>The type of the identity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk</p>
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * <p>The SSO enabling status.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder SSOStatus(String SSOStatus) {
                this.SSOStatus = SSOStatus;
                return this;
            }

            public SpecificIdentityProviderConfiguration build() {
                return new SpecificIdentityProviderConfiguration(this);
            } 

        } 

    }
}
