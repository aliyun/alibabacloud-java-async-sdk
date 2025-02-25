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
 * {@link TriggerTimeMachineTaskResponseBody} extends {@link TeaModel}
 *
 * <p>TriggerTimeMachineTaskResponseBody</p>
 */
public class TriggerTimeMachineTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMsg")
    private String errMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TriggerTimeMachineTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerTimeMachineTaskResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMsg; 
        private String requestId; 

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

        public TriggerTimeMachineTaskResponseBody build() {
            return new TriggerTimeMachineTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TriggerTimeMachineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>TriggerTimeMachineTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ObjId")
        private String objId;

        @com.aliyun.core.annotation.NameInMap("ObjName")
        private String objName;

        @com.aliyun.core.annotation.NameInMap("OperType")
        private String operType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hostName = builder.hostName;
            this.id = builder.id;
            this.objId = builder.objId;
            this.objName = builder.objName;
            this.operType = builder.operType;
            this.status = builder.status;
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
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return objId
         */
        public String getObjId() {
            return this.objId;
        }

        /**
         * @return objName
         */
        public String getObjName() {
            return this.objName;
        }

        /**
         * @return operType
         */
        public String getOperType() {
            return this.operType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private String hostName; 
            private String id; 
            private String objId; 
            private String objName; 
            private String operType; 
            private String status; 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ObjId.
             */
            public Builder objId(String objId) {
                this.objId = objId;
                return this;
            }

            /**
             * ObjName.
             */
            public Builder objName(String objName) {
                this.objName = objName;
                return this;
            }

            /**
             * OperType.
             */
            public Builder operType(String operType) {
                this.operType = operType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
