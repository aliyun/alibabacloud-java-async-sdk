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
 * {@link DescribePostpayUserVpcStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostpayUserVpcStatusResponseBody</p>
 */
public class DescribePostpayUserVpcStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UnprotectedDate")
    private Long unprotectedDate;

    private DescribePostpayUserVpcStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.unprotectedDate = builder.unprotectedDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayUserVpcStatusResponseBody create() {
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

        private Builder(DescribePostpayUserVpcStatusResponseBody model) {
            this.requestId = model.requestId;
            this.status = model.status;
            this.unprotectedDate = model.unprotectedDate;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7447795A-39AB-52CB-8F92-128DF******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the VPC Firewall feature. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: enabled</li>
         * <li><strong>init</strong>: being enabled</li>
         * <li><strong>closed</strong>: disabled</li>
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
         * <p>The number of days during which no asset is added to the VPC Firewall feature for protection. This parameter is valid only when the value of Status is open.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder unprotectedDate(Long unprotectedDate) {
            this.unprotectedDate = unprotectedDate;
            return this;
        }

        public DescribePostpayUserVpcStatusResponseBody build() {
            return new DescribePostpayUserVpcStatusResponseBody(this);
        } 

    } 

}
