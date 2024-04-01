// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAoneAppAuditResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAoneAppAuditResponseBody</p>
 */
public class CheckAoneAppAuditResponseBody extends TeaModel {
    @NameInMap("CheckResult")
    private Boolean checkResult;

    @NameInMap("RequestId")
    private String requestId;

    private CheckAoneAppAuditResponseBody(Builder builder) {
        this.checkResult = builder.checkResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAoneAppAuditResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkResult
     */
    public Boolean getCheckResult() {
        return this.checkResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean checkResult; 
        private String requestId; 

        /**
         * CheckResult.
         */
        public Builder checkResult(Boolean checkResult) {
            this.checkResult = checkResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckAoneAppAuditResponseBody build() {
            return new CheckAoneAppAuditResponseBody(this);
        } 

    } 

}
