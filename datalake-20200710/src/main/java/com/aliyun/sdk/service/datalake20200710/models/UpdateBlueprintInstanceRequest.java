// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBlueprintInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateBlueprintInstanceRequest</p>
 */
public class UpdateBlueprintInstanceRequest extends Request {
    @Body
    @NameInMap("ExecuteCapacity")
    private Integer executeCapacity;

    @Body
    @NameInMap("ExecuteConcurrency")
    private Integer executeConcurrency;

    @Body
    @NameInMap("ExecuteParameters")
    private String executeParameters;

    @Body
    @NameInMap("ExecuteType")
    private String executeType;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private UpdateBlueprintInstanceRequest(Builder builder) {
        super(builder);
        this.executeCapacity = builder.executeCapacity;
        this.executeConcurrency = builder.executeConcurrency;
        this.executeParameters = builder.executeParameters;
        this.executeType = builder.executeType;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBlueprintInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executeCapacity
     */
    public Integer getExecuteCapacity() {
        return this.executeCapacity;
    }

    /**
     * @return executeConcurrency
     */
    public Integer getExecuteConcurrency() {
        return this.executeConcurrency;
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateBlueprintInstanceRequest, Builder> {
        private Integer executeCapacity; 
        private Integer executeConcurrency; 
        private String executeParameters; 
        private String executeType; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBlueprintInstanceRequest response) {
            super(response);
            this.executeCapacity = response.executeCapacity;
            this.executeConcurrency = response.executeConcurrency;
            this.executeParameters = response.executeParameters;
            this.executeType = response.executeType;
            this.id = response.id;
        } 

        /**
         * ExecuteCapacity.
         */
        public Builder executeCapacity(Integer executeCapacity) {
            this.putBodyParameter("ExecuteCapacity", executeCapacity);
            this.executeCapacity = executeCapacity;
            return this;
        }

        /**
         * ExecuteConcurrency.
         */
        public Builder executeConcurrency(Integer executeConcurrency) {
            this.putBodyParameter("ExecuteConcurrency", executeConcurrency);
            this.executeConcurrency = executeConcurrency;
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
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateBlueprintInstanceRequest build() {
            return new UpdateBlueprintInstanceRequest(this);
        } 

    } 

}
