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
 * {@link DescribeReportRecipientStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReportRecipientStatusResponseBody</p>
 */
public class DescribeReportRecipientStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportRecipientList")
    private java.util.List<ReportRecipientList> reportRecipientList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeReportRecipientStatusResponseBody(Builder builder) {
        this.reportRecipientList = builder.reportRecipientList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReportRecipientStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportRecipientList
     */
    public java.util.List<ReportRecipientList> getReportRecipientList() {
        return this.reportRecipientList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ReportRecipientList> reportRecipientList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeReportRecipientStatusResponseBody model) {
            this.reportRecipientList = model.reportRecipientList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The report recipients.</p>
         */
        public Builder reportRecipientList(java.util.List<ReportRecipientList> reportRecipientList) {
            this.reportRecipientList = reportRecipientList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0DC1F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeReportRecipientStatusResponseBody build() {
            return new DescribeReportRecipientStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReportRecipientStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReportRecipientStatusResponseBody</p>
     */
    public static class ReportRecipientList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsVerify")
        private Integer isVerify;

        @com.aliyun.core.annotation.NameInMap("Recipient")
        private String recipient;

        private ReportRecipientList(Builder builder) {
            this.isVerify = builder.isVerify;
            this.recipient = builder.recipient;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportRecipientList create() {
            return builder().build();
        }

        /**
         * @return isVerify
         */
        public Integer getIsVerify() {
            return this.isVerify;
        }

        /**
         * @return recipient
         */
        public String getRecipient() {
            return this.recipient;
        }

        public static final class Builder {
            private Integer isVerify; 
            private String recipient; 

            private Builder() {
            } 

            private Builder(ReportRecipientList model) {
                this.isVerify = model.isVerify;
                this.recipient = model.recipient;
            } 

            /**
             * <p>Indicates whether the email address is verified. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * <blockquote>
             * <p> If no email is specified when you create a report, the value of this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isVerify(Integer isVerify) {
                this.isVerify = isVerify;
                return this;
            }

            /**
             * <p>The email address of the report recipient.</p>
             * <blockquote>
             * <p> If no email is specified when you create a report, the value of this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder recipient(String recipient) {
                this.recipient = recipient;
                return this;
            }

            public ReportRecipientList build() {
                return new ReportRecipientList(this);
            } 

        } 

    }
}
