// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventRuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventRuleAttributeRequest</p>
 */
public class DescribeEventRuleAttributeRequest extends Request {
    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("SilenceTime")
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
         * The error message.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The ID of the request.
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
