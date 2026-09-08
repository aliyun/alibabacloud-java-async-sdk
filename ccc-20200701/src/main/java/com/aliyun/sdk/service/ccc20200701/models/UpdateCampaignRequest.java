// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link UpdateCampaignRequest} extends {@link RequestModel}
 *
 * <p>UpdateCampaignRequest</p>
 */
public class UpdateCampaignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallableTime")
    private String callableTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CampaignId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String campaignId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowId")
    private String contactFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyParameters")
    private String strategyParameters;

    private UpdateCampaignRequest(Builder builder) {
        super(builder);
        this.callableTime = builder.callableTime;
        this.campaignId = builder.campaignId;
        this.contactFlowId = builder.contactFlowId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.startTime = builder.startTime;
        this.strategyParameters = builder.strategyParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCampaignRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callableTime
     */
    public String getCallableTime() {
        return this.callableTime;
    }

    /**
     * @return campaignId
     */
    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @return contactFlowId
     */
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return strategyParameters
     */
    public String getStrategyParameters() {
        return this.strategyParameters;
    }

    public static final class Builder extends Request.Builder<UpdateCampaignRequest, Builder> {
        private String callableTime; 
        private String campaignId; 
        private String contactFlowId; 
        private String endTime; 
        private String instanceId; 
        private String name; 
        private String startTime; 
        private String strategyParameters; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCampaignRequest request) {
            super(request);
            this.callableTime = request.callableTime;
            this.campaignId = request.campaignId;
            this.contactFlowId = request.contactFlowId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.startTime = request.startTime;
            this.strategyParameters = request.strategyParameters;
        } 

        /**
         * <p>Callable time, supports multiple time segments.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;beginTime&quot;: &quot;09:00:00&quot;,
         *             &quot;endTime&quot;: &quot;12:00:00&quot;
         *       }
         * ]</p>
         */
        public Builder callableTime(String callableTime) {
            this.putQueryParameter("CallableTime", callableTime);
            this.callableTime = callableTime;
            return this;
        }

        /**
         * <p>Predictive outbound campaign ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ab11908b-6ebc-4b0c-b51e-3e17c7060</p>
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * <p>Contact stream ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3a310f56-4d30-4081-ba24-5d87a3b7262e</p>
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
        }

        /**
         * <p>End time, in Unix timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1689933600000</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Cloud Contact Center instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Predictive outbound campaign name.</p>
         * 
         * <strong>example:</strong>
         * <p>云联络中心测试</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Start time, in Unix timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1689901200000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Policy parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>PACING策略，参考参数
         * {
         *       &quot;ratio&quot;: 2
         * }</p>
         * <p>PID策略，参考参数
         * {
         *     &quot;abandonRate&quot;:5,
         *     &quot;historicalConnectedRate&quot;:45
         * }</p>
         */
        public Builder strategyParameters(String strategyParameters) {
            this.putQueryParameter("StrategyParameters", strategyParameters);
            this.strategyParameters = strategyParameters;
            return this;
        }

        @Override
        public UpdateCampaignRequest build() {
            return new UpdateCampaignRequest(this);
        } 

    } 

}
