// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetGovernanceReportStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetGovernanceReportStatusResponseBody</p>
 */
public class GetGovernanceReportStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GovernanceItemsStatus")
    private GovernanceItemsStatus governanceItemsStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WholeReportStatus")
    private String wholeReportStatus;

    private GetGovernanceReportStatusResponseBody(Builder builder) {
        this.governanceItemsStatus = builder.governanceItemsStatus;
        this.requestId = builder.requestId;
        this.wholeReportStatus = builder.wholeReportStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGovernanceReportStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return governanceItemsStatus
     */
    public GovernanceItemsStatus getGovernanceItemsStatus() {
        return this.governanceItemsStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return wholeReportStatus
     */
    public String getWholeReportStatus() {
        return this.wholeReportStatus;
    }

    public static final class Builder {
        private GovernanceItemsStatus governanceItemsStatus; 
        private String requestId; 
        private String wholeReportStatus; 

        /**
         * GovernanceItemsStatus.
         */
        public Builder governanceItemsStatus(GovernanceItemsStatus governanceItemsStatus) {
            this.governanceItemsStatus = governanceItemsStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WholeReportStatus.
         */
        public Builder wholeReportStatus(String wholeReportStatus) {
            this.wholeReportStatus = wholeReportStatus;
            return this;
        }

        public GetGovernanceReportStatusResponseBody build() {
            return new GetGovernanceReportStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGovernanceReportStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetGovernanceReportStatusResponseBody</p>
     */
    public static class GovernanceItemStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GovernanceItem")
        private String governanceItem;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private GovernanceItemStatus(Builder builder) {
            this.governanceItem = builder.governanceItem;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GovernanceItemStatus create() {
            return builder().build();
        }

        /**
         * @return governanceItem
         */
        public String getGovernanceItem() {
            return this.governanceItem;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String governanceItem; 
            private String status; 

            /**
             * GovernanceItem.
             */
            public Builder governanceItem(String governanceItem) {
                this.governanceItem = governanceItem;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public GovernanceItemStatus build() {
                return new GovernanceItemStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGovernanceReportStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetGovernanceReportStatusResponseBody</p>
     */
    public static class GovernanceItemsStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GovernanceItemStatus")
        private java.util.List<GovernanceItemStatus> governanceItemStatus;

        private GovernanceItemsStatus(Builder builder) {
            this.governanceItemStatus = builder.governanceItemStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GovernanceItemsStatus create() {
            return builder().build();
        }

        /**
         * @return governanceItemStatus
         */
        public java.util.List<GovernanceItemStatus> getGovernanceItemStatus() {
            return this.governanceItemStatus;
        }

        public static final class Builder {
            private java.util.List<GovernanceItemStatus> governanceItemStatus; 

            /**
             * GovernanceItemStatus.
             */
            public Builder governanceItemStatus(java.util.List<GovernanceItemStatus> governanceItemStatus) {
                this.governanceItemStatus = governanceItemStatus;
                return this;
            }

            public GovernanceItemsStatus build() {
                return new GovernanceItemsStatus(this);
            } 

        } 

    }
}
