// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the training dataset that you want to remove from the specified custom linguistic model.
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * The type of the dataset row and column permission. Valid values:
         * <p>
         * 
         * *   ROW_LEVEL: row-level permissions
         * *   COLUMN_LEVEL: column-level permissions
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
