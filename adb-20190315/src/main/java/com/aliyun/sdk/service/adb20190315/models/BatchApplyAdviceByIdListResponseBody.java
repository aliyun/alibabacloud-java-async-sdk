// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link BatchApplyAdviceByIdListResponseBody} extends {@link TeaModel}
 *
 * <p>BatchApplyAdviceByIdListResponseBody</p>
 */
public class BatchApplyAdviceByIdListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchApplyAdviceByIdListResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchApplyAdviceByIdListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchApplyAdviceByIdListResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The message returned for the operation. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong> is returned if the operation is successful.</li>
         * <li>An error message is returned if the operation fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>86F92D26-B774-5FA1-8E53-82CBEEEBB012</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchApplyAdviceByIdListResponseBody build() {
            return new BatchApplyAdviceByIdListResponseBody(this);
        } 

    } 

}
