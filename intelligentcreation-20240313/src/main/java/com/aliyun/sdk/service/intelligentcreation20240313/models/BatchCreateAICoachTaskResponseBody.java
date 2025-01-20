// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link BatchCreateAICoachTaskResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCreateAICoachTaskResponseBody</p>
 */
public class BatchCreateAICoachTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("taskIds")
    private java.util.List<String> taskIds;

    private BatchCreateAICoachTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateAICoachTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> taskIds; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>10923AA3-F7A1-5EA0-ACCA-D704269EAA78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * taskIds.
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }

        public BatchCreateAICoachTaskResponseBody build() {
            return new BatchCreateAICoachTaskResponseBody(this);
        } 

    } 

}
