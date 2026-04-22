// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link MarkOssV2ResultResponseBody} extends {@link TeaModel}
 *
 * <p>MarkOssV2ResultResponseBody</p>
 */
public class MarkOssV2ResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailureRequestIds")
    private java.util.List<String> failureRequestIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessRequestIds")
    private java.util.List<String> successRequestIds;

    private MarkOssV2ResultResponseBody(Builder builder) {
        this.failureRequestIds = builder.failureRequestIds;
        this.requestId = builder.requestId;
        this.successRequestIds = builder.successRequestIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkOssV2ResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failureRequestIds
     */
    public java.util.List<String> getFailureRequestIds() {
        return this.failureRequestIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successRequestIds
     */
    public java.util.List<String> getSuccessRequestIds() {
        return this.successRequestIds;
    }

    public static final class Builder {
        private java.util.List<String> failureRequestIds; 
        private String requestId; 
        private java.util.List<String> successRequestIds; 

        private Builder() {
        } 

        private Builder(MarkOssV2ResultResponseBody model) {
            this.failureRequestIds = model.failureRequestIds;
            this.requestId = model.requestId;
            this.successRequestIds = model.successRequestIds;
        } 

        /**
         * FailureRequestIds.
         */
        public Builder failureRequestIds(java.util.List<String> failureRequestIds) {
            this.failureRequestIds = failureRequestIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessRequestIds.
         */
        public Builder successRequestIds(java.util.List<String> successRequestIds) {
            this.successRequestIds = successRequestIds;
            return this;
        }

        public MarkOssV2ResultResponseBody build() {
            return new MarkOssV2ResultResponseBody(this);
        } 

    } 

}
