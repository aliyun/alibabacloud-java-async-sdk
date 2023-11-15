// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessRuleRequest</p>
 */
public class ModifyAccessRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AccessGroupId")
    @Validation(required = true)
    private String accessGroupId;

    @Query
    @NameInMap("AccessRuleId")
    @Validation(required = true)
    private String accessRuleId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InputRegionId")
    @Validation(required = true)
    private String inputRegionId;

    @Query
    @NameInMap("Priority")
    @Validation(maximum = 100)
    private Integer priority;

    @Query
    @NameInMap("RWAccessType")
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
         * AccessGroupId.
         */
        public Builder accessGroupId(String accessGroupId) {
            this.putQueryParameter("AccessGroupId", accessGroupId);
            this.accessGroupId = accessGroupId;
            return this;
        }

        /**
         * AccessRuleId.
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
         * InputRegionId.
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
