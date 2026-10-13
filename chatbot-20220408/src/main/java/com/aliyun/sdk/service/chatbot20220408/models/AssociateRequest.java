// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link AssociateRequest} extends {@link RequestModel}
 *
 * <p>AssociateRequest</p>
 */
public class AssociateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Perspective")
    private java.util.List<String> perspective;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecommendNum")
    private Long recommendNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Utterance")
    private String utterance;

    private AssociateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.perspective = builder.perspective;
        this.recommendNum = builder.recommendNum;
        this.sessionId = builder.sessionId;
        this.utterance = builder.utterance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return perspective
     */
    public java.util.List<String> getPerspective() {
        return this.perspective;
    }

    /**
     * @return recommendNum
     */
    public Long getRecommendNum() {
        return this.recommendNum;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return utterance
     */
    public String getUtterance() {
        return this.utterance;
    }

    public static final class Builder extends Request.Builder<AssociateRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String instanceId; 
        private java.util.List<String> perspective; 
        private Long recommendNum; 
        private String sessionId; 
        private String utterance; 

        private Builder() {
            super();
        } 

        private Builder(AssociateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.perspective = request.perspective;
            this.recommendNum = request.recommendNum;
            this.sessionId = request.sessionId;
            this.utterance = request.utterance;
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
         * <p>The business space key. If not specified, the default business space is accessed. Obtain the key value from the business management page of the primary account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The unique identifier of the robot.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-mp90s2lrk00050</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The perspective code, which is used to call answers from different perspectives under the same knowledge title. When assembling request parameters, pass the parameter in the format Perspective={perspective code}. For example: &amp;Perspective=[&quot;FZJBY3raWr&quot;]. When using the SDK, use the parameters defined in the SDK. Currently, only one perspective answer can be called.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;qyzzVfyFfa&quot;]</p>
         */
        public Builder perspective(java.util.List<String> perspective) {
            String perspectiveShrink = shrink(perspective, "Perspective", "json");
            this.putQueryParameter("Perspective", perspectiveShrink);
            this.perspective = perspective;
            return this;
        }

        /**
         * <p>The number of recommended questions, ranging from 1 to 10. This parameter takes effect only when recommendations are returned. The number of returned recommended questions is less than or equal to RecommendNum.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder recommendNum(Long recommendNum) {
            this.putQueryParameter("RecommendNum", recommendNum);
            this.recommendNum = recommendNum;
            return this;
        }

        /**
         * <p>The session ID, which is used to identify a visitor\&quot;s session and maintain context information. For a new visitor, you do not need to pass this field when calling the Chat operation for the first time. The robot starts a session and returns the SessionId of the session in the response of the Chat operation. For subsequent conversation turns of the visitor, pass the SessionId of the current session when calling the Chat operation so that the robot can continue the conversation based on the SessionId.</p>
         * 
         * <strong>example:</strong>
         * <p>7c3cec23cc8940bc9db4a318c8f4f0aa</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The user utterance.</p>
         * 
         * <strong>example:</strong>
         * <p>Housing fund withdrawal</p>
         */
        public Builder utterance(String utterance) {
            this.putQueryParameter("Utterance", utterance);
            this.utterance = utterance;
            return this;
        }

        @Override
        public AssociateRequest build() {
            return new AssociateRequest(this);
        } 

    } 

}
