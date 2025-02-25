// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link SearchManualDagNodeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>SearchManualDagNodeInstanceResponseBody</p>
 */
public class SearchManualDagNodeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMsg")
    private String errMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SearchManualDagNodeInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchManualDagNodeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
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
        private Data data; 
        private String errCode; 
        private String errMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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

        public SearchManualDagNodeInstanceResponseBody build() {
            return new SearchManualDagNodeInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchManualDagNodeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>SearchManualDagNodeInstanceResponseBody</p>
     */
    public static class NodeInsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginRunningTime")
        private String beginRunningTime;

        @com.aliyun.core.annotation.NameInMap("BeginWaitResTime")
        private String beginWaitResTime;

        @com.aliyun.core.annotation.NameInMap("BeginWaitTimeTime")
        private String beginWaitTimeTime;

        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private String bizdate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DagId")
        private Long dagId;

        @com.aliyun.core.annotation.NameInMap("DagType")
        private Integer dagType;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ParaValue")
        private String paraValue;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private NodeInsInfo(Builder builder) {
            this.beginRunningTime = builder.beginRunningTime;
            this.beginWaitResTime = builder.beginWaitResTime;
            this.beginWaitTimeTime = builder.beginWaitTimeTime;
            this.bizdate = builder.bizdate;
            this.createTime = builder.createTime;
            this.dagId = builder.dagId;
            this.dagType = builder.dagType;
            this.finishTime = builder.finishTime;
            this.instanceId = builder.instanceId;
            this.modifyTime = builder.modifyTime;
            this.nodeName = builder.nodeName;
            this.paraValue = builder.paraValue;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInsInfo create() {
            return builder().build();
        }

        /**
         * @return beginRunningTime
         */
        public String getBeginRunningTime() {
            return this.beginRunningTime;
        }

        /**
         * @return beginWaitResTime
         */
        public String getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        /**
         * @return beginWaitTimeTime
         */
        public String getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        /**
         * @return bizdate
         */
        public String getBizdate() {
            return this.bizdate;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dagId
         */
        public Long getDagId() {
            return this.dagId;
        }

        /**
         * @return dagType
         */
        public Integer getDagType() {
            return this.dagType;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return paraValue
         */
        public String getParaValue() {
            return this.paraValue;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String beginRunningTime; 
            private String beginWaitResTime; 
            private String beginWaitTimeTime; 
            private String bizdate; 
            private String createTime; 
            private Long dagId; 
            private Integer dagType; 
            private String finishTime; 
            private Long instanceId; 
            private String modifyTime; 
            private String nodeName; 
            private String paraValue; 
            private Integer status; 

            /**
             * BeginRunningTime.
             */
            public Builder beginRunningTime(String beginRunningTime) {
                this.beginRunningTime = beginRunningTime;
                return this;
            }

            /**
             * BeginWaitResTime.
             */
            public Builder beginWaitResTime(String beginWaitResTime) {
                this.beginWaitResTime = beginWaitResTime;
                return this;
            }

            /**
             * BeginWaitTimeTime.
             */
            public Builder beginWaitTimeTime(String beginWaitTimeTime) {
                this.beginWaitTimeTime = beginWaitTimeTime;
                return this;
            }

            /**
             * Bizdate.
             */
            public Builder bizdate(String bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DagId.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * DagType.
             */
            public Builder dagType(Integer dagType) {
                this.dagType = dagType;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * ParaValue.
             */
            public Builder paraValue(String paraValue) {
                this.paraValue = paraValue;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public NodeInsInfo build() {
                return new NodeInsInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchManualDagNodeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>SearchManualDagNodeInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeInsInfo")
        private java.util.List<NodeInsInfo> nodeInsInfo;

        private Data(Builder builder) {
            this.nodeInsInfo = builder.nodeInsInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nodeInsInfo
         */
        public java.util.List<NodeInsInfo> getNodeInsInfo() {
            return this.nodeInsInfo;
        }

        public static final class Builder {
            private java.util.List<NodeInsInfo> nodeInsInfo; 

            /**
             * NodeInsInfo.
             */
            public Builder nodeInsInfo(java.util.List<NodeInsInfo> nodeInsInfo) {
                this.nodeInsInfo = nodeInsInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
