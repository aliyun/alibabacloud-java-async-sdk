// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesByOutputRequest} extends {@link RequestModel}
 *
 * <p>ListNodesByOutputRequest</p>
 */
public class ListNodesByOutputRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("Outputs")
    @Validation(required = true)
    private String outputs;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    private ListNodesByOutputRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.outputs = builder.outputs;
        this.projectEnv = builder.projectEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesByOutputRequest create() {
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

    public static final class Builder extends Request.Builder<ListNodesByOutputRequest, Builder> {
        private String regionId; 
        private String outputs; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesByOutputRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.outputs = request.outputs;
            this.projectEnv = request.projectEnv;
        } 

        /**
         * The region ID. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The output name of the node. You can specify multiple output names. In this case, separate them with commas (,).
         */
        public Builder outputs(String outputs) {
            this.putBodyParameter("Outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * The environment type. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public ListNodesByOutputRequest build() {
            return new ListNodesByOutputRequest(this);
        } 

    } 

}
