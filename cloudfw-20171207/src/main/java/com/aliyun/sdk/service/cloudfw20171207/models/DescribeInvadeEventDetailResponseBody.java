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
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vb2nmm070m****</p>
         */
        public Builder assetsInstanceId(String assetsInstanceId) {
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_test</p>
         */
        public Builder assetsInstanceName(String assetsInstanceName) {
            this.assetsInstanceName = assetsInstanceName;
            return this;
        }

        /**
         * <p>The description of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder eventDesc(String eventDesc) {
            this.eventDesc = eventDesc;
            return this;
        }

        /**
         * <p>The details of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder eventDetail(String eventDetail) {
            this.eventDetail = eventDetail;
            return this;
        }

        /**
         * <p>The key of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>C&amp;CActivity</p>
         */
        public Builder eventKey(String eventKey) {
            this.eventKey = eventKey;
            return this;
        }

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>event_test</p>
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The UUID of the threat detection event.</p>
         * 
         * <strong>example:</strong>
         * <p>aa6e786c-5034-457a-8e05-1c63fab****</p>
         */
        public Builder eventUuid(String eventUuid) {
            this.eventUuid = eventUuid;
            return this;
        }

        /**
         * <p>The time when the event first occurred. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735006706</p>
         */
        public Builder firstTime(Integer firstTime) {
            this.firstTime = firstTime;
            return this;
        }

        /**
         * <p>Indicates whether the event is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isIgnore(Boolean isIgnore) {
            this.isIgnore = isIgnore;
            return this;
        }

        /**
         * <p>The time when the event last occurred. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1740104108</p>
         */
        public Builder lastTime(Integer lastTime) {
            this.lastTime = lastTime;
            return this;
        }

        /**
         * <p>The list of remediation operations.</p>
         */
        public Builder operationList(java.util.List<OperationList> operationList) {
            this.operationList = operationList;
            return this;
        }

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.21.186.XXX</p>
         */
        public Builder privateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }

        /**
         * <p>The handling status of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder processStatus(Integer processStatus) {
            this.processStatus = processStatus;
            return this;
        }

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>106.15.185.XXX</p>
         */
        public Builder publicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }

        /**
         * <p>The reference information.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8022D695-4A35-50BC-8697-EA9C233A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The risk level of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder riskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The list of unhandled operations.</p>
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
             * <p>The parameters for the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The operation.</p>
             * 
             * <strong>example:</strong>
             * <p>RunMode</p>
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
             * <p>The parameters for the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The operation.</p>
             * 
             * <strong>example:</strong>
             * <p>RunMode</p>
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
