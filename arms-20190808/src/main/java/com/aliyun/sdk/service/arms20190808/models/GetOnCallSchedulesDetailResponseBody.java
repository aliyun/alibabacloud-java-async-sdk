// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetOnCallSchedulesDetailResponseBody</p>
 */
public class GetOnCallSchedulesDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOnCallSchedulesDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOnCallSchedulesDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The information about the scheduling policy.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21E85B16-75A6-429A-9F65-8AAC9A54****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOnCallSchedulesDetailResponseBody build() {
            return new GetOnCallSchedulesDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnCallSchedulesDetailResponseBody</p>
     */
    public static class SimpleContact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SimpleContact(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleContact create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * <p>The ID of the user on duty.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the user on duty.</p>
             * 
             * <strong>example:</strong>
             * <p>Employee 1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SimpleContact build() {
                return new SimpleContact(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnCallSchedulesDetailResponseBody</p>
     */
    public static class RenderedFinnalEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("SimpleContact")
        private SimpleContact simpleContact;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private RenderedFinnalEntries(Builder builder) {
            this.end = builder.end;
            this.simpleContact = builder.simpleContact;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderedFinnalEntries create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return simpleContact
         */
        public SimpleContact getSimpleContact() {
            return this.simpleContact;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private SimpleContact simpleContact; 
            private String start; 

            /**
             * <p>The date on which the user completed shift work.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-30</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The information about the user on duty.</p>
             */
            public Builder simpleContact(SimpleContact simpleContact) {
                this.simpleContact = simpleContact;
                return this;
            }

            /**
             * <p>The date from which the user started shift work.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-01</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public RenderedFinnalEntries build() {
                return new RenderedFinnalEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnCallSchedulesDetailResponseBody</p>
     */
    public static class RenderedLayerEntriesSimpleContact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private RenderedLayerEntriesSimpleContact(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderedLayerEntriesSimpleContact create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * <p>The ID of the scheduled user.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the scheduled user.</p>
             * 
             * <strong>example:</strong>
             * <p>Employee 1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RenderedLayerEntriesSimpleContact build() {
                return new RenderedLayerEntriesSimpleContact(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnCallSchedulesDetailResponseBody</p>
     */
    public static class RenderedLayerEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("SimpleContact")
        private RenderedLayerEntriesSimpleContact simpleContact;

        private RenderedLayerEntries(Builder builder) {
            this.start = builder.start;
            this.end = builder.end;
            this.simpleContact = builder.simpleContact;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderedLayerEntries create() {
            return builder().build();
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return simpleContact
         */
        public RenderedLayerEntriesSimpleContact getSimpleContact() {
            return this.simpleContact;
        }

        public static final class Builder {
            private String start; 
            private String end; 
            private RenderedLayerEntriesSimpleContact simpleContact; 

            /**
             * <p>The date from which the scheduled user was supposed to start shift work.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-01</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * <p>The date on which the scheduled user was supposed to complete shift work.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-30</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The information about the scheduled user.</p>
             */
            public Builder simpleContact(RenderedLayerEntriesSimpleContact simpleContact) {
                this.simpleContact = simpleContact;
                return this;
            }

            public RenderedLayerEntries build() {
                return new RenderedLayerEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnCallSchedulesDetailResponseBody</p>
     */
    public static class RenderedSubstitudeEntriesSimpleContact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private RenderedSubstitudeEntriesSimpleContact(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderedSubstitudeEntriesSimpleContact create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * <p>The ID of the substitute.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the substitute.</p>
             * 
             * <strong>example:</strong>
             * <p>Employee 2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RenderedSubstitudeEntriesSimpleContact build() {
                return new RenderedSubstitudeEntriesSimpleContact(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnCallSchedulesDetailResponseBody</p>
     */
    public static class RenderedSubstitudeEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("SimpleContact")
        private RenderedSubstitudeEntriesSimpleContact simpleContact;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private RenderedSubstitudeEntries(Builder builder) {
            this.end = builder.end;
            this.simpleContact = builder.simpleContact;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderedSubstitudeEntries create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return simpleContact
         */
        public RenderedSubstitudeEntriesSimpleContact getSimpleContact() {
            return this.simpleContact;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private RenderedSubstitudeEntriesSimpleContact simpleContact; 
            private String start; 

            /**
             * <p>The date on which the substitute was supposed to complete shift work.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-30</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The information about the substitute.</p>
             */
            public Builder simpleContact(RenderedSubstitudeEntriesSimpleContact simpleContact) {
                this.simpleContact = simpleContact;
                return this;
            }

            /**
             * <p>The date from which the substitute was supposed to start shift work.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-01</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public RenderedSubstitudeEntries build() {
                return new RenderedSubstitudeEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnCallSchedulesDetailResponseBody</p>
     */
    public static class Restrictions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTimeOfDay")
        private String endTimeOfDay;

        @com.aliyun.core.annotation.NameInMap("RestrictionType")
        private String restrictionType;

        @com.aliyun.core.annotation.NameInMap("StartTimeOfDay")
        private String startTimeOfDay;

        private Restrictions(Builder builder) {
            this.endTimeOfDay = builder.endTimeOfDay;
            this.restrictionType = builder.restrictionType;
            this.startTimeOfDay = builder.startTimeOfDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Restrictions create() {
            return builder().build();
        }

        /**
         * @return endTimeOfDay
         */
        public String getEndTimeOfDay() {
            return this.endTimeOfDay;
        }

        /**
         * @return restrictionType
         */
        public String getRestrictionType() {
            return this.restrictionType;
        }

        /**
         * @return startTimeOfDay
         */
        public String getStartTimeOfDay() {
            return this.startTimeOfDay;
        }

        public static final class Builder {
            private String endTimeOfDay; 
            private String restrictionType; 
            private String startTimeOfDay; 

            /**
             * <p>The end time of the shift per day.</p>
             * 
             * <strong>example:</strong>
             * <p>18:00</p>
             */
            public Builder endTimeOfDay(String endTimeOfDay) {
                this.endTimeOfDay = endTimeOfDay;
                return this;
            }

            /**
             * <p>The type of the limit. Valid values:</p>
             * <ul>
             * <li>daily_restriction</li>
             * <li>weekly_restriction</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>daily_restriction</p>
             */
            public Builder restrictionType(String restrictionType) {
                this.restrictionType = restrictionType;
                return this;
            }

            /**
             * <p>The start time of the shift per day.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00</p>
             */
            public Builder startTimeOfDay(String startTimeOfDay) {
                this.startTimeOfDay = startTimeOfDay;
                return this;
            }

            public Restrictions build() {
                return new Restrictions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnCallSchedulesDetailResponseBody</p>
     */
    public static class ScheduleLayers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactIds")
        private java.util.List<Long> contactIds;

        @com.aliyun.core.annotation.NameInMap("Restrictions")
        private java.util.List<Restrictions> restrictions;

        @com.aliyun.core.annotation.NameInMap("RotationType")
        private String rotationType;

        @com.aliyun.core.annotation.NameInMap("ShiftLength")
        private Long shiftLength;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private ScheduleLayers(Builder builder) {
            this.contactIds = builder.contactIds;
            this.restrictions = builder.restrictions;
            this.rotationType = builder.rotationType;
            this.shiftLength = builder.shiftLength;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleLayers create() {
            return builder().build();
        }

        /**
         * @return contactIds
         */
        public java.util.List<Long> getContactIds() {
            return this.contactIds;
        }

        /**
         * @return restrictions
         */
        public java.util.List<Restrictions> getRestrictions() {
            return this.restrictions;
        }

        /**
         * @return rotationType
         */
        public String getRotationType() {
            return this.rotationType;
        }

        /**
         * @return shiftLength
         */
        public Long getShiftLength() {
            return this.shiftLength;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List<Long> contactIds; 
            private java.util.List<Restrictions> restrictions; 
            private String rotationType; 
            private Long shiftLength; 
            private String startTime; 

            /**
             * <p>The ID list of users on duty.</p>
             */
            public Builder contactIds(java.util.List<Long> contactIds) {
                this.contactIds = contactIds;
                return this;
            }

            /**
             * <p>The limit on the time of the shift.</p>
             */
            public Builder restrictions(java.util.List<Restrictions> restrictions) {
                this.restrictions = restrictions;
                return this;
            }

            /**
             * <p>The type of the shift. Valid values:</p>
             * <ul>
             * <li>DAY</li>
             * <li>WEEK</li>
             * <li>CUSTOM</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DAY</p>
             */
            public Builder rotationType(String rotationType) {
                this.rotationType = rotationType;
                return this;
            }

            /**
             * <p>The shift cycle. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder shiftLength(Long shiftLength) {
                this.shiftLength = shiftLength;
                return this;
            }

            /**
             * <p>The date on which the shift change took effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-01</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public ScheduleLayers build() {
                return new ScheduleLayers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnCallSchedulesDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertRobotId")
        private Long alertRobotId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RenderedFinnalEntries")
        private java.util.List<RenderedFinnalEntries> renderedFinnalEntries;

        @com.aliyun.core.annotation.NameInMap("RenderedLayerEntries")
        private java.util.List<java.util.List<RenderedLayerEntries>> renderedLayerEntries;

        @com.aliyun.core.annotation.NameInMap("RenderedSubstitudeEntries")
        private java.util.List<RenderedSubstitudeEntries> renderedSubstitudeEntries;

        @com.aliyun.core.annotation.NameInMap("ScheduleLayers")
        private java.util.List<ScheduleLayers> scheduleLayers;

        private Data(Builder builder) {
            this.alertRobotId = builder.alertRobotId;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.renderedFinnalEntries = builder.renderedFinnalEntries;
            this.renderedLayerEntries = builder.renderedLayerEntries;
            this.renderedSubstitudeEntries = builder.renderedSubstitudeEntries;
            this.scheduleLayers = builder.scheduleLayers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertRobotId
         */
        public Long getAlertRobotId() {
            return this.alertRobotId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return renderedFinnalEntries
         */
        public java.util.List<RenderedFinnalEntries> getRenderedFinnalEntries() {
            return this.renderedFinnalEntries;
        }

        /**
         * @return renderedLayerEntries
         */
        public java.util.List<java.util.List<RenderedLayerEntries>> getRenderedLayerEntries() {
            return this.renderedLayerEntries;
        }

        /**
         * @return renderedSubstitudeEntries
         */
        public java.util.List<RenderedSubstitudeEntries> getRenderedSubstitudeEntries() {
            return this.renderedSubstitudeEntries;
        }

        /**
         * @return scheduleLayers
         */
        public java.util.List<ScheduleLayers> getScheduleLayers() {
            return this.scheduleLayers;
        }

        public static final class Builder {
            private Long alertRobotId; 
            private String description; 
            private Long id; 
            private String name; 
            private java.util.List<RenderedFinnalEntries> renderedFinnalEntries; 
            private java.util.List<java.util.List<RenderedLayerEntries>> renderedLayerEntries; 
            private java.util.List<RenderedSubstitudeEntries> renderedSubstitudeEntries; 
            private java.util.List<ScheduleLayers> scheduleLayers; 

            /**
             * <p>The URL of the DingTalk chatbot, which is used to receive notifications about shift changes.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=69d4e009547e11069c6513309414937b7bf0482fb9284125b5">https://oapi.dingtalk.com/robot/send?access_token=69d4e009547e11069c6513309414937b7bf0482fb9284125b5</a>******</p>
             */
            public Builder alertRobotId(Long alertRobotId) {
                this.alertRobotId = alertRobotId;
                return this;
            }

            /**
             * <p>The description of the scheduling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the scheduling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the scheduling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduling policy test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The information about the final user on duty.</p>
             */
            public Builder renderedFinnalEntries(java.util.List<RenderedFinnalEntries> renderedFinnalEntries) {
                this.renderedFinnalEntries = renderedFinnalEntries;
                return this;
            }

            /**
             * <p>The scheduled users on duty within a time range.</p>
             */
            public Builder renderedLayerEntries(java.util.List<java.util.List<RenderedLayerEntries>> renderedLayerEntries) {
                this.renderedLayerEntries = renderedLayerEntries;
                return this;
            }

            /**
             * <p>The information about the substitutes within a time range.</p>
             */
            public Builder renderedSubstitudeEntries(java.util.List<RenderedSubstitudeEntries> renderedSubstitudeEntries) {
                this.renderedSubstitudeEntries = renderedSubstitudeEntries;
                return this;
            }

            /**
             * <p>The information about the shift.</p>
             */
            public Builder scheduleLayers(java.util.List<ScheduleLayers> scheduleLayers) {
                this.scheduleLayers = scheduleLayers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
