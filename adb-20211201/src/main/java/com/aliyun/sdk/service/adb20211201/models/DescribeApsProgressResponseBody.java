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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeApsProgressResponseBody model) {
            this.apsHiveProgress = model.apsHiveProgress;
            this.requestId = model.requestId;
            this.successPercentage = model.successPercentage;
            this.successTableCount = model.successTableCount;
            this.totalTableCount = model.totalTableCount;
        } 

        /**
         * <p>The migration progress.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder apsHiveProgress(java.util.List<ApsHiveProgress> apsHiveProgress) {
            this.apsHiveProgress = apsHiveProgress;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>-3EEC-</strong></strong></strong>-9F06-******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The success rate.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder successPercentage(Integer successPercentage) {
            this.successPercentage = successPercentage;
            return this;
        }

        /**
         * <p>The total number of migrated tables returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder successTableCount(Integer successTableCount) {
            this.successTableCount = successTableCount;
            return this;
        }

        /**
         * <p>The total number of tables to be migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

            private Builder() {
            } 

            private Builder(ApsHiveProgress model) {
                this.dbName = model.dbName;
                this.progress = model.progress;
                this.speed = model.speed;
                this.tbName = model.tbName;
            } 

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The migration progress.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The migration speed.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
