// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnKvAccountStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnKvAccountStatusResponseBody</p>
 */
public class DescribeDcdnKvAccountStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeDcdnKvAccountStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnKvAccountStatusResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the account.
         * <p>
         * 
         * *   **online**
         * *   **offline**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDcdnKvAccountStatusResponseBody build() {
            return new DescribeDcdnKvAccountStatusResponseBody(this);
        } 

    } 

}
