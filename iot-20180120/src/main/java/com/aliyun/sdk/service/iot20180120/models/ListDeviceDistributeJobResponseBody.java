// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceDistributeJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceDistributeJobResponseBody</p>
 */
public class ListDeviceDistributeJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDeviceDistributeJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceDistributeJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDeviceDistributeJobResponseBody build() {
            return new ListDeviceDistributeJobResponseBody(this);
        } 

    } 

    public static class TargetInstanceConfigs extends TeaModel {
        @NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @NameInMap("TargetInstanceName")
        private String targetInstanceName;

        @NameInMap("TargetRegion")
        private String targetRegion;

        private TargetInstanceConfigs(Builder builder) {
            this.targetInstanceId = builder.targetInstanceId;
            this.targetInstanceName = builder.targetInstanceName;
            this.targetRegion = builder.targetRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetInstanceConfigs create() {
            return builder().build();
        }

        /**
         * @return targetInstanceId
         */
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        /**
         * @return targetInstanceName
         */
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        /**
         * @return targetRegion
         */
        public String getTargetRegion() {
            return this.targetRegion;
        }

        public static final class Builder {
            private String targetInstanceId; 
            private String targetInstanceName; 
            private String targetRegion; 

            /**
             * TargetInstanceId.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * TargetInstanceName.
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * TargetRegion.
             */
            public Builder targetRegion(String targetRegion) {
                this.targetRegion = targetRegion;
                return this;
            }

            public TargetInstanceConfigs build() {
                return new TargetInstanceConfigs(this);
            } 

        } 

    }
    public static class ItemsTargetInstanceConfigs extends TeaModel {
        @NameInMap("targetInstanceConfigs")
        private java.util.List < TargetInstanceConfigs> targetInstanceConfigs;

        private ItemsTargetInstanceConfigs(Builder builder) {
            this.targetInstanceConfigs = builder.targetInstanceConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemsTargetInstanceConfigs create() {
            return builder().build();
        }

        /**
         * @return targetInstanceConfigs
         */
        public java.util.List < TargetInstanceConfigs> getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

        public static final class Builder {
            private java.util.List < TargetInstanceConfigs> targetInstanceConfigs; 

            /**
             * targetInstanceConfigs.
             */
            public Builder targetInstanceConfigs(java.util.List < TargetInstanceConfigs> targetInstanceConfigs) {
                this.targetInstanceConfigs = targetInstanceConfigs;
                return this;
            }

            public ItemsTargetInstanceConfigs build() {
                return new ItemsTargetInstanceConfigs(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @NameInMap("SourceInstanceName")
        private String sourceInstanceName;

        @NameInMap("SourceRegion")
        private String sourceRegion;

        @NameInMap("SourceUid")
        private String sourceUid;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Strategy")
        private Integer strategy;

        @NameInMap("TargetInstanceConfigs")
        private ItemsTargetInstanceConfigs targetInstanceConfigs;

        @NameInMap("TargetUid")
        private String targetUid;

        @NameInMap("Total")
        private Integer total;

        private Items(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.jobId = builder.jobId;
            this.productKey = builder.productKey;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceInstanceName = builder.sourceInstanceName;
            this.sourceRegion = builder.sourceRegion;
            this.sourceUid = builder.sourceUid;
            this.status = builder.status;
            this.strategy = builder.strategy;
            this.targetInstanceConfigs = builder.targetInstanceConfigs;
            this.targetUid = builder.targetUid;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return sourceInstanceName
         */
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        /**
         * @return sourceRegion
         */
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        /**
         * @return sourceUid
         */
        public String getSourceUid() {
            return this.sourceUid;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return strategy
         */
        public Integer getStrategy() {
            return this.strategy;
        }

        /**
         * @return targetInstanceConfigs
         */
        public ItemsTargetInstanceConfigs getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

        /**
         * @return targetUid
         */
        public String getTargetUid() {
            return this.targetUid;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private String jobId; 
            private String productKey; 
            private String sourceInstanceId; 
            private String sourceInstanceName; 
            private String sourceRegion; 
            private String sourceUid; 
            private Integer status; 
            private Integer strategy; 
            private ItemsTargetInstanceConfigs targetInstanceConfigs; 
            private String targetUid; 
            private Integer total; 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * SourceInstanceId.
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * SourceInstanceName.
             */
            public Builder sourceInstanceName(String sourceInstanceName) {
                this.sourceInstanceName = sourceInstanceName;
                return this;
            }

            /**
             * SourceRegion.
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * SourceUid.
             */
            public Builder sourceUid(String sourceUid) {
                this.sourceUid = sourceUid;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Strategy.
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * TargetInstanceConfigs.
             */
            public Builder targetInstanceConfigs(ItemsTargetInstanceConfigs targetInstanceConfigs) {
                this.targetInstanceConfigs = targetInstanceConfigs;
                return this;
            }

            /**
             * TargetUid.
             */
            public Builder targetUid(String targetUid) {
                this.targetUid = targetUid;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class JobInfo extends TeaModel {
        @NameInMap("items")
        private java.util.List < Items> items;

        private JobInfo(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfo create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List < Items> items; 

            /**
             * items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            public JobInfo build() {
                return new JobInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("JobInfo")
        private JobInfo jobInfo;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.jobInfo = builder.jobInfo;
            this.nextToken = builder.nextToken;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobInfo
         */
        public JobInfo getJobInfo() {
            return this.jobInfo;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private JobInfo jobInfo; 
            private String nextToken; 
            private Integer total; 

            /**
             * JobInfo.
             */
            public Builder jobInfo(JobInfo jobInfo) {
                this.jobInfo = jobInfo;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
