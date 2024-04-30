// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCurrentModifyOrderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCurrentModifyOrderResponseBody</p>
 */
public class DescribeCurrentModifyOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModifyOrder")
    private java.util.List < ModifyOrder> modifyOrder;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCurrentModifyOrderResponseBody(Builder builder) {
        this.modifyOrder = builder.modifyOrder;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCurrentModifyOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return modifyOrder
     */
    public java.util.List < ModifyOrder> getModifyOrder() {
        return this.modifyOrder;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ModifyOrder> modifyOrder; 
        private String requestId; 

        /**
         * The specification change order.
         */
        public Builder modifyOrder(java.util.List < ModifyOrder> modifyOrder) {
            this.modifyOrder = modifyOrder;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCurrentModifyOrderResponseBody build() {
            return new DescribeCurrentModifyOrderResponseBody(this);
        } 

    } 

    public static class ModifyOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassGroup")
        private String classGroup;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("Mark")
        private String mark;

        @com.aliyun.core.annotation.NameInMap("MemoryClass")
        private String memoryClass;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private String storage;

        @com.aliyun.core.annotation.NameInMap("TargetDBInstanceClass")
        private String targetDBInstanceClass;

        private ModifyOrder(Builder builder) {
            this.classGroup = builder.classGroup;
            this.cpu = builder.cpu;
            this.dbInstanceId = builder.dbInstanceId;
            this.effectiveTime = builder.effectiveTime;
            this.mark = builder.mark;
            this.memoryClass = builder.memoryClass;
            this.status = builder.status;
            this.storage = builder.storage;
            this.targetDBInstanceClass = builder.targetDBInstanceClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyOrder create() {
            return builder().build();
        }

        /**
         * @return classGroup
         */
        public String getClassGroup() {
            return this.classGroup;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return mark
         */
        public String getMark() {
            return this.mark;
        }

        /**
         * @return memoryClass
         */
        public String getMemoryClass() {
            return this.memoryClass;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storage
         */
        public String getStorage() {
            return this.storage;
        }

        /**
         * @return targetDBInstanceClass
         */
        public String getTargetDBInstanceClass() {
            return this.targetDBInstanceClass;
        }

        public static final class Builder {
            private String classGroup; 
            private String cpu; 
            private String dbInstanceId; 
            private String effectiveTime; 
            private String mark; 
            private String memoryClass; 
            private String status; 
            private String storage; 
            private String targetDBInstanceClass; 

            /**
             * The instance family of the instance.
             */
            public Builder classGroup(String classGroup) {
                this.classGroup = classGroup;
                return this;
            }

            /**
             * The number of CPU cores that are supported by the instance type. Unit: cores.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * The effective time. Valid values:
             * <p>
             * 
             * *   **Immediate**: This is the default value.
             * *   **MaintainTime**: The effective time is within the maintenance window. For more information, see [ModifyDBInstanceMaintainTime](~~610402~~).
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder mark(String mark) {
                this.mark = mark;
                return this;
            }

            /**
             * The memory capacity that is supported by the instance type. Unit: GB.
             */
            public Builder memoryClass(String memoryClass) {
                this.memoryClass = memoryClass;
                return this;
            }

            /**
             * The status of the task.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The storage capacity of the instance.
             */
            public Builder storage(String storage) {
                this.storage = storage;
                return this;
            }

            /**
             * The new instance type of the instance. Valid values:
             */
            public Builder targetDBInstanceClass(String targetDBInstanceClass) {
                this.targetDBInstanceClass = targetDBInstanceClass;
                return this;
            }

            public ModifyOrder build() {
                return new ModifyOrder(this);
            } 

        } 

    }
}
