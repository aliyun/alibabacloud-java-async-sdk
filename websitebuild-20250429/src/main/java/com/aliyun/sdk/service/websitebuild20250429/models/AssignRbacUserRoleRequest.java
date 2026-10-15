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
 * {@link AssignRbacUserRoleRequest} extends {@link RequestModel}
 *
 * <p>AssignRbacUserRoleRequest</p>
 */
public class AssignRbacUserRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserRoleData")
    private String userRoleData;

    private AssignRbacUserRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.userRoleData = builder.userRoleData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignRbacUserRoleRequest create() {
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
     * @return userRoleData
     */
    public String getUserRoleData() {
        return this.userRoleData;
    }

    public static final class Builder extends Request.Builder<AssignRbacUserRoleRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String userRoleData; 

        private Builder() {
            super();
        } 

        private Builder(AssignRbacUserRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.userRoleData = request.userRoleData;
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
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The role parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;user_id&quot;: &quot;c1721c87-5401-40b3-b836-9b2653507feb&quot;,
         *     &quot;role_id&quot;: &quot;804a6b2a-82ac-49f2-960a-a6c2ed9e73dd&quot;,
         *     &quot;org_id&quot;: &quot;f0534aa7-94ec-4368-a34a-310390f66253&quot;}</p>
         */
        public Builder userRoleData(String userRoleData) {
            this.putQueryParameter("UserRoleData", userRoleData);
            this.userRoleData = userRoleData;
            return this;
        }

        @Override
        public AssignRbacUserRoleRequest build() {
            return new AssignRbacUserRoleRequest(this);
        } 

    } 

}
