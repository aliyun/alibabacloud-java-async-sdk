// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessRuleRequest</p>
 */
public class DeleteAccessRuleRequest extends Request {
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
    @NameInMap("InputRegionId")
    @Validation(required = true)
    private String inputRegionId;

    private DeleteAccessRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessGroupId = builder.accessGroupId;
        this.accessRuleId = builder.accessRuleId;
        this.inputRegionId = builder.inputRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessRuleRequest create() {
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
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public static final class Builder extends Request.Builder<DeleteAccessRuleRequest, Builder> {
        private String regionId; 
        private String accessGroupId; 
        private String accessRuleId; 
        private String inputRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessGroupId = request.accessGroupId;
            this.accessRuleId = request.accessRuleId;
            this.inputRegionId = request.inputRegionId;
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
         * InputRegionId.
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        @Override
        public DeleteAccessRuleRequest build() {
            return new DeleteAccessRuleRequest(this);
        } 

    } 

}
