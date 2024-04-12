// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForGenerateDomainCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>SaveBatchTaskForGenerateDomainCertificateResponseBody</p>
 */
public class SaveBatchTaskForGenerateDomainCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskNo")
    private String taskNo;

    private SaveBatchTaskForGenerateDomainCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskNo = builder.taskNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForGenerateDomainCertificateResponseBody create() {
        return builder().build();
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

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The task ID.
         */
        public Builder taskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }

        public SaveBatchTaskForGenerateDomainCertificateResponseBody build() {
            return new SaveBatchTaskForGenerateDomainCertificateResponseBody(this);
        } 

    } 

}
