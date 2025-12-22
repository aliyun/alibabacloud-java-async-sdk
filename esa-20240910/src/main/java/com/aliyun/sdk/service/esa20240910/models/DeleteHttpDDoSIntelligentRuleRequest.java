// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DeleteHttpDDoSIntelligentRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteHttpDDoSIntelligentRuleRequest</p>
 */
public class DeleteHttpDDoSIntelligentRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordName")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String recordName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long siteId;

    private DeleteHttpDDoSIntelligentRuleRequest(Builder builder) {
        super(builder);
        this.recordName = builder.recordName;
        this.ruleId = builder.ruleId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHttpDDoSIntelligentRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<DeleteHttpDDoSIntelligentRuleRequest, Builder> {
        private String recordName; 
        private Long ruleId; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHttpDDoSIntelligentRuleRequest request) {
            super(request);
            this.recordName = request.recordName;
            this.ruleId = request.ruleId;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder recordName(String recordName) {
            this.putQueryParameter("RecordName", recordName);
            this.recordName = recordName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20928021</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public DeleteHttpDDoSIntelligentRuleRequest build() {
            return new DeleteHttpDDoSIntelligentRuleRequest(this);
        } 

    } 

}
