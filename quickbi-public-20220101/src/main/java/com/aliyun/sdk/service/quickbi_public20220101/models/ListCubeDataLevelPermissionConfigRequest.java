// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCubeDataLevelPermissionConfigRequest} extends {@link RequestModel}
 *
 * <p>ListCubeDataLevelPermissionConfigRequest</p>
 */
public class ListCubeDataLevelPermissionConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CubeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cubeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleType;

    private ListCubeDataLevelPermissionConfigRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCubeDataLevelPermissionConfigRequest create() {
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
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<ListCubeDataLevelPermissionConfigRequest, Builder> {
        private String cubeId; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(ListCubeDataLevelPermissionConfigRequest request) {
            super(request);
            this.cubeId = request.cubeId;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * <p>The type of the dataset row and column permission. Valid values:</p>
         * <ul>
         * <li>ROW_LEVEL: row-level permissions</li>
         * <li>COLUMN_LEVEL: column-level permissions</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ROW_LEVEL</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public ListCubeDataLevelPermissionConfigRequest build() {
            return new ListCubeDataLevelPermissionConfigRequest(this);
        } 

    } 

}
