// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    @NameInMap("SasId")
    private String sasId;

    @NameInMap("Type")
    private String type;

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
        this.sasId = builder.sasId;
        this.type = builder.type;
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
     * @return sasId
     */
    public String getSasId() {
        return this.sasId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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
        private String sasId; 
        private String type; 
        private String uuid; 

        /**
         * <p>CanBeDealOnLine.</p>
         */
        public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }

        /**
         * <p>DataSource.</p>
         */
        public Builder dataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>Details.</p>
         */
        public Builder details(java.util.List < Details> details) {
            this.details = details;
            return this;
        }

        /**
         * <p>EventDesc.</p>
         */
        public Builder eventDesc(String eventDesc) {
            this.eventDesc = eventDesc;
            return this;
        }

        /**
         * <p>EventName.</p>
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>EventStatus.</p>
         */
        public Builder eventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * <p>EventTypeDesc.</p>
         */
        public Builder eventTypeDesc(String eventTypeDesc) {
            this.eventTypeDesc = eventTypeDesc;
            return this;
        }

        /**
         * <p>Id.</p>
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * <p>InstanceName.</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>InternetIp.</p>
         */
        public Builder internetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>IntranetIp.</p>
         */
        public Builder intranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * <p>LastTime.</p>
         */
        public Builder lastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }

        /**
         * <p>Level.</p>
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * <p>OperateErrorCode.</p>
         */
        public Builder operateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }

        /**
         * <p>OperateMsg.</p>
         */
        public Builder operateMsg(String operateMsg) {
            this.operateMsg = operateMsg;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SaleVersion.</p>
         */
        public Builder saleVersion(String saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }

        /**
         * <p>SasId.</p>
         */
        public Builder sasId(String sasId) {
            this.sasId = sasId;
            return this;
        }

        /**
         * <p>Type.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>Uuid.</p>
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
        @NameInMap("InfoType")
        private String infoType;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameDisplay")
        private String nameDisplay;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;


        private Details(Builder builder) {
            this.infoType = builder.infoType;
            this.name = builder.name;
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
         * @return infoType
         */
        public String getInfoType() {
            return this.infoType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String infoType; 
            private String name; 
            private String nameDisplay; 
            private String type; 
            private String value; 

            /**
             * <p>InfoType.</p>
             */
            public Builder infoType(String infoType) {
                this.infoType = infoType;
                return this;
            }

            /**
             * <p>Name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>NameDisplay.</p>
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * <p>Type.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Value.</p>
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
