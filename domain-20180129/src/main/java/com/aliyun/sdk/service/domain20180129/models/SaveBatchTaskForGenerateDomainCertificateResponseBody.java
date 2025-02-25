// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveBatchTaskForGenerateDomainCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>SaveBatchTaskForGenerateDomainCertificateResponseBody</p>
 */
public class SaveBatchTaskForGenerateDomainCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskNo")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40F46D3D-F4F3-4CCB-AC30-2DD20E32E528</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8b1cd755-4928-4b02-adee-e5d41d7b1939</p>
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
