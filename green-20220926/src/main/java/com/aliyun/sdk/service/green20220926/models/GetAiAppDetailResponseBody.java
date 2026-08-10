// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetAiAppDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiAppDetailResponseBody</p>
 */
public class GetAiAppDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("Chart")
    private Chart chart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskEvents")
    private java.util.List<RiskEvents> riskEvents;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Integer score;

    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private GetAiAppDetailResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.chart = builder.chart;
        this.requestId = builder.requestId;
        this.riskEvents = builder.riskEvents;
        this.score = builder.score;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiAppDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return chart
     */
    public Chart getChart() {
        return this.chart;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskEvents
     */
    public java.util.List<RiskEvents> getRiskEvents() {
        return this.riskEvents;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return this.score;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private String appId; 
        private String appName; 
        private Chart chart; 
        private String requestId; 
        private java.util.List<RiskEvents> riskEvents; 
        private Integer score; 
        private String uid; 

        private Builder() {
        } 

        private Builder(GetAiAppDetailResponseBody model) {
            this.appId = model.appId;
            this.appName = model.appName;
            this.chart = model.chart;
            this.requestId = model.requestId;
            this.riskEvents = model.riskEvents;
            this.score = model.score;
            this.uid = model.uid;
        } 

        /**
         * <p>appId。</p>
         * 
         * <strong>example:</strong>
         * <p>id-xxx</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * Chart.
         */
        public Builder chart(Chart chart) {
            this.chart = chart;
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
         * RiskEvents.
         */
        public Builder riskEvents(java.util.List<RiskEvents> riskEvents) {
            this.riskEvents = riskEvents;
            return this;
        }

        /**
         * Score.
         */
        public Builder score(Integer score) {
            this.score = score;
            return this;
        }

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>17726*****370735</p>
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GetAiAppDetailResponseBody build() {
            return new GetAiAppDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAiAppDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppDetailResponseBody</p>
     */
    public static class Y extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Long> data;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Y(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Y create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Long> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Long> data; 
            private String name; 

            private Builder() {
            } 

            private Builder(Y model) {
                this.data = model.data;
                this.name = model.name;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Long> data) {
                this.data = data;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Y build() {
                return new Y(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiAppDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppDetailResponseBody</p>
     */
    public static class Chart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private java.util.List<String> x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private java.util.List<Y> y;

        private Chart(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chart create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public java.util.List<String> getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public java.util.List<Y> getY() {
            return this.y;
        }

        public static final class Builder {
            private java.util.List<String> x; 
            private java.util.List<Y> y; 

            private Builder() {
            } 

            private Builder(Chart model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(java.util.List<String> x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(java.util.List<Y> y) {
                this.y = y;
                return this;
            }

            public Chart build() {
                return new Chart(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiAppDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppDetailResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelDesc")
        private String labelDesc;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Labels(Builder builder) {
            this.label = builder.label;
            this.labelDesc = builder.labelDesc;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelDesc
         */
        public String getLabelDesc() {
            return this.labelDesc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String label; 
            private String labelDesc; 
            private String type; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.label = model.label;
                this.labelDesc = model.labelDesc;
                this.type = model.type;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * LabelDesc.
             */
            public Builder labelDesc(String labelDesc) {
                this.labelDesc = labelDesc;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiAppDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppDetailResponseBody</p>
     */
    public static class RiskEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("EventCount")
        private Long eventCount;

        @com.aliyun.core.annotation.NameInMap("EventIds")
        private java.util.List<String> eventIds;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventStatus")
        private String eventStatus;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        private RiskEvents(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventCount = builder.eventCount;
            this.eventIds = builder.eventIds;
            this.eventName = builder.eventName;
            this.eventStatus = builder.eventStatus;
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskEvents create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventCount
         */
        public Long getEventCount() {
            return this.eventCount;
        }

        /**
         * @return eventIds
         */
        public java.util.List<String> getEventIds() {
            return this.eventIds;
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
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private String eventCode; 
            private Long eventCount; 
            private java.util.List<String> eventIds; 
            private String eventName; 
            private String eventStatus; 
            private java.util.List<Labels> labels; 

            private Builder() {
            } 

            private Builder(RiskEvents model) {
                this.eventCode = model.eventCode;
                this.eventCount = model.eventCount;
                this.eventIds = model.eventIds;
                this.eventName = model.eventName;
                this.eventStatus = model.eventStatus;
                this.labels = model.labels;
            } 

            /**
             * EventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * EventCount.
             */
            public Builder eventCount(Long eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * EventIds.
             */
            public Builder eventIds(java.util.List<String> eventIds) {
                this.eventIds = eventIds;
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
             * Labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            public RiskEvents build() {
                return new RiskEvents(this);
            } 

        } 

    }
}
