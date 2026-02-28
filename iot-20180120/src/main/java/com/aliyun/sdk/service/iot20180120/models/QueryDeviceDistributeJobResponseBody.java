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
 * {@link QueryDeviceDistributeJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceDistributeJobResponseBody</p>
 */
public class QueryDeviceDistributeJobResponseBody extends TeaModel {
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

    private QueryDeviceDistributeJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceDistributeJobResponseBody create() {
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

        private Builder(QueryDeviceDistributeJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The task information returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
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
         * <p>Indicates whether the call was successful.</p>
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

        public QueryDeviceDistributeJobResponseBody build() {
            return new QueryDeviceDistributeJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceDistributeJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceDistributeJobResponseBody</p>
     */
    public static class TargetInstanceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
        private String targetInstanceId;

        private TargetInstanceConfigs(Builder builder) {
            this.targetInstanceId = builder.targetInstanceId;
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

        public static final class Builder {
            private String targetInstanceId; 

            private Builder() {
            } 

            private Builder(TargetInstanceConfigs model) {
                this.targetInstanceId = model.targetInstanceId;
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

            public TargetInstanceConfigs build() {
                return new TargetInstanceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceDistributeJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceDistributeJobResponseBody</p>
     */
    public static class DataTargetInstanceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("targetInstanceConfigs")
        private java.util.List<TargetInstanceConfigs> targetInstanceConfigs;

        private DataTargetInstanceConfigs(Builder builder) {
            this.targetInstanceConfigs = builder.targetInstanceConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataTargetInstanceConfigs create() {
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

            private Builder(DataTargetInstanceConfigs model) {
                this.targetInstanceConfigs = model.targetInstanceConfigs;
            } 

            /**
             * targetInstanceConfigs.
             */
            public Builder targetInstanceConfigs(java.util.List<TargetInstanceConfigs> targetInstanceConfigs) {
                this.targetInstanceConfigs = targetInstanceConfigs;
                return this;
            }

            public DataTargetInstanceConfigs build() {
                return new DataTargetInstanceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceDistributeJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceDistributeJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceUid")
        private String sourceUid;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Integer strategy;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceConfigs")
        private DataTargetInstanceConfigs targetInstanceConfigs;

        @com.aliyun.core.annotation.NameInMap("TargetUid")
        private String targetUid;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.jobId = builder.jobId;
            this.productKey = builder.productKey;
            this.sourceInstanceId = builder.sourceInstanceId;
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

        public static Data create() {
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
        public DataTargetInstanceConfigs getTargetInstanceConfigs() {
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
            private String sourceUid; 
            private Integer status; 
            private Integer strategy; 
            private DataTargetInstanceConfigs targetInstanceConfigs; 
            private String targetUid; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gmtCreate = model.gmtCreate;
                this.jobId = model.jobId;
                this.productKey = model.productKey;
                this.sourceInstanceId = model.sourceInstanceId;
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
             * <p>The ID of the distribution task.</p>
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
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>198***</p>
             */
            public Builder sourceUid(String sourceUid) {
                this.sourceUid = sourceUid;
                return this;
            }

            /**
             * <p>The status of the distribution task.</p>
             * <ul>
             * <li><strong>0</strong>: The task is being initialized.</li>
             * <li><strong>1</strong>: The task is being implemented.</li>
             * <li><strong>2</strong>: The task is completed. This status only indicates that the distribution task is completed. This status does not indicate that all products and devices are distributed. To obtain distribution results, call the <a href="https://help.aliyun.com/document_detail/199533.html">QueryDeviceDistributeDetail</a> operation.</li>
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
             * <li><strong>0</strong>: distributes devices to instances in a specified region.</li>
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
            public Builder targetInstanceConfigs(DataTargetInstanceConfigs targetInstanceConfigs) {
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
             * <p>The total number of devices in the distribution task.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
