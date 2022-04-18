// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventDetailResponseBody</p>
 */
public class DescribeEventDetailResponseBody extends TeaModel {
    @NameInMap("Event")
    private Event event;

    @NameInMap("RequestId")
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
         * Event.
         */
        public Builder event(Event event) {
            this.event = event;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("X")
        private java.util.List < String > x;

        @NameInMap("Y")
        private java.util.List < String > y;

        private Data(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
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

        public static final class Builder {
            private java.util.List < String > x; 
            private java.util.List < String > y; 

            /**
             * X.
             */
            public Builder x(java.util.List < String > x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(java.util.List < String > y) {
                this.y = y;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Chart extends TeaModel {
        @NameInMap("Data")
        private Data data;

        @NameInMap("Label")
        private String label;

        @NameInMap("Type")
        private String type;

        @NameInMap("XLabel")
        private String xLabel;

        @NameInMap("YLabel")
        private String yLabel;

        private Chart(Builder builder) {
            this.data = builder.data;
            this.label = builder.label;
            this.type = builder.type;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chart create() {
            return builder().build();
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

        public static final class Builder {
            private Data data; 
            private String label; 
            private String type; 
            private String xLabel; 
            private String yLabel; 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * XLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * YLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public Chart build() {
                return new Chart(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Value")
        private String value;

        private Content(Builder builder) {
            this.label = builder.label;
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("Label")
        private String label;

        @NameInMap("Value")
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
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("Chart")
        private java.util.List < Chart> chart;

        @NameInMap("Content")
        private java.util.List < Content> content;

        @NameInMap("ResourceInfo")
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
             * Chart.
             */
            public Builder chart(java.util.List < Chart> chart) {
                this.chart = chart;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(java.util.List < Content> content) {
                this.content = content;
                return this;
            }

            /**
             * ResourceInfo.
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
        @NameInMap("CurrentValue")
        private String currentValue;

        @NameInMap("DisableTime")
        private Long disableTime;

        @NameInMap("EnableTime")
        private Long enableTime;

        @NameInMap("HandlerName")
        private String handlerName;

        @NameInMap("HandlerType")
        private String handlerType;

        @NameInMap("HandlerValue")
        private Integer handlerValue;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Status")
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
             * CurrentValue.
             */
            public Builder currentValue(String currentValue) {
                this.currentValue = currentValue;
                return this;
            }

            /**
             * DisableTime.
             */
            public Builder disableTime(Long disableTime) {
                this.disableTime = disableTime;
                return this;
            }

            /**
             * EnableTime.
             */
            public Builder enableTime(Long enableTime) {
                this.enableTime = enableTime;
                return this;
            }

            /**
             * HandlerName.
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * HandlerType.
             */
            public Builder handlerType(String handlerType) {
                this.handlerType = handlerType;
                return this;
            }

            /**
             * HandlerValue.
             */
            public Builder handlerValue(Integer handlerValue) {
                this.handlerValue = handlerValue;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Status.
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
        @NameInMap("AlertTime")
        private Long alertTime;

        @NameInMap("Backed")
        private Boolean backed;

        @NameInMap("DataInstance")
        private String dataInstance;

        @NameInMap("DealDisplayName")
        private String dealDisplayName;

        @NameInMap("DealLoginName")
        private String dealLoginName;

        @NameInMap("DealReason")
        private String dealReason;

        @NameInMap("DealTime")
        private Long dealTime;

        @NameInMap("DealUserId")
        private Long dealUserId;

        @NameInMap("Detail")
        private Detail detail;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("EventTime")
        private Long eventTime;

        @NameInMap("HandleInfoList")
        private java.util.List < HandleInfoList> handleInfoList;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LogDetail")
        private String logDetail;

        @NameInMap("LoginName")
        private String loginName;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("SubTypeCode")
        private String subTypeCode;

        @NameInMap("SubTypeName")
        private String subTypeName;

        @NameInMap("TypeCode")
        private String typeCode;

        @NameInMap("TypeName")
        private String typeName;

        @NameInMap("UserId")
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
            private String productCode; 
            private Integer status; 
            private String statusName; 
            private String subTypeCode; 
            private String subTypeName; 
            private String typeCode; 
            private String typeName; 
            private Long userId; 

            /**
             * AlertTime.
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * Backed.
             */
            public Builder backed(Boolean backed) {
                this.backed = backed;
                return this;
            }

            /**
             * DataInstance.
             */
            public Builder dataInstance(String dataInstance) {
                this.dataInstance = dataInstance;
                return this;
            }

            /**
             * DealDisplayName.
             */
            public Builder dealDisplayName(String dealDisplayName) {
                this.dealDisplayName = dealDisplayName;
                return this;
            }

            /**
             * DealLoginName.
             */
            public Builder dealLoginName(String dealLoginName) {
                this.dealLoginName = dealLoginName;
                return this;
            }

            /**
             * DealReason.
             */
            public Builder dealReason(String dealReason) {
                this.dealReason = dealReason;
                return this;
            }

            /**
             * DealTime.
             */
            public Builder dealTime(Long dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * DealUserId.
             */
            public Builder dealUserId(Long dealUserId) {
                this.dealUserId = dealUserId;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * HandleInfoList.
             */
            public Builder handleInfoList(java.util.List < HandleInfoList> handleInfoList) {
                this.handleInfoList = handleInfoList;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LogDetail.
             */
            public Builder logDetail(String logDetail) {
                this.logDetail = logDetail;
                return this;
            }

            /**
             * LoginName.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * SubTypeCode.
             */
            public Builder subTypeCode(String subTypeCode) {
                this.subTypeCode = subTypeCode;
                return this;
            }

            /**
             * SubTypeName.
             */
            public Builder subTypeName(String subTypeName) {
                this.subTypeName = subTypeName;
                return this;
            }

            /**
             * TypeCode.
             */
            public Builder typeCode(String typeCode) {
                this.typeCode = typeCode;
                return this;
            }

            /**
             * TypeName.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            /**
             * UserId.
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
