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
 * {@link DeleteHttpDDoSIntelligentRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteHttpDDoSIntelligentRuleResponseBody</p>
 */
public class DeleteHttpDDoSIntelligentRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordName")
    private String recordName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private DeleteHttpDDoSIntelligentRuleResponseBody(Builder builder) {
        this.recordName = builder.recordName;
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHttpDDoSIntelligentRuleResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String recordName; 
        private String requestId; 
        private Long ruleId; 
        private Long siteId; 

        private Builder() {
        } 

        private Builder(DeleteHttpDDoSIntelligentRuleResponseBody model) {
            this.recordName = model.recordName;
            this.requestId = model.requestId;
            this.ruleId = model.ruleId;
            this.siteId = model.siteId;
        } 

        /**
         * <p>Record name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder recordName(String recordName) {
            this.recordName = recordName;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20757864</p>
         */
        public Builder ruleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        public DeleteHttpDDoSIntelligentRuleResponseBody build() {
            return new DeleteHttpDDoSIntelligentRuleResponseBody(this);
        } 

    } 

}
