// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicantResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicantResponseBody</p>
 */
public class CreateApplicantResponseBody extends TeaModel {
    @NameInMap("ApplicantId")
    private String applicantId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateApplicantResponseBody(Builder builder) {
        this.applicantId = builder.applicantId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicantResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicantId
     */
    public String getApplicantId() {
        return this.applicantId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicantId; 
        private String requestId; 

        /**
         * ApplicantId.
         */
        public Builder applicantId(String applicantId) {
            this.applicantId = applicantId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApplicantResponseBody build() {
            return new CreateApplicantResponseBody(this);
        } 

    } 

}
