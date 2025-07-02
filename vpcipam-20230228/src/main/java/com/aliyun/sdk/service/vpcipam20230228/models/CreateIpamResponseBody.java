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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateIpamResponseBody model) {
            this.defaultResourceDiscoveryAssociationId = model.defaultResourceDiscoveryAssociationId;
            this.defaultResourceDiscoveryId = model.defaultResourceDiscoveryId;
            this.ipamId = model.ipamId;
            this.privateDefaultScopeId = model.privateDefaultScopeId;
            this.publicDefaultScopeId = model.publicDefaultScopeId;
            this.requestId = model.requestId;
            this.resourceDiscoveryAssociationCount = model.resourceDiscoveryAssociationCount;
        } 

        /**
         * <p>The ID of the default resource discovery association.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-res-disco-assoc-jt5fac8twugdbbgip****</p>
         */
        public Builder defaultResourceDiscoveryAssociationId(String defaultResourceDiscoveryAssociationId) {
            this.defaultResourceDiscoveryAssociationId = defaultResourceDiscoveryAssociationId;
            return this;
        }

        /**
         * <p>The ID of the default resource discovery instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
         */
        public Builder defaultResourceDiscoveryId(String defaultResourceDiscoveryId) {
            this.defaultResourceDiscoveryId = defaultResourceDiscoveryId;
            return this;
        }

        /**
         * <p>The ID of the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-ccxbnsbhew0d6t****</p>
         */
        public Builder ipamId(String ipamId) {
            this.ipamId = ipamId;
            return this;
        }

        /**
         * <p>The default private scope created by the system after the IPAM is created.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-scope-8wiontzmiy6cg0****</p>
         */
        public Builder privateDefaultScopeId(String privateDefaultScopeId) {
            this.privateDefaultScopeId = privateDefaultScopeId;
            return this;
        }

        /**
         * <p>The default public scope created by the system after the IPAM is created.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-scope-r5c5c7bmym1brc****</p>
         */
        public Builder publicDefaultScopeId(String publicDefaultScopeId) {
            this.publicDefaultScopeId = publicDefaultScopeId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED39DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of discovered resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
