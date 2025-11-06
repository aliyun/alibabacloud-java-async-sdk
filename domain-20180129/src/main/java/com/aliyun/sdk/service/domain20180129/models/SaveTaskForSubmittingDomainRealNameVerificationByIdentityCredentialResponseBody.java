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
 * {@link SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody</p>
 */
public class SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskNo")
    private String taskNo;

    private SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskNo = builder.taskNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody create() {
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

        private Builder(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody model) {
            this.requestId = model.requestId;
            this.taskNo = model.taskNo;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskNo.
         */
        public Builder taskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }

        public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody build() {
            return new SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody(this);
        } 

    } 

}
