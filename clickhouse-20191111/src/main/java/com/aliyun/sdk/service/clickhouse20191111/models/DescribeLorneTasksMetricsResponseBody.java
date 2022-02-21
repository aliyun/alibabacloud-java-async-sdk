// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLorneTasksMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLorneTasksMetricsResponseBody</p>
 */
public class DescribeLorneTasksMetricsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLorneTasksMetricsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLorneTasksMetricsResponseBody create() {
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

        public DescribeLorneTasksMetricsResponseBody build() {
            return new DescribeLorneTasksMetricsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Columns")
        private java.util.List < String > columns;

        @NameInMap("Name")
        private String name;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Values")
        private java.util.List < String > values;

        private Data(Builder builder) {
            this.columns = builder.columns;
            this.name = builder.name;
            this.taskId = builder.taskId;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List < String > getColumns() {
            return this.columns;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > columns; 
            private String name; 
            private String taskId; 
            private java.util.List < String > values; 

            /**
             * Columns.
             */
            public Builder columns(java.util.List < String > columns) {
                this.columns = columns;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
