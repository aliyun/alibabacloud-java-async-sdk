// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeApsProgressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsProgressResponseBody</p>
 */
public class DescribeApsProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApsHiveProgress")
    private java.util.List<ApsHiveProgress> apsHiveProgress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessPercentage")
    private Integer successPercentage;

    @com.aliyun.core.annotation.NameInMap("SuccessTableCount")
    private Integer successTableCount;

    @com.aliyun.core.annotation.NameInMap("TotalTableCount")
    private Integer totalTableCount;

    private DescribeApsProgressResponseBody(Builder builder) {
        this.apsHiveProgress = builder.apsHiveProgress;
        this.requestId = builder.requestId;
        this.successPercentage = builder.successPercentage;
        this.successTableCount = builder.successTableCount;
        this.totalTableCount = builder.totalTableCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsProgressResponseBody create() {
        return builder().build();
    }

    /**
     * @return apsHiveProgress
     */
    public java.util.List<ApsHiveProgress> getApsHiveProgress() {
        return this.apsHiveProgress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successPercentage
     */
    public Integer getSuccessPercentage() {
        return this.successPercentage;
    }

    /**
     * @return successTableCount
     */
    public Integer getSuccessTableCount() {
        return this.successTableCount;
    }

    /**
     * @return totalTableCount
     */
    public Integer getTotalTableCount() {
        return this.totalTableCount;
    }

    public static final class Builder {
        private java.util.List<ApsHiveProgress> apsHiveProgress; 
        private String requestId; 
        private Integer successPercentage; 
        private Integer successTableCount; 
        private Integer totalTableCount; 

        /**
         * ApsHiveProgress.
         */
        public Builder apsHiveProgress(java.util.List<ApsHiveProgress> apsHiveProgress) {
            this.apsHiveProgress = apsHiveProgress;
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
         * SuccessPercentage.
         */
        public Builder successPercentage(Integer successPercentage) {
            this.successPercentage = successPercentage;
            return this;
        }

        /**
         * SuccessTableCount.
         */
        public Builder successTableCount(Integer successTableCount) {
            this.successTableCount = successTableCount;
            return this;
        }

        /**
         * TotalTableCount.
         */
        public Builder totalTableCount(Integer totalTableCount) {
            this.totalTableCount = totalTableCount;
            return this;
        }

        public DescribeApsProgressResponseBody build() {
            return new DescribeApsProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApsProgressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsProgressResponseBody</p>
     */
    public static class ApsHiveProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private String speed;

        @com.aliyun.core.annotation.NameInMap("TbName")
        private String tbName;

        private ApsHiveProgress(Builder builder) {
            this.dbName = builder.dbName;
            this.progress = builder.progress;
            this.speed = builder.speed;
            this.tbName = builder.tbName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApsHiveProgress create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return tbName
         */
        public String getTbName() {
            return this.tbName;
        }

        public static final class Builder {
            private String dbName; 
            private String progress; 
            private String speed; 
            private String tbName; 

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * TbName.
             */
            public Builder tbName(String tbName) {
                this.tbName = tbName;
                return this;
            }

            public ApsHiveProgress build() {
                return new ApsHiveProgress(this);
            } 

        } 

    }
}
