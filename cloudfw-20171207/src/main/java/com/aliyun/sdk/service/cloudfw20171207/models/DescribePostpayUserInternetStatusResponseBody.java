// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePostpayUserInternetStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostpayUserInternetStatusResponseBody</p>
 */
public class DescribePostpayUserInternetStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UnprotectedDate")
    private Long unprotectedDate;

    private DescribePostpayUserInternetStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.unprotectedDate = builder.unprotectedDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayUserInternetStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return unprotectedDate
     */
    public Long getUnprotectedDate() {
        return this.unprotectedDate;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 
        private Long unprotectedDate; 

        private Builder() {
        } 

        private Builder(DescribePostpayUserInternetStatusResponseBody model) {
            this.requestId = model.requestId;
            this.status = model.status;
            this.unprotectedDate = model.unprotectedDate;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0DC783F1-B3A7-578D-8A63-*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the Internet Border firewall. Valid values:</p>
         * <ul>
         * <li><p><strong>open</strong>: The firewall is enabled.</p>
         * </li>
         * <li><p><strong>init</strong>: The firewall is being enabled.</p>
         * </li>
         * <li><p><strong>closed</strong>: The firewall is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The number of days that the firewall was disabled. This parameter is returned only if the value of the Status parameter is open.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder unprotectedDate(Long unprotectedDate) {
            this.unprotectedDate = unprotectedDate;
            return this;
        }

        public DescribePostpayUserInternetStatusResponseBody build() {
            return new DescribePostpayUserInternetStatusResponseBody(this);
        } 

    } 

}
