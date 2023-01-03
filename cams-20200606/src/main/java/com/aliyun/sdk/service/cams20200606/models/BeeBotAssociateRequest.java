// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BeeBotAssociateRequest} extends {@link RequestModel}
 *
 * <p>BeeBotAssociateRequest</p>
 */
public class BeeBotAssociateRequest extends Request {
    @Body
    @NameInMap("ChatBotInstanceId")
    @Validation(required = true)
    private String chatBotInstanceId;

    @Body
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Body
    @NameInMap("IsvCode")
    private String isvCode;

    @Body
    @NameInMap("Perspective")
    private java.util.List < String > perspective;

    @Body
    @NameInMap("RecommendNum")
    @Validation(maximum = 10, minimum = 1)
    private Integer recommendNum;

    @Body
    @NameInMap("SessionId")
    private String sessionId;

    @Body
    @NameInMap("Utterance")
    private String utterance;

    private BeeBotAssociateRequest(Builder builder) {
        super(builder);
        this.chatBotInstanceId = builder.chatBotInstanceId;
        this.custSpaceId = builder.custSpaceId;
        this.isvCode = builder.isvCode;
        this.perspective = builder.perspective;
        this.recommendNum = builder.recommendNum;
        this.sessionId = builder.sessionId;
        this.utterance = builder.utterance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeeBotAssociateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatBotInstanceId
     */
    public String getChatBotInstanceId() {
        return this.chatBotInstanceId;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
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

    public static final class Builder extends Request.Builder<BeeBotAssociateRequest, Builder> {
        private String chatBotInstanceId; 
        private String custSpaceId; 
        private String isvCode; 
        private java.util.List < String > perspective; 
        private Integer recommendNum; 
        private String sessionId; 
        private String utterance; 

        private Builder() {
            super();
        } 

        private Builder(BeeBotAssociateRequest request) {
            super(request);
            this.chatBotInstanceId = request.chatBotInstanceId;
            this.custSpaceId = request.custSpaceId;
            this.isvCode = request.isvCode;
            this.perspective = request.perspective;
            this.recommendNum = request.recommendNum;
            this.sessionId = request.sessionId;
            this.utterance = request.utterance;
        } 

        /**
         * The ID of chatbot instance.
         */
        public Builder chatBotInstanceId(String chatBotInstanceId) {
            this.putBodyParameter("ChatBotInstanceId", chatBotInstanceId);
            this.chatBotInstanceId = chatBotInstanceId;
            return this;
        }

        /**
         * ISV子客户的SpaceId
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * ISV verification code, which is used to verify whether the sub-account is authorized by ISV.
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * The list of codes for answers from different perspectives.
         */
        public Builder perspective(java.util.List < String > perspective) {
            String perspectiveShrink = shrink(perspective, "Perspective", "json");
            this.putBodyParameter("Perspective", perspectiveShrink);
            this.perspective = perspective;
            return this;
        }

        /**
         * The number of recommended questions, which ranges from 1 to 10.
         */
        public Builder recommendNum(Integer recommendNum) {
            this.putBodyParameter("RecommendNum", recommendNum);
            this.recommendNum = recommendNum;
            return this;
        }

        /**
         * The ID of the session, which identifies the session and context information of the visitor.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * The input of the visitor.
         */
        public Builder utterance(String utterance) {
            this.putBodyParameter("Utterance", utterance);
            this.utterance = utterance;
            return this;
        }

        @Override
        public BeeBotAssociateRequest build() {
            return new BeeBotAssociateRequest(this);
        } 

    } 

}
