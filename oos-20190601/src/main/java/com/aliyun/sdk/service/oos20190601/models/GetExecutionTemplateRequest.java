// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExecutionTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetExecutionTemplateRequest</p>
 */
public class GetExecutionTemplateRequest extends Request {
    @Query
    @NameInMap("ExecutionId")
    @Validation(required = true)
    private String executionId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetExecutionTemplateRequest(Builder builder) {
        super(builder);
        this.executionId = builder.executionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExecutionTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetExecutionTemplateRequest, Builder> {
        private String executionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetExecutionTemplateRequest response) {
            super(response);
            this.executionId = response.executionId;
            this.regionId = response.regionId;
        } 

        /**
         * ExecutionId.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetExecutionTemplateRequest build() {
            return new GetExecutionTemplateRequest(this);
        } 

    } 

}
