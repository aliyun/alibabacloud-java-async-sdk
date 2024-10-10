// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRulesCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetRulesCountResponseBody</p>
 */
public class GetRulesCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalSystemClientRuleCount")
    private Long totalSystemClientRuleCount;

    @com.aliyun.core.annotation.NameInMap("TotalUserDefineRuleCount")
    private Long totalUserDefineRuleCount;

    private GetRulesCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalSystemClientRuleCount = builder.totalSystemClientRuleCount;
        this.totalUserDefineRuleCount = builder.totalUserDefineRuleCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRulesCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalSystemClientRuleCount
     */
    public Long getTotalSystemClientRuleCount() {
        return this.totalSystemClientRuleCount;
    }

    /**
     * @return totalUserDefineRuleCount
     */
    public Long getTotalUserDefineRuleCount() {
        return this.totalUserDefineRuleCount;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalSystemClientRuleCount; 
        private Long totalUserDefineRuleCount; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578AB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of system defense rules.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalSystemClientRuleCount(Long totalSystemClientRuleCount) {
            this.totalSystemClientRuleCount = totalSystemClientRuleCount;
            return this;
        }

        /**
         * <p>The total number of custom defense rules.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalUserDefineRuleCount(Long totalUserDefineRuleCount) {
            this.totalUserDefineRuleCount = totalUserDefineRuleCount;
            return this;
        }

        public GetRulesCountResponseBody build() {
            return new GetRulesCountResponseBody(this);
        } 

    } 

}
