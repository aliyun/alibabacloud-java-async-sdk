// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserDcdnIpaStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserDcdnIpaStatusResponseBody</p>
 */
public class DescribeUserDcdnIpaStatusResponseBody extends TeaModel {
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

    private DescribeUserDcdnIpaStatusResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.inDebt = builder.inDebt;
        this.inDebtOverdue = builder.inDebtOverdue;
        this.onService = builder.onService;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserDcdnIpaStatusResponseBody create() {
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
         * <p>Indicates whether the IPA service is activated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>Indicates whether you have overdue payments.</p>
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
         * <p>Indicates whether the IPA service is available. The IPA service is available when no payment is overdue.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder onService(Boolean onService) {
            this.onService = onService;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4F51E9C3-728F-4E35-952D-0ED87A06A8A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserDcdnIpaStatusResponseBody build() {
            return new DescribeUserDcdnIpaStatusResponseBody(this);
        } 

    } 

}
