// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDeployPauseTypeRequest} extends {@link RequestModel}
 *
 * <p>SetDeployPauseTypeRequest</p>
 */
public class SetDeployPauseTypeRequest extends Request {
    @Query
    @NameInMap("DeployOrderId")
    @Validation(required = true)
    private Long deployOrderId;

    @Query
    @NameInMap("DeployPauseType")
    @Validation(required = true)
    private String deployPauseType;

    private SetDeployPauseTypeRequest(Builder builder) {
        super(builder);
        this.deployOrderId = builder.deployOrderId;
        this.deployPauseType = builder.deployPauseType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDeployPauseTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployOrderId
     */
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

    /**
     * @return deployPauseType
     */
    public String getDeployPauseType() {
        return this.deployPauseType;
    }

    public static final class Builder extends Request.Builder<SetDeployPauseTypeRequest, Builder> {
        private Long deployOrderId; 
        private String deployPauseType; 

        private Builder() {
            super();
        } 

        private Builder(SetDeployPauseTypeRequest request) {
            super(request);
            this.deployOrderId = request.deployOrderId;
            this.deployPauseType = request.deployPauseType;
        } 

        /**
         * DeployOrderId.
         */
        public Builder deployOrderId(Long deployOrderId) {
            this.putQueryParameter("DeployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        /**
         * DeployPauseType.
         */
        public Builder deployPauseType(String deployPauseType) {
            this.putQueryParameter("DeployPauseType", deployPauseType);
            this.deployPauseType = deployPauseType;
            return this;
        }

        @Override
        public SetDeployPauseTypeRequest build() {
            return new SetDeployPauseTypeRequest(this);
        } 

    } 

}
