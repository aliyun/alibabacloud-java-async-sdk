// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleVersionListRequest} extends {@link RequestModel}
 *
 * <p>DescribeRuleVersionListRequest</p>
 */
public class DescribeRuleVersionListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consoleRuleId")
    private Long consoleRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    private DescribeRuleVersionListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.consoleRuleId = builder.consoleRuleId;
        this.regId = builder.regId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleVersionListRequest create() {
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
     * @return consoleRuleId
     */
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DescribeRuleVersionListRequest, Builder> {
        private String lang; 
        private Long consoleRuleId; 
        private String regId; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRuleVersionListRequest request) {
            super(request);
            this.lang = request.lang;
            this.consoleRuleId = request.consoleRuleId;
            this.regId = request.regId;
            this.ruleId = request.ruleId;
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
         * consoleRuleId.
         */
        public Builder consoleRuleId(Long consoleRuleId) {
            this.putQueryParameter("consoleRuleId", consoleRuleId);
            this.consoleRuleId = consoleRuleId;
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
         * ruleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DescribeRuleVersionListRequest build() {
            return new DescribeRuleVersionListRequest(this);
        } 

    } 

}
