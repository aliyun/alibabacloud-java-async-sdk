// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserLogserviceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserLogserviceStatusResponseBody</p>
 */
public class DescribeUserLogserviceStatusResponseBody extends TeaModel {
    @NameInMap("Enabled")
    private Boolean enabled;

    @NameInMap("InDebt")
    private Boolean inDebt;

    @NameInMap("InDebtOverdue")
    private Boolean inDebtOverdue;

    @NameInMap("OnService")
    private Boolean onService;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUserLogserviceStatusResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.inDebt = builder.inDebt;
        this.inDebtOverdue = builder.inDebtOverdue;
        this.onService = builder.onService;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserLogserviceStatusResponseBody create() {
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
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * InDebt.
         */
        public Builder inDebt(Boolean inDebt) {
            this.inDebt = inDebt;
            return this;
        }

        /**
         * InDebtOverdue.
         */
        public Builder inDebtOverdue(Boolean inDebtOverdue) {
            this.inDebtOverdue = inDebtOverdue;
            return this;
        }

        /**
         * OnService.
         */
        public Builder onService(Boolean onService) {
            this.onService = onService;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserLogserviceStatusResponseBody build() {
            return new DescribeUserLogserviceStatusResponseBody(this);
        } 

    } 

}
