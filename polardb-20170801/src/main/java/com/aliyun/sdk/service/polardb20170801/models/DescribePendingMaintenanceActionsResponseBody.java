// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePendingMaintenanceActionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePendingMaintenanceActionsResponseBody</p>
 */
public class DescribePendingMaintenanceActionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TypeList")
    private java.util.List < TypeList> typeList;

    private DescribePendingMaintenanceActionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.typeList = builder.typeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePendingMaintenanceActionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return typeList
     */
    public java.util.List < TypeList> getTypeList() {
        return this.typeList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TypeList> typeList; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of pending events.
         */
        public Builder typeList(java.util.List < TypeList> typeList) {
            this.typeList = typeList;
            return this;
        }

        public DescribePendingMaintenanceActionsResponseBody build() {
            return new DescribePendingMaintenanceActionsResponseBody(this);
        } 

    } 

    public static class TypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private TypeList(Builder builder) {
            this.count = builder.count;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TypeList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Integer count; 
            private String taskType; 

            /**
             * The number of pending events.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The task type of pending events. Valid values:
             * <p>
             * 
             * *   **DatabaseSoftwareUpgrading**: database software upgrades
             * *   **DatabaseHardwareMaintenance**: hardware maintenance and upgrades
             * *   **DatabaseStorageUpgrading**: database storage upgrades
             * *   **DatabaseProxyUpgrading**: minor version upgrades of the proxy
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public TypeList build() {
                return new TypeList(this);
            } 

        } 

    }
}
