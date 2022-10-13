// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBatchOperateCardsTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBatchOperateCardsTaskResponseBody</p>
 */
public class CreateBatchOperateCardsTaskResponseBody extends TeaModel {
    @NameInMap("BatchOperateCardsTaskId")
    private String batchOperateCardsTaskId;

    @NameInMap("OperateResultOssFilePath")
    private String operateResultOssFilePath;

    @NameInMap("RequestId")
    private String requestId;

    private CreateBatchOperateCardsTaskResponseBody(Builder builder) {
        this.batchOperateCardsTaskId = builder.batchOperateCardsTaskId;
        this.operateResultOssFilePath = builder.operateResultOssFilePath;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchOperateCardsTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchOperateCardsTaskId
     */
    public String getBatchOperateCardsTaskId() {
        return this.batchOperateCardsTaskId;
    }

    /**
     * @return operateResultOssFilePath
     */
    public String getOperateResultOssFilePath() {
        return this.operateResultOssFilePath;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String batchOperateCardsTaskId; 
        private String operateResultOssFilePath; 
        private String requestId; 

        /**
         * BatchOperateCardsTaskId.
         */
        public Builder batchOperateCardsTaskId(String batchOperateCardsTaskId) {
            this.batchOperateCardsTaskId = batchOperateCardsTaskId;
            return this;
        }

        /**
         * OperateResultOssFilePath.
         */
        public Builder operateResultOssFilePath(String operateResultOssFilePath) {
            this.operateResultOssFilePath = operateResultOssFilePath;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBatchOperateCardsTaskResponseBody build() {
            return new CreateBatchOperateCardsTaskResponseBody(this);
        } 

    } 

}
