// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeOperatorsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOperatorsRequest</p>
 */
public class DescribeOperatorsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneType")
    private String sceneType;

    private DescribeOperatorsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.sceneType = builder.sceneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOperatorsRequest create() {
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
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    public static final class Builder extends Request.Builder<DescribeOperatorsRequest, Builder> {
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String sceneType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOperatorsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.sceneType = request.sceneType;
        } 

        /**
         * <p>The region of the Data Management center for threat analysis. Select a region based on your asset location. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: Assets in the Chinese mainland and China (Hong Kong).</p>
         * </li>
         * <li><p>ap-southeast-1: Assets outside China.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user ID of the member. An administrator can use this parameter to switch to the perspective of this member.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The view type.</p>
         * <ul>
         * <li><p>0: The view of the current Alibaba Cloud account.</p>
         * </li>
         * <li><p>1: The view of all accounts that are managed by your enterprise.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The scenario for the operator. Valid values:</p>
         * <ul>
         * <li><p>If you leave this parameter empty, the default scenario is used.</p>
         * </li>
         * <li><p>AGGREGATE: The aggregate function scenario.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AGGREGATE</p>
         */
        public Builder sceneType(String sceneType) {
            this.putBodyParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        @Override
        public DescribeOperatorsRequest build() {
            return new DescribeOperatorsRequest(this);
        } 

    } 

}
