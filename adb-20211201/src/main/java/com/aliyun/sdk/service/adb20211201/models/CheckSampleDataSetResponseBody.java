// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSampleDataSetResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSampleDataSetResponseBody</p>
 */
public class CheckSampleDataSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CheckSampleDataSetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSampleDataSetResponseBody create() {
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
         * The state of the built-in dataset. Valid values:
         * <p>
         * 
         * *   **SUCCEED**: The dataset is loaded.
         * *   **INIT**: The dataset is being loaded.
         * *   **FAILED**: The dataset failed to be loaded.
         * *   **UNINITIALIZED**: The dataset is not loaded.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CheckSampleDataSetResponseBody build() {
            return new CheckSampleDataSetResponseBody(this);
        } 

    } 

}
