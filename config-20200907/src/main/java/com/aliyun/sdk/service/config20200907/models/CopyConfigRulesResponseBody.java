// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyConfigRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CopyConfigRulesResponseBody</p>
 */
public class CopyConfigRulesResponseBody extends TeaModel {
    @NameInMap("CopyRulesResult")
    private Boolean copyRulesResult;

    @NameInMap("RequestId")
    private String requestId;

    private CopyConfigRulesResponseBody(Builder builder) {
        this.copyRulesResult = builder.copyRulesResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyConfigRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return copyRulesResult
     */
    public Boolean getCopyRulesResult() {
        return this.copyRulesResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean copyRulesResult; 
        private String requestId; 

        /**
         * Indicates whether the rules are replicated. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder copyRulesResult(Boolean copyRulesResult) {
            this.copyRulesResult = copyRulesResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CopyConfigRulesResponseBody build() {
            return new CopyConfigRulesResponseBody(this);
        } 

    } 

}
