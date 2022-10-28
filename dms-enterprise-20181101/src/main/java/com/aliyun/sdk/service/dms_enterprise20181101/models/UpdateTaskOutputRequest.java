// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskOutputRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskOutputRequest</p>
 */
public class UpdateTaskOutputRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    @Query
    @NameInMap("NodeOutput")
    private String nodeOutput;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private UpdateTaskOutputRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeId = builder.nodeId;
        this.nodeOutput = builder.nodeOutput;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskOutputRequest create() {
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
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeOutput
     */
    public String getNodeOutput() {
        return this.nodeOutput;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateTaskOutputRequest, Builder> {
        private String regionId; 
        private String nodeId; 
        private String nodeOutput; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskOutputRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeId = request.nodeId;
            this.nodeOutput = request.nodeOutput;
            this.tid = request.tid;
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
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * NodeOutput.
         */
        public Builder nodeOutput(String nodeOutput) {
            this.putQueryParameter("NodeOutput", nodeOutput);
            this.nodeOutput = nodeOutput;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateTaskOutputRequest build() {
            return new UpdateTaskOutputRequest(this);
        } 

    } 

}
