// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRulesCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetRulesCountResponseBody</p>
 */
public class GetRulesCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalSystemClientRuleCount")
    private Long totalSystemClientRuleCount;

    @NameInMap("TotalUserDefineRuleCount")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalSystemClientRuleCount.
         */
        public Builder totalSystemClientRuleCount(Long totalSystemClientRuleCount) {
            this.totalSystemClientRuleCount = totalSystemClientRuleCount;
            return this;
        }

        /**
         * TotalUserDefineRuleCount.
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
