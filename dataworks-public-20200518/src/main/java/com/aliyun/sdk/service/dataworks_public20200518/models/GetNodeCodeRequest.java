// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeCodeRequest} extends {@link RequestModel}
 *
 * <p>GetNodeCodeRequest</p>
 */
public class GetNodeCodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true, minimum = 2)
    private Long nodeId;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    private GetNodeCodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeId = builder.nodeId;
        this.projectEnv = builder.projectEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeCodeRequest create() {
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
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public static final class Builder extends Request.Builder<GetNodeCodeRequest, Builder> {
        private String regionId; 
        private Long nodeId; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeCodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeId = request.nodeId;
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
         * The ID of the node.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The environment of the workspace. Valid values: PROD and DEV.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public GetNodeCodeRequest build() {
            return new GetNodeCodeRequest(this);
        } 

    } 

}
