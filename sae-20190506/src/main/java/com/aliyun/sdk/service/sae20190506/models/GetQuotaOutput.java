// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetQuotaOutput} extends {@link TeaModel}
 *
 * <p>GetQuotaOutput</p>
 */
public class GetQuotaOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("instanceLimit")
    private Long instanceLimit;

    @com.aliyun.core.annotation.NameInMap("instanceUsed")
    private Long instanceUsed;

    private GetQuotaOutput(Builder builder) {
        this.requestId = builder.requestId;
        this.instanceLimit = builder.instanceLimit;
        this.instanceUsed = builder.instanceUsed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaOutput create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return instanceLimit
     */
    public Long getInstanceLimit() {
        return this.instanceLimit;
    }

    /**
     * @return instanceUsed
     */
    public Long getInstanceUsed() {
        return this.instanceUsed;
    }

    public static final class Builder {
        private String requestId; 
        private Long instanceLimit; 
        private Long instanceUsed; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * instanceLimit.
         */
        public Builder instanceLimit(Long instanceLimit) {
            this.instanceLimit = instanceLimit;
            return this;
        }

        /**
         * instanceUsed.
         */
        public Builder instanceUsed(Long instanceUsed) {
            this.instanceUsed = instanceUsed;
            return this;
        }

        public GetQuotaOutput build() {
            return new GetQuotaOutput(this);
        } 

    } 

}
