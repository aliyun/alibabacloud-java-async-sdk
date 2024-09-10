// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReportRecipientStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReportRecipientStatusResponseBody</p>
 */
public class DescribeReportRecipientStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportRecipientList")
    private java.util.List < ReportRecipientList> reportRecipientList;

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

    /**
     * @return reportRecipientList
     */
    public java.util.List < ReportRecipientList> getReportRecipientList() {
        return this.reportRecipientList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ReportRecipientList> reportRecipientList; 
        private String requestId; 

        /**
         * The report recipients.
         */
        public Builder reportRecipientList(java.util.List < ReportRecipientList> reportRecipientList) {
            this.reportRecipientList = reportRecipientList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeReportRecipientStatusResponseBody build() {
            return new DescribeReportRecipientStatusResponseBody(this);
        } 

    } 

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

            /**
             * Indicates whether the email address is verified. Valid values:
             * <p>
             * 
             * *   0: no
             * *   1: yes
             * 
             * >  If no email is specified when you create a report, the value of this parameter is empty.
             */
            public Builder isVerify(Integer isVerify) {
                this.isVerify = isVerify;
                return this;
            }

            /**
             * The email address of the report recipient.
             * <p>
             * 
             * >  If no email is specified when you create a report, the value of this parameter is empty.
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
