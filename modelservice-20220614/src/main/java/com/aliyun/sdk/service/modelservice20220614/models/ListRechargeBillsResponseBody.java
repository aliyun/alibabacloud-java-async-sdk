// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelservice20220614.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRechargeBillsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRechargeBillsResponseBody</p>
 */
public class ListRechargeBillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanseInfos")
    private java.util.List < InstanseInfos> instanseInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResidueAmount")
    private Integer residueAmount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListRechargeBillsResponseBody(Builder builder) {
        this.instanseInfos = builder.instanseInfos;
        this.requestId = builder.requestId;
        this.residueAmount = builder.residueAmount;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRechargeBillsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanseInfos
     */
    public java.util.List < InstanseInfos> getInstanseInfos() {
        return this.instanseInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return residueAmount
     */
    public Integer getResidueAmount() {
        return this.residueAmount;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < InstanseInfos> instanseInfos; 
        private String requestId; 
        private Integer residueAmount; 
        private Integer totalCount; 

        /**
         * InstanseInfos.
         */
        public Builder instanseInfos(java.util.List < InstanseInfos> instanseInfos) {
            this.instanseInfos = instanseInfos;
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
         * ResidueAmount.
         */
        public Builder residueAmount(Integer residueAmount) {
            this.residueAmount = residueAmount;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRechargeBillsResponseBody build() {
            return new ListRechargeBillsResponseBody(this);
        } 

    } 

    public static class InstanseInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrTimes")
        private Integer currTimes;

        @com.aliyun.core.annotation.NameInMap("GmtEndTime")
        private String gmtEndTime;

        @com.aliyun.core.annotation.NameInMap("InitTimes")
        private Integer initTimes;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private InstanseInfos(Builder builder) {
            this.currTimes = builder.currTimes;
            this.gmtEndTime = builder.gmtEndTime;
            this.initTimes = builder.initTimes;
            this.instanceId = builder.instanceId;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanseInfos create() {
            return builder().build();
        }

        /**
         * @return currTimes
         */
        public Integer getCurrTimes() {
            return this.currTimes;
        }

        /**
         * @return gmtEndTime
         */
        public String getGmtEndTime() {
            return this.gmtEndTime;
        }

        /**
         * @return initTimes
         */
        public Integer getInitTimes() {
            return this.initTimes;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private Integer currTimes; 
            private String gmtEndTime; 
            private Integer initTimes; 
            private String instanceId; 
            private String source; 

            /**
             * CurrTimes.
             */
            public Builder currTimes(Integer currTimes) {
                this.currTimes = currTimes;
                return this;
            }

            /**
             * GmtEndTime.
             */
            public Builder gmtEndTime(String gmtEndTime) {
                this.gmtEndTime = gmtEndTime;
                return this;
            }

            /**
             * InitTimes.
             */
            public Builder initTimes(Integer initTimes) {
                this.initTimes = initTimes;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public InstanseInfos build() {
                return new InstanseInfos(this);
            } 

        } 

    }
}
