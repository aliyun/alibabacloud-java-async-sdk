// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ModifyAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessRuleRequest</p>
 */
public class ModifyAccessRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RWAccessType")
    private String RWAccessType;

    private ModifyAccessRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessGroupId = builder.accessGroupId;
        this.accessRuleId = builder.accessRuleId;
        this.description = builder.description;
        this.inputRegionId = builder.inputRegionId;
        this.priority = builder.priority;
        this.RWAccessType = builder.RWAccessType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccessRuleRequest create() {
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
     * @return accessGroupId
     */
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    /**
     * @return accessRuleId
     */
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return RWAccessType
     */
    public String getRWAccessType() {
        return this.RWAccessType;
    }

    public static final class Builder extends Request.Builder<ModifyAccessRuleRequest, Builder> {
        private String regionId; 
        private String accessGroupId; 
        private String accessRuleId; 
        private String description; 
        private String inputRegionId; 
        private Integer priority; 
        private String RWAccessType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccessRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessGroupId = request.accessGroupId;
            this.accessRuleId = request.accessRuleId;
            this.description = request.description;
            this.inputRegionId = request.inputRegionId;
            this.priority = request.priority;
            this.RWAccessType = request.RWAccessType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
         */
        public Builder accessGroupId(String accessGroupId) {
            this.putQueryParameter("AccessGroupId", accessGroupId);
            this.accessGroupId = accessGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-c38028f0-f313-4385-9456-3501b1f5****</p>
         */
        public Builder accessRuleId(String accessRuleId) {
            this.putQueryParameter("AccessRuleId", accessRuleId);
            this.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RWAccessType.
         */
        public Builder RWAccessType(String RWAccessType) {
            this.putQueryParameter("RWAccessType", RWAccessType);
            this.RWAccessType = RWAccessType;
            return this;
        }

        @Override
        public ModifyAccessRuleRequest build() {
            return new ModifyAccessRuleRequest(this);
        } 

    } 

}
