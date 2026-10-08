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
 * {@link SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody} extends {@link TeaModel}
 *
 * <p>SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody</p>
 */
public class SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskNo")
    private String taskNo;

    private SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskNo = builder.taskNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody create() {
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

        private Builder(SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody model) {
            this.requestId = model.requestId;
            this.taskNo = model.taskNo;
        } 

        /**
         * <p>The unique ID for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E2598CAF-DBFE-494E-95EF-B42A33C178AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the batch transfer-out task.</p>
         * 
         * <strong>example:</strong>
         * <p>3cb1adc3-20e8-44ae-9e76-e812fa6fc9d8</p>
         */
        public Builder taskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }

        public SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody build() {
            return new SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody(this);
        } 

    } 

}
