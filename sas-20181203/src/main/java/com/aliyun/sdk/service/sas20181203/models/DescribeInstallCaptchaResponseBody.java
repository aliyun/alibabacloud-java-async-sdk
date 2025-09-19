// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeInstallCaptchaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstallCaptchaResponseBody</p>
 */
public class DescribeInstallCaptchaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CaptchaCode")
    private String captchaCode;

    @com.aliyun.core.annotation.NameInMap("Deadline")
    private String deadline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstallCaptchaResponseBody model) {
            this.captchaCode = model.captchaCode;
            this.deadline = model.deadline;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The installation verification code for you to manually install the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>M1HH**</p>
         */
        public Builder captchaCode(String captchaCode) {
            this.captchaCode = captchaCode;
            return this;
        }

        /**
         * <p>The validity period of the installation verification code.</p>
         * <blockquote>
         * <p> The installation verification code is valid only within the validity period. An expired installation verification code cannot be used to install the agent.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-10-10 16:06:38</p>
         */
        public Builder deadline(String deadline) {
            this.deadline = deadline;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4E5BFDCF-B9DD-430D-9DA4-151BCB581C9D</p>
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
