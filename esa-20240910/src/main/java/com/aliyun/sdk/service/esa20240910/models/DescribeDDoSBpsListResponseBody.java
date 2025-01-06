// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeDDoSBpsListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSBpsListResponseBody</p>
 */
public class DescribeDDoSBpsListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private Integer dataInterval;

    @com.aliyun.core.annotation.NameInMap("DataModule")
    private java.util.List<DataModule> dataModule;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDDoSBpsListResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.dataModule = builder.dataModule;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSBpsListResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInterval
     */
    public Integer getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return dataModule
     */
    public java.util.List<DataModule> getDataModule() {
        return this.dataModule;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private Integer dataInterval; 
        private java.util.List<DataModule> dataModule; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        /**
         * DataInterval.
         */
        public Builder dataInterval(Integer dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * DataModule.
         */
        public Builder dataModule(java.util.List<DataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDDoSBpsListResponseBody build() {
            return new DescribeDDoSBpsListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDoSBpsListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDoSBpsListResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackBps")
        private Long attackBps;

        @com.aliyun.core.annotation.NameInMap("AttackPps")
        private Long attackPps;

        @com.aliyun.core.annotation.NameInMap("NormalBps")
        private Long normalBps;

        @com.aliyun.core.annotation.NameInMap("NormalPps")
        private Long normalPps;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TotalBps")
        private Long totalBps;

        @com.aliyun.core.annotation.NameInMap("TotalPps")
        private Long totalPps;

        private DataModule(Builder builder) {
            this.attackBps = builder.attackBps;
            this.attackPps = builder.attackPps;
            this.normalBps = builder.normalBps;
            this.normalPps = builder.normalPps;
            this.timeStamp = builder.timeStamp;
            this.totalBps = builder.totalBps;
            this.totalPps = builder.totalPps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return attackBps
         */
        public Long getAttackBps() {
            return this.attackBps;
        }

        /**
         * @return attackPps
         */
        public Long getAttackPps() {
            return this.attackPps;
        }

        /**
         * @return normalBps
         */
        public Long getNormalBps() {
            return this.normalBps;
        }

        /**
         * @return normalPps
         */
        public Long getNormalPps() {
            return this.normalPps;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return totalBps
         */
        public Long getTotalBps() {
            return this.totalBps;
        }

        /**
         * @return totalPps
         */
        public Long getTotalPps() {
            return this.totalPps;
        }

        public static final class Builder {
            private Long attackBps; 
            private Long attackPps; 
            private Long normalBps; 
            private Long normalPps; 
            private String timeStamp; 
            private Long totalBps; 
            private Long totalPps; 

            /**
             * AttackBps.
             */
            public Builder attackBps(Long attackBps) {
                this.attackBps = attackBps;
                return this;
            }

            /**
             * AttackPps.
             */
            public Builder attackPps(Long attackPps) {
                this.attackPps = attackPps;
                return this;
            }

            /**
             * NormalBps.
             */
            public Builder normalBps(Long normalBps) {
                this.normalBps = normalBps;
                return this;
            }

            /**
             * NormalPps.
             */
            public Builder normalPps(Long normalPps) {
                this.normalPps = normalPps;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * TotalBps.
             */
            public Builder totalBps(Long totalBps) {
                this.totalBps = totalBps;
                return this;
            }

            /**
             * TotalPps.
             */
            public Builder totalPps(Long totalPps) {
                this.totalPps = totalPps;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
}
