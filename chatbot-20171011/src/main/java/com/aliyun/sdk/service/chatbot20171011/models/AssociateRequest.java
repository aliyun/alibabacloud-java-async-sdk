// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateRequest} extends {@link RequestModel}
 *
 * <p>AssociateRequest</p>
 */
public class AssociateRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Perspective")
    private java.util.List < String > perspective;

    @Query
    @NameInMap("RecommendNum")
    private Integer recommendNum;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SessionId")
    private String sessionId;

    @Query
    @NameInMap("Utterance")
    @Validation(required = true)
    private String utterance;

    private AssociateRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.perspective = builder.perspective;
        this.recommendNum = builder.recommendNum;
        this.regionId = builder.regionId;
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
    public java.util.List < String > getPerspective() {
        return this.perspective;
    }

    /**
     * @return recommendNum
     */
    public Integer getRecommendNum() {
        return this.recommendNum;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String agentKey; 
        private String instanceId; 
        private java.util.List < String > perspective; 
        private Integer recommendNum; 
        private String regionId; 
        private String sessionId; 
        private String utterance; 

        private Builder() {
            super();
        } 

        private Builder(AssociateRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.perspective = request.perspective;
            this.recommendNum = request.recommendNum;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.utterance = request.utterance;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Perspective.
         */
        public Builder perspective(java.util.List < String > perspective) {
            this.putQueryParameter("Perspective", perspective);
            this.perspective = perspective;
            return this;
        }

        /**
         * RecommendNum.
         */
        public Builder recommendNum(Integer recommendNum) {
            this.putQueryParameter("RecommendNum", recommendNum);
            this.recommendNum = recommendNum;
            return this;
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
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Utterance.
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
