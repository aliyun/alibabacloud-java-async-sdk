// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAegisContainerPluginRuleRequest} extends {@link RequestModel}
 *
 * <p>GetAegisContainerPluginRuleRequest</p>
 */
public class GetAegisContainerPluginRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    private GetAegisContainerPluginRuleRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAegisContainerPluginRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<GetAegisContainerPluginRuleRequest, Builder> {
        private String id; 
        private String lang; 
        private Integer ruleType; 

        private Builder() {
            super();
        } 

        private Builder(GetAegisContainerPluginRuleRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>The ID of the container anti-escape rule.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListAegisContainerPluginRule~~">ListAegisContainerPluginRule</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>Note: This parameter is required. If you do not specify this parameter, the API returns a parameter validation error (HTTP 400).</p>
         * 
         * <strong>example:</strong>
         * <p>1141****</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language type for the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The rule type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: user-defined</li>
         * <li><strong>1</strong>: system built-in</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public GetAegisContainerPluginRuleRequest build() {
            return new GetAegisContainerPluginRuleRequest(this);
        } 

    } 

}
