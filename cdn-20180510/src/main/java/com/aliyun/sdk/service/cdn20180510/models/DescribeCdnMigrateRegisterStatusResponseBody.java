// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnMigrateRegisterStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnMigrateRegisterStatusResponseBody</p>
 */
public class DescribeCdnMigrateRegisterStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeCdnMigrateRegisterStatusResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnMigrateRegisterStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    public static final class Builder {
        private String domainName; 
        private String requestId; 
        private String status; 

        /**
         * The accelerated domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The registration status. Valid values:
         * <p>
         * 
         * *   **not exist**
         * *   **running**
         * *   **succeed**
         * *   **failed**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeCdnMigrateRegisterStatusResponseBody build() {
            return new DescribeCdnMigrateRegisterStatusResponseBody(this);
        } 

    } 

}
