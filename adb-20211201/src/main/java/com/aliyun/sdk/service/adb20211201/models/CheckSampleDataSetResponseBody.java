// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0CE655C3-C211-513D-A42F-D4AE2D1A867C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the built-in dataset. Valid values:</p>
         * <ul>
         * <li><strong>SUCCEED</strong>: The dataset is loaded.</li>
         * <li><strong>INIT</strong>: The dataset is being loaded.</li>
         * <li><strong>FAILED</strong>: The dataset failed to be loaded.</li>
         * <li><strong>UNINITIALIZED</strong>: The dataset is not loaded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UNINITIALIZED</p>
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
