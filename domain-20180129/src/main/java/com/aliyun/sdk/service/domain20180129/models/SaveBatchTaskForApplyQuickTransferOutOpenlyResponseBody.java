// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody} extends {@link TeaModel}
 *
 * <p>SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody</p>
 */
public class SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskNo")
    private String taskNo;

    private SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskNo = builder.taskNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskNo
     */
    public String getTaskNo() {
        return this.taskNo;
    }

    public static final class Builder {
        private String requestId; 
        private String taskNo; 

        private Builder() {
        } 

        private Builder(SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody model) {
            this.requestId = model.requestId;
            this.taskNo = model.taskNo;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D6CB3623-4726-4947-AC2B-2C6E673B447C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d3babb0a-c939-4c25-8c65-c47b65f5492a</p>
         */
        public Builder taskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }

        public SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody build() {
            return new SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody(this);
        } 

    } 

}
