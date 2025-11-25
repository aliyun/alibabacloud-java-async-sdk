// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInvadeEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvadeEventDetailResponseBody</p>
 */
public class DescribeInvadeEventDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetsInstanceId")
    private String assetsInstanceId;

    @com.aliyun.core.annotation.NameInMap("AssetsInstanceName")
    private String assetsInstanceName;

    @com.aliyun.core.annotation.NameInMap("EventDesc")
    private String eventDesc;

    @com.aliyun.core.annotation.NameInMap("EventDetail")
    private String eventDetail;

    @com.aliyun.core.annotation.NameInMap("EventKey")
    private String eventKey;

    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.NameInMap("EventUuid")
    private String eventUuid;

    @com.aliyun.core.annotation.NameInMap("FirstTime")
    private Integer firstTime;

    @com.aliyun.core.annotation.NameInMap("IsIgnore")
    private Boolean isIgnore;

    @com.aliyun.core.annotation.NameInMap("LastTime")
    private Integer lastTime;

    @com.aliyun.core.annotation.NameInMap("OperationList")
    private java.util.List<OperationList> operationList;

    @com.aliyun.core.annotation.NameInMap("PrivateIP")
    private String privateIP;

    @com.aliyun.core.annotation.NameInMap("ProcessStatus")
    private Integer processStatus;

    @com.aliyun.core.annotation.NameInMap("PublicIP")
    private String publicIP;

    @com.aliyun.core.annotation.NameInMap("Reference")
    private String reference;

    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private Integer riskLevel;

    @com.aliyun.core.annotation.NameInMap("UnhandleOperationList")
    private java.util.List<UnhandleOperationList> unhandleOperationList;

    private DescribeInvadeEventDetailResponseBody(Builder builder) {
        this.assetsInstanceId = builder.assetsInstanceId;
        this.assetsInstanceName = builder.assetsInstanceName;
        this.eventDesc = builder.eventDesc;
        this.eventDetail = builder.eventDetail;
        this.eventKey = builder.eventKey;
        this.eventName = builder.eventName;
        this.eventUuid = builder.eventUuid;
        this.firstTime = builder.firstTime;
        this.isIgnore = builder.isIgnore;
        this.lastTime = builder.lastTime;
        this.operationList = builder.operationList;
        this.privateIP = builder.privateIP;
        this.processStatus = builder.processStatus;
        this.publicIP = builder.publicIP;
        this.reference = builder.reference;
        this.regionNo = builder.regionNo;
        this.requestId = builder.requestId;
        this.riskLevel = builder.riskLevel;
        this.unhandleOperationList = builder.unhandleOperationList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvadeEventDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetsInstanceId
     */
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    /**
     * @return assetsInstanceName
     */
    public String getAssetsInstanceName() {
        return this.assetsInstanceName;
    }

    /**
     * @return eventDesc
     */
    public String getEventDesc() {
        return this.eventDesc;
    }

    /**
     * @return eventDetail
     */
    public String getEventDetail() {
        return this.eventDetail;
    }

    /**
     * @return eventKey
     */
    public String getEventKey() {
        return this.eventKey;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventUuid
     */
    public String getEventUuid() {
        return this.eventUuid;
    }

    /**
     * @return firstTime
     */
    public Integer getFirstTime() {
        return this.firstTime;
    }

    /**
     * @return isIgnore
     */
    public Boolean getIsIgnore() {
        return this.isIgnore;
    }

    /**
     * @return lastTime
     */
    public Integer getLastTime() {
        return this.lastTime;
    }

    /**
     * @return operationList
     */
    public java.util.List<OperationList> getOperationList() {
        return this.operationList;
    }

    /**
     * @return privateIP
     */
    public String getPrivateIP() {
        return this.privateIP;
    }

    /**
     * @return processStatus
     */
    public Integer getProcessStatus() {
        return this.processStatus;
    }

    /**
     * @return publicIP
     */
    public String getPublicIP() {
        return this.publicIP;
    }

    /**
     * @return reference
     */
    public String getReference() {
        return this.reference;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return unhandleOperationList
     */
    public java.util.List<UnhandleOperationList> getUnhandleOperationList() {
        return this.unhandleOperationList;
    }

    public static final class Builder {
        private String assetsInstanceId; 
        private String assetsInstanceName; 
        private String eventDesc; 
        private String eventDetail; 
        private String eventKey; 
        private String eventName; 
        private String eventUuid; 
        private Integer firstTime; 
        private Boolean isIgnore; 
        private Integer lastTime; 
        private java.util.List<OperationList> operationList; 
        private String privateIP; 
        private Integer processStatus; 
        private String publicIP; 
        private String reference; 
        private String regionNo; 
        private String requestId; 
        private Integer riskLevel; 
        private java.util.List<UnhandleOperationList> unhandleOperationList; 

        private Builder() {
        } 

        private Builder(DescribeInvadeEventDetailResponseBody model) {
            this.assetsInstanceId = model.assetsInstanceId;
            this.assetsInstanceName = model.assetsInstanceName;
            this.eventDesc = model.eventDesc;
            this.eventDetail = model.eventDetail;
            this.eventKey = model.eventKey;
            this.eventName = model.eventName;
            this.eventUuid = model.eventUuid;
            this.firstTime = model.firstTime;
            this.isIgnore = model.isIgnore;
            this.lastTime = model.lastTime;
            this.operationList = model.operationList;
            this.privateIP = model.privateIP;
            this.processStatus = model.processStatus;
            this.publicIP = model.publicIP;
            this.reference = model.reference;
            this.regionNo = model.regionNo;
            this.requestId = model.requestId;
            this.riskLevel = model.riskLevel;
            this.unhandleOperationList = model.unhandleOperationList;
        } 

        /**
         * AssetsInstanceId.
         */
        public Builder assetsInstanceId(String assetsInstanceId) {
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }

        /**
         * AssetsInstanceName.
         */
        public Builder assetsInstanceName(String assetsInstanceName) {
            this.assetsInstanceName = assetsInstanceName;
            return this;
        }

        /**
         * EventDesc.
         */
        public Builder eventDesc(String eventDesc) {
            this.eventDesc = eventDesc;
            return this;
        }

        /**
         * EventDetail.
         */
        public Builder eventDetail(String eventDetail) {
            this.eventDetail = eventDetail;
            return this;
        }

        /**
         * EventKey.
         */
        public Builder eventKey(String eventKey) {
            this.eventKey = eventKey;
            return this;
        }

        /**
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * EventUuid.
         */
        public Builder eventUuid(String eventUuid) {
            this.eventUuid = eventUuid;
            return this;
        }

        /**
         * FirstTime.
         */
        public Builder firstTime(Integer firstTime) {
            this.firstTime = firstTime;
            return this;
        }

        /**
         * IsIgnore.
         */
        public Builder isIgnore(Boolean isIgnore) {
            this.isIgnore = isIgnore;
            return this;
        }

        /**
         * LastTime.
         */
        public Builder lastTime(Integer lastTime) {
            this.lastTime = lastTime;
            return this;
        }

        /**
         * OperationList.
         */
        public Builder operationList(java.util.List<OperationList> operationList) {
            this.operationList = operationList;
            return this;
        }

        /**
         * PrivateIP.
         */
        public Builder privateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }

        /**
         * ProcessStatus.
         */
        public Builder processStatus(Integer processStatus) {
            this.processStatus = processStatus;
            return this;
        }

        /**
         * PublicIP.
         */
        public Builder publicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }

        /**
         * Reference.
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.regionNo = regionNo;
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
         * RiskLevel.
         */
        public Builder riskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * UnhandleOperationList.
         */
        public Builder unhandleOperationList(java.util.List<UnhandleOperationList> unhandleOperationList) {
            this.unhandleOperationList = unhandleOperationList;
            return this;
        }

        public DescribeInvadeEventDetailResponseBody build() {
            return new DescribeInvadeEventDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvadeEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvadeEventDetailResponseBody</p>
     */
    public static class OperationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Operate")
        private String operate;

        private OperationList(Builder builder) {
            this.args = builder.args;
            this.operate = builder.operate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationList create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return operate
         */
        public String getOperate() {
            return this.operate;
        }

        public static final class Builder {
            private String args; 
            private String operate; 

            private Builder() {
            } 

            private Builder(OperationList model) {
                this.args = model.args;
                this.operate = model.operate;
            } 

            /**
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * Operate.
             */
            public Builder operate(String operate) {
                this.operate = operate;
                return this;
            }

            public OperationList build() {
                return new OperationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInvadeEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvadeEventDetailResponseBody</p>
     */
    public static class UnhandleOperationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Operate")
        private String operate;

        private UnhandleOperationList(Builder builder) {
            this.args = builder.args;
            this.operate = builder.operate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnhandleOperationList create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return operate
         */
        public String getOperate() {
            return this.operate;
        }

        public static final class Builder {
            private String args; 
            private String operate; 

            private Builder() {
            } 

            private Builder(UnhandleOperationList model) {
                this.args = model.args;
                this.operate = model.operate;
            } 

            /**
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * Operate.
             */
            public Builder operate(String operate) {
                this.operate = operate;
                return this;
            }

            public UnhandleOperationList build() {
                return new UnhandleOperationList(this);
            } 

        } 

    }
}
