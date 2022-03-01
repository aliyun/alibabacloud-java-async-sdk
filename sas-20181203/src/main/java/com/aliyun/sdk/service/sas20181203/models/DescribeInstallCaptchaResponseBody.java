// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstallCaptchaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstallCaptchaResponseBody</p>
 */
public class DescribeInstallCaptchaResponseBody extends TeaModel {
    @NameInMap("CaptchaCode")
    private String captchaCode;

    @NameInMap("Deadline")
    private String deadline;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstallCaptchaResponseBody(Builder builder) {
        this.captchaCode = builder.captchaCode;
        this.deadline = builder.deadline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstallCaptchaResponseBody create() {
        return builder().build();
    }

    /**
     * @return captchaCode
     */
    public String getCaptchaCode() {
        return this.captchaCode;
    }

    /**
     * @return deadline
     */
    public String getDeadline() {
        return this.deadline;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String captchaCode; 
        private String deadline; 
        private String requestId; 

        /**
         * CaptchaCode.
         */
        public Builder captchaCode(String captchaCode) {
            this.captchaCode = captchaCode;
            return this;
        }

        /**
         * Deadline.
         */
        public Builder deadline(String deadline) {
            this.deadline = deadline;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstallCaptchaResponseBody build() {
            return new DescribeInstallCaptchaResponseBody(this);
        } 

    } 

}
