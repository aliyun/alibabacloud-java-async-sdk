// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link EscalationRule} extends {@link TeaModel}
 *
 * <p>EscalationRule</p>
 */
public class EscalationRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Escalations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Escalations> escalations;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private EscalationRule(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.escalations = builder.escalations;
        this.name = builder.name;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EscalationRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return escalations
     */
    public java.util.List<Escalations> getEscalations() {
        return this.escalations;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private java.util.List<Escalations> escalations; 
        private String name; 
        private String updateTime; 
        private String userId; 
        private String uuid; 

        private Builder() {
        } 

        private Builder(EscalationRule model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.escalations = model.escalations;
            this.name = model.name;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
            this.uuid = model.uuid;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder escalations(java.util.List<Escalations> escalations) {
            this.escalations = escalations;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public EscalationRule build() {
            return new EscalationRule(this);
        } 

    } 

    /**
     * 
     * {@link EscalationRule} extends {@link TeaModel}
     *
     * <p>EscalationRule</p>
     */
    public static class ContactGroupsByLevel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        private java.util.List<String> critical;

        @com.aliyun.core.annotation.NameInMap("Error")
        private java.util.List<String> error;

        @com.aliyun.core.annotation.NameInMap("Info")
        private java.util.List<String> info;

        @com.aliyun.core.annotation.NameInMap("Resolve")
        private java.util.List<String> resolve;

        @com.aliyun.core.annotation.NameInMap("Warning")
        private java.util.List<String> warning;

        private ContactGroupsByLevel(Builder builder) {
            this.critical = builder.critical;
            this.error = builder.error;
            this.info = builder.info;
            this.resolve = builder.resolve;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroupsByLevel create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public java.util.List<String> getCritical() {
            return this.critical;
        }

        /**
         * @return error
         */
        public java.util.List<String> getError() {
            return this.error;
        }

        /**
         * @return info
         */
        public java.util.List<String> getInfo() {
            return this.info;
        }

        /**
         * @return resolve
         */
        public java.util.List<String> getResolve() {
            return this.resolve;
        }

        /**
         * @return warning
         */
        public java.util.List<String> getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private java.util.List<String> critical; 
            private java.util.List<String> error; 
            private java.util.List<String> info; 
            private java.util.List<String> resolve; 
            private java.util.List<String> warning; 

            private Builder() {
            } 

            private Builder(ContactGroupsByLevel model) {
                this.critical = model.critical;
                this.error = model.error;
                this.info = model.info;
                this.resolve = model.resolve;
                this.warning = model.warning;
            } 

            /**
             * Critical.
             */
            public Builder critical(java.util.List<String> critical) {
                this.critical = critical;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(java.util.List<String> error) {
                this.error = error;
                return this;
            }

            /**
             * Info.
             */
            public Builder info(java.util.List<String> info) {
                this.info = info;
                return this;
            }

            /**
             * Resolve.
             */
            public Builder resolve(java.util.List<String> resolve) {
                this.resolve = resolve;
                return this;
            }

            /**
             * Warning.
             */
            public Builder warning(java.util.List<String> warning) {
                this.warning = warning;
                return this;
            }

            public ContactGroupsByLevel build() {
                return new ContactGroupsByLevel(this);
            } 

        } 

    }
    /**
     * 
     * {@link EscalationRule} extends {@link TeaModel}
     *
     * <p>EscalationRule</p>
     */
    public static class Escalations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupContactGroups")
        private java.util.List<String> backupContactGroups;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private java.util.List<String> contactGroups;

        @com.aliyun.core.annotation.NameInMap("ContactGroupsByLevel")
        private ContactGroupsByLevel contactGroupsByLevel;

        @com.aliyun.core.annotation.NameInMap("EscalateMin")
        private Long escalateMin;

        private Escalations(Builder builder) {
            this.backupContactGroups = builder.backupContactGroups;
            this.contactGroups = builder.contactGroups;
            this.contactGroupsByLevel = builder.contactGroupsByLevel;
            this.escalateMin = builder.escalateMin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalations create() {
            return builder().build();
        }

        /**
         * @return backupContactGroups
         */
        public java.util.List<String> getBackupContactGroups() {
            return this.backupContactGroups;
        }

        /**
         * @return contactGroups
         */
        public java.util.List<String> getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return contactGroupsByLevel
         */
        public ContactGroupsByLevel getContactGroupsByLevel() {
            return this.contactGroupsByLevel;
        }

        /**
         * @return escalateMin
         */
        public Long getEscalateMin() {
            return this.escalateMin;
        }

        public static final class Builder {
            private java.util.List<String> backupContactGroups; 
            private java.util.List<String> contactGroups; 
            private ContactGroupsByLevel contactGroupsByLevel; 
            private Long escalateMin; 

            private Builder() {
            } 

            private Builder(Escalations model) {
                this.backupContactGroups = model.backupContactGroups;
                this.contactGroups = model.contactGroups;
                this.contactGroupsByLevel = model.contactGroupsByLevel;
                this.escalateMin = model.escalateMin;
            } 

            /**
             * BackupContactGroups.
             */
            public Builder backupContactGroups(java.util.List<String> backupContactGroups) {
                this.backupContactGroups = backupContactGroups;
                return this;
            }

            /**
             * ContactGroups.
             */
            public Builder contactGroups(java.util.List<String> contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * ContactGroupsByLevel.
             */
            public Builder contactGroupsByLevel(ContactGroupsByLevel contactGroupsByLevel) {
                this.contactGroupsByLevel = contactGroupsByLevel;
                return this;
            }

            /**
             * EscalateMin.
             */
            public Builder escalateMin(Long escalateMin) {
                this.escalateMin = escalateMin;
                return this;
            }

            public Escalations build() {
                return new Escalations(this);
            } 

        } 

    }
}
