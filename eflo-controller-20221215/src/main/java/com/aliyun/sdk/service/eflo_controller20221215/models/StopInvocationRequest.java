// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopInvocationRequest} extends {@link RequestModel}
 *
 * <p>StopInvocationRequest</p>
 */
public class StopInvocationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("InvokeId")
    @Validation(required = true)
    private String invokeId;

    @Body
    @NameInMap("NodeIdList")
    private java.util.List < String > nodeIdList;

    private StopInvocationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.invokeId = builder.invokeId;
        this.nodeIdList = builder.nodeIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInvocationRequest create() {
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
     * @return nodeIdList
     */
    public java.util.List < String > getNodeIdList() {
        return this.nodeIdList;
    }

    public static final class Builder extends Request.Builder<StopInvocationRequest, Builder> {
        private String regionId; 
        private String invokeId; 
        private java.util.List < String > nodeIdList; 

        private Builder() {
            super();
        } 

        private Builder(StopInvocationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.invokeId = request.invokeId;
            this.nodeIdList = request.nodeIdList;
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
         * NodeIdList.
         */
        public Builder nodeIdList(java.util.List < String > nodeIdList) {
            String nodeIdListShrink = shrink(nodeIdList, "NodeIdList", "json");
            this.putBodyParameter("NodeIdList", nodeIdListShrink);
            this.nodeIdList = nodeIdList;
            return this;
        }

        @Override
        public StopInvocationRequest build() {
            return new StopInvocationRequest(this);
        } 

    } 

}
