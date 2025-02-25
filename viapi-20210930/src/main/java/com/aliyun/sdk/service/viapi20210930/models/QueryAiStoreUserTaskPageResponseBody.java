// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAiStoreUserTaskPageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiStoreUserTaskPageResponseBody</p>
 */
public class QueryAiStoreUserTaskPageResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryAiStoreUserTaskPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiStoreUserTaskPageResponseBody create() {
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

        public QueryAiStoreUserTaskPageResponseBody build() {
            return new QueryAiStoreUserTaskPageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("TaskList")
        private java.util.List < AiStoreUserTask > taskList;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.taskList = builder.taskList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskList
         */
        public java.util.List < AiStoreUserTask > getTaskList() {
            return this.taskList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < AiStoreUserTask > taskList; 
            private Integer totalCount; 

            /**
             * TaskList.
             */
            public Builder taskList(java.util.List < AiStoreUserTask > taskList) {
                this.taskList = taskList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
