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
 * {@link UpdateOncallScheduleRequest} extends {@link RequestModel}
 *
 * <p>UpdateOncallScheduleRequest</p>
 */
public class UpdateOncallScheduleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("oncallScheduleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String oncallScheduleId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("oncallScheduleName")
    private String oncallScheduleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rotations")
    private java.util.List<Rotations> rotations;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shiftRobotId")
    private String shiftRobotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("substitudes")
    private java.util.List<Substitudes> substitudes;

    private UpdateOncallScheduleRequest(Builder builder) {
        super(builder);
        this.oncallScheduleId = builder.oncallScheduleId;
        this.regionId = builder.regionId;
        this.oncallScheduleName = builder.oncallScheduleName;
        this.rotations = builder.rotations;
        this.shiftRobotId = builder.shiftRobotId;
        this.substitudes = builder.substitudes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOncallScheduleRequest create() {
        return builder().build();
    }

@Override
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<UpdateOncallScheduleRequest, Builder> {
        private String oncallScheduleId; 
        private String regionId; 
        private String oncallScheduleName; 
        private java.util.List<Rotations> rotations; 
        private String shiftRobotId; 
        private java.util.List<Substitudes> substitudes; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOncallScheduleRequest request) {
            super(request);
            this.oncallScheduleId = request.oncallScheduleId;
            this.regionId = request.regionId;
            this.oncallScheduleName = request.oncallScheduleName;
            this.rotations = request.rotations;
            this.shiftRobotId = request.shiftRobotId;
            this.substitudes = request.substitudes;
        } 

        /**
         * <p>The unique identifier of the on-call schedule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder oncallScheduleId(String oncallScheduleId) {
            this.putPathParameter("oncallScheduleId", oncallScheduleId);
            this.oncallScheduleId = oncallScheduleId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder oncallScheduleName(String oncallScheduleName) {
            this.putBodyParameter("oncallScheduleName", oncallScheduleName);
            this.oncallScheduleName = oncallScheduleName;
            return this;
        }

        /**
         * <p>The list of rotations.</p>
         */
        public Builder rotations(java.util.List<Rotations> rotations) {
            this.putBodyParameter("rotations", rotations);
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
            this.putBodyParameter("shiftRobotId", shiftRobotId);
            this.shiftRobotId = shiftRobotId;
            return this;
        }

        /**
         * <p>The list of substitution rules.</p>
         */
        public Builder substitudes(java.util.List<Substitudes> substitudes) {
            this.putBodyParameter("substitudes", substitudes);
            this.substitudes = substitudes;
            return this;
        }

        @Override
        public UpdateOncallScheduleRequest build() {
            return new UpdateOncallScheduleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateOncallScheduleRequest} extends {@link TeaModel}
     *
     * <p>UpdateOncallScheduleRequest</p>
     */
    public static class Rotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeDays")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Integer> activeDays;

        @com.aliyun.core.annotation.NameInMap("contacts")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> contacts;

        @com.aliyun.core.annotation.NameInMap("rotationEndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String rotationEndTime;

        @com.aliyun.core.annotation.NameInMap("rotationName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String rotationName;

        @com.aliyun.core.annotation.NameInMap("rotationStartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String rotationStartTime;

        @com.aliyun.core.annotation.NameInMap("shiftLength")
        private Integer shiftLength;

        @com.aliyun.core.annotation.NameInMap("shiftRecurrenceFrequency")
        @com.aliyun.core.annotation.Validation(required = true)
        private String shiftRecurrenceFrequency;

        @com.aliyun.core.annotation.NameInMap("startDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("timeZone")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The days of the week when the rotation takes effect.</p>
             * <p>This parameter is required.</p>
             */
            public Builder activeDays(java.util.List<Integer> activeDays) {
                this.activeDays = activeDays;
                return this;
            }

            /**
             * <p>The IDs of the contacts.</p>
             * <p>This parameter is required.</p>
             */
            public Builder contacts(java.util.List<String> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * <p>The end time of the rotation. Format: HH:mm.</p>
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder rotationName(String rotationName) {
                this.rotationName = rotationName;
                return this;
            }

            /**
             * <p>The start time of the rotation. Format: HH:mm.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder rotationStartTime(String rotationStartTime) {
                this.rotationStartTime = rotationStartTime;
                return this;
            }

            /**
             * <p>The length of the shift cycle. Used in conjunction with shiftRecurrenceFrequency, such as switching to the next on-call person every 3 days.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder shiftLength(Integer shiftLength) {
                this.shiftLength = shiftLength;
                return this;
            }

            /**
             * <p>The unit of the shift cycle. Used in conjunction with shiftRecurrenceFrequency, such as switching to the next on-call person every week.</p>
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-04</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The time zone name. Uses the IANA Time Zone Database standard, such as Asia/Shanghai.</p>
             * <p>This parameter is required.</p>
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
     * {@link UpdateOncallScheduleRequest} extends {@link TeaModel}
     *
     * <p>UpdateOncallScheduleRequest</p>
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
             * <p>The contact ID of the replaced person.</p>
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
