// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateClusterVpcEndpointConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterVpcEndpointConnectionRequest</p>
 */
public class CreateClusterVpcEndpointConnectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private CreateClusterVpcEndpointConnectionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dryRun = builder.dryRun;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterVpcEndpointConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<CreateClusterVpcEndpointConnectionRequest, Builder> {
        private String clusterId; 
        private Boolean dryRun; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterVpcEndpointConnectionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dryRun = request.dryRun;
            this.region = request.region;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-bzxw7g2r7301r3f2</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        @Override
        public CreateClusterVpcEndpointConnectionRequest build() {
            return new CreateClusterVpcEndpointConnectionRequest(this);
        } 

    } 

}
