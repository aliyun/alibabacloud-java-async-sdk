// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CdnMigrateRegisterResponseBody} extends {@link TeaModel}
 *
 * <p>CdnMigrateRegisterResponseBody</p>
 */
public class CdnMigrateRegisterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CdnMigrateRegisterResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CdnMigrateRegisterResponseBody create() {
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
         * The accelerated domain name. You can specify only one domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The registration status. Valid values:
         * <p>
         * 
         * *   **running**
         * *   **succeed**
         * *   **failed**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CdnMigrateRegisterResponseBody build() {
            return new CdnMigrateRegisterResponseBody(this);
        } 

    } 

}
