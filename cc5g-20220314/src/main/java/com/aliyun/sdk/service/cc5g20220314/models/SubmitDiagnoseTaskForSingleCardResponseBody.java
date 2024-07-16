// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDiagnoseTaskForSingleCardResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitDiagnoseTaskForSingleCardResponseBody</p>
 */
public class SubmitDiagnoseTaskForSingleCardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnoseTaskId")
    private String diagnoseTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitDiagnoseTaskForSingleCardResponseBody(Builder builder) {
        this.diagnoseTaskId = builder.diagnoseTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDiagnoseTaskForSingleCardResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnoseTaskId
     */
    public String getDiagnoseTaskId() {
        return this.diagnoseTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String diagnoseTaskId; 
        private String requestId; 

        /**
         * DiagnoseTaskId.
         */
        public Builder diagnoseTaskId(String diagnoseTaskId) {
            this.diagnoseTaskId = diagnoseTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitDiagnoseTaskForSingleCardResponseBody build() {
            return new SubmitDiagnoseTaskForSingleCardResponseBody(this);
        } 

    } 

}
