// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDomainTransferStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainTransferStatusResponseBody</p>
 */
public class QueryDomainTransferStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainTransferStatus")
    private java.util.List < DomainTransferStatus> domainTransferStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDomainTransferStatusResponseBody(Builder builder) {
        this.domainTransferStatus = builder.domainTransferStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainTransferStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainTransferStatus
     */
    public java.util.List < DomainTransferStatus> getDomainTransferStatus() {
        return this.domainTransferStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainTransferStatus> domainTransferStatus; 
        private String requestId; 

        /**
         * DomainTransferStatus.
         */
        public Builder domainTransferStatus(java.util.List < DomainTransferStatus> domainTransferStatus) {
            this.domainTransferStatus = domainTransferStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDomainTransferStatusResponseBody build() {
            return new QueryDomainTransferStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainTransferStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainTransferStatusResponseBody</p>
     */
    public static class DomainTransferStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainStatusDescription")
        private String domainStatusDescription;

        private DomainTransferStatus(Builder builder) {
            this.domainName = builder.domainName;
            this.domainStatusDescription = builder.domainStatusDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTransferStatus create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainStatusDescription
         */
        public String getDomainStatusDescription() {
            return this.domainStatusDescription;
        }

        public static final class Builder {
            private String domainName; 
            private String domainStatusDescription; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainStatusDescription.
             */
            public Builder domainStatusDescription(String domainStatusDescription) {
                this.domainStatusDescription = domainStatusDescription;
                return this;
            }

            public DomainTransferStatus build() {
                return new DomainTransferStatus(this);
            } 

        } 

    }
}
