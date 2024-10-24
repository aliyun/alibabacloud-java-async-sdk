// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSchedulerRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSchedulerRuleResponseBody</p>
 */
public class CreateSchedulerRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cname")
    private String cname;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    private CreateSchedulerRuleResponseBody(Builder builder) {
        this.cname = builder.cname;
        this.requestId = builder.requestId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSchedulerRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return cname
     */
    public String getCname() {
        return this.cname;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder {
        private String cname; 
        private String requestId; 
        private String ruleName; 

        /**
         * <p>The CNAME that is assigned by Sec-Traffic Manager for the scheduling rule.</p>
         * <blockquote>
         * <p>To enable the scheduling rule, you must map the domain name of the service to the CNAME.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>48k7b372gpl4****.aliyunddos0001.com</p>
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8DFB602D-1AAC-46C4-90F2-C84086E7A6E4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>testrule</p>
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public CreateSchedulerRuleResponseBody build() {
            return new CreateSchedulerRuleResponseBody(this);
        } 

    } 

}
