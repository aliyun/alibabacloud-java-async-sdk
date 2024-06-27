// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHasRuleNameByEventCodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeHasRuleNameByEventCodeRequest</p>
 */
public class DescribeHasRuleNameByEventCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("excludeRuleId")
    private String excludeRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleName")
    private String ruleName;

    private DescribeHasRuleNameByEventCodeRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventCode = builder.eventCode;
        this.excludeRuleId = builder.excludeRuleId;
        this.regId = builder.regId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHasRuleNameByEventCodeRequest create() {
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
     * @return excludeRuleId
     */
    public String getExcludeRuleId() {
        return this.excludeRuleId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<DescribeHasRuleNameByEventCodeRequest, Builder> {
        private String lang; 
        private String eventCode; 
        private String excludeRuleId; 
        private String regId; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHasRuleNameByEventCodeRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventCode = request.eventCode;
            this.excludeRuleId = request.excludeRuleId;
            this.regId = request.regId;
            this.ruleName = request.ruleName;
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
         * excludeRuleId.
         */
        public Builder excludeRuleId(String excludeRuleId) {
            this.putQueryParameter("excludeRuleId", excludeRuleId);
            this.excludeRuleId = excludeRuleId;
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
         * ruleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public DescribeHasRuleNameByEventCodeRequest build() {
            return new DescribeHasRuleNameByEventCodeRequest(this);
        } 

    } 

}
