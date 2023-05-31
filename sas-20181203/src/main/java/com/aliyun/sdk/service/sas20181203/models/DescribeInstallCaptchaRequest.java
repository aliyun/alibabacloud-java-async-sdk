// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstallCaptchaRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstallCaptchaRequest</p>
 */
public class DescribeInstallCaptchaRequest extends Request {
    @Query
    @NameInMap("Deadline")
    private String deadline;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeInstallCaptchaRequest(Builder builder) {
        super(builder);
        this.deadline = builder.deadline;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstallCaptchaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deadline
     */
    public String getDeadline() {
        return this.deadline;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeInstallCaptchaRequest, Builder> {
        private String deadline; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstallCaptchaRequest request) {
            super(request);
            this.deadline = request.deadline;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The validity period of the installation verification code. If this parameter is not specified, the validity period is 1 hour.
         * <p>
         * 
         * >  The installation verification code is valid only within the validity period. An expired installation verification code cannot be used to install the agent.
         */
        public Builder deadline(String deadline) {
            this.putQueryParameter("Deadline", deadline);
            this.deadline = deadline;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeInstallCaptchaRequest build() {
            return new DescribeInstallCaptchaRequest(this);
        } 

    } 

}
