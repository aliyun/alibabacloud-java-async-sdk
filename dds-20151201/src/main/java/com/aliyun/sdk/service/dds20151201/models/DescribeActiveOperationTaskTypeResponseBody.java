// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeActiveOperationTaskTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationTaskTypeResponseBody</p>
 */
public class DescribeActiveOperationTaskTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TypeList")
    private java.util.List<TypeList> typeList;

    private DescribeActiveOperationTaskTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.typeList = builder.typeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveOperationTaskTypeResponseBody create() {
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
    public java.util.List<TypeList> getTypeList() {
        return this.typeList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TypeList> typeList; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7EE83BF-7BA8-5087-BAC9-ED85ED54****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The O&amp;M tasks.</p>
         */
        public Builder typeList(java.util.List<TypeList> typeList) {
            this.typeList = typeList;
            return this;
        }

        public DescribeActiveOperationTaskTypeResponseBody build() {
            return new DescribeActiveOperationTaskTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeActiveOperationTaskTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeActiveOperationTaskTypeResponseBody</p>
     */
    public static class TypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TaskTypeInfoEn")
        private String taskTypeInfoEn;

        @com.aliyun.core.annotation.NameInMap("TaskTypeInfoZh")
        private String taskTypeInfoZh;

        private TypeList(Builder builder) {
            this.count = builder.count;
            this.taskType = builder.taskType;
            this.taskTypeInfoEn = builder.taskTypeInfoEn;
            this.taskTypeInfoZh = builder.taskTypeInfoZh;
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

        /**
         * @return taskTypeInfoEn
         */
        public String getTaskTypeInfoEn() {
            return this.taskTypeInfoEn;
        }

        /**
         * @return taskTypeInfoZh
         */
        public String getTaskTypeInfoZh() {
            return this.taskTypeInfoZh;
        }

        public static final class Builder {
            private Integer count; 
            private String taskType; 
            private String taskTypeInfoEn; 
            private String taskTypeInfoZh; 

            /**
             * <p>The number of pending tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The type of the task. Valid values:</p>
             * <ul>
             * <li><strong>rds_apsaradb_transfer</strong>: data migration</li>
             * <li><strong>rds_apsaradb_upgrade</strong>: minor version update</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rds_apsaradb_upgrade</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The task type in English.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_apsaradb_upgrade</p>
             */
            public Builder taskTypeInfoEn(String taskTypeInfoEn) {
                this.taskTypeInfoEn = taskTypeInfoEn;
                return this;
            }

            /**
             * <p>The task type in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_apsaradb_upgrade</p>
             */
            public Builder taskTypeInfoZh(String taskTypeInfoZh) {
                this.taskTypeInfoZh = taskTypeInfoZh;
                return this;
            }

            public TypeList build() {
                return new TypeList(this);
            } 

        } 

    }
}
