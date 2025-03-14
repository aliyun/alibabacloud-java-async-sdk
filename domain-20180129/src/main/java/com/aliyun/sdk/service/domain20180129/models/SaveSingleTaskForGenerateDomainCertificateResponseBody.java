// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveSingleTaskForGenerateDomainCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForGenerateDomainCertificateResponseBody</p>
 */
public class SaveSingleTaskForGenerateDomainCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskNo")
    private String taskNo;

    private SaveSingleTaskForGenerateDomainCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskNo = builder.taskNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForGenerateDomainCertificateResponseBody create() {
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
         * <p>3E68AB12-3D1F-5B9A-A358-F6B7852AD0B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2741a831-d9ea-4dfb-af94-61948c0478c3</p>
         */
        public Builder taskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }

        public SaveSingleTaskForGenerateDomainCertificateResponseBody build() {
            return new SaveSingleTaskForGenerateDomainCertificateResponseBody(this);
        } 

    } 

}
