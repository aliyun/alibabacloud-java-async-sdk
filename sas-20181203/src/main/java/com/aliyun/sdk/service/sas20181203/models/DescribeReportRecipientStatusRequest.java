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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The email address of the recipient. Separate multiple email addresses with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a>,<a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder recipients(String recipients) {
            this.putQueryParameter("Recipients", recipients);
            this.recipients = recipients;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>39.174.xxx.xxx</p>
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
