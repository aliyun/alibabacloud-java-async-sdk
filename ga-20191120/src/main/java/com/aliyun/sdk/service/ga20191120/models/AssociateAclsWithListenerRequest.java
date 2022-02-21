// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateAclsWithListenerRequest} extends {@link RequestModel}
 *
 * <p>AssociateAclsWithListenerRequest</p>
 */
public class AssociateAclsWithListenerRequest extends Request {
    @Query
    @NameInMap("AclIds")
    @Validation(required = true)
    private java.util.List < String > aclIds;

    @Query
    @NameInMap("AclType")
    @Validation(required = true)
    private String aclType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AssociateAclsWithListenerRequest(Builder builder) {
        super(builder);
        this.aclIds = builder.aclIds;
        this.aclType = builder.aclType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateAclsWithListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclIds
     */
    public java.util.List < String > getAclIds() {
        return this.aclIds;
    }

    /**
     * @return aclType
     */
    public String getAclType() {
        return this.aclType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AssociateAclsWithListenerRequest, Builder> {
        private java.util.List < String > aclIds; 
        private String aclType; 
        private String clientToken; 
        private Boolean dryRun; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateAclsWithListenerRequest response) {
            super(response);
            this.aclIds = response.aclIds;
            this.aclType = response.aclType;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.listenerId = response.listenerId;
            this.regionId = response.regionId;
        } 

        /**
         * AclIds.
         */
        public Builder aclIds(java.util.List < String > aclIds) {
            this.putQueryParameter("AclIds", aclIds);
            this.aclIds = aclIds;
            return this;
        }

        /**
         * AclType.
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AssociateAclsWithListenerRequest build() {
            return new AssociateAclsWithListenerRequest(this);
        } 

    } 

}
