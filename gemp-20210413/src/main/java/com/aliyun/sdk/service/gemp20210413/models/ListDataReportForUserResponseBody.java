// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataReportForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataReportForUserResponseBody</p>
 */
public class ListDataReportForUserResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListDataReportForUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataReportForUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataReportForUserResponseBody build() {
            return new ListDataReportForUserResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("distributionIncidentCount")
        private Long distributionIncidentCount;

        @NameInMap("escalationIncidentCount")
        private Long escalationIncidentCount;

        @NameInMap("finishIncidentNumber")
        private Long finishIncidentNumber;

        @NameInMap("finishProportion")
        private String finishProportion;

        @NameInMap("meanTimeToAcknowledge")
        private String meanTimeToAcknowledge;

        @NameInMap("meanTimeToRepair")
        private String meanTimeToRepair;

        @NameInMap("unAcknowledgedEscalationIncidentCount")
        private Long unAcknowledgedEscalationIncidentCount;

        @NameInMap("unDistributionIncidentCount")
        private Long unDistributionIncidentCount;

        @NameInMap("unFinishEscalationIncidentCount")
        private Long unFinishEscalationIncidentCount;

        @NameInMap("userId")
        private Long userId;

        @NameInMap("userName")
        private String userName;

        private Data(Builder builder) {
            this.distributionIncidentCount = builder.distributionIncidentCount;
            this.escalationIncidentCount = builder.escalationIncidentCount;
            this.finishIncidentNumber = builder.finishIncidentNumber;
            this.finishProportion = builder.finishProportion;
            this.meanTimeToAcknowledge = builder.meanTimeToAcknowledge;
            this.meanTimeToRepair = builder.meanTimeToRepair;
            this.unAcknowledgedEscalationIncidentCount = builder.unAcknowledgedEscalationIncidentCount;
            this.unDistributionIncidentCount = builder.unDistributionIncidentCount;
            this.unFinishEscalationIncidentCount = builder.unFinishEscalationIncidentCount;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return distributionIncidentCount
         */
        public Long getDistributionIncidentCount() {
            return this.distributionIncidentCount;
        }

        /**
         * @return escalationIncidentCount
         */
        public Long getEscalationIncidentCount() {
            return this.escalationIncidentCount;
        }

        /**
         * @return finishIncidentNumber
         */
        public Long getFinishIncidentNumber() {
            return this.finishIncidentNumber;
        }

        /**
         * @return finishProportion
         */
        public String getFinishProportion() {
            return this.finishProportion;
        }

        /**
         * @return meanTimeToAcknowledge
         */
        public String getMeanTimeToAcknowledge() {
            return this.meanTimeToAcknowledge;
        }

        /**
         * @return meanTimeToRepair
         */
        public String getMeanTimeToRepair() {
            return this.meanTimeToRepair;
        }

        /**
         * @return unAcknowledgedEscalationIncidentCount
         */
        public Long getUnAcknowledgedEscalationIncidentCount() {
            return this.unAcknowledgedEscalationIncidentCount;
        }

        /**
         * @return unDistributionIncidentCount
         */
        public Long getUnDistributionIncidentCount() {
            return this.unDistributionIncidentCount;
        }

        /**
         * @return unFinishEscalationIncidentCount
         */
        public Long getUnFinishEscalationIncidentCount() {
            return this.unFinishEscalationIncidentCount;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long distributionIncidentCount; 
            private Long escalationIncidentCount; 
            private Long finishIncidentNumber; 
            private String finishProportion; 
            private String meanTimeToAcknowledge; 
            private String meanTimeToRepair; 
            private Long unAcknowledgedEscalationIncidentCount; 
            private Long unDistributionIncidentCount; 
            private Long unFinishEscalationIncidentCount; 
            private Long userId; 
            private String userName; 

            /**
             * distributionIncidentCount.
             */
            public Builder distributionIncidentCount(Long distributionIncidentCount) {
                this.distributionIncidentCount = distributionIncidentCount;
                return this;
            }

            /**
             * escalationIncidentCount.
             */
            public Builder escalationIncidentCount(Long escalationIncidentCount) {
                this.escalationIncidentCount = escalationIncidentCount;
                return this;
            }

            /**
             * finishIncidentNumber.
             */
            public Builder finishIncidentNumber(Long finishIncidentNumber) {
                this.finishIncidentNumber = finishIncidentNumber;
                return this;
            }

            /**
             * finishProportion.
             */
            public Builder finishProportion(String finishProportion) {
                this.finishProportion = finishProportion;
                return this;
            }

            /**
             * MRRA
             */
            public Builder meanTimeToAcknowledge(String meanTimeToAcknowledge) {
                this.meanTimeToAcknowledge = meanTimeToAcknowledge;
                return this;
            }

            /**
             * MTTA
             */
            public Builder meanTimeToRepair(String meanTimeToRepair) {
                this.meanTimeToRepair = meanTimeToRepair;
                return this;
            }

            /**
             * unAcknowledgedEscalationIncidentCount.
             */
            public Builder unAcknowledgedEscalationIncidentCount(Long unAcknowledgedEscalationIncidentCount) {
                this.unAcknowledgedEscalationIncidentCount = unAcknowledgedEscalationIncidentCount;
                return this;
            }

            /**
             * unDistributionIncidentCount.
             */
            public Builder unDistributionIncidentCount(Long unDistributionIncidentCount) {
                this.unDistributionIncidentCount = unDistributionIncidentCount;
                return this;
            }

            /**
             * unFinishEscalationIncidentCount.
             */
            public Builder unFinishEscalationIncidentCount(Long unFinishEscalationIncidentCount) {
                this.unFinishEscalationIncidentCount = unFinishEscalationIncidentCount;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * userName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
