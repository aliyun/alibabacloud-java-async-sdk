// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody</p>
 */
public class SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskNo")
    private String taskNo;

    private SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskNo = builder.taskNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody create() {
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

        public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody build() {
            return new SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody(this);
        } 

    } 

}
