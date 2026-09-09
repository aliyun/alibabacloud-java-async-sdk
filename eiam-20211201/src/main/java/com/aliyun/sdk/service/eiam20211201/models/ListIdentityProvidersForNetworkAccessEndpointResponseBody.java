// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListIdentityProvidersForNetworkAccessEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>ListIdentityProvidersForNetworkAccessEndpointResponseBody</p>
 */
public class ListIdentityProvidersForNetworkAccessEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentityProvidersForNetworkAccessEndpoint")
    private java.util.List<IdentityProvidersForNetworkAccessEndpoint> identityProvidersForNetworkAccessEndpoint;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIdentityProvidersForNetworkAccessEndpointResponseBody(Builder builder) {
        this.identityProvidersForNetworkAccessEndpoint = builder.identityProvidersForNetworkAccessEndpoint;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityProvidersForNetworkAccessEndpointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProvidersForNetworkAccessEndpoint
     */
    public java.util.List<IdentityProvidersForNetworkAccessEndpoint> getIdentityProvidersForNetworkAccessEndpoint() {
        return this.identityProvidersForNetworkAccessEndpoint;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<IdentityProvidersForNetworkAccessEndpoint> identityProvidersForNetworkAccessEndpoint; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListIdentityProvidersForNetworkAccessEndpointResponseBody model) {
            this.identityProvidersForNetworkAccessEndpoint = model.identityProvidersForNetworkAccessEndpoint;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The collection of IdPs for the network endpoint.</p>
         */
        public Builder identityProvidersForNetworkAccessEndpoint(java.util.List<IdentityProvidersForNetworkAccessEndpoint> identityProvidersForNetworkAccessEndpoint) {
            this.identityProvidersForNetworkAccessEndpoint = identityProvidersForNetworkAccessEndpoint;
            return this;
        }

        /**
         * <p>The token that is returned from the call.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIdentityProvidersForNetworkAccessEndpointResponseBody build() {
            return new ListIdentityProvidersForNetworkAccessEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIdentityProvidersForNetworkAccessEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>ListIdentityProvidersForNetworkAccessEndpointResponseBody</p>
     */
    public static class IdentityProvidersForNetworkAccessEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
        private String identityProviderId;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
        private String identityProviderName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private IdentityProvidersForNetworkAccessEndpoint(Builder builder) {
            this.identityProviderId = builder.identityProviderId;
            this.identityProviderName = builder.identityProviderName;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityProvidersForNetworkAccessEndpoint create() {
            return builder().build();
        }

        /**
         * @return identityProviderId
         */
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        /**
         * @return identityProviderName
         */
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String identityProviderId; 
            private String identityProviderName; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(IdentityProvidersForNetworkAccessEndpoint model) {
                this.identityProviderId = model.identityProviderId;
                this.identityProviderName = model.identityProviderName;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The ID of the IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>idp_nbq7i4ylodmm64iy6t5muxxxxx</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>The name of the IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>OIDC Provider</p>
             */
            public Builder identityProviderName(String identityProviderName) {
                this.identityProviderName = identityProviderName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_elk5evwagodqlmwpfehasxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public IdentityProvidersForNetworkAccessEndpoint build() {
                return new IdentityProvidersForNetworkAccessEndpoint(this);
            } 

        } 

    }
}
