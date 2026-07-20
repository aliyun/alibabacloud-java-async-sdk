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
 * {@link CreateRbacPermissionRequest} extends {@link RequestModel}
 *
 * <p>CreateRbacPermissionRequest</p>
 */
public class CreateRbacPermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionData")
    private String permissionData;

    private CreateRbacPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.permissionData = builder.permissionData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRbacPermissionRequest create() {
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
     * @return permissionData
     */
    public String getPermissionData() {
        return this.permissionData;
    }

    public static final class Builder extends Request.Builder<CreateRbacPermissionRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String permissionData; 

        private Builder() {
            super();
        } 

        private Builder(CreateRbacPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.permissionData = request.permissionData;
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
         * PermissionData.
         */
        public Builder permissionData(String permissionData) {
            this.putQueryParameter("PermissionData", permissionData);
            this.permissionData = permissionData;
            return this;
        }

        @Override
        public CreateRbacPermissionRequest build() {
            return new CreateRbacPermissionRequest(this);
        } 

    } 

}
