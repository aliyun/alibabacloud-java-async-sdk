// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchNodesByOutputRequest} extends {@link RequestModel}
 *
 * <p>SearchNodesByOutputRequest</p>
 */
public class SearchNodesByOutputRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Outputs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The output names of the node. If you specify multiple output names, separate them with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aaaaa.1231412_out,bbbb.12313123_out</p>
         */
        public Builder outputs(String outputs) {
            this.putBodyParameter("Outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>The environment of Operation Center. Valid values: PROD and DEV.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
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
