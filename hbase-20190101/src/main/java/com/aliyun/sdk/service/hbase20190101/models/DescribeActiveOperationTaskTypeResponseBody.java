// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationTaskTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationTaskTypeResponseBody</p>
 */
public class DescribeActiveOperationTaskTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TypeList")
    private java.util.List < TypeList> typeList;

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
    public java.util.List < TypeList> getTypeList() {
        return this.typeList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TypeList> typeList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TypeList.
         */
        public Builder typeList(java.util.List < TypeList> typeList) {
            this.typeList = typeList;
            return this;
        }

        public DescribeActiveOperationTaskTypeResponseBody build() {
            return new DescribeActiveOperationTaskTypeResponseBody(this);
        } 

    } 

    public static class TypeList extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("TaskTypeInfoEn")
        private String taskTypeInfoEn;

        @NameInMap("TaskTypeInfoZh")
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * TaskTypeInfoEn.
             */
            public Builder taskTypeInfoEn(String taskTypeInfoEn) {
                this.taskTypeInfoEn = taskTypeInfoEn;
                return this;
            }

            /**
             * TaskTypeInfoZh.
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
