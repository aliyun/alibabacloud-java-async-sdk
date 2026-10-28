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
 * {@link GetOncallScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>GetOncallScheduleResponseBody</p>
 */
public class GetOncallScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("oncallScheduleId")
    private String oncallScheduleId;

    @com.aliyun.core.annotation.NameInMap("oncallScheduleName")
    private String oncallScheduleName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("rotations")
    private java.util.List<Rotations> rotations;

    @com.aliyun.core.annotation.NameInMap("shiftRobotId")
    private String shiftRobotId;

    @com.aliyun.core.annotation.NameInMap("substitudes")
    private java.util.List<Substitudes> substitudes;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private GetOncallScheduleResponseBody(Builder builder) {
        this.oncallScheduleId = builder.oncallScheduleId;
        this.oncallScheduleName = builder.oncallScheduleName;
        this.requestId = builder.requestId;
        this.rotations = builder.rotations;
        this.shiftRobotId = builder.shiftRobotId;
        this.substitudes = builder.substitudes;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOncallScheduleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private java.util.List<Rotations> rotations; 
        private String shiftRobotId; 
        private java.util.List<Substitudes> substitudes; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(GetOncallScheduleResponseBody model) {
            this.oncallScheduleId = model.oncallScheduleId;
            this.oncallScheduleName = model.oncallScheduleName;
            this.requestId = model.requestId;
            this.rotations = model.rotations;
            this.shiftRobotId = model.shiftRobotId;
            this.substitudes = model.substitudes;
            this.workspace = model.workspace;
        } 

        /**
         * <p>The unique identifier of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder oncallScheduleId(String oncallScheduleId) {
            this.oncallScheduleId = oncallScheduleId;
            return this;
        }

        /**
         * <p>The name of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>testOncallScheduleName</p>
         */
        public Builder oncallScheduleName(String oncallScheduleName) {
            this.oncallScheduleName = oncallScheduleName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of rotations.</p>
         */
        public Builder rotations(java.util.List<Rotations> rotations) {
            this.rotations = rotations;
            return this;
        }

        /**
         * <p>The ID of the shift reminder chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder shiftRobotId(String shiftRobotId) {
            this.shiftRobotId = shiftRobotId;
            return this;
        }

        /**
         * <p>The list of substitution rules.</p>
         */
        public Builder substitudes(java.util.List<Substitudes> substitudes) {
            this.substitudes = substitudes;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-5884500827389836-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetOncallScheduleResponseBody build() {
            return new GetOncallScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOncallScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetOncallScheduleResponseBody</p>
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
             * <p>The days of the week when the rotation is active.</p>
             */
            public Builder activeDays(java.util.List<Integer> activeDays) {
                this.activeDays = activeDays;
                return this;
            }

            /**
             * <p>The contact ID.</p>
             */
            public Builder contacts(java.util.List<String> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * <p>The end time of the rotation. Format: HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>24:00</p>
             */
            public Builder rotationEndTime(String rotationEndTime) {
                this.rotationEndTime = rotationEndTime;
                return this;
            }

            /**
             * <p>The name of the rotation.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder rotationName(String rotationName) {
                this.rotationName = rotationName;
                return this;
            }

            /**
             * <p>The start time of the rotation. Format: HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder rotationStartTime(String rotationStartTime) {
                this.rotationStartTime = rotationStartTime;
                return this;
            }

            /**
             * <p>The length of the shift rotation cycle. Used in combination with shiftRecurrenceFrequency. For example, set this parameter to 3 to rotate to the next on-call contact every 3 days.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder shiftLength(Integer shiftLength) {
                this.shiftLength = shiftLength;
                return this;
            }

            /**
             * <p>The unit of the shift rotation cycle. Used in combination with shiftRecurrenceFrequency. For example, set this parameter to Week to rotate to the next on-call contact every week.</p>
             * 
             * <strong>example:</strong>
             * <p>WEEKLY</p>
             */
            public Builder shiftRecurrenceFrequency(String shiftRecurrenceFrequency) {
                this.shiftRecurrenceFrequency = shiftRecurrenceFrequency;
                return this;
            }

            /**
             * <p>The start date of the rotation. Format: yyyy-MM-dd.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The time zone name based on the IANA Time Zone Database standard. Example: Asia/Shanghai.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
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
     * {@link GetOncallScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetOncallScheduleResponseBody</p>
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
             * <p>The contact ID of the substitute.</p>
             * 
             * <strong>example:</strong>
             * <p>testId</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The end time of the substitution. Format: YYYY-MM-DD HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-15 18:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The contact ID of the replaced contact.</p>
             * 
             * <strong>example:</strong>
             * <p>testId</p>
             */
            public Builder replacedContactId(String replacedContactId) {
                this.replacedContactId = replacedContactId;
                return this;
            }

            /**
             * <p>The start time of the substitution. Format: YYYY-MM-DD HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10 09:00</p>
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
}
