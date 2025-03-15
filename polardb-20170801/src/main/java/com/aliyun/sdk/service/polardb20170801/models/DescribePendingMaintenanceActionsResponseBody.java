// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePendingMaintenanceActionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePendingMaintenanceActionsResponseBody</p>
 */
public class DescribePendingMaintenanceActionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TypeList")
    private java.util.List<TypeList> typeList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TypeList> getTypeList() {
        return this.typeList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TypeList> typeList; 

        private Builder() {
        } 

        private Builder(DescribePendingMaintenanceActionsResponseBody model) {
            this.requestId = model.requestId;
            this.typeList = model.typeList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>314127C2-B6C1-4F58-B1F6-E6B645******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of pending events.</p>
         */
        public Builder typeList(java.util.List<TypeList> typeList) {
            this.typeList = typeList;
            return this;
        }

        public DescribePendingMaintenanceActionsResponseBody build() {
            return new DescribePendingMaintenanceActionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePendingMaintenanceActionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePendingMaintenanceActionsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TypeList model) {
                this.count = model.count;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The number of pending events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The task type of pending events. Valid values:</p>
             * <ul>
             * <li><strong>DatabaseSoftwareUpgrading</strong>: database software upgrades</li>
             * <li><strong>DatabaseHardwareMaintenance</strong>: hardware maintenance and upgrades</li>
             * <li><strong>DatabaseStorageUpgrading</strong>: database storage upgrades</li>
             * <li><strong>DatabaseProxyUpgrading</strong>: minor version upgrades of the proxy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DatabaseSoftwareUpgrading</p>
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
