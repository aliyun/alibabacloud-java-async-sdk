// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListDeviceDistributeJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceDistributeJobResponseBody</p>
 */
public class ListDeviceDistributeJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDeviceDistributeJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code that is returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The distribution tasks that are returned if the call is successful. For more information, see the <strong>JobInfo</strong> parameter.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDeviceDistributeJobResponseBody build() {
            return new ListDeviceDistributeJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeviceDistributeJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceDistributeJobResponseBody</p>
     */
    public static class TargetInstanceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceName")
        private String targetInstanceName;

        @com.aliyun.core.annotation.NameInMap("TargetRegion")
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

            private Builder() {
            } 

            private Builder(TargetInstanceConfigs model) {
                this.targetInstanceId = model.targetInstanceId;
                this.targetInstanceName = model.targetInstanceName;
                this.targetRegion = model.targetRegion;
            } 

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>iot-cn-6ja***</p>
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * <p>The name of the destination instance.</p>
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * <p>The region where the destination instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
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
    /**
     * 
     * {@link ListDeviceDistributeJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceDistributeJobResponseBody</p>
     */
    public static class ItemsTargetInstanceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("targetInstanceConfigs")
        private java.util.List<TargetInstanceConfigs> targetInstanceConfigs;

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
        public java.util.List<TargetInstanceConfigs> getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

        public static final class Builder {
            private java.util.List<TargetInstanceConfigs> targetInstanceConfigs; 

            private Builder() {
            } 

            private Builder(ItemsTargetInstanceConfigs model) {
                this.targetInstanceConfigs = model.targetInstanceConfigs;
            } 

            /**
             * targetInstanceConfigs.
             */
            public Builder targetInstanceConfigs(java.util.List<TargetInstanceConfigs> targetInstanceConfigs) {
                this.targetInstanceConfigs = targetInstanceConfigs;
                return this;
            }

            public ItemsTargetInstanceConfigs build() {
                return new ItemsTargetInstanceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDeviceDistributeJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceDistributeJobResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceName")
        private String sourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("SourceRegion")
        private String sourceRegion;

        @com.aliyun.core.annotation.NameInMap("SourceUid")
        private String sourceUid;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Integer strategy;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceConfigs")
        private ItemsTargetInstanceConfigs targetInstanceConfigs;

        @com.aliyun.core.annotation.NameInMap("TargetUid")
        private String targetUid;

        @com.aliyun.core.annotation.NameInMap("Total")
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.gmtCreate = model.gmtCreate;
                this.jobId = model.jobId;
                this.productKey = model.productKey;
                this.sourceInstanceId = model.sourceInstanceId;
                this.sourceInstanceName = model.sourceInstanceName;
                this.sourceRegion = model.sourceRegion;
                this.sourceUid = model.sourceUid;
                this.status = model.status;
                this.strategy = model.strategy;
                this.targetInstanceConfigs = model.targetInstanceConfigs;
                this.targetUid = model.targetUid;
                this.total = model.total;
            } 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1581595942000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>UbmsMHmkqv0PiAG****010001</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The ID of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>iot-cn-6ja***</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * <p>The name of the source instance.</p>
             */
            public Builder sourceInstanceName(String sourceInstanceName) {
                this.sourceInstanceName = sourceInstanceName;
                return this;
            }

            /**
             * <p>The region where the source instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * <p>The ID of the source Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>198***</p>
             */
            public Builder sourceUid(String sourceUid) {
                this.sourceUid = sourceUid;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * <ul>
             * <li><strong>0</strong>: The task is being initialized.</li>
             * <li><strong>1</strong>: The task is running.</li>
             * <li><strong>2</strong>: The task is completed. The status indicates that the distribution task is complete but does not indicate that all products and devices are distributed. To obtain distribution results, call the <a href="https://help.aliyun.com/document_detail/199533.html">QueryDeviceDistributeDetail</a> operation.</li>
             * <li><strong>3</strong>: The task is unexpectedly interrupted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The distribution policy.</p>
             * <ul>
             * <li><strong>0</strong>: distributes devices to specified instances in a specified region. This is the default value.</li>
             * <li><strong>1</strong>: configures instance IDs in multiple regions and distributes devices to the nearest regions based on the IP addresses of the devices.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * <p>The IDs of the destination instances.</p>
             * <ul>
             * <li>If the value of the <strong>Strategy</strong> parameter is <strong>1</strong>, multiple instance IDs exist.</li>
             * <li>If the value of the <strong>Strategy</strong> parameter is <strong>0</strong>, only one instance ID exists.</li>
             * </ul>
             */
            public Builder targetInstanceConfigs(ItemsTargetInstanceConfigs targetInstanceConfigs) {
                this.targetInstanceConfigs = targetInstanceConfigs;
                return this;
            }

            /**
             * <p>The ID of the destination Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>198***</p>
             */
            public Builder targetUid(String targetUid) {
                this.targetUid = targetUid;
                return this;
            }

            /**
             * <p>The total number of devices in the distribution task.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
    /**
     * 
     * {@link ListDeviceDistributeJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceDistributeJobResponseBody</p>
     */
    public static class JobInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

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
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(JobInfo model) {
                this.items = model.items;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public JobInfo build() {
                return new JobInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDeviceDistributeJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceDistributeJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobInfo")
        private JobInfo jobInfo;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Total")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobInfo = model.jobInfo;
                this.nextToken = model.nextToken;
                this.total = model.total;
            } 

            /**
             * <p>The information about the task.</p>
             */
            public Builder jobInfo(JobInfo jobInfo) {
                this.jobInfo = jobInfo;
                return this;
            }

            /**
             * <p>The token that is used to retrieve the subsequent pages of the query results. The value of this parameter can be used in the next query to obtain the subsequent pages of results. </p>
             * <p>If the return value is empty, no subsequent page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>TGlzdFJlc291***</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of device distribution tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
