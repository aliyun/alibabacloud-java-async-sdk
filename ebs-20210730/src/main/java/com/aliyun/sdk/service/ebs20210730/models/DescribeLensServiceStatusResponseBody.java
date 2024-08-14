// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLensServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLensServiceStatusResponseBody</p>
 */
public class DescribeLensServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeLensServiceStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLensServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The state of CloudLens for EBS. Valid values:
         * <p>
         * 
         * *   Applying
         * *   UnAvailable
         * *   Available
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeLensServiceStatusResponseBody build() {
            return new DescribeLensServiceStatusResponseBody(this);
        } 

    } 

}
