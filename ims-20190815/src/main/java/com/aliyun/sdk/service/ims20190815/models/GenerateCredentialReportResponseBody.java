// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BBCCA90A-A1F0-4B16-B355-692247197805</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The generation status of the user credential report. Valid values:</p>
         * <ul>
         * <li>STARTED: The user credential report starts to generate.</li>
         * <li>INPROGRESS: The user credential report is being generated.</li>
         * <li>COMPLETED: The user credential report is generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STARTED</p>
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
