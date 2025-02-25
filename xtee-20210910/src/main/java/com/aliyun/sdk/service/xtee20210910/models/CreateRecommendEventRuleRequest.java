// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRecommendEventRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRecommendEventRuleRequest</p>
 */
public class CreateRecommendEventRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventName")
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("recommendRuleIdsStr")
    private String recommendRuleIdsStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    private CreateRecommendEventRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventCode = builder.eventCode;
        this.eventName = builder.eventName;
        this.recommendRuleIdsStr = builder.recommendRuleIdsStr;
        this.regId = builder.regId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecommendEventRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return recommendRuleIdsStr
     */
    public String getRecommendRuleIdsStr() {
        return this.recommendRuleIdsStr;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CreateRecommendEventRuleRequest, Builder> {
        private String lang; 
        private String eventCode; 
        private String eventName; 
        private String recommendRuleIdsStr; 
        private String regId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecommendEventRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventCode = request.eventCode;
            this.eventName = request.eventName;
            this.recommendRuleIdsStr = request.recommendRuleIdsStr;
            this.regId = request.regId;
            this.taskId = request.taskId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * eventName.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("eventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * recommendRuleIdsStr.
         */
        public Builder recommendRuleIdsStr(String recommendRuleIdsStr) {
            this.putQueryParameter("recommendRuleIdsStr", recommendRuleIdsStr);
            this.recommendRuleIdsStr = recommendRuleIdsStr;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CreateRecommendEventRuleRequest build() {
            return new CreateRecommendEventRuleRequest(this);
        } 

    } 

}
