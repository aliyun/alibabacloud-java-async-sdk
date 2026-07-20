// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link UpdateRbacOrgUnitRequest} extends {@link RequestModel}
 *
 * <p>UpdateRbacOrgUnitRequest</p>
 */
public class UpdateRbacOrgUnitRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgUnitData")
    private String orgUnitData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgUnitId")
    private String orgUnitId;

    private UpdateRbacOrgUnitRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.orgUnitData = builder.orgUnitData;
        this.orgUnitId = builder.orgUnitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRbacOrgUnitRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return orgUnitData
     */
    public String getOrgUnitData() {
        return this.orgUnitData;
    }

    /**
     * @return orgUnitId
     */
    public String getOrgUnitId() {
        return this.orgUnitId;
    }

    public static final class Builder extends Request.Builder<UpdateRbacOrgUnitRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String orgUnitData; 
        private String orgUnitId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRbacOrgUnitRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.orgUnitData = request.orgUnitData;
            this.orgUnitId = request.orgUnitId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * OrgUnitData.
         */
        public Builder orgUnitData(String orgUnitData) {
            this.putQueryParameter("OrgUnitData", orgUnitData);
            this.orgUnitData = orgUnitData;
            return this;
        }

        /**
         * OrgUnitId.
         */
        public Builder orgUnitId(String orgUnitId) {
            this.putQueryParameter("OrgUnitId", orgUnitId);
            this.orgUnitId = orgUnitId;
            return this;
        }

        @Override
        public UpdateRbacOrgUnitRequest build() {
            return new UpdateRbacOrgUnitRequest(this);
        } 

    } 

}
