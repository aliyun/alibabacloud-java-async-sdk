// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHitRuleTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeHitRuleTrendRequest</p>
 */
public class DescribeHitRuleTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("beginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleStatus")
    private String ruleStatus;

    private DescribeHitRuleTrendRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.eventCodes = builder.eventCodes;
        this.regId = builder.regId;
        this.ruleStatus = builder.ruleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHitRuleTrendRequest create() {
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
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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

    public static final class Builder extends Request.Builder<DescribeHitRuleTrendRequest, Builder> {
        private String lang; 
        private Long beginTime; 
        private Long endTime; 
        private String eventCodes; 
        private String regId; 
        private String ruleStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHitRuleTrendRequest request) {
            super(request);
            this.lang = request.lang;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
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
         * beginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("beginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
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
        public DescribeHitRuleTrendRequest build() {
            return new DescribeHitRuleTrendRequest(this);
        } 

    } 

}
