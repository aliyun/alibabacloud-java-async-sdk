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
 * {@link GetSAMLServiceProviderInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSAMLServiceProviderInfoResponseBody</p>
 */
public class GetSAMLServiceProviderInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SAMLServiceProviderInfo")
    private SAMLServiceProviderInfo SAMLServiceProviderInfo;

    private GetSAMLServiceProviderInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SAMLServiceProviderInfo = builder.SAMLServiceProviderInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSAMLServiceProviderInfoResponseBody create() {
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
     * @return SAMLServiceProviderInfo
     */
    public SAMLServiceProviderInfo getSAMLServiceProviderInfo() {
        return this.SAMLServiceProviderInfo;
    }

    public static final class Builder {
        private String requestId; 
        private SAMLServiceProviderInfo SAMLServiceProviderInfo; 

        private Builder() {
        } 

        private Builder(GetSAMLServiceProviderInfoResponseBody model) {
            this.requestId = model.requestId;
            this.SAMLServiceProviderInfo = model.SAMLServiceProviderInfo;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SAMLServiceProviderInfo.
         */
        public Builder SAMLServiceProviderInfo(SAMLServiceProviderInfo SAMLServiceProviderInfo) {
            this.SAMLServiceProviderInfo = SAMLServiceProviderInfo;
            return this;
        }

        public GetSAMLServiceProviderInfoResponseBody build() {
            return new GetSAMLServiceProviderInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSAMLServiceProviderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetSAMLServiceProviderInfoResponseBody</p>
     */
    public static class SAMLServiceProviderInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ACSURL")
        private String ACSURL;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("SPMetadataDocument")
        private String SPMetadataDocument;

        @com.aliyun.core.annotation.NameInMap("UserPoolId")
        private String userPoolId;

        private SAMLServiceProviderInfo(Builder builder) {
            this.ACSURL = builder.ACSURL;
            this.entityId = builder.entityId;
            this.SPMetadataDocument = builder.SPMetadataDocument;
            this.userPoolId = builder.userPoolId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SAMLServiceProviderInfo create() {
            return builder().build();
        }

        /**
         * @return ACSURL
         */
        public String getACSURL() {
            return this.ACSURL;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return SPMetadataDocument
         */
        public String getSPMetadataDocument() {
            return this.SPMetadataDocument;
        }

        /**
         * @return userPoolId
         */
        public String getUserPoolId() {
            return this.userPoolId;
        }

        public static final class Builder {
            private String ACSURL; 
            private String entityId; 
            private String SPMetadataDocument; 
            private String userPoolId; 

            private Builder() {
            } 

            private Builder(SAMLServiceProviderInfo model) {
                this.ACSURL = model.ACSURL;
                this.entityId = model.entityId;
                this.SPMetadataDocument = model.SPMetadataDocument;
                this.userPoolId = model.userPoolId;
            } 

            /**
             * ACSURL.
             */
            public Builder ACSURL(String ACSURL) {
                this.ACSURL = ACSURL;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * SPMetadataDocument.
             */
            public Builder SPMetadataDocument(String SPMetadataDocument) {
                this.SPMetadataDocument = SPMetadataDocument;
                return this;
            }

            /**
             * UserPoolId.
             */
            public Builder userPoolId(String userPoolId) {
                this.userPoolId = userPoolId;
                return this;
            }

            public SAMLServiceProviderInfo build() {
                return new SAMLServiceProviderInfo(this);
            } 

        } 

    }
}
