// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotEventTrendRequest} extends {@link RequestModel}
 *
 * <p>GetHoneypotEventTrendRequest</p>
 */
public class GetHoneypotEventTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeStamp")
    private Long endTimeStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelList")
    private java.util.List < String > riskLevelList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeStamp")
    private Long startTimeStamp;

    private GetHoneypotEventTrendRequest(Builder builder) {
        super(builder);
        this.endTimeStamp = builder.endTimeStamp;
        this.lang = builder.lang;
        this.riskLevelList = builder.riskLevelList;
        this.srcIp = builder.srcIp;
        this.startTimeStamp = builder.startTimeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotEventTrendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimeStamp
     */
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return riskLevelList
     */
    public java.util.List < String > getRiskLevelList() {
        return this.riskLevelList;
    }

    /**
     * @return srcIp
     */
    public String getSrcIp() {
        return this.srcIp;
    }

    /**
     * @return startTimeStamp
     */
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public static final class Builder extends Request.Builder<GetHoneypotEventTrendRequest, Builder> {
        private Long endTimeStamp; 
        private String lang; 
        private java.util.List < String > riskLevelList; 
        private String srcIp; 
        private Long startTimeStamp; 

        private Builder() {
            super();
        } 

        private Builder(GetHoneypotEventTrendRequest request) {
            super(request);
            this.endTimeStamp = request.endTimeStamp;
            this.lang = request.lang;
            this.riskLevelList = request.riskLevelList;
            this.srcIp = request.srcIp;
            this.startTimeStamp = request.startTimeStamp;
        } 

        /**
         * End time, timestamp format.
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.putQueryParameter("EndTimeStamp", endTimeStamp);
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The risk levels of the alert events.
         */
        public Builder riskLevelList(java.util.List < String > riskLevelList) {
            this.putQueryParameter("RiskLevelList", riskLevelList);
            this.riskLevelList = riskLevelList;
            return this;
        }

        /**
         * The source IP address of the attack.
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        /**
         * Start time, timestamp format.
         */
        public Builder startTimeStamp(Long startTimeStamp) {
            this.putQueryParameter("StartTimeStamp", startTimeStamp);
            this.startTimeStamp = startTimeStamp;
            return this;
        }

        @Override
        public GetHoneypotEventTrendRequest build() {
            return new GetHoneypotEventTrendRequest(this);
        } 

    } 

}
