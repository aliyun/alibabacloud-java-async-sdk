// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreFullDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreFullDetailsResponseBody</p>
 */
public class DescribeRestoreFullDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RestoreFull")
    private RestoreFull restoreFull;

    private DescribeRestoreFullDetailsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.restoreFull = builder.restoreFull;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreFullDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreFull
     */
    public RestoreFull getRestoreFull() {
        return this.restoreFull;
    }

    public static final class Builder {
        private String requestId; 
        private RestoreFull restoreFull; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RestoreFull.
         */
        public Builder restoreFull(RestoreFull restoreFull) {
            this.restoreFull = restoreFull;
            return this;
        }

        public DescribeRestoreFullDetailsResponseBody build() {
            return new DescribeRestoreFullDetailsResponseBody(this);
        } 

    } 

    public static class RestoreFullDetail extends TeaModel {
        @NameInMap("DataSize")
        private String dataSize;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Process")
        private String process;

        @NameInMap("Speed")
        private String speed;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("Table")
        private String table;

        private RestoreFullDetail(Builder builder) {
            this.dataSize = builder.dataSize;
            this.endTime = builder.endTime;
            this.message = builder.message;
            this.process = builder.process;
            this.speed = builder.speed;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreFullDetail create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public String getDataSize() {
            return this.dataSize;
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
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
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
            private String dataSize; 
            private String endTime; 
            private String message; 
            private String process; 
            private String speed; 
            private String startTime; 
            private String state; 
            private String table; 

            /**
             * DataSize.
             */
            public Builder dataSize(String dataSize) {
                this.dataSize = dataSize;
                return this;
            }

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
             * Process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
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

            public RestoreFullDetail build() {
                return new RestoreFullDetail(this);
            } 

        } 

    }
    public static class RestoreFullDetails extends TeaModel {
        @NameInMap("RestoreFullDetail")
        private java.util.List < RestoreFullDetail> restoreFullDetail;

        private RestoreFullDetails(Builder builder) {
            this.restoreFullDetail = builder.restoreFullDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreFullDetails create() {
            return builder().build();
        }

        /**
         * @return restoreFullDetail
         */
        public java.util.List < RestoreFullDetail> getRestoreFullDetail() {
            return this.restoreFullDetail;
        }

        public static final class Builder {
            private java.util.List < RestoreFullDetail> restoreFullDetail; 

            /**
             * RestoreFullDetail.
             */
            public Builder restoreFullDetail(java.util.List < RestoreFullDetail> restoreFullDetail) {
                this.restoreFullDetail = restoreFullDetail;
                return this;
            }

            public RestoreFullDetails build() {
                return new RestoreFullDetails(this);
            } 

        } 

    }
    public static class RestoreFull extends TeaModel {
        @NameInMap("DataSize")
        private String dataSize;

        @NameInMap("Fail")
        private Integer fail;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("RestoreFullDetails")
        private RestoreFullDetails restoreFullDetails;

        @NameInMap("Speed")
        private String speed;

        @NameInMap("Succeed")
        private Integer succeed;

        @NameInMap("Total")
        private Long total;

        private RestoreFull(Builder builder) {
            this.dataSize = builder.dataSize;
            this.fail = builder.fail;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.restoreFullDetails = builder.restoreFullDetails;
            this.speed = builder.speed;
            this.succeed = builder.succeed;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreFull create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public String getDataSize() {
            return this.dataSize;
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
         * @return restoreFullDetails
         */
        public RestoreFullDetails getRestoreFullDetails() {
            return this.restoreFullDetails;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
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
            private String dataSize; 
            private Integer fail; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private RestoreFullDetails restoreFullDetails; 
            private String speed; 
            private Integer succeed; 
            private Long total; 

            /**
             * DataSize.
             */
            public Builder dataSize(String dataSize) {
                this.dataSize = dataSize;
                return this;
            }

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
             * RestoreFullDetails.
             */
            public Builder restoreFullDetails(RestoreFullDetails restoreFullDetails) {
                this.restoreFullDetails = restoreFullDetails;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
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

            public RestoreFull build() {
                return new RestoreFull(this);
            } 

        } 

    }
}
