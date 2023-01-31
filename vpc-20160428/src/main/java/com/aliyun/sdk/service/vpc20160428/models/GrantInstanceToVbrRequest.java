// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantInstanceToVbrRequest} extends {@link RequestModel}
 *
 * <p>GrantInstanceToVbrRequest</p>
 */
public class GrantInstanceToVbrRequest extends Request {
    @Query
    @NameInMap("GrantType")
    @Validation(required = true)
    private String grantType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VbrInstanceIds")
    private java.util.List < String > vbrInstanceIds;

    @Query
    @NameInMap("VbrOwnerUid")
    @Validation(required = true)
    private Long vbrOwnerUid;

    @Query
    @NameInMap("VbrRegionNo")
    @Validation(required = true)
    private String vbrRegionNo;

    private GrantInstanceToVbrRequest(Builder builder) {
        super(builder);
        this.grantType = builder.grantType;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.vbrInstanceIds = builder.vbrInstanceIds;
        this.vbrOwnerUid = builder.vbrOwnerUid;
        this.vbrRegionNo = builder.vbrRegionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantInstanceToVbrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return grantType
     */
    public String getGrantType() {
        return this.grantType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vbrInstanceIds
     */
    public java.util.List < String > getVbrInstanceIds() {
        return this.vbrInstanceIds;
    }

    /**
     * @return vbrOwnerUid
     */
    public Long getVbrOwnerUid() {
        return this.vbrOwnerUid;
    }

    /**
     * @return vbrRegionNo
     */
    public String getVbrRegionNo() {
        return this.vbrRegionNo;
    }

    public static final class Builder extends Request.Builder<GrantInstanceToVbrRequest, Builder> {
        private String grantType; 
        private String instanceId; 
        private String regionId; 
        private java.util.List < String > vbrInstanceIds; 
        private Long vbrOwnerUid; 
        private String vbrRegionNo; 

        private Builder() {
            super();
        } 

        private Builder(GrantInstanceToVbrRequest request) {
            super(request);
            this.grantType = request.grantType;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.vbrInstanceIds = request.vbrInstanceIds;
            this.vbrOwnerUid = request.vbrOwnerUid;
            this.vbrRegionNo = request.vbrRegionNo;
        } 

        /**
         * GrantType.
         */
        public Builder grantType(String grantType) {
            this.putQueryParameter("GrantType", grantType);
            this.grantType = grantType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * VbrInstanceIds.
         */
        public Builder vbrInstanceIds(java.util.List < String > vbrInstanceIds) {
            String vbrInstanceIdsShrink = shrink(vbrInstanceIds, "VbrInstanceIds", "simple");
            this.putQueryParameter("VbrInstanceIds", vbrInstanceIdsShrink);
            this.vbrInstanceIds = vbrInstanceIds;
            return this;
        }

        /**
         * VbrOwnerUid.
         */
        public Builder vbrOwnerUid(Long vbrOwnerUid) {
            this.putQueryParameter("VbrOwnerUid", vbrOwnerUid);
            this.vbrOwnerUid = vbrOwnerUid;
            return this;
        }

        /**
         * VbrRegionNo.
         */
        public Builder vbrRegionNo(String vbrRegionNo) {
            this.putQueryParameter("VbrRegionNo", vbrRegionNo);
            this.vbrRegionNo = vbrRegionNo;
            return this;
        }

        @Override
        public GrantInstanceToVbrRequest build() {
            return new GrantInstanceToVbrRequest(this);
        } 

    } 

}
