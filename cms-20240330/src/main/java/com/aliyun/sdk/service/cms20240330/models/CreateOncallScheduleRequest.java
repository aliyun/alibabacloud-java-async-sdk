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
 * {@link CreateOncallScheduleRequest} extends {@link RequestModel}
 *
 * <p>CreateOncallScheduleRequest</p>
 */
public class CreateOncallScheduleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("oncallScheduleId")
    private String oncallScheduleId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private CreateOncallScheduleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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

    public static CreateOncallScheduleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateOncallScheduleRequest, Builder> {
        private String regionId; 
        private String oncallScheduleId; 
        private String oncallScheduleName; 
        private java.util.List<Rotations> rotations; 
        private String shiftRobotId; 
        private java.util.List<Substitudes> substitudes; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateOncallScheduleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.oncallScheduleId = request.oncallScheduleId;
            this.oncallScheduleName = request.oncallScheduleName;
            this.rotations = request.rotations;
            this.shiftRobotId = request.shiftRobotId;
            this.substitudes = request.substitudes;
            this.workspace = request.workspace;
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
         * oncallScheduleId.
         */
        public Builder oncallScheduleId(String oncallScheduleId) {
            this.putBodyParameter("oncallScheduleId", oncallScheduleId);
            this.oncallScheduleId = oncallScheduleId;
            return this;
        }

        /**
         * oncallScheduleName.
         */
        public Builder oncallScheduleName(String oncallScheduleName) {
            this.putBodyParameter("oncallScheduleName", oncallScheduleName);
            this.oncallScheduleName = oncallScheduleName;
            return this;
        }

        /**
         * rotations.
         */
        public Builder rotations(java.util.List<Rotations> rotations) {
            this.putBodyParameter("rotations", rotations);
            this.rotations = rotations;
            return this;
        }

        /**
         * shiftRobotId.
         */
        public Builder shiftRobotId(String shiftRobotId) {
            this.putBodyParameter("shiftRobotId", shiftRobotId);
            this.shiftRobotId = shiftRobotId;
            return this;
        }

        /**
         * substitudes.
         */
        public Builder substitudes(java.util.List<Substitudes> substitudes) {
            this.putBodyParameter("substitudes", substitudes);
            this.substitudes = substitudes;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public CreateOncallScheduleRequest build() {
            return new CreateOncallScheduleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOncallScheduleRequest} extends {@link TeaModel}
     *
     * <p>CreateOncallScheduleRequest</p>
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
             * <p>This parameter is required.</p>
             */
            public Builder activeDays(java.util.List<Integer> activeDays) {
                this.activeDays = activeDays;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder contacts(java.util.List<String> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>testRotationName</p>
             */
            public Builder rotationName(String rotationName) {
                this.rotationName = rotationName;
                return this;
            }

            /**
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
             * shiftLength.
             */
            public Builder shiftLength(Integer shiftLength) {
                this.shiftLength = shiftLength;
                return this;
            }

            /**
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-14</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
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
     * {@link CreateOncallScheduleRequest} extends {@link TeaModel}
     *
     * <p>CreateOncallScheduleRequest</p>
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
}
