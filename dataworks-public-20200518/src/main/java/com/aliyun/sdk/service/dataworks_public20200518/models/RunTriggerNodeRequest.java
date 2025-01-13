// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link RunTriggerNodeRequest} extends {@link RequestModel}
 *
 * <p>RunTriggerNodeRequest</p>
 */
public class RunTriggerNodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CycleTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cycleTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace to which the manually triggered node belongs. You can call the <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder appId(Long appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The data timestamp of the instance that is generated for the manually triggered node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1606200230105</p>
         */
        public Builder bizDate(Long bizDate) {
            this.putBodyParameter("BizDate", bizDate);
            this.bizDate = bizDate;
            return this;
        }

        /**
         * <p>The scheduling time to run the manually triggered node. Set the value to a 13-digit timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1606200230105</p>
         */
        public Builder cycleTime(Long cycleTime) {
            this.putBodyParameter("CycleTime", cycleTime);
            this.cycleTime = cycleTime;
            return this;
        }

        /**
         * <p>The ID of the manually triggered node. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000011</p>
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
