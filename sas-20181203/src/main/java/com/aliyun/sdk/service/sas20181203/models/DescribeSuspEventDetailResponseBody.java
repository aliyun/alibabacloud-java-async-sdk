// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSuspEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventDetailResponseBody</p>
 */
public class DescribeSuspEventDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanBeDealOnLine")
    private Boolean canBeDealOnLine;

    @com.aliyun.core.annotation.NameInMap("DataSource")
    private String dataSource;

    @com.aliyun.core.annotation.NameInMap("Details")
    private java.util.List<Details> details;

    @com.aliyun.core.annotation.NameInMap("EventDesc")
    private String eventDesc;

    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.NameInMap("EventStatus")
    private String eventStatus;

    @com.aliyun.core.annotation.NameInMap("EventTypeDesc")
    private String eventTypeDesc;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InternetIp")
    private String internetIp;

    @com.aliyun.core.annotation.NameInMap("IntranetIp")
    private String intranetIp;

    @com.aliyun.core.annotation.NameInMap("LastTime")
    private String lastTime;

    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.NameInMap("OperateErrorCode")
    private String operateErrorCode;

    @com.aliyun.core.annotation.NameInMap("OperateMsg")
    private String operateMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SaleVersion")
    private String saleVersion;

    @com.aliyun.core.annotation.NameInMap("Uuid")
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
    public java.util.List<Details> getDetails() {
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
        private java.util.List<Details> details; 
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
         * <p>Indicates whether the online processing of exceptions is supported, such as blocking an exception, adding an exception to the whitelist, and ignoring an exception. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The online processing of exceptions is supported.</li>
         * <li><strong>false</strong>: The online processing of exceptions is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }

        /**
         * <p>The data source of the exception.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis_suspicious_****</p>
         */
        public Builder dataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>An array that consists of the details of the exception.</p>
         */
        public Builder details(java.util.List<Details> details) {
            this.details = details;
            return this;
        }

        /**
         * <p>The description of the exception.</p>
         * 
         * <strong>example:</strong>
         * <p>The detection model found a suspicious Webshell file on your server, which may be a backdoor file implanted to maintain permissions after the attacker successfully invaded the website.</p>
         */
        public Builder eventDesc(String eventDesc) {
            this.eventDesc = eventDesc;
            return this;
        }

        /**
         * <p>The name of the exception.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The status of the exception. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: pending handling</li>
         * <li><strong>2</strong>: ignored</li>
         * <li><strong>4</strong>: confirmed</li>
         * <li><strong>8</strong>: marked as a false positive</li>
         * <li><strong>16</strong>: handling</li>
         * <li><strong>32</strong>: handled</li>
         * <li><strong>64</strong>: expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder eventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * <p>The type of the exception.</p>
         * 
         * <strong>example:</strong>
         * <p>Malicious Software-Variable Trojan</p>
         */
        public Builder eventTypeDesc(String eventTypeDesc) {
            this.eventTypeDesc = eventTypeDesc;
            return this;
        }

        /**
         * <p>The ID of the exception.</p>
         * 
         * <strong>example:</strong>
         * <p>11416624</p>
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the server on which the exception was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_cpm_****</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The public IP address of the server on which the exception was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>101.132.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>The private IP address of the server on which the exception was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>172.26.XX.XX</p>
         */
        public Builder intranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * <p>The time when the exception was last detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-30 11:43:46</p>
         */
        public Builder lastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }

        /**
         * <p>The risk level of the exception. Valid values:</p>
         * <ul>
         * <li><strong>serious</strong></li>
         * <li><strong>suspicious</strong></li>
         * <li><strong>remind</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The code that indicates the handling result of the exception.</p>
         * 
         * <strong>example:</strong>
         * <p>quara.Succes</p>
         */
        public Builder operateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }

        /**
         * <p>The message that indicates the handling result of the exception.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder operateMsg(String operateMsg) {
            this.operateMsg = operateMsg;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The edition of Security Center in which the exception can be detected. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Basic edition</li>
         * <li><strong>1</strong>: Advanced edition</li>
         * <li><strong>2</strong>: Enterprise edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder saleVersion(String saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }

        /**
         * <p>The UUID of the server on which the exception was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>bffb12c3-590a-4db2-b538-****</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public DescribeSuspEventDetailResponseBody build() {
            return new DescribeSuspEventDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSuspEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSuspEventDetailResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameDisplay")
        private String nameDisplay;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The display name of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Trojan Path</p>
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * <p>The format in which the details of the exception are displayed.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>text</strong></li>
             * <li><strong>html</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>html</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The attribute information about the exception. For example, if the exception is associated with an alert that is triggered by an unusual logon, the information can include the time when the logon is initiated and the location from which the logon is initiated. If the exception is associated with an alert that is triggered by a webshell file, the information can include the path of the trojan file and the type of the trojan.</p>
             * 
             * <strong>example:</strong>
             * <p>getopt</p>
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
