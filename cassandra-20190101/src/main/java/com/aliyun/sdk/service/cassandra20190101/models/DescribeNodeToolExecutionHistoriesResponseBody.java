// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeToolExecutionHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeToolExecutionHistoriesResponseBody</p>
 */
public class DescribeNodeToolExecutionHistoriesResponseBody extends TeaModel {
    @NameInMap("Histories")
    private Histories histories;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeNodeToolExecutionHistoriesResponseBody(Builder builder) {
        this.histories = builder.histories;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeToolExecutionHistoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return histories
     */
    public Histories getHistories() {
        return this.histories;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Histories histories; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Histories.
         */
        public Builder histories(Histories histories) {
            this.histories = histories;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNodeToolExecutionHistoriesResponseBody build() {
            return new DescribeNodeToolExecutionHistoriesResponseBody(this);
        } 

    } 

    public static class History extends TeaModel {
        @NameInMap("Arguments")
        private String arguments;

        @NameInMap("Command")
        private String command;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DataCenterId")
        private String dataCenterId;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("IsEnded")
        private Boolean isEnded;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Nodes")
        private String nodes;

        @NameInMap("RegionId")
        private String regionId;

        private History(Builder builder) {
            this.arguments = builder.arguments;
            this.command = builder.command;
            this.createTime = builder.createTime;
            this.dataCenterId = builder.dataCenterId;
            this.errorMessage = builder.errorMessage;
            this.isEnded = builder.isEnded;
            this.jobId = builder.jobId;
            this.modifyTime = builder.modifyTime;
            this.nodes = builder.nodes;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static History create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataCenterId
         */
        public String getDataCenterId() {
            return this.dataCenterId;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return isEnded
         */
        public Boolean getIsEnded() {
            return this.isEnded;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return nodes
         */
        public String getNodes() {
            return this.nodes;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String arguments; 
            private String command; 
            private Long createTime; 
            private String dataCenterId; 
            private String errorMessage; 
            private Boolean isEnded; 
            private String jobId; 
            private Long modifyTime; 
            private String nodes; 
            private String regionId; 

            /**
             * Arguments.
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataCenterId.
             */
            public Builder dataCenterId(String dataCenterId) {
                this.dataCenterId = dataCenterId;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * IsEnded.
             */
            public Builder isEnded(Boolean isEnded) {
                this.isEnded = isEnded;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(String nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public History build() {
                return new History(this);
            } 

        } 

    }
    public static class Histories extends TeaModel {
        @NameInMap("History")
        private java.util.List < History> history;

        private Histories(Builder builder) {
            this.history = builder.history;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Histories create() {
            return builder().build();
        }

        /**
         * @return history
         */
        public java.util.List < History> getHistory() {
            return this.history;
        }

        public static final class Builder {
            private java.util.List < History> history; 

            /**
             * History.
             */
            public Builder history(java.util.List < History> history) {
                this.history = history;
                return this;
            }

            public Histories build() {
                return new Histories(this);
            } 

        } 

    }
}
