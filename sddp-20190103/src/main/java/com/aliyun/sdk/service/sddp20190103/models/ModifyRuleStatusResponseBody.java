// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyRuleStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRuleStatusResponseBody</p>
 */
public class ModifyRuleStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedIds")
    private String failedIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyRuleStatusResponseBody(Builder builder) {
        this.failedIds = builder.failedIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRuleStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedIds
     */
    public String getFailedIds() {
        return this.failedIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String failedIds; 
        private String requestId; 

        /**
         * <p>The IDs of sensitive data detection rules whose status failed to be changed. Multiple IDs are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3,4</p>
         */
        public Builder failedIds(String failedIds) {
            this.failedIds = failedIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7C3AC882-E5A8-4855-BE77-B6837B695EF1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyRuleStatusResponseBody build() {
            return new ModifyRuleStatusResponseBody(this);
        } 

    } 

}
