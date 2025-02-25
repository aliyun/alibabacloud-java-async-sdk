// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEventRuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventRuleAttributeRequest</p>
 */
public class DescribeEventRuleAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SilenceTime")
    private String silenceTime;

    private DescribeEventRuleAttributeRequest(Builder builder) {
        super(builder);
        this.ruleName = builder.ruleName;
        this.silenceTime = builder.silenceTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventRuleAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return silenceTime
     */
    public String getSilenceTime() {
        return this.silenceTime;
    }

    public static final class Builder extends Request.Builder<DescribeEventRuleAttributeRequest, Builder> {
        private String ruleName; 
        private String silenceTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventRuleAttributeRequest request) {
            super(request);
            this.ruleName = request.ruleName;
            this.silenceTime = request.silenceTime;
        } 

        /**
         * <p>The name of the event-triggered alert rule.</p>
         * <p>For information about how to obtain the name of an event-triggered alert rule, see <a href="https://help.aliyun.com/document_detail/114996.html">DescribeEventRuleList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testRule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The mute period during which new alert notifications are not sent even if the trigger conditions are met.</p>
         * <p>Unit: seconds. Default value: 86400, which indicates one day.</p>
         * <blockquote>
         * <p> Only one alert notification is sent during each mute period even if the metric value exceeds the alert threshold several times.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder silenceTime(String silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        @Override
        public DescribeEventRuleAttributeRequest build() {
            return new DescribeEventRuleAttributeRequest(this);
        } 

    } 

}
