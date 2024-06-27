// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHitRuleFluctuationRequest} extends {@link RequestModel}
 *
 * <p>DescribeHitRuleFluctuationRequest</p>
 */
public class DescribeHitRuleFluctuationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleStatus")
    private String ruleStatus;

    private DescribeHitRuleFluctuationRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventCodes = builder.eventCodes;
        this.regId = builder.regId;
        this.ruleStatus = builder.ruleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHitRuleFluctuationRequest create() {
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
     * @return eventCodes
     */
    public String getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public static final class Builder extends Request.Builder<DescribeHitRuleFluctuationRequest, Builder> {
        private String lang; 
        private String eventCodes; 
        private String regId; 
        private String ruleStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHitRuleFluctuationRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventCodes = request.eventCodes;
            this.regId = request.regId;
            this.ruleStatus = request.ruleStatus;
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
         * eventCodes.
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
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
         * ruleStatus.
         */
        public Builder ruleStatus(String ruleStatus) {
            this.putQueryParameter("ruleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        @Override
        public DescribeHitRuleFluctuationRequest build() {
            return new DescribeHitRuleFluctuationRequest(this);
        } 

    } 

}
