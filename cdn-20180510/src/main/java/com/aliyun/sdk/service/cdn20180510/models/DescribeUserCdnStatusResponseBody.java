// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeUserCdnStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserCdnStatusResponseBody</p>
 */
public class DescribeUserCdnStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("InDebt")
    private Boolean inDebt;

    @com.aliyun.core.annotation.NameInMap("InDebtOverdue")
    private Boolean inDebtOverdue;

    @com.aliyun.core.annotation.NameInMap("OnService")
    private Boolean onService;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserCdnStatusResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.inDebt = builder.inDebt;
        this.inDebtOverdue = builder.inDebtOverdue;
        this.onService = builder.onService;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserCdnStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return inDebt
     */
    public Boolean getInDebt() {
        return this.inDebt;
    }

    /**
     * @return inDebtOverdue
     */
    public Boolean getInDebtOverdue() {
        return this.inDebtOverdue;
    }

    /**
     * @return onService
     */
    public Boolean getOnService() {
        return this.onService;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean enabled; 
        private Boolean inDebt; 
        private Boolean inDebtOverdue; 
        private Boolean onService; 
        private String requestId; 

        /**
         * <p>Indicates whetherAlibaba Cloud CDN is activated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>Indicates whether your account has overdue payments.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder inDebt(Boolean inDebt) {
            this.inDebt = inDebt;
            return this;
        }

        /**
         * <p>Indicates whether the grace period for your overdue payments expired.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder inDebtOverdue(Boolean inDebtOverdue) {
            this.inDebtOverdue = inDebtOverdue;
            return this;
        }

        /**
         * <p>Indicates whether the service is available.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder onService(Boolean onService) {
            this.onService = onService;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39B1DC7F-9D25-5D54-8F02-6EE26A7F48CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserCdnStatusResponseBody build() {
            return new DescribeUserCdnStatusResponseBody(this);
        } 

    } 

}
