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
 * {@link IncidentMemberStruct} extends {@link TeaModel}
 *
 * <p>IncidentMemberStruct</p>
 */
public class IncidentMemberStruct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("acknowledge")
    private Acknowledge acknowledge;

    @com.aliyun.core.annotation.NameInMap("contactId")
    private String contactId;

    @com.aliyun.core.annotation.NameInMap("contacts")
    private java.util.List<Contacts> contacts;

    @com.aliyun.core.annotation.NameInMap("escalation")
    private Escalation escalation;

    @com.aliyun.core.annotation.NameInMap("incidentId")
    private String incidentId;

    @com.aliyun.core.annotation.NameInMap("incidentMemberId")
    private String incidentMemberId;

    @com.aliyun.core.annotation.NameInMap("scheduleGroup")
    private ScheduleGroup scheduleGroup;

    @com.aliyun.core.annotation.NameInMap("time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private IncidentMemberStruct(Builder builder) {
        this.acknowledge = builder.acknowledge;
        this.contactId = builder.contactId;
        this.contacts = builder.contacts;
        this.escalation = builder.escalation;
        this.incidentId = builder.incidentId;
        this.incidentMemberId = builder.incidentMemberId;
        this.scheduleGroup = builder.scheduleGroup;
        this.time = builder.time;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentMemberStruct create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acknowledge
     */
    public Acknowledge getAcknowledge() {
        return this.acknowledge;
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return contacts
     */
    public java.util.List<Contacts> getContacts() {
        return this.contacts;
    }

    /**
     * @return escalation
     */
    public Escalation getEscalation() {
        return this.escalation;
    }

    /**
     * @return incidentId
     */
    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return incidentMemberId
     */
    public String getIncidentMemberId() {
        return this.incidentMemberId;
    }

    /**
     * @return scheduleGroup
     */
    public ScheduleGroup getScheduleGroup() {
        return this.scheduleGroup;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Acknowledge acknowledge; 
        private String contactId; 
        private java.util.List<Contacts> contacts; 
        private Escalation escalation; 
        private String incidentId; 
        private String incidentMemberId; 
        private ScheduleGroup scheduleGroup; 
        private Long time; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(IncidentMemberStruct model) {
            this.acknowledge = model.acknowledge;
            this.contactId = model.contactId;
            this.contacts = model.contacts;
            this.escalation = model.escalation;
            this.incidentId = model.incidentId;
            this.incidentMemberId = model.incidentMemberId;
            this.scheduleGroup = model.scheduleGroup;
            this.time = model.time;
            this.userId = model.userId;
        } 

        /**
         * acknowledge.
         */
        public Builder acknowledge(Acknowledge acknowledge) {
            this.acknowledge = acknowledge;
            return this;
        }

        /**
         * contactId.
         */
        public Builder contactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * contacts.
         */
        public Builder contacts(java.util.List<Contacts> contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * escalation.
         */
        public Builder escalation(Escalation escalation) {
            this.escalation = escalation;
            return this;
        }

        /**
         * incidentId.
         */
        public Builder incidentId(String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        /**
         * incidentMemberId.
         */
        public Builder incidentMemberId(String incidentMemberId) {
            this.incidentMemberId = incidentMemberId;
            return this;
        }

        /**
         * scheduleGroup.
         */
        public Builder scheduleGroup(ScheduleGroup scheduleGroup) {
            this.scheduleGroup = scheduleGroup;
            return this;
        }

        /**
         * time.
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public IncidentMemberStruct build() {
            return new IncidentMemberStruct(this);
        } 

    } 

    /**
     * 
     * {@link IncidentMemberStruct} extends {@link TeaModel}
     *
     * <p>IncidentMemberStruct</p>
     */
    public static class Acknowledge extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("breakLevel")
        private String breakLevel;

        @com.aliyun.core.annotation.NameInMap("verifyTime")
        private Long verifyTime;

        private Acknowledge(Builder builder) {
            this.breakLevel = builder.breakLevel;
            this.verifyTime = builder.verifyTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acknowledge create() {
            return builder().build();
        }

        /**
         * @return breakLevel
         */
        public String getBreakLevel() {
            return this.breakLevel;
        }

        /**
         * @return verifyTime
         */
        public Long getVerifyTime() {
            return this.verifyTime;
        }

        public static final class Builder {
            private String breakLevel; 
            private Long verifyTime; 

            private Builder() {
            } 

            private Builder(Acknowledge model) {
                this.breakLevel = model.breakLevel;
                this.verifyTime = model.verifyTime;
            } 

            /**
             * breakLevel.
             */
            public Builder breakLevel(String breakLevel) {
                this.breakLevel = breakLevel;
                return this;
            }

            /**
             * verifyTime.
             */
            public Builder verifyTime(Long verifyTime) {
                this.verifyTime = verifyTime;
                return this;
            }

            public Acknowledge build() {
                return new Acknowledge(this);
            } 

        } 

    }
    /**
     * 
     * {@link IncidentMemberStruct} extends {@link TeaModel}
     *
     * <p>IncidentMemberStruct</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("contactMask")
        private String contactMask;

        private Contacts(Builder builder) {
            this.channel = builder.channel;
            this.contactMask = builder.contactMask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return contactMask
         */
        public String getContactMask() {
            return this.contactMask;
        }

        public static final class Builder {
            private String channel; 
            private String contactMask; 

            private Builder() {
            } 

            private Builder(Contacts model) {
                this.channel = model.channel;
                this.contactMask = model.contactMask;
            } 

            /**
             * channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * contactMask.
             */
            public Builder contactMask(String contactMask) {
                this.contactMask = contactMask;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link IncidentMemberStruct} extends {@link TeaModel}
     *
     * <p>IncidentMemberStruct</p>
     */
    public static class Escalation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("incidentEscalationId")
        private String incidentEscalationId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("stageIndex")
        private String stageIndex;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Escalation(Builder builder) {
            this.description = builder.description;
            this.incidentEscalationId = builder.incidentEscalationId;
            this.name = builder.name;
            this.stageIndex = builder.stageIndex;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalation create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return incidentEscalationId
         */
        public String getIncidentEscalationId() {
            return this.incidentEscalationId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return stageIndex
         */
        public String getStageIndex() {
            return this.stageIndex;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String incidentEscalationId; 
            private String name; 
            private String stageIndex; 
            private String title; 

            private Builder() {
            } 

            private Builder(Escalation model) {
                this.description = model.description;
                this.incidentEscalationId = model.incidentEscalationId;
                this.name = model.name;
                this.stageIndex = model.stageIndex;
                this.title = model.title;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * incidentEscalationId.
             */
            public Builder incidentEscalationId(String incidentEscalationId) {
                this.incidentEscalationId = incidentEscalationId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * stageIndex.
             */
            public Builder stageIndex(String stageIndex) {
                this.stageIndex = stageIndex;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Escalation build() {
                return new Escalation(this);
            } 

        } 

    }
    /**
     * 
     * {@link IncidentMemberStruct} extends {@link TeaModel}
     *
     * <p>IncidentMemberStruct</p>
     */
    public static class ScheduleGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private ScheduleGroup(Builder builder) {
            this.contactId = builder.contactId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleGroup create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String contactId; 
            private String name; 

            private Builder() {
            } 

            private Builder(ScheduleGroup model) {
                this.contactId = model.contactId;
                this.name = model.name;
            } 

            /**
             * contactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ScheduleGroup build() {
                return new ScheduleGroup(this);
            } 

        } 

    }
}
