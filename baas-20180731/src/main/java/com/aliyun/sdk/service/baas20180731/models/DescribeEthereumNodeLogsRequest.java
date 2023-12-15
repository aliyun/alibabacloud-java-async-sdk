// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumNodeLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEthereumNodeLogsRequest</p>
 */
public class DescribeEthereumNodeLogsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Lines")
    private String lines;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    @Body
    @NameInMap("Target")
    private String target;

    private DescribeEthereumNodeLogsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.lines = builder.lines;
        this.nodeId = builder.nodeId;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEthereumNodeLogsRequest create() {
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
     * @return lines
     */
    public String getLines() {
        return this.lines;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<DescribeEthereumNodeLogsRequest, Builder> {
        private String regionId; 
        private String lines; 
        private String nodeId; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEthereumNodeLogsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.lines = request.lines;
            this.nodeId = request.nodeId;
            this.target = request.target;
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
         * Lines.
         */
        public Builder lines(String lines) {
            this.putBodyParameter("Lines", lines);
            this.lines = lines;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putBodyParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public DescribeEthereumNodeLogsRequest build() {
            return new DescribeEthereumNodeLogsRequest(this);
        } 

    } 

}
