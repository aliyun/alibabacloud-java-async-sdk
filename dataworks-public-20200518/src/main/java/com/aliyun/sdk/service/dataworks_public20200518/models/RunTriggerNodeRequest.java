// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunTriggerNodeRequest} extends {@link RequestModel}
 *
 * <p>RunTriggerNodeRequest</p>
 */
public class RunTriggerNodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Body
    @NameInMap("BizDate")
    @Validation(required = true)
    private Long bizDate;

    @Body
    @NameInMap("CycleTime")
    @Validation(required = true)
    private Long cycleTime;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private Long nodeId;

    private RunTriggerNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.bizDate = builder.bizDate;
        this.cycleTime = builder.cycleTime;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunTriggerNodeRequest create() {
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
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return bizDate
     */
    public Long getBizDate() {
        return this.bizDate;
    }

    /**
     * @return cycleTime
     */
    public Long getCycleTime() {
        return this.cycleTime;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<RunTriggerNodeRequest, Builder> {
        private String regionId; 
        private Long appId; 
        private Long bizDate; 
        private Long cycleTime; 
        private Long nodeId; 

        private Builder() {
            super();
        } 

        private Builder(RunTriggerNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.bizDate = request.bizDate;
            this.cycleTime = request.cycleTime;
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
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * BizDate.
         */
        public Builder bizDate(Long bizDate) {
            this.putBodyParameter("BizDate", bizDate);
            this.bizDate = bizDate;
            return this;
        }

        /**
         * CycleTime.
         */
        public Builder cycleTime(Long cycleTime) {
            this.putBodyParameter("CycleTime", cycleTime);
            this.cycleTime = cycleTime;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public RunTriggerNodeRequest build() {
            return new RunTriggerNodeRequest(this);
        } 

    } 

}
