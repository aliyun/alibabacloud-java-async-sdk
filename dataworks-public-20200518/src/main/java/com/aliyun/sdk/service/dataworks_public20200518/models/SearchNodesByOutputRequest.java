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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Outputs")
    @Validation(required = true)
    private String outputs;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    private SearchNodesByOutputRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.outputs = builder.outputs;
        this.projectEnv = builder.projectEnv;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<SearchNodesByOutputRequest, Builder> {
        private String regionId; 
        private String outputs; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(SearchNodesByOutputRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.outputs = request.outputs;
            this.projectEnv = request.projectEnv;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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

        @Override
        public SearchNodesByOutputRequest build() {
            return new SearchNodesByOutputRequest(this);
        } 

    } 

}
