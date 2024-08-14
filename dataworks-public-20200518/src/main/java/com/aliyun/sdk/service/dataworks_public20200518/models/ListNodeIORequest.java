// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeIORequest} extends {@link RequestModel}
 *
 * <p>ListNodeIORequest</p>
 */
public class ListNodeIORequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IoType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ioType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 2)
    private Long nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    private ListNodeIORequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ioType = builder.ioType;
        this.nodeId = builder.nodeId;
        this.projectEnv = builder.projectEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeIORequest create() {
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

    public static final class Builder extends Request.Builder<ListNodeIORequest, Builder> {
        private String regionId; 
        private String ioType; 
        private Long nodeId; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeIORequest request) {
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
         * Specifies whether to query the information about ancestor or descendant nodes of the current node. Valid values: input and output.
         */
        public Builder ioType(String ioType) {
            this.putBodyParameter("IoType", ioType);
            this.ioType = ioType;
            return this;
        }

        /**
         * The node ID. You can call the [ListNodes](~~173979~~) operation to query the ID.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The runtime environment. Valid values: DEV and PROD.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public ListNodeIORequest build() {
            return new ListNodeIORequest(this);
        } 

    } 

}
