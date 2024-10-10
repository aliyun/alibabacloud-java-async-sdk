// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReceiveFunctionTrialRewardByAliUidResponseBody} extends {@link TeaModel}
 *
 * <p>ReceiveFunctionTrialRewardByAliUidResponseBody</p>
 */
public class ReceiveFunctionTrialRewardByAliUidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReceiveFunctionTrialRewardByAliUidResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReceiveFunctionTrialRewardByAliUidResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>94004FDB-27EC-5666-83D4-D0C5C624****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReceiveFunctionTrialRewardByAliUidResponseBody build() {
            return new ReceiveFunctionTrialRewardByAliUidResponseBody(this);
        } 

    } 

}
