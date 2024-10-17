// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the anomalous event.</p>
         */
        public Builder event(Event event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>69FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEventDetailResponseBody build() {
            return new DescribeEventDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventDetailResponseBody</p>
     */
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
             * <p>The value of the data item on the X axis.</p>
             * 
             * <strong>example:</strong>
             * <p>[test1,test2,...]</p>
             */
            public Builder x(java.util.List < String > x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The value of the data item on the Y axis.</p>
             * 
             * <strong>example:</strong>
             * <p>[1,2,3,...]</p>
             */
            public Builder y(java.util.List < String > y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The value of the data item for the Z axis.</p>
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
    /**
     * 
     * {@link DescribeEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventDetailResponseBody</p>
     */
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
             * <p>The type of the chart. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: column chart</li>
             * <li><strong>2</strong>: line chart</li>
             * </ul>
             * <blockquote>
             * <p>This field will be returned only when NewAlarm is true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chatType(Integer chatType) {
                this.chatType = chatType;
                return this;
            }

            /**
             * <p>The data in the baseline behavior profile of the anomalous event.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The name of the baseline behavior chart of the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>Baseline behavior chart</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>Icon title.</p>
             * <blockquote>
             * <p>This field will be returned only when NewAlarm is true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>misskingm</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the chart. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: column chart</li>
             * <li><strong>2</strong>: line chart</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The descriptive label of data items on the X axis.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of days</p>
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * <p>The descriptive label of data items on the Y axis.</p>
             * 
             * <strong>example:</strong>
             * <p>Value</p>
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            /**
             * <p>The descriptive label of data items on the Z axis.</p>
             * <blockquote>
             * <p>This field will be returned only when NewAlarm is true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>chart description</p>
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
    /**
     * 
     * {@link DescribeEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventDetailResponseBody</p>
     */
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
             * <p>The title of the content in the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>Anomaly description</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>Exception event name.</p>
             * 
             * <strong>example:</strong>
             * <p>daliaoyuncom</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The description of the content in the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>The account was used to access OSS from an unusual terminal whose IP address is 1.2.3.4 from 00:06:45 on September 9, 2019 to 00:57:37 on September 9, 2019.</p>
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
    /**
     * 
     * {@link DescribeEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventDetailResponseBody</p>
     */
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
             * <p>The source title.</p>
             * 
             * <strong>example:</strong>
             * <p>Risk</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The source description.</p>
             * 
             * <strong>example:</strong>
             * <p>Based on the record of authentication by using an unusual terminal, an attacker may have obtained the access permission of the account, or an employee accessed data from a personal terminal.</p>
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
    /**
     * 
     * {@link DescribeEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventDetailResponseBody</p>
     */
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
             * <p>The baseline behavior chart of the anomalous event.</p>
             */
            public Builder chart(java.util.List < Chart> chart) {
                this.chart = chart;
                return this;
            }

            /**
             * <p>The content in the anomalous event.</p>
             */
            public Builder content(java.util.List < Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>An array that consists of the source from which the information of the anomalous event is recorded.</p>
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
    /**
     * 
     * {@link DescribeEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventDetailResponseBody</p>
     */
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
             * <p>The account that is used to handle the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>sddp-test2</p>
             */
            public Builder currentValue(String currentValue) {
                this.currentValue = currentValue;
                return this;
            }

            /**
             * <p>The time when the account is disabled. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1611139155000</p>
             */
            public Builder disableTime(Long disableTime) {
                this.disableTime = disableTime;
                return this;
            }

            /**
             * <p>The time when the disabled account is enabled. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1611139155000</p>
             */
            public Builder enableTime(Long enableTime) {
                this.enableTime = enableTime;
                return this;
            }

            /**
             * <p>The handling method.</p>
             * 
             * <strong>example:</strong>
             * <p>Remove from the whitelist</p>
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * <p>The type of the handling method.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_security_ip</p>
             */
            public Builder handlerType(String handlerType) {
                this.handlerType = handlerType;
                return this;
            }

            /**
             * <p>The duration for which the handling operation takes effect. If you leave this parameter empty, the handling operation is permanently valid. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder handlerValue(Integer handlerValue) {
                this.handlerValue = handlerValue;
                return this;
            }

            /**
             * <p>The ID of the handling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The status of the account that triggered the anomalous event. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * <li><strong>-1</strong>: failed to disable the account</li>
             * <li><strong>-2</strong>: failed to enable the account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventDetailResponseBody</p>
     */
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
             * <p>The time when the alert for the anomalous event was generated. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1545829129000</p>
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * <p>Indicates whether the handling result of the anomalous event is used to enhance the detection of anomalous events. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * <blockquote>
             * <p>If you enhance the detection of anomalous events, the detection accuracy and the rate of triggering alerts for anomalous events are improved.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder backed(Boolean backed) {
                this.backed = backed;
                return this;
            }

            /**
             * <p>The instance name of the service in which the anomalous event was detected.</p>
             * 
             * <strong>example:</strong>
             * <p>in-222***</p>
             */
            public Builder dataInstance(String dataInstance) {
                this.dataInstance = dataInstance;
                return this;
            }

            /**
             * <p>The display name of the account that is used to handle the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>yundunsr</p>
             */
            public Builder dealDisplayName(String dealDisplayName) {
                this.dealDisplayName = dealDisplayName;
                return this;
            }

            /**
             * <p>The username of the account that is used to handle the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>det1111</p>
             */
            public Builder dealLoginName(String dealLoginName) {
                this.dealLoginName = dealLoginName;
                return this;
            }

            /**
             * <p>The reason why the anomalous event is handled.</p>
             * 
             * <strong>example:</strong>
             * <p>Anomaly confirmed</p>
             */
            public Builder dealReason(String dealReason) {
                this.dealReason = dealReason;
                return this;
            }

            /**
             * <p>The time when the anomalous event was handled. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1230000</p>
             */
            public Builder dealTime(Long dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * <p>The ID of the account that is used to handle the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>229157443385014***</p>
             */
            public Builder dealUserId(Long dealUserId) {
                this.dealUserId = dealUserId;
                return this;
            }

            /**
             * <p>The content in the details of the anomalous event.</p>
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The display name of the account that triggered the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>yundunsr</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The time when the anomalous event occurred. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1545829129000</p>
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>An array that consists of the handling records of the anomalous event.</p>
             */
            public Builder handleInfoList(java.util.List < HandleInfoList> handleInfoList) {
                this.handleInfoList = handleInfoList;
                return this;
            }

            /**
             * <p>The unique ID of the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>52234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The details of the alert logs.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;client_ip&quot;: [&quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;], &quot;start_time&quot;: &quot;2020-05-10 00:00:01&quot;, &quot;instance&quot;: [&quot;omniscience-data&quot;, &quot;punish-beaver-data&quot;], &quot;end_time&quot;: &quot;2020-05-10 00:21:22&quot;, &quot;client_ua&quot;: [&quot;Java/1.8.0_152&quot;, &quot;Java/1.8.0_92&quot;, &quot;aliyun-sdk-java/2.0.0&quot;, &quot;aliyun-sdk-java/2.8.0(Linux/4.9.151-015.ali3000.alios7.x86_64/amd64;1.8.0_152)&quot;], &quot;user_name&quot;: 1512222261295262}</p>
             */
            public Builder logDetail(String logDetail) {
                this.logDetail = logDetail;
                return this;
            }

            /**
             * <p>The username of the account that triggered the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>det1111</p>
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * <p>Whether it is a new version of the alarm. Value:</p>
             * <ul>
             * <li><strong>true</strong>: Yes. </li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder newAlarm(Boolean newAlarm) {
                this.newAlarm = newAlarm;
                return this;
            }

            /**
             * <p>The name of the service in which the anomalous event was detected. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The handling status for the anomalous event. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unhandled</li>
             * <li><strong>1</strong>: confirmed</li>
             * <li><strong>2</strong>: marked as false positive</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the handling status for the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * <p>The code of the anomalous event subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>020008</p>
             */
            public Builder subTypeCode(String subTypeCode) {
                this.subTypeCode = subTypeCode;
                return this;
            }

            /**
             * <p>The name of the anomalous event subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>Anomalous volume of downloaded data</p>
             */
            public Builder subTypeName(String subTypeName) {
                this.subTypeName = subTypeName;
                return this;
            }

            /**
             * <p>The code of the anomalous event type.</p>
             * 
             * <strong>example:</strong>
             * <p>02</p>
             */
            public Builder typeCode(String typeCode) {
                this.typeCode = typeCode;
                return this;
            }

            /**
             * <p>The name of the anomalous event type. Valid values:</p>
             * <ul>
             * <li><strong>01</strong>: anomalous permission usage</li>
             * <li><strong>02</strong>: anomalous data flow</li>
             * <li><strong>03</strong>: anomalous data operation</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Anomalous data flow</p>
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            /**
             * <p>The ID of the account that triggered the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>229157443385014***</p>
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
