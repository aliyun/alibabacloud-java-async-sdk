// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreSchemaDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreSchemaDetailsResponseBody</p>
 */
public class DescribeRestoreSchemaDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestoreSchema")
    private RestoreSchema restoreSchema;

    private DescribeRestoreSchemaDetailsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.restoreSchema = builder.restoreSchema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreSchemaDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreSchema
     */
    public RestoreSchema getRestoreSchema() {
        return this.restoreSchema;
    }

    public static final class Builder {
        private String requestId; 
        private RestoreSchema restoreSchema; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RestoreSchema.
         */
        public Builder restoreSchema(RestoreSchema restoreSchema) {
            this.restoreSchema = restoreSchema;
            return this;
        }

        public DescribeRestoreSchemaDetailsResponseBody build() {
            return new DescribeRestoreSchemaDetailsResponseBody(this);
        } 

    } 

    public static class RestoreSchemaDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        private RestoreSchemaDetail(Builder builder) {
            this.endTime = builder.endTime;
            this.message = builder.message;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreSchemaDetail create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String endTime; 
            private String message; 
            private String startTime; 
            private String state; 
            private String table; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public RestoreSchemaDetail build() {
                return new RestoreSchemaDetail(this);
            } 

        } 

    }
    public static class RestoreSchemaDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RestoreSchemaDetail")
        private java.util.List < RestoreSchemaDetail> restoreSchemaDetail;

        private RestoreSchemaDetails(Builder builder) {
            this.restoreSchemaDetail = builder.restoreSchemaDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreSchemaDetails create() {
            return builder().build();
        }

        /**
         * @return restoreSchemaDetail
         */
        public java.util.List < RestoreSchemaDetail> getRestoreSchemaDetail() {
            return this.restoreSchemaDetail;
        }

        public static final class Builder {
            private java.util.List < RestoreSchemaDetail> restoreSchemaDetail; 

            /**
             * RestoreSchemaDetail.
             */
            public Builder restoreSchemaDetail(java.util.List < RestoreSchemaDetail> restoreSchemaDetail) {
                this.restoreSchemaDetail = restoreSchemaDetail;
                return this;
            }

            public RestoreSchemaDetails build() {
                return new RestoreSchemaDetails(this);
            } 

        } 

    }
    public static class RestoreSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fail")
        private Integer fail;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RestoreSchemaDetails")
        private RestoreSchemaDetails restoreSchemaDetails;

        @com.aliyun.core.annotation.NameInMap("Succeed")
        private Integer succeed;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private RestoreSchema(Builder builder) {
            this.fail = builder.fail;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.restoreSchemaDetails = builder.restoreSchemaDetails;
            this.succeed = builder.succeed;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreSchema create() {
            return builder().build();
        }

        /**
         * @return fail
         */
        public Integer getFail() {
            return this.fail;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return restoreSchemaDetails
         */
        public RestoreSchemaDetails getRestoreSchemaDetails() {
            return this.restoreSchemaDetails;
        }

        /**
         * @return succeed
         */
        public Integer getSucceed() {
            return this.succeed;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer fail; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private RestoreSchemaDetails restoreSchemaDetails; 
            private Integer succeed; 
            private Long total; 

            /**
             * Fail.
             */
            public Builder fail(Integer fail) {
                this.fail = fail;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * RestoreSchemaDetails.
             */
            public Builder restoreSchemaDetails(RestoreSchemaDetails restoreSchemaDetails) {
                this.restoreSchemaDetails = restoreSchemaDetails;
                return this;
            }

            /**
             * Succeed.
             */
            public Builder succeed(Integer succeed) {
                this.succeed = succeed;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public RestoreSchema build() {
                return new RestoreSchema(this);
            } 

        } 

    }
}
