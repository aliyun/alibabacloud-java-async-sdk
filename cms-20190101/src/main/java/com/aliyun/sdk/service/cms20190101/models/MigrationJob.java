// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrationJob} extends {@link TeaModel}
 *
 * <p>MigrationJob</p>
 */
public class MigrationJob extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Detail")
    private String detail;

    @NameInMap("JobStatus")
    private String jobStatus;

    @NameInMap("Plan")
    private Plan plan;

    @NameInMap("RuleNames")
    private java.util.List < String > ruleNames;

    @NameInMap("Source")
    private java.util.List < Source> source;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("Uuid")
    private String uuid;

    private MigrationJob(Builder builder) {
        this.createTime = builder.createTime;
        this.detail = builder.detail;
        this.jobStatus = builder.jobStatus;
        this.plan = builder.plan;
        this.ruleNames = builder.ruleNames;
        this.source = builder.source;
        this.updateTime = builder.updateTime;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrationJob create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return plan
     */
    public Plan getPlan() {
        return this.plan;
    }

    /**
     * @return ruleNames
     */
    public java.util.List < String > getRuleNames() {
        return this.ruleNames;
    }

    /**
     * @return source
     */
    public java.util.List < Source> getSource() {
        return this.source;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String createTime; 
        private String detail; 
        private String jobStatus; 
        private Plan plan; 
        private java.util.List < String > ruleNames; 
        private java.util.List < Source> source; 
        private String updateTime; 
        private String uuid; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * JobStatus.
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * Plan.
         */
        public Builder plan(Plan plan) {
            this.plan = plan;
            return this;
        }

        /**
         * RuleNames.
         */
        public Builder ruleNames(java.util.List < String > ruleNames) {
            this.ruleNames = ruleNames;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(java.util.List < Source> source) {
            this.source = source;
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
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public MigrationJob build() {
            return new MigrationJob(this);
        } 

    } 

    public static class Channels extends TeaModel {
        @NameInMap("Level")
        private Long level;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Channels(Builder builder) {
            this.level = builder.level;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long level; 
            private String type; 
            private String value; 

            /**
             * Level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
    public static class Contacts extends TeaModel {
        @NameInMap("Channels")
        private java.util.List < Channels> channels;

        @NameInMap("Name")
        private String name;

        private Contacts(Builder builder) {
            this.channels = builder.channels;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public java.util.List < Channels> getChannels() {
            return this.channels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < Channels> channels; 
            private String name; 

            /**
             * Channels.
             */
            public Builder channels(java.util.List < Channels> channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    public static class LevelGroups extends TeaModel {
        @NameInMap("Critical")
        private java.util.List < String > critical;

        @NameInMap("Info")
        private java.util.List < String > info;

        @NameInMap("Resolved")
        private java.util.List < String > resolved;

        @NameInMap("Warning")
        private java.util.List < String > warning;

        private LevelGroups(Builder builder) {
            this.critical = builder.critical;
            this.info = builder.info;
            this.resolved = builder.resolved;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LevelGroups create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public java.util.List < String > getCritical() {
            return this.critical;
        }

        /**
         * @return info
         */
        public java.util.List < String > getInfo() {
            return this.info;
        }

        /**
         * @return resolved
         */
        public java.util.List < String > getResolved() {
            return this.resolved;
        }

        /**
         * @return warning
         */
        public java.util.List < String > getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private java.util.List < String > critical; 
            private java.util.List < String > info; 
            private java.util.List < String > resolved; 
            private java.util.List < String > warning; 

            /**
             * Critical.
             */
            public Builder critical(java.util.List < String > critical) {
                this.critical = critical;
                return this;
            }

            /**
             * Info.
             */
            public Builder info(java.util.List < String > info) {
                this.info = info;
                return this;
            }

            /**
             * Resolved.
             */
            public Builder resolved(java.util.List < String > resolved) {
                this.resolved = resolved;
                return this;
            }

            /**
             * Warning.
             */
            public Builder warning(java.util.List < String > warning) {
                this.warning = warning;
                return this;
            }

            public LevelGroups build() {
                return new LevelGroups(this);
            } 

        } 

    }
    public static class Escalations extends TeaModel {
        @NameInMap("Groups")
        private java.util.List < String > groups;

        @NameInMap("LevelGroups")
        private LevelGroups levelGroups;

        private Escalations(Builder builder) {
            this.groups = builder.groups;
            this.levelGroups = builder.levelGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalations create() {
            return builder().build();
        }

        /**
         * @return groups
         */
        public java.util.List < String > getGroups() {
            return this.groups;
        }

        /**
         * @return levelGroups
         */
        public LevelGroups getLevelGroups() {
            return this.levelGroups;
        }

        public static final class Builder {
            private java.util.List < String > groups; 
            private LevelGroups levelGroups; 

            /**
             * Groups.
             */
            public Builder groups(java.util.List < String > groups) {
                this.groups = groups;
                return this;
            }

            /**
             * LevelGroups.
             */
            public Builder levelGroups(LevelGroups levelGroups) {
                this.levelGroups = levelGroups;
                return this;
            }

            public Escalations build() {
                return new Escalations(this);
            } 

        } 

    }
    public static class PlanEscalations extends TeaModel {
        @NameInMap("Escalations")
        private java.util.List < Escalations> escalations;

        @NameInMap("Name")
        private String name;

        @NameInMap("Uuid")
        private String uuid;

        private PlanEscalations(Builder builder) {
            this.escalations = builder.escalations;
            this.name = builder.name;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanEscalations create() {
            return builder().build();
        }

        /**
         * @return escalations
         */
        public java.util.List < Escalations> getEscalations() {
            return this.escalations;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private java.util.List < Escalations> escalations; 
            private String name; 
            private String uuid; 

            /**
             * Escalations.
             */
            public Builder escalations(java.util.List < Escalations> escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public PlanEscalations build() {
                return new PlanEscalations(this);
            } 

        } 

    }
    public static class Groups extends TeaModel {
        @NameInMap("Contacts")
        private java.util.List < String > contacts;

        @NameInMap("Name")
        private String name;

        private Groups(Builder builder) {
            this.contacts = builder.contacts;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return contacts
         */
        public java.util.List < String > getContacts() {
            return this.contacts;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > contacts; 
            private String name; 

            /**
             * Contacts.
             */
            public Builder contacts(java.util.List < String > contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    public static class EscalationSetting extends TeaModel {
        @NameInMap("escalationUuid")
        private String escalationUuid;

        private EscalationSetting(Builder builder) {
            this.escalationUuid = builder.escalationUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EscalationSetting create() {
            return builder().build();
        }

        /**
         * @return escalationUuid
         */
        public String getEscalationUuid() {
            return this.escalationUuid;
        }

        public static final class Builder {
            private String escalationUuid; 

            /**
             * escalationUuid.
             */
            public Builder escalationUuid(String escalationUuid) {
                this.escalationUuid = escalationUuid;
                return this;
            }

            public EscalationSetting build() {
                return new EscalationSetting(this);
            } 

        } 

    }
    public static class PushingSetting extends TeaModel {
        @NameInMap("TargetUuids")
        private java.util.List < String > targetUuids;

        private PushingSetting(Builder builder) {
            this.targetUuids = builder.targetUuids;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushingSetting create() {
            return builder().build();
        }

        /**
         * @return targetUuids
         */
        public java.util.List < String > getTargetUuids() {
            return this.targetUuids;
        }

        public static final class Builder {
            private java.util.List < String > targetUuids; 

            /**
             * TargetUuids.
             */
            public Builder targetUuids(java.util.List < String > targetUuids) {
                this.targetUuids = targetUuids;
                return this;
            }

            public PushingSetting build() {
                return new PushingSetting(this);
            } 

        } 

    }
    public static class Strategies extends TeaModel {
        @NameInMap("EscalationSetting")
        private EscalationSetting escalationSetting;

        @NameInMap("Name")
        private String name;

        @NameInMap("PushingSetting")
        private PushingSetting pushingSetting;

        private Strategies(Builder builder) {
            this.escalationSetting = builder.escalationSetting;
            this.name = builder.name;
            this.pushingSetting = builder.pushingSetting;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategies create() {
            return builder().build();
        }

        /**
         * @return escalationSetting
         */
        public EscalationSetting getEscalationSetting() {
            return this.escalationSetting;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pushingSetting
         */
        public PushingSetting getPushingSetting() {
            return this.pushingSetting;
        }

        public static final class Builder {
            private EscalationSetting escalationSetting; 
            private String name; 
            private PushingSetting pushingSetting; 

            /**
             * EscalationSetting.
             */
            public Builder escalationSetting(EscalationSetting escalationSetting) {
                this.escalationSetting = escalationSetting;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PushingSetting.
             */
            public Builder pushingSetting(PushingSetting pushingSetting) {
                this.pushingSetting = pushingSetting;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
    public static class Conditions extends TeaModel {
        @NameInMap("Field")
        private String field;

        @NameInMap("Op")
        private String op;

        @NameInMap("Value")
        private String value;

        private Conditions(Builder builder) {
            this.field = builder.field;
            this.op = builder.op;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String field; 
            private String op; 
            private String value; 

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * Op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    public static class Subscriptions extends TeaModel {
        @NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @NameInMap("Name")
        private String name;

        @NameInMap("StrategyUuid")
        private String strategyUuid;

        private Subscriptions(Builder builder) {
            this.conditions = builder.conditions;
            this.name = builder.name;
            this.strategyUuid = builder.strategyUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subscriptions create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return strategyUuid
         */
        public String getStrategyUuid() {
            return this.strategyUuid;
        }

        public static final class Builder {
            private java.util.List < Conditions> conditions; 
            private String name; 
            private String strategyUuid; 

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * StrategyUuid.
             */
            public Builder strategyUuid(String strategyUuid) {
                this.strategyUuid = strategyUuid;
                return this;
            }

            public Subscriptions build() {
                return new Subscriptions(this);
            } 

        } 

    }
    public static class HttpRequestTarget extends TeaModel {
        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("Method")
        private String method;

        @NameInMap("Url")
        private String url;

        private HttpRequestTarget(Builder builder) {
            this.contentType = builder.contentType;
            this.method = builder.method;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpRequestTarget create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String contentType; 
            private String method; 
            private String url; 

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public HttpRequestTarget build() {
                return new HttpRequestTarget(this);
            } 

        } 

    }
    public static class Targets extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("HttpRequestTarget")
        private HttpRequestTarget httpRequestTarget;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uuid")
        private String uuid;

        private Targets(Builder builder) {
            this.arn = builder.arn;
            this.httpRequestTarget = builder.httpRequestTarget;
            this.name = builder.name;
            this.type = builder.type;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return httpRequestTarget
         */
        public HttpRequestTarget getHttpRequestTarget() {
            return this.httpRequestTarget;
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
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String arn; 
            private HttpRequestTarget httpRequestTarget; 
            private String name; 
            private String type; 
            private String uuid; 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * HttpRequestTarget.
             */
            public Builder httpRequestTarget(HttpRequestTarget httpRequestTarget) {
                this.httpRequestTarget = httpRequestTarget;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    public static class Plan extends TeaModel {
        @NameInMap("Contacts")
        private java.util.List < Contacts> contacts;

        @NameInMap("Escalations")
        private java.util.List < PlanEscalations> escalations;

        @NameInMap("Groups")
        private java.util.List < Groups> groups;

        @NameInMap("RuleNames")
        private java.util.List < String > ruleNames;

        @NameInMap("Strategies")
        private java.util.List < Strategies> strategies;

        @NameInMap("Subscriptions")
        private java.util.List < Subscriptions> subscriptions;

        @NameInMap("Targets")
        private java.util.List < Targets> targets;

        private Plan(Builder builder) {
            this.contacts = builder.contacts;
            this.escalations = builder.escalations;
            this.groups = builder.groups;
            this.ruleNames = builder.ruleNames;
            this.strategies = builder.strategies;
            this.subscriptions = builder.subscriptions;
            this.targets = builder.targets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plan create() {
            return builder().build();
        }

        /**
         * @return contacts
         */
        public java.util.List < Contacts> getContacts() {
            return this.contacts;
        }

        /**
         * @return escalations
         */
        public java.util.List < PlanEscalations> getEscalations() {
            return this.escalations;
        }

        /**
         * @return groups
         */
        public java.util.List < Groups> getGroups() {
            return this.groups;
        }

        /**
         * @return ruleNames
         */
        public java.util.List < String > getRuleNames() {
            return this.ruleNames;
        }

        /**
         * @return strategies
         */
        public java.util.List < Strategies> getStrategies() {
            return this.strategies;
        }

        /**
         * @return subscriptions
         */
        public java.util.List < Subscriptions> getSubscriptions() {
            return this.subscriptions;
        }

        /**
         * @return targets
         */
        public java.util.List < Targets> getTargets() {
            return this.targets;
        }

        public static final class Builder {
            private java.util.List < Contacts> contacts; 
            private java.util.List < PlanEscalations> escalations; 
            private java.util.List < Groups> groups; 
            private java.util.List < String > ruleNames; 
            private java.util.List < Strategies> strategies; 
            private java.util.List < Subscriptions> subscriptions; 
            private java.util.List < Targets> targets; 

            /**
             * Contacts.
             */
            public Builder contacts(java.util.List < Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * Escalations.
             */
            public Builder escalations(java.util.List < PlanEscalations> escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * Groups.
             */
            public Builder groups(java.util.List < Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * RuleNames.
             */
            public Builder ruleNames(java.util.List < String > ruleNames) {
                this.ruleNames = ruleNames;
                return this;
            }

            /**
             * Strategies.
             */
            public Builder strategies(java.util.List < Strategies> strategies) {
                this.strategies = strategies;
                return this;
            }

            /**
             * Subscriptions.
             */
            public Builder subscriptions(java.util.List < Subscriptions> subscriptions) {
                this.subscriptions = subscriptions;
                return this;
            }

            /**
             * Targets.
             */
            public Builder targets(java.util.List < Targets> targets) {
                this.targets = targets;
                return this;
            }

            public Plan build() {
                return new Plan(this);
            } 

        } 

    }
    public static class KeywordFilter extends TeaModel {
        @NameInMap("Keywords")
        private java.util.List < String > keywords;

        @NameInMap("Relation")
        private String relation;

        private KeywordFilter(Builder builder) {
            this.keywords = builder.keywords;
            this.relation = builder.relation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeywordFilter create() {
            return builder().build();
        }

        /**
         * @return keywords
         */
        public java.util.List < String > getKeywords() {
            return this.keywords;
        }

        /**
         * @return relation
         */
        public String getRelation() {
            return this.relation;
        }

        public static final class Builder {
            private java.util.List < String > keywords; 
            private String relation; 

            /**
             * Keywords.
             */
            public Builder keywords(java.util.List < String > keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * Relation.
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            public KeywordFilter build() {
                return new KeywordFilter(this);
            } 

        } 

    }
    public static class PrimaryFilters extends TeaModel {
        @NameInMap("Field")
        private String field;

        @NameInMap("OpType")
        private String opType;

        @NameInMap("Value")
        private String value;

        private PrimaryFilters(Builder builder) {
            this.field = builder.field;
            this.opType = builder.opType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrimaryFilters create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String field; 
            private String opType; 
            private String value; 

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * OpType.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PrimaryFilters build() {
                return new PrimaryFilters(this);
            } 

        } 

    }
    public static class Rule extends TeaModel {
        @NameInMap("KeywordFilter")
        private KeywordFilter keywordFilter;

        @NameInMap("Name")
        private String name;

        @NameInMap("PrimaryFilters")
        private java.util.List < PrimaryFilters> primaryFilters;

        private Rule(Builder builder) {
            this.keywordFilter = builder.keywordFilter;
            this.name = builder.name;
            this.primaryFilters = builder.primaryFilters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return keywordFilter
         */
        public KeywordFilter getKeywordFilter() {
            return this.keywordFilter;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return primaryFilters
         */
        public java.util.List < PrimaryFilters> getPrimaryFilters() {
            return this.primaryFilters;
        }

        public static final class Builder {
            private KeywordFilter keywordFilter; 
            private String name; 
            private java.util.List < PrimaryFilters> primaryFilters; 

            /**
             * KeywordFilter.
             */
            public Builder keywordFilter(KeywordFilter keywordFilter) {
                this.keywordFilter = keywordFilter;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PrimaryFilters.
             */
            public Builder primaryFilters(java.util.List < PrimaryFilters> primaryFilters) {
                this.primaryFilters = primaryFilters;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("Group")
        private String group;

        @NameInMap("Level")
        private String level;

        @NameInMap("Method")
        private String method;

        @NameInMap("Region")
        private String region;

        @NameInMap("ResourcePath")
        private String resourcePath;

        @NameInMap("Url")
        private String url;

        private Content(Builder builder) {
            this.group = builder.group;
            this.level = builder.level;
            this.method = builder.method;
            this.region = builder.region;
            this.resourcePath = builder.resourcePath;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourcePath
         */
        public String getResourcePath() {
            return this.resourcePath;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String group; 
            private String level; 
            private String method; 
            private String region; 
            private String resourcePath; 
            private String url; 

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourcePath.
             */
            public Builder resourcePath(String resourcePath) {
                this.resourcePath = resourcePath;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class SourceTargets extends TeaModel {
        @NameInMap("Content")
        private Content content;

        @NameInMap("Type")
        private String type;

        private SourceTargets(Builder builder) {
            this.content = builder.content;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceTargets create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Content content; 
            private String type; 

            /**
             * Content.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SourceTargets build() {
                return new SourceTargets(this);
            } 

        } 

    }
    public static class Source extends TeaModel {
        @NameInMap("Rule")
        private Rule rule;

        @NameInMap("Targets")
        private java.util.List < SourceTargets> targets;

        private Source(Builder builder) {
            this.rule = builder.rule;
            this.targets = builder.targets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return rule
         */
        public Rule getRule() {
            return this.rule;
        }

        /**
         * @return targets
         */
        public java.util.List < SourceTargets> getTargets() {
            return this.targets;
        }

        public static final class Builder {
            private Rule rule; 
            private java.util.List < SourceTargets> targets; 

            /**
             * Rule.
             */
            public Builder rule(Rule rule) {
                this.rule = rule;
                return this;
            }

            /**
             * Targets.
             */
            public Builder targets(java.util.List < SourceTargets> targets) {
                this.targets = targets;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
}
