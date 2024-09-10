// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReportRecipientStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeReportRecipientStatusRequest</p>
 */
public class DescribeReportRecipientStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Recipients")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recipients;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeReportRecipientStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.recipients = builder.recipients;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReportRecipientStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return recipients
     */
    public String getRecipients() {
        return this.recipients;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeReportRecipientStatusRequest, Builder> {
        private String lang; 
        private String recipients; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReportRecipientStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.recipients = request.recipients;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
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
         * The email address of the recipient. Separate multiple email addresses with commas (,).
         */
        public Builder recipients(String recipients) {
            this.putQueryParameter("Recipients", recipients);
            this.recipients = recipients;
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
        public DescribeReportRecipientStatusRequest build() {
            return new DescribeReportRecipientStatusRequest(this);
        } 

    } 

}
