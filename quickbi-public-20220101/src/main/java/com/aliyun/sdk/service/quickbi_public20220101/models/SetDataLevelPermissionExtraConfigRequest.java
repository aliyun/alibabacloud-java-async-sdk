// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataLevelPermissionExtraConfigRequest} extends {@link RequestModel}
 *
 * <p>SetDataLevelPermissionExtraConfigRequest</p>
 */
public class SetDataLevelPermissionExtraConfigRequest extends Request {
    @Query
    @NameInMap("CubeId")
    @Validation(required = true)
    private String cubeId;

    @Query
    @NameInMap("MissHitPolicy")
    @Validation(required = true)
    private String missHitPolicy;

    @Query
    @NameInMap("RuleType")
    @Validation(required = true)
    private String ruleType;

    private SetDataLevelPermissionExtraConfigRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
        this.missHitPolicy = builder.missHitPolicy;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDataLevelPermissionExtraConfigRequest create() {
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
     * @return missHitPolicy
     */
    public String getMissHitPolicy() {
        return this.missHitPolicy;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<SetDataLevelPermissionExtraConfigRequest, Builder> {
        private String cubeId; 
        private String missHitPolicy; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(SetDataLevelPermissionExtraConfigRequest request) {
            super(request);
            this.cubeId = request.cubeId;
            this.missHitPolicy = request.missHitPolicy;
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
         * MissHitPolicy.
         */
        public Builder missHitPolicy(String missHitPolicy) {
            this.putQueryParameter("MissHitPolicy", missHitPolicy);
            this.missHitPolicy = missHitPolicy;
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
        public SetDataLevelPermissionExtraConfigRequest build() {
            return new SetDataLevelPermissionExtraConfigRequest(this);
        } 

    } 

}
