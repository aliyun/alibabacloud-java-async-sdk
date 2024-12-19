// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link CreateIpamResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpamResponseBody</p>
 */
public class CreateIpamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultResourceDiscoveryAssociationId")
    private String defaultResourceDiscoveryAssociationId;

    @com.aliyun.core.annotation.NameInMap("DefaultResourceDiscoveryId")
    private String defaultResourceDiscoveryId;

    @com.aliyun.core.annotation.NameInMap("IpamId")
    private String ipamId;

    @com.aliyun.core.annotation.NameInMap("PrivateDefaultScopeId")
    private String privateDefaultScopeId;

    @com.aliyun.core.annotation.NameInMap("PublicDefaultScopeId")
    private String publicDefaultScopeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceDiscoveryAssociationCount")
    private Integer resourceDiscoveryAssociationCount;

    private CreateIpamResponseBody(Builder builder) {
        this.defaultResourceDiscoveryAssociationId = builder.defaultResourceDiscoveryAssociationId;
        this.defaultResourceDiscoveryId = builder.defaultResourceDiscoveryId;
        this.ipamId = builder.ipamId;
        this.privateDefaultScopeId = builder.privateDefaultScopeId;
        this.publicDefaultScopeId = builder.publicDefaultScopeId;
        this.requestId = builder.requestId;
        this.resourceDiscoveryAssociationCount = builder.resourceDiscoveryAssociationCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpamResponseBody create() {
        return builder().build();
    }

    /**
     * @return defaultResourceDiscoveryAssociationId
     */
    public String getDefaultResourceDiscoveryAssociationId() {
        return this.defaultResourceDiscoveryAssociationId;
    }

    /**
     * @return defaultResourceDiscoveryId
     */
    public String getDefaultResourceDiscoveryId() {
        return this.defaultResourceDiscoveryId;
    }

    /**
     * @return ipamId
     */
    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * @return privateDefaultScopeId
     */
    public String getPrivateDefaultScopeId() {
        return this.privateDefaultScopeId;
    }

    /**
     * @return publicDefaultScopeId
     */
    public String getPublicDefaultScopeId() {
        return this.publicDefaultScopeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceDiscoveryAssociationCount
     */
    public Integer getResourceDiscoveryAssociationCount() {
        return this.resourceDiscoveryAssociationCount;
    }

    public static final class Builder {
        private String defaultResourceDiscoveryAssociationId; 
        private String defaultResourceDiscoveryId; 
        private String ipamId; 
        private String privateDefaultScopeId; 
        private String publicDefaultScopeId; 
        private String requestId; 
        private Integer resourceDiscoveryAssociationCount; 

        /**
         * DefaultResourceDiscoveryAssociationId.
         */
        public Builder defaultResourceDiscoveryAssociationId(String defaultResourceDiscoveryAssociationId) {
            this.defaultResourceDiscoveryAssociationId = defaultResourceDiscoveryAssociationId;
            return this;
        }

        /**
         * DefaultResourceDiscoveryId.
         */
        public Builder defaultResourceDiscoveryId(String defaultResourceDiscoveryId) {
            this.defaultResourceDiscoveryId = defaultResourceDiscoveryId;
            return this;
        }

        /**
         * IpamId.
         */
        public Builder ipamId(String ipamId) {
            this.ipamId = ipamId;
            return this;
        }

        /**
         * PrivateDefaultScopeId.
         */
        public Builder privateDefaultScopeId(String privateDefaultScopeId) {
            this.privateDefaultScopeId = privateDefaultScopeId;
            return this;
        }

        /**
         * PublicDefaultScopeId.
         */
        public Builder publicDefaultScopeId(String publicDefaultScopeId) {
            this.publicDefaultScopeId = publicDefaultScopeId;
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
         * ResourceDiscoveryAssociationCount.
         */
        public Builder resourceDiscoveryAssociationCount(Integer resourceDiscoveryAssociationCount) {
            this.resourceDiscoveryAssociationCount = resourceDiscoveryAssociationCount;
            return this;
        }

        public CreateIpamResponseBody build() {
            return new CreateIpamResponseBody(this);
        } 

    } 

}
