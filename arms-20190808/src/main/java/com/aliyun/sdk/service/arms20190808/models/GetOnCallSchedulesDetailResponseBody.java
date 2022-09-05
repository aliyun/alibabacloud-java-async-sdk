// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOnCallSchedulesDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetOnCallSchedulesDetailResponseBody</p>
 */
public class GetOnCallSchedulesDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * 排班策略详情信息
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOnCallSchedulesDetailResponseBody build() {
            return new GetOnCallSchedulesDetailResponseBody(this);
        } 

    } 

    public static class SimpleContact extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
    public static class RenderedFinnalEntries extends TeaModel {
        @NameInMap("End")
        private String end;

        @NameInMap("SimpleContact")
        private SimpleContact simpleContact;

        @NameInMap("Start")
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
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * SimpleContact.
             */
            public Builder simpleContact(SimpleContact simpleContact) {
                this.simpleContact = simpleContact;
                return this;
            }

            /**
             * Start.
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
    public static class RenderedLayerEntriesSimpleContact extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
    public static class RenderedLayerEntries extends TeaModel {
        @NameInMap("Start")
        private String start;

        @NameInMap("End")
        private String end;

        @NameInMap("SimpleContact")
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
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * SimpleContact.
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
    public static class RenderedSubstitudeEntriesSimpleContact extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
    public static class RenderedSubstitudeEntries extends TeaModel {
        @NameInMap("End")
        private String end;

        @NameInMap("SimpleContact")
        private RenderedSubstitudeEntriesSimpleContact simpleContact;

        @NameInMap("Start")
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
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * SimpleContact.
             */
            public Builder simpleContact(RenderedSubstitudeEntriesSimpleContact simpleContact) {
                this.simpleContact = simpleContact;
                return this;
            }

            /**
             * Start.
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
    public static class Restrictions extends TeaModel {
        @NameInMap("EndTimeOfDay")
        private String endTimeOfDay;

        @NameInMap("RestrictionType")
        private String restrictionType;

        @NameInMap("StartTimeOfDay")
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
             * EndTimeOfDay.
             */
            public Builder endTimeOfDay(String endTimeOfDay) {
                this.endTimeOfDay = endTimeOfDay;
                return this;
            }

            /**
             * RestrictionType.
             */
            public Builder restrictionType(String restrictionType) {
                this.restrictionType = restrictionType;
                return this;
            }

            /**
             * StartTimeOfDay.
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
    public static class ScheduleLayers extends TeaModel {
        @NameInMap("ContactIds")
        private java.util.List < Long > contactIds;

        @NameInMap("Restrictions")
        private java.util.List < Restrictions> restrictions;

        @NameInMap("RotationType")
        private String rotationType;

        @NameInMap("ShiftLength")
        private Long shiftLength;

        @NameInMap("StartTime")
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
        public java.util.List < Long > getContactIds() {
            return this.contactIds;
        }

        /**
         * @return restrictions
         */
        public java.util.List < Restrictions> getRestrictions() {
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
            private java.util.List < Long > contactIds; 
            private java.util.List < Restrictions> restrictions; 
            private String rotationType; 
            private Long shiftLength; 
            private String startTime; 

            /**
             * ContactIds.
             */
            public Builder contactIds(java.util.List < Long > contactIds) {
                this.contactIds = contactIds;
                return this;
            }

            /**
             * Restrictions.
             */
            public Builder restrictions(java.util.List < Restrictions> restrictions) {
                this.restrictions = restrictions;
                return this;
            }

            /**
             * RotationType.
             */
            public Builder rotationType(String rotationType) {
                this.rotationType = rotationType;
                return this;
            }

            /**
             * ShiftLength.
             */
            public Builder shiftLength(Long shiftLength) {
                this.shiftLength = shiftLength;
                return this;
            }

            /**
             * StartTime.
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
    public static class Data extends TeaModel {
        @NameInMap("AlertRobotId")
        private Long alertRobotId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("RenderedFinnalEntries")
        private java.util.List < RenderedFinnalEntries> renderedFinnalEntries;

        @NameInMap("RenderedLayerEntries")
        private java.util.List < java.util.List < RenderedLayerEntries> > renderedLayerEntries;

        @NameInMap("RenderedSubstitudeEntries")
        private java.util.List < RenderedSubstitudeEntries> renderedSubstitudeEntries;

        @NameInMap("ScheduleLayers")
        private java.util.List < ScheduleLayers> scheduleLayers;

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
        public java.util.List < RenderedFinnalEntries> getRenderedFinnalEntries() {
            return this.renderedFinnalEntries;
        }

        /**
         * @return renderedLayerEntries
         */
        public java.util.List < java.util.List < RenderedLayerEntries> > getRenderedLayerEntries() {
            return this.renderedLayerEntries;
        }

        /**
         * @return renderedSubstitudeEntries
         */
        public java.util.List < RenderedSubstitudeEntries> getRenderedSubstitudeEntries() {
            return this.renderedSubstitudeEntries;
        }

        /**
         * @return scheduleLayers
         */
        public java.util.List < ScheduleLayers> getScheduleLayers() {
            return this.scheduleLayers;
        }

        public static final class Builder {
            private Long alertRobotId; 
            private String description; 
            private Long id; 
            private String name; 
            private java.util.List < RenderedFinnalEntries> renderedFinnalEntries; 
            private java.util.List < java.util.List < RenderedLayerEntries> > renderedLayerEntries; 
            private java.util.List < RenderedSubstitudeEntries> renderedSubstitudeEntries; 
            private java.util.List < ScheduleLayers> scheduleLayers; 

            /**
             * AlertRobotId.
             */
            public Builder alertRobotId(Long alertRobotId) {
                this.alertRobotId = alertRobotId;
                return this;
            }

            /**
             * 描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 排班策略ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 排名策略名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RenderedFinnalEntries.
             */
            public Builder renderedFinnalEntries(java.util.List < RenderedFinnalEntries> renderedFinnalEntries) {
                this.renderedFinnalEntries = renderedFinnalEntries;
                return this;
            }

            /**
             * RenderedLayerEntries.
             */
            public Builder renderedLayerEntries(java.util.List < java.util.List < RenderedLayerEntries> > renderedLayerEntries) {
                this.renderedLayerEntries = renderedLayerEntries;
                return this;
            }

            /**
             * RenderedSubstitudeEntries.
             */
            public Builder renderedSubstitudeEntries(java.util.List < RenderedSubstitudeEntries> renderedSubstitudeEntries) {
                this.renderedSubstitudeEntries = renderedSubstitudeEntries;
                return this;
            }

            /**
             * ScheduleLayers.
             */
            public Builder scheduleLayers(java.util.List < ScheduleLayers> scheduleLayers) {
                this.scheduleLayers = scheduleLayers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
