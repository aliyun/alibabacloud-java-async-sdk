// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link AddDataLevelPermissionWhiteListRequest} extends {@link RequestModel}
 *
 * <p>AddDataLevelPermissionWhiteListRequest</p>
 */
public class AddDataLevelPermissionWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CubeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cubeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetIds")
    private String targetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
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
         * <p>The dataset ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-***-3c744528014b</p>
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * <p>The operation type. Valid values: </p>
         * <ul>
         * <li>ADD: add entries to the whitelist</li>
         * <li>DELETE: remove entries from the whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>The permission type. Valid values:</p>
         * <ul>
         * <li>ROW_LEVEL: row-level permissions</li>
         * <li>COLUMN_LEVEL: column-level permissions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROW_LEVEL</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The authorization targets. You can specify multiple targets separated by commas (,). Valid values:</p>
         * <ul>
         * <li>If TargetType is set to 1 (user), the value is the user ID.</li>
         * <li>If TargetType is set to 2 (user group), the value is the user group ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>43342<em><strong>435,1553a</strong></em>*41231</p>
         */
        public Builder targetIds(String targetIds) {
            this.putQueryParameter("TargetIds", targetIds);
            this.targetIds = targetIds;
            return this;
        }

        /**
         * <p>The type of the target for which the whitelist is modified. Valid values:</p>
         * <ul>
         * <li>1: user </li>
         * <li>2: user group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
