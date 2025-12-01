// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CompareRuleRequest} extends {@link RequestModel}
 *
 * <p>CompareRuleRequest</p>
 */
public class CompareRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("previousRuleVersionId")
    private Long previousRuleVersionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleVersionId")
    private Long ruleVersionId;

    private CompareRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.previousRuleVersionId = builder.previousRuleVersionId;
        this.regId = builder.regId;
        this.ruleVersionId = builder.ruleVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareRuleRequest create() {
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
     * @return previousRuleVersionId
     */
    public Long getPreviousRuleVersionId() {
        return this.previousRuleVersionId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return ruleVersionId
     */
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

    public static final class Builder extends Request.Builder<CompareRuleRequest, Builder> {
        private String lang; 
        private Long previousRuleVersionId; 
        private String regId; 
        private Long ruleVersionId; 

        private Builder() {
            super();
        } 

        private Builder(CompareRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.previousRuleVersionId = request.previousRuleVersionId;
            this.regId = request.regId;
            this.ruleVersionId = request.ruleVersionId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
         * <p>Primary key ID of the previous policy version.</p>
         * 
         * <strong>example:</strong>
         * <p>11518</p>
         */
        public Builder previousRuleVersionId(Long previousRuleVersionId) {
            this.putQueryParameter("previousRuleVersionId", previousRuleVersionId);
            this.previousRuleVersionId = previousRuleVersionId;
            return this;
        }

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Primary key ID of the policy version.</p>
         * 
         * <strong>example:</strong>
         * <p>11519</p>
         */
        public Builder ruleVersionId(Long ruleVersionId) {
            this.putQueryParameter("ruleVersionId", ruleVersionId);
            this.ruleVersionId = ruleVersionId;
            return this;
        }

        @Override
        public CompareRuleRequest build() {
            return new CompareRuleRequest(this);
        } 

    } 

}
