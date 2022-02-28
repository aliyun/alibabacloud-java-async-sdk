// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventDetailResponseBody</p>
 */
public class DescribeSuspEventDetailResponseBody extends TeaModel {
    @NameInMap("CanBeDealOnLine")
    private Boolean canBeDealOnLine;

    @NameInMap("DataSource")
    private String dataSource;

    @NameInMap("Details")
    private java.util.List < Details> details;

    @NameInMap("EventDesc")
    private String eventDesc;

    @NameInMap("EventName")
    private String eventName;

    @NameInMap("EventStatus")
    private String eventStatus;

    @NameInMap("EventTypeDesc")
    private String eventTypeDesc;

    @NameInMap("Id")
    private Integer id;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("InternetIp")
    private String internetIp;

    @NameInMap("IntranetIp")
    private String intranetIp;

    @NameInMap("LastTime")
    private String lastTime;

    @NameInMap("Level")
    private String level;

    @NameInMap("OperateErrorCode")
    private String operateErrorCode;

    @NameInMap("OperateMsg")
    private String operateMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SaleVersion")
    private String saleVersion;

    @NameInMap("Uuid")
    private String uuid;

    private DescribeSuspEventDetailResponseBody(Builder builder) {
        this.canBeDealOnLine = builder.canBeDealOnLine;
        this.dataSource = builder.dataSource;
        this.details = builder.details;
        this.eventDesc = builder.eventDesc;
        this.eventName = builder.eventName;
        this.eventStatus = builder.eventStatus;
        this.eventTypeDesc = builder.eventTypeDesc;
        this.id = builder.id;
        this.instanceName = builder.instanceName;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.lastTime = builder.lastTime;
        this.level = builder.level;
        this.operateErrorCode = builder.operateErrorCode;
        this.operateMsg = builder.operateMsg;
        this.requestId = builder.requestId;
        this.saleVersion = builder.saleVersion;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return canBeDealOnLine
     */
    public Boolean getCanBeDealOnLine() {
        return this.canBeDealOnLine;
    }

    /**
     * @return dataSource
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * @return details
     */
    public java.util.List < Details> getDetails() {
        return this.details;
    }

    /**
     * @return eventDesc
     */
    public String getEventDesc() {
        return this.eventDesc;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventStatus
     */
    public String getEventStatus() {
        return this.eventStatus;
    }

    /**
     * @return eventTypeDesc
     */
    public String getEventTypeDesc() {
        return this.eventTypeDesc;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return intranetIp
     */
    public String getIntranetIp() {
        return this.intranetIp;
    }

    /**
     * @return lastTime
     */
    public String getLastTime() {
        return this.lastTime;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return operateErrorCode
     */
    public String getOperateErrorCode() {
        return this.operateErrorCode;
    }

    /**
     * @return operateMsg
     */
    public String getOperateMsg() {
        return this.operateMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return saleVersion
     */
    public String getSaleVersion() {
        return this.saleVersion;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private Boolean canBeDealOnLine; 
        private String dataSource; 
        private java.util.List < Details> details; 
        private String eventDesc; 
        private String eventName; 
        private String eventStatus; 
        private String eventTypeDesc; 
        private Integer id; 
        private String instanceName; 
        private String internetIp; 
        private String intranetIp; 
        private String lastTime; 
        private String level; 
        private String operateErrorCode; 
        private String operateMsg; 
        private String requestId; 
        private String saleVersion; 
        private String uuid; 

        /**
         * CanBeDealOnLine.
         */
        public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }

        /**
         * DataSource.
         */
        public Builder dataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * Details.
         */
        public Builder details(java.util.List < Details> details) {
            this.details = details;
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
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * EventStatus.
         */
        public Builder eventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * EventTypeDesc.
         */
        public Builder eventTypeDesc(String eventTypeDesc) {
            this.eventTypeDesc = eventTypeDesc;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InternetIp.
         */
        public Builder internetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }

        /**
         * IntranetIp.
         */
        public Builder intranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * LastTime.
         */
        public Builder lastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * OperateErrorCode.
         */
        public Builder operateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }

        /**
         * OperateMsg.
         */
        public Builder operateMsg(String operateMsg) {
            this.operateMsg = operateMsg;
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
         * SaleVersion.
         */
        public Builder saleVersion(String saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public DescribeSuspEventDetailResponseBody build() {
            return new DescribeSuspEventDetailResponseBody(this);
        } 

    } 

    public static class Details extends TeaModel {
        @NameInMap("NameDisplay")
        private String nameDisplay;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Details(Builder builder) {
            this.nameDisplay = builder.nameDisplay;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return nameDisplay
         */
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String nameDisplay; 
            private String type; 
            private String value; 

            /**
             * NameDisplay.
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
}
