// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDataLevelPermissionWhiteListRequest} extends {@link RequestModel}
 *
 * <p>AddDataLevelPermissionWhiteListRequest</p>
 */
public class AddDataLevelPermissionWhiteListRequest extends Request {
    @Query
    @NameInMap("CubeId")
    @Validation(required = true)
    private String cubeId;

    @Query
    @NameInMap("OperateType")
    private String operateType;

    @Query
    @NameInMap("RuleType")
    private String ruleType;

    @Query
    @NameInMap("TargetIds")
    private String targetIds;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    private AddDataLevelPermissionWhiteListRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
        this.operateType = builder.operateType;
        this.ruleType = builder.ruleType;
        this.targetIds = builder.targetIds;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataLevelPermissionWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cubeId
     */
    public String getCubeId() {
        return this.cubeId;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return targetIds
     */
    public String getTargetIds() {
        return this.targetIds;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<AddDataLevelPermissionWhiteListRequest, Builder> {
        private String cubeId; 
        private String operateType; 
        private String ruleType; 
        private String targetIds; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(AddDataLevelPermissionWhiteListRequest request) {
            super(request);
            this.cubeId = request.cubeId;
            this.operateType = request.operateType;
            this.ruleType = request.ruleType;
            this.targetIds = request.targetIds;
            this.targetType = request.targetType;
        } 

        /**
         * The ID of the training dataset that you want to remove from the specified custom linguistic model.
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * Operation Type: You can set this parameter to one of the following values.
         * <p>
         * 
         * *   ADD: Add a whitelist
         * *   DELETE: deletes a whitelist.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * The type of row-level permissions.
         * <p>
         * 
         * *   ROW_LEVEL: row-level permissions,
         * *   COLUMN_LEVEL: column-level permissions
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * TargetIds.
         */
        public Builder targetIds(String targetIds) {
            this.putQueryParameter("TargetIds", targetIds);
            this.targetIds = targetIds;
            return this;
        }

        /**
         * Modify the type of the whitelist:
         * <p>
         * 
         * *   1: user
         * *   2: user group
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public AddDataLevelPermissionWhiteListRequest build() {
            return new AddDataLevelPermissionWhiteListRequest(this);
        } 

    } 

}
