// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link ModifyDBInstanceClassResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceClassResponseBody</p>
 */
public class ModifyDBInstanceClassResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceClassResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceClassResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDBInstanceClassResponseBody build() {
            return new ModifyDBInstanceClassResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDBInstanceClassResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDBInstanceClassResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceID")
        private Long DBInstanceID;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("ScaleMax")
        private Long scaleMax;

        @com.aliyun.core.annotation.NameInMap("ScaleMin")
        private Long scaleMin;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private Data(Builder builder) {
            this.DBInstanceID = builder.DBInstanceID;
            this.DBInstanceName = builder.DBInstanceName;
            this.scaleMax = builder.scaleMax;
            this.scaleMin = builder.scaleMin;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DBInstanceID
         */
        public Long getDBInstanceID() {
            return this.DBInstanceID;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return scaleMax
         */
        public Long getScaleMax() {
            return this.scaleMax;
        }

        /**
         * @return scaleMin
         */
        public Long getScaleMin() {
            return this.scaleMin;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long DBInstanceID; 
            private String DBInstanceName; 
            private Long scaleMax; 
            private Long scaleMin; 
            private Long taskId; 

            /**
             * DBInstanceID.
             */
            public Builder DBInstanceID(Long DBInstanceID) {
                this.DBInstanceID = DBInstanceID;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * ScaleMax.
             */
            public Builder scaleMax(Long scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * ScaleMin.
             */
            public Builder scaleMin(Long scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
