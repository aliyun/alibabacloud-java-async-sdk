// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventDetailResponseBody</p>
 */
public class DescribeEventDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Event")
    private Event event;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEventDetailResponseBody(Builder builder) {
        this.event = builder.event;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return event
     */
    public Event getEvent() {
        return this.event;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Event event; 
        private String requestId; 

        /**
         * The details of the anomalous event.
         */
        public Builder event(Event event) {
            this.event = event;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEventDetailResponseBody build() {
            return new DescribeEventDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private java.util.List < String > x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private java.util.List < String > y;

        @com.aliyun.core.annotation.NameInMap("Z")
        private java.util.List < String > z;

        private Data(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
            this.z = builder.z;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public java.util.List < String > getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public java.util.List < String > getY() {
            return this.y;
        }

        /**
         * @return z
         */
        public java.util.List < String > getZ() {
            return this.z;
        }

        public static final class Builder {
            private java.util.List < String > x; 
            private java.util.List < String > y; 
            private java.util.List < String > z; 

            /**
             * The values of data on the x-axis.
             */
            public Builder x(java.util.List < String > x) {
                this.x = x;
                return this;
            }

            /**
             * The values of data on the y-axis.
             */
            public Builder y(java.util.List < String > y) {
                this.y = y;
                return this;
            }

            /**
             * Z.
             */
            public Builder z(java.util.List < String > z) {
                this.z = z;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Chart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatType")
        private Integer chatType;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("XLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("YLabel")
        private String yLabel;

        @com.aliyun.core.annotation.NameInMap("ZLabel")
        private String zLabel;

        private Chart(Builder builder) {
            this.chatType = builder.chatType;
            this.data = builder.data;
            this.label = builder.label;
            this.name = builder.name;
            this.type = builder.type;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
            this.zLabel = builder.zLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chart create() {
            return builder().build();
        }

        /**
         * @return chatType
         */
        public Integer getChatType() {
            return this.chatType;
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        /**
         * @return zLabel
         */
        public String getZLabel() {
            return this.zLabel;
        }

        public static final class Builder {
            private Integer chatType; 
            private Data data; 
            private String label; 
            private String name; 
            private String type; 
            private String xLabel; 
            private String yLabel; 
            private String zLabel; 

            /**
             * ChatType.
             */
            public Builder chatType(Integer chatType) {
                this.chatType = chatType;
                return this;
            }

            /**
             * The data in the baseline behavior profile of the anomalous event.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * The name of the baseline behavior chart of the anomalous event.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the chart. Valid values:
             * <p>
             * 
             * *   **1**: column chart
             * *   **2**: line chart
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The descriptive label of data on the x-axis.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * The descriptive label of data on the y-axis.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            /**
             * ZLabel.
             */
            public Builder zLabel(String zLabel) {
                this.zLabel = zLabel;
                return this;
            }

            public Chart build() {
                return new Chart(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Content(Builder builder) {
            this.label = builder.label;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String name; 
            private String value; 

            /**
             * The title of the content in the anomalous event.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The description of the content in the anomalous event.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class ResourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ResourceInfo(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInfo create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            /**
             * The source title.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The source description.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResourceInfo build() {
                return new ResourceInfo(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Chart")
        private java.util.List < Chart> chart;

        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List < Content> content;

        @com.aliyun.core.annotation.NameInMap("ResourceInfo")
        private java.util.List < ResourceInfo> resourceInfo;

        private Detail(Builder builder) {
            this.chart = builder.chart;
            this.content = builder.content;
            this.resourceInfo = builder.resourceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return chart
         */
        public java.util.List < Chart> getChart() {
            return this.chart;
        }

        /**
         * @return content
         */
        public java.util.List < Content> getContent() {
            return this.content;
        }

        /**
         * @return resourceInfo
         */
        public java.util.List < ResourceInfo> getResourceInfo() {
            return this.resourceInfo;
        }

        public static final class Builder {
            private java.util.List < Chart> chart; 
            private java.util.List < Content> content; 
            private java.util.List < ResourceInfo> resourceInfo; 

            /**
             * An array that consists of the baseline behavior chart of the anomalous event.
             */
            public Builder chart(java.util.List < Chart> chart) {
                this.chart = chart;
                return this;
            }

            /**
             * An array that consists of the content in the anomalous event.
             */
            public Builder content(java.util.List < Content> content) {
                this.content = content;
                return this;
            }

            /**
             * An array that consists of the source from which the information of the anomalous event is recorded.
             */
            public Builder resourceInfo(java.util.List < ResourceInfo> resourceInfo) {
                this.resourceInfo = resourceInfo;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class HandleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentValue")
        private String currentValue;

        @com.aliyun.core.annotation.NameInMap("DisableTime")
        private Long disableTime;

        @com.aliyun.core.annotation.NameInMap("EnableTime")
        private Long enableTime;

        @com.aliyun.core.annotation.NameInMap("HandlerName")
        private String handlerName;

        @com.aliyun.core.annotation.NameInMap("HandlerType")
        private String handlerType;

        @com.aliyun.core.annotation.NameInMap("HandlerValue")
        private Integer handlerValue;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private HandleInfoList(Builder builder) {
            this.currentValue = builder.currentValue;
            this.disableTime = builder.disableTime;
            this.enableTime = builder.enableTime;
            this.handlerName = builder.handlerName;
            this.handlerType = builder.handlerType;
            this.handlerValue = builder.handlerValue;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HandleInfoList create() {
            return builder().build();
        }

        /**
         * @return currentValue
         */
        public String getCurrentValue() {
            return this.currentValue;
        }

        /**
         * @return disableTime
         */
        public Long getDisableTime() {
            return this.disableTime;
        }

        /**
         * @return enableTime
         */
        public Long getEnableTime() {
            return this.enableTime;
        }

        /**
         * @return handlerName
         */
        public String getHandlerName() {
            return this.handlerName;
        }

        /**
         * @return handlerType
         */
        public String getHandlerType() {
            return this.handlerType;
        }

        /**
         * @return handlerValue
         */
        public Integer getHandlerValue() {
            return this.handlerValue;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String currentValue; 
            private Long disableTime; 
            private Long enableTime; 
            private String handlerName; 
            private String handlerType; 
            private Integer handlerValue; 
            private Long id; 
            private Integer status; 

            /**
             * The account that is used to handle the anomalous event.
             */
            public Builder currentValue(String currentValue) {
                this.currentValue = currentValue;
                return this;
            }

            /**
             * The point in time when the account was locked. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder disableTime(Long disableTime) {
                this.disableTime = disableTime;
                return this;
            }

            /**
             * The point in time when the account was unlocked. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder enableTime(Long enableTime) {
                this.enableTime = enableTime;
                return this;
            }

            /**
             * The handling method.
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * The type of the handling method.
             */
            public Builder handlerType(String handlerType) {
                this.handlerType = handlerType;
                return this;
            }

            /**
             * The duration for which the handling operation takes effect. If you leave this parameter empty, the handling operation is permanently valid. Unit: minutes.
             */
            public Builder handlerValue(Integer handlerValue) {
                this.handlerValue = handlerValue;
                return this;
            }

            /**
             * The ID of the handling record.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The status of the account that triggered the anomalous event. Valid values:
             * <p>
             * 
             * *   **0**: locked
             * *   **1**: unlocked
             * *   **-1**: failed to unlock the account
             * *   **-2**: failed to enable the account
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public HandleInfoList build() {
                return new HandleInfoList(this);
            } 

        } 

    }
    public static class Event extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertTime")
        private Long alertTime;

        @com.aliyun.core.annotation.NameInMap("Backed")
        private Boolean backed;

        @com.aliyun.core.annotation.NameInMap("DataInstance")
        private String dataInstance;

        @com.aliyun.core.annotation.NameInMap("DealDisplayName")
        private String dealDisplayName;

        @com.aliyun.core.annotation.NameInMap("DealLoginName")
        private String dealLoginName;

        @com.aliyun.core.annotation.NameInMap("DealReason")
        private String dealReason;

        @com.aliyun.core.annotation.NameInMap("DealTime")
        private Long dealTime;

        @com.aliyun.core.annotation.NameInMap("DealUserId")
        private Long dealUserId;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private Detail detail;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        @com.aliyun.core.annotation.NameInMap("HandleInfoList")
        private java.util.List < HandleInfoList> handleInfoList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LogDetail")
        private String logDetail;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("NewAlarm")
        private Boolean newAlarm;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusName")
        private String statusName;

        @com.aliyun.core.annotation.NameInMap("SubTypeCode")
        private String subTypeCode;

        @com.aliyun.core.annotation.NameInMap("SubTypeName")
        private String subTypeName;

        @com.aliyun.core.annotation.NameInMap("TypeCode")
        private String typeCode;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private Event(Builder builder) {
            this.alertTime = builder.alertTime;
            this.backed = builder.backed;
            this.dataInstance = builder.dataInstance;
            this.dealDisplayName = builder.dealDisplayName;
            this.dealLoginName = builder.dealLoginName;
            this.dealReason = builder.dealReason;
            this.dealTime = builder.dealTime;
            this.dealUserId = builder.dealUserId;
            this.detail = builder.detail;
            this.displayName = builder.displayName;
            this.eventTime = builder.eventTime;
            this.handleInfoList = builder.handleInfoList;
            this.id = builder.id;
            this.logDetail = builder.logDetail;
            this.loginName = builder.loginName;
            this.newAlarm = builder.newAlarm;
            this.productCode = builder.productCode;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.subTypeCode = builder.subTypeCode;
            this.subTypeName = builder.subTypeName;
            this.typeCode = builder.typeCode;
            this.typeName = builder.typeName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Event create() {
            return builder().build();
        }

        /**
         * @return alertTime
         */
        public Long getAlertTime() {
            return this.alertTime;
        }

        /**
         * @return backed
         */
        public Boolean getBacked() {
            return this.backed;
        }

        /**
         * @return dataInstance
         */
        public String getDataInstance() {
            return this.dataInstance;
        }

        /**
         * @return dealDisplayName
         */
        public String getDealDisplayName() {
            return this.dealDisplayName;
        }

        /**
         * @return dealLoginName
         */
        public String getDealLoginName() {
            return this.dealLoginName;
        }

        /**
         * @return dealReason
         */
        public String getDealReason() {
            return this.dealReason;
        }

        /**
         * @return dealTime
         */
        public Long getDealTime() {
            return this.dealTime;
        }

        /**
         * @return dealUserId
         */
        public Long getDealUserId() {
            return this.dealUserId;
        }

        /**
         * @return detail
         */
        public Detail getDetail() {
            return this.detail;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        /**
         * @return handleInfoList
         */
        public java.util.List < HandleInfoList> getHandleInfoList() {
            return this.handleInfoList;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return logDetail
         */
        public String getLogDetail() {
            return this.logDetail;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return newAlarm
         */
        public Boolean getNewAlarm() {
            return this.newAlarm;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return subTypeCode
         */
        public String getSubTypeCode() {
            return this.subTypeCode;
        }

        /**
         * @return subTypeName
         */
        public String getSubTypeName() {
            return this.subTypeName;
        }

        /**
         * @return typeCode
         */
        public String getTypeCode() {
            return this.typeCode;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long alertTime; 
            private Boolean backed; 
            private String dataInstance; 
            private String dealDisplayName; 
            private String dealLoginName; 
            private String dealReason; 
            private Long dealTime; 
            private Long dealUserId; 
            private Detail detail; 
            private String displayName; 
            private Long eventTime; 
            private java.util.List < HandleInfoList> handleInfoList; 
            private Long id; 
            private String logDetail; 
            private String loginName; 
            private Boolean newAlarm; 
            private String productCode; 
            private Integer status; 
            private String statusName; 
            private String subTypeCode; 
            private String subTypeName; 
            private String typeCode; 
            private String typeName; 
            private Long userId; 

            /**
             * The time when the alert for the anomalous event was generated. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * Indicates whether the handling result of the anomalous event is used to enhance the detection of anomalous events. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             * 
             * > If you enhance the detection of anomalous events, the detection accuracy and the rate of triggering alerts for anomalous events are improved.
             */
            public Builder backed(Boolean backed) {
                this.backed = backed;
                return this;
            }

            /**
             * The instance name of the service in which the anomalous event was detected.
             */
            public Builder dataInstance(String dataInstance) {
                this.dataInstance = dataInstance;
                return this;
            }

            /**
             * The display name of the account that is used to handle the anomalous event.
             */
            public Builder dealDisplayName(String dealDisplayName) {
                this.dealDisplayName = dealDisplayName;
                return this;
            }

            /**
             * The username of the account that is used to handle the anomalous event.
             */
            public Builder dealLoginName(String dealLoginName) {
                this.dealLoginName = dealLoginName;
                return this;
            }

            /**
             * The reason why the anomalous event is handled.
             */
            public Builder dealReason(String dealReason) {
                this.dealReason = dealReason;
                return this;
            }

            /**
             * The time when the anomalous event was handled. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder dealTime(Long dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * The ID of the account that is used to handle the anomalous event.
             */
            public Builder dealUserId(Long dealUserId) {
                this.dealUserId = dealUserId;
                return this;
            }

            /**
             * The content in the details of the anomalous event.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The display name of the account that triggered the anomalous event.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The time when the anomalous event occurred. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * An array that consists of the handling records of the anomalous event.
             */
            public Builder handleInfoList(java.util.List < HandleInfoList> handleInfoList) {
                this.handleInfoList = handleInfoList;
                return this;
            }

            /**
             * The unique ID of the anomalous event.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The details of the alert logs.
             */
            public Builder logDetail(String logDetail) {
                this.logDetail = logDetail;
                return this;
            }

            /**
             * The username of the account that triggered the anomalous event.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * NewAlarm.
             */
            public Builder newAlarm(Boolean newAlarm) {
                this.newAlarm = newAlarm;
                return this;
            }

            /**
             * The name of the service in which the anomalous event was detected. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The handling status for the anomalous event. Valid values:
             * <p>
             * 
             * *   **0**: unhandled
             * *   **1**: confirmed
             * *   **2**: marked as false positive
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the handling status for the anomalous event.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * The code of the anomalous event subtype.
             */
            public Builder subTypeCode(String subTypeCode) {
                this.subTypeCode = subTypeCode;
                return this;
            }

            /**
             * The name of the anomalous event subtype.
             */
            public Builder subTypeName(String subTypeName) {
                this.subTypeName = subTypeName;
                return this;
            }

            /**
             * The code of the anomalous event type.
             */
            public Builder typeCode(String typeCode) {
                this.typeCode = typeCode;
                return this;
            }

            /**
             * The name of the anomalous event type. Valid values:
             * <p>
             * 
             * *   **01**: anomalous permission usage
             * *   **02**: anomalous data flow
             * *   **03**: anomalous data operation
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            /**
             * The ID of the account that triggered the anomalous event.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Event build() {
                return new Event(this);
            } 

        } 

    }
}
