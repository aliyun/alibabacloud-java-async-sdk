// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWorkflowExecuteInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyWorkflowExecuteInfoRequest</p>
 */
public class ModifyWorkflowExecuteInfoRequest extends Request {
    @Body
    @NameInMap("BlueprintInstanceId")
    private String blueprintInstanceId;

    @Body
    @NameInMap("ExecuteCapacity")
    private String executeCapacity;

    @Body
    @NameInMap("ExecuteParameters")
    private String executeParameters;

    @Body
    @NameInMap("ExecuteType")
    private String executeType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyWorkflowExecuteInfoRequest(Builder builder) {
        super(builder);
        this.blueprintInstanceId = builder.blueprintInstanceId;
        this.executeCapacity = builder.executeCapacity;
        this.executeParameters = builder.executeParameters;
        this.executeType = builder.executeType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWorkflowExecuteInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blueprintInstanceId
     */
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

    /**
     * @return executeCapacity
     */
    public String getExecuteCapacity() {
        return this.executeCapacity;
    }

    /**
     * @return executeParameters
     */
    public String getExecuteParameters() {
        return this.executeParameters;
    }

    /**
     * @return executeType
     */
    public String getExecuteType() {
        return this.executeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyWorkflowExecuteInfoRequest, Builder> {
        private String blueprintInstanceId; 
        private String executeCapacity; 
        private String executeParameters; 
        private String executeType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWorkflowExecuteInfoRequest response) {
            super(response);
            this.blueprintInstanceId = response.blueprintInstanceId;
            this.executeCapacity = response.executeCapacity;
            this.executeParameters = response.executeParameters;
            this.executeType = response.executeType;
            this.regionId = response.regionId;
        } 

        /**
         * BlueprintInstanceId.
         */
        public Builder blueprintInstanceId(String blueprintInstanceId) {
            this.putBodyParameter("BlueprintInstanceId", blueprintInstanceId);
            this.blueprintInstanceId = blueprintInstanceId;
            return this;
        }

        /**
         * ExecuteCapacity.
         */
        public Builder executeCapacity(String executeCapacity) {
            this.putBodyParameter("ExecuteCapacity", executeCapacity);
            this.executeCapacity = executeCapacity;
            return this;
        }

        /**
         * ExecuteParameters.
         */
        public Builder executeParameters(String executeParameters) {
            this.putBodyParameter("ExecuteParameters", executeParameters);
            this.executeParameters = executeParameters;
            return this;
        }

        /**
         * ExecuteType.
         */
        public Builder executeType(String executeType) {
            this.putBodyParameter("ExecuteType", executeType);
            this.executeType = executeType;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyWorkflowExecuteInfoRequest build() {
            return new ModifyWorkflowExecuteInfoRequest(this);
        } 

    } 

}
