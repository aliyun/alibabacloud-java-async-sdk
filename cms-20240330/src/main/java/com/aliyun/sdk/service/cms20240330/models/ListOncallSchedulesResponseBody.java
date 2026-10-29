// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListOncallSchedulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOncallSchedulesResponseBody</p>
 */
public class ListOncallSchedulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("oncallSchedules")
    private java.util.List<OncallSchedules> oncallSchedules;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListOncallSchedulesResponseBody(Builder builder) {
        this.oncallSchedules = builder.oncallSchedules;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOncallSchedulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return oncallSchedules
     */
    public java.util.List<OncallSchedules> getOncallSchedules() {
        return this.oncallSchedules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<OncallSchedules> oncallSchedules; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListOncallSchedulesResponseBody model) {
            this.oncallSchedules = model.oncallSchedules;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * oncallSchedules.
         */
        public Builder oncallSchedules(java.util.List<OncallSchedules> oncallSchedules) {
            this.oncallSchedules = oncallSchedules;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListOncallSchedulesResponseBody build() {
            return new ListOncallSchedulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOncallSchedulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOncallSchedulesResponseBody</p>
     */
    public static class Rotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeDays")
        private java.util.List<Integer> activeDays;

        @com.aliyun.core.annotation.NameInMap("contacts")
        private java.util.List<String> contacts;

        @com.aliyun.core.annotation.NameInMap("rotationEndTime")
        private String rotationEndTime;

        @com.aliyun.core.annotation.NameInMap("rotationName")
        private String rotationName;

        @com.aliyun.core.annotation.NameInMap("rotationStartTime")
        private String rotationStartTime;

        @com.aliyun.core.annotation.NameInMap("shiftLength")
        private Integer shiftLength;

        @com.aliyun.core.annotation.NameInMap("shiftRecurrenceFrequency")
        private String shiftRecurrenceFrequency;

        @com.aliyun.core.annotation.NameInMap("startDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("timeZone")
        private String timeZone;

        private Rotations(Builder builder) {
            this.activeDays = builder.activeDays;
            this.contacts = builder.contacts;
            this.rotationEndTime = builder.rotationEndTime;
            this.rotationName = builder.rotationName;
            this.rotationStartTime = builder.rotationStartTime;
            this.shiftLength = builder.shiftLength;
            this.shiftRecurrenceFrequency = builder.shiftRecurrenceFrequency;
            this.startDate = builder.startDate;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rotations create() {
            return builder().build();
        }

        /**
         * @return activeDays
         */
        public java.util.List<Integer> getActiveDays() {
            return this.activeDays;
        }

        /**
         * @return contacts
         */
        public java.util.List<String> getContacts() {
            return this.contacts;
        }

        /**
         * @return rotationEndTime
         */
        public String getRotationEndTime() {
            return this.rotationEndTime;
        }

        /**
         * @return rotationName
         */
        public String getRotationName() {
            return this.rotationName;
        }

        /**
         * @return rotationStartTime
         */
        public String getRotationStartTime() {
            return this.rotationStartTime;
        }

        /**
         * @return shiftLength
         */
        public Integer getShiftLength() {
            return this.shiftLength;
        }

        /**
         * @return shiftRecurrenceFrequency
         */
        public String getShiftRecurrenceFrequency() {
            return this.shiftRecurrenceFrequency;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private java.util.List<Integer> activeDays; 
            private java.util.List<String> contacts; 
            private String rotationEndTime; 
            private String rotationName; 
            private String rotationStartTime; 
            private Integer shiftLength; 
            private String shiftRecurrenceFrequency; 
            private String startDate; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(Rotations model) {
                this.activeDays = model.activeDays;
                this.contacts = model.contacts;
                this.rotationEndTime = model.rotationEndTime;
                this.rotationName = model.rotationName;
                this.rotationStartTime = model.rotationStartTime;
                this.shiftLength = model.shiftLength;
                this.shiftRecurrenceFrequency = model.shiftRecurrenceFrequency;
                this.startDate = model.startDate;
                this.timeZone = model.timeZone;
            } 

            /**
             * activeDays.
             */
            public Builder activeDays(java.util.List<Integer> activeDays) {
                this.activeDays = activeDays;
                return this;
            }

            /**
             * contacts.
             */
            public Builder contacts(java.util.List<String> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * rotationEndTime.
             */
            public Builder rotationEndTime(String rotationEndTime) {
                this.rotationEndTime = rotationEndTime;
                return this;
            }

            /**
             * rotationName.
             */
            public Builder rotationName(String rotationName) {
                this.rotationName = rotationName;
                return this;
            }

            /**
             * rotationStartTime.
             */
            public Builder rotationStartTime(String rotationStartTime) {
                this.rotationStartTime = rotationStartTime;
                return this;
            }

            /**
             * shiftLength.
             */
            public Builder shiftLength(Integer shiftLength) {
                this.shiftLength = shiftLength;
                return this;
            }

            /**
             * shiftRecurrenceFrequency.
             */
            public Builder shiftRecurrenceFrequency(String shiftRecurrenceFrequency) {
                this.shiftRecurrenceFrequency = shiftRecurrenceFrequency;
                return this;
            }

            /**
             * startDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * timeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public Rotations build() {
                return new Rotations(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOncallSchedulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOncallSchedulesResponseBody</p>
     */
    public static class Substitudes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("replacedContactId")
        private String replacedContactId;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private Substitudes(Builder builder) {
            this.contactId = builder.contactId;
            this.endTime = builder.endTime;
            this.replacedContactId = builder.replacedContactId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Substitudes create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return replacedContactId
         */
        public String getReplacedContactId() {
            return this.replacedContactId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String contactId; 
            private String endTime; 
            private String replacedContactId; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Substitudes model) {
                this.contactId = model.contactId;
                this.endTime = model.endTime;
                this.replacedContactId = model.replacedContactId;
                this.startTime = model.startTime;
            } 

            /**
             * contactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * replacedContactId.
             */
            public Builder replacedContactId(String replacedContactId) {
                this.replacedContactId = replacedContactId;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Substitudes build() {
                return new Substitudes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOncallSchedulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOncallSchedulesResponseBody</p>
     */
    public static class OncallSchedules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("oncallScheduleId")
        private String oncallScheduleId;

        @com.aliyun.core.annotation.NameInMap("oncallScheduleName")
        private String oncallScheduleName;

        @com.aliyun.core.annotation.NameInMap("rotations")
        private java.util.List<Rotations> rotations;

        @com.aliyun.core.annotation.NameInMap("shiftRobotId")
        private String shiftRobotId;

        @com.aliyun.core.annotation.NameInMap("substitudes")
        private java.util.List<Substitudes> substitudes;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private OncallSchedules(Builder builder) {
            this.oncallScheduleId = builder.oncallScheduleId;
            this.oncallScheduleName = builder.oncallScheduleName;
            this.rotations = builder.rotations;
            this.shiftRobotId = builder.shiftRobotId;
            this.substitudes = builder.substitudes;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OncallSchedules create() {
            return builder().build();
        }

        /**
         * @return oncallScheduleId
         */
        public String getOncallScheduleId() {
            return this.oncallScheduleId;
        }

        /**
         * @return oncallScheduleName
         */
        public String getOncallScheduleName() {
            return this.oncallScheduleName;
        }

        /**
         * @return rotations
         */
        public java.util.List<Rotations> getRotations() {
            return this.rotations;
        }

        /**
         * @return shiftRobotId
         */
        public String getShiftRobotId() {
            return this.shiftRobotId;
        }

        /**
         * @return substitudes
         */
        public java.util.List<Substitudes> getSubstitudes() {
            return this.substitudes;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String oncallScheduleId; 
            private String oncallScheduleName; 
            private java.util.List<Rotations> rotations; 
            private String shiftRobotId; 
            private java.util.List<Substitudes> substitudes; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(OncallSchedules model) {
                this.oncallScheduleId = model.oncallScheduleId;
                this.oncallScheduleName = model.oncallScheduleName;
                this.rotations = model.rotations;
                this.shiftRobotId = model.shiftRobotId;
                this.substitudes = model.substitudes;
                this.workspace = model.workspace;
            } 

            /**
             * oncallScheduleId.
             */
            public Builder oncallScheduleId(String oncallScheduleId) {
                this.oncallScheduleId = oncallScheduleId;
                return this;
            }

            /**
             * oncallScheduleName.
             */
            public Builder oncallScheduleName(String oncallScheduleName) {
                this.oncallScheduleName = oncallScheduleName;
                return this;
            }

            /**
             * rotations.
             */
            public Builder rotations(java.util.List<Rotations> rotations) {
                this.rotations = rotations;
                return this;
            }

            /**
             * shiftRobotId.
             */
            public Builder shiftRobotId(String shiftRobotId) {
                this.shiftRobotId = shiftRobotId;
                return this;
            }

            /**
             * substitudes.
             */
            public Builder substitudes(java.util.List<Substitudes> substitudes) {
                this.substitudes = substitudes;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public OncallSchedules build() {
                return new OncallSchedules(this);
            } 

        } 

    }
}
