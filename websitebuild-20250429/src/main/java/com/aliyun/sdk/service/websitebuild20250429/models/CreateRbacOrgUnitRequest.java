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
 * {@link CreateRbacOrgUnitRequest} extends {@link RequestModel}
 *
 * <p>CreateRbacOrgUnitRequest</p>
 */
public class CreateRbacOrgUnitRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgUnitData")
    private String orgUnitData;

    private CreateRbacOrgUnitRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.orgUnitData = builder.orgUnitData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRbacOrgUnitRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRbacOrgUnitRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String orgUnitData; 

        private Builder() {
            super();
        } 

        private Builder(CreateRbacOrgUnitRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.orgUnitData = request.orgUnitData;
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

        @Override
        public CreateRbacOrgUnitRequest build() {
            return new CreateRbacOrgUnitRequest(this);
        } 

    } 

}
