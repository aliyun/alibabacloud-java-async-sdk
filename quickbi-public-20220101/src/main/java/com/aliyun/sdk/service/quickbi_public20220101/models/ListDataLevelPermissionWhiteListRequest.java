// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataLevelPermissionWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ListDataLevelPermissionWhiteListRequest</p>
 */
public class ListDataLevelPermissionWhiteListRequest extends Request {
    @Query
    @NameInMap("CubeId")
    @Validation(required = true)
    private String cubeId;

    @Query
    @NameInMap("RuleType")
    @Validation(required = true)
    private String ruleType;

    private ListDataLevelPermissionWhiteListRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataLevelPermissionWhiteListRequest create() {
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

    public static final class Builder extends Request.Builder<ListDataLevelPermissionWhiteListRequest, Builder> {
        private String cubeId; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(ListDataLevelPermissionWhiteListRequest request) {
            super(request);
            this.cubeId = request.cubeId;
            this.ruleType = request.ruleType;
        } 

        /**
         * CubeId.
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public ListDataLevelPermissionWhiteListRequest build() {
            return new ListDataLevelPermissionWhiteListRequest(this);
        } 

    } 

}
