// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateCredentialReportResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateCredentialReportResponseBody</p>
 */
public class GenerateCredentialReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private GenerateCredentialReportResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCredentialReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String requestId; 
        private String state; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The generation status of the user credential report. Valid values:
         * <p>
         * 
         * *   STARTED: The user credential report starts to generate.
         * *   INPROGRESS: The user credential report is being generated.
         * *   COMPLETED: The user credential report is generated.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GenerateCredentialReportResponseBody build() {
            return new GenerateCredentialReportResponseBody(this);
        } 

    } 

}
