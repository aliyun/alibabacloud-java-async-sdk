// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeInputOrOutputRequest} extends {@link RequestModel}
 *
 * <p>ListNodeInputOrOutputRequest</p>
 */
public class ListNodeInputOrOutputRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("IoType")
    @Validation(required = true)
    private String ioType;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true, minimum = 2)
    private Long nodeId;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    private ListNodeInputOrOutputRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ioType = builder.ioType;
        this.nodeId = builder.nodeId;
        this.projectEnv = builder.projectEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeInputOrOutputRequest create() {
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
     * @return ioType
     */
    public String getIoType() {
        return this.ioType;
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

    public static final class Builder extends Request.Builder<ListNodeInputOrOutputRequest, Builder> {
        private String regionId; 
        private String ioType; 
        private Long nodeId; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeInputOrOutputRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ioType = request.ioType;
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
         * The type of node that you want to query. Valid values:
         * <p>
         * 
         * *   input: ancestor nodes
         * *   output: descendant nodes
         */
        public Builder ioType(String ioType) {
            this.putBodyParameter("IoType", ioType);
            this.ioType = ioType;
            return this;
        }

        /**
         * The ID of the node. You can call the [ListNodes](~~173979~~) operation to query the node ID.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The environment of the workspace. Valid values: DEV and PROD. A value of DEV indicates the development environment. A value of PROD indicates the production environment.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public ListNodeInputOrOutputRequest build() {
            return new ListNodeInputOrOutputRequest(this);
        } 

    } 

}
