// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchNodesByOutputRequest} extends {@link RequestModel}
 *
 * <p>SearchNodesByOutputRequest</p>
 */
public class SearchNodesByOutputRequest extends Request {
    @Body
    @NameInMap("Outputs")
    @Validation(required = true)
    private String outputs;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SearchNodesByOutputRequest(Builder builder) {
        super(builder);
        this.outputs = builder.outputs;
        this.projectEnv = builder.projectEnv;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchNodesByOutputRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outputs
     */
    public String getOutputs() {
        return this.outputs;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SearchNodesByOutputRequest, Builder> {
        private String outputs; 
        private String projectEnv; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SearchNodesByOutputRequest request) {
            super(request);
            this.outputs = request.outputs;
            this.projectEnv = request.projectEnv;
            this.regionId = request.regionId;
        } 

        /**
         * Outputs.
         */
        public Builder outputs(String outputs) {
            this.putBodyParameter("Outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SearchNodesByOutputRequest build() {
            return new SearchNodesByOutputRequest(this);
        } 

    } 

}
