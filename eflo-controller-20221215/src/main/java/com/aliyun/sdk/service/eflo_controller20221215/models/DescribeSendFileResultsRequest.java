// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSendFileResultsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSendFileResultsRequest</p>
 */
public class DescribeSendFileResultsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("InvokeId")
    @Validation(required = true)
    private String invokeId;

    @Body
    @NameInMap("NodeId")
    private String nodeId;

    private DescribeSendFileResultsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.invokeId = builder.invokeId;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSendFileResultsRequest create() {
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
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<DescribeSendFileResultsRequest, Builder> {
        private String regionId; 
        private String invokeId; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSendFileResultsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.invokeId = request.invokeId;
            this.nodeId = request.nodeId;
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
         * InvokeId.
         */
        public Builder invokeId(String invokeId) {
            this.putBodyParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
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

        @Override
        public DescribeSendFileResultsRequest build() {
            return new DescribeSendFileResultsRequest(this);
        } 

    } 

}
