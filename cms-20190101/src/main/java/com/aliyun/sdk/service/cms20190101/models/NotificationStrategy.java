// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NotificationStrategy} extends {@link TeaModel}
 *
 * <p>NotificationStrategy</p>
 */
public class NotificationStrategy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EscalationSetting")
    private EscalationSetting escalationSetting;

    @com.aliyun.core.annotation.NameInMap("FilterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("GroupingSetting")
    private GroupingSetting groupingSetting;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.NameInMap("PushingSetting")
    private PushingSetting pushingSetting;

    @com.aliyun.core.annotation.NameInMap("RouteSetting")
    private RouteSetting routeSetting;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private NotificationStrategy(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.escalationSetting = builder.escalationSetting;
        this.filterSetting = builder.filterSetting;
        this.groupingSetting = builder.groupingSetting;
        this.name = builder.name;
        this.product = builder.product;
        this.pushingSetting = builder.pushingSetting;
        this.routeSetting = builder.routeSetting;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotificationStrategy create() {
        return builder().build();
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
     * @return escalationSetting
     */
    public EscalationSetting getEscalationSetting() {
        return this.escalationSetting;
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return groupingSetting
     */
    public GroupingSetting getGroupingSetting() {
        return this.groupingSetting;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return pushingSetting
     */
    public PushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    /**
     * @return routeSetting
     */
    public RouteSetting getRouteSetting() {
        return this.routeSetting;
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
        private EscalationSetting escalationSetting; 
        private FilterSetting filterSetting; 
        private GroupingSetting groupingSetting; 
        private String name; 
        private String product; 
        private PushingSetting pushingSetting; 
        private RouteSetting routeSetting; 
        private String updateTime; 
        private String userId; 
        private String uuid; 

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
         * EscalationSetting.
         */
        public Builder escalationSetting(EscalationSetting escalationSetting) {
            this.escalationSetting = escalationSetting;
            return this;
        }

        /**
         * FilterSetting.
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * GroupingSetting.
         */
        public Builder groupingSetting(GroupingSetting groupingSetting) {
            this.groupingSetting = groupingSetting;
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
         * Product.
         */
        public Builder product(String product) {
            this.product = product;
            return this;
        }

        /**
         * PushingSetting.
         */
        public Builder pushingSetting(PushingSetting pushingSetting) {
            this.pushingSetting = pushingSetting;
            return this;
        }

        /**
         * RouteSetting.
         */
        public Builder routeSetting(RouteSetting routeSetting) {
            this.routeSetting = routeSetting;
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

        public NotificationStrategy build() {
            return new NotificationStrategy(this);
        } 

    } 

    public static class CustomChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("Severities")
        private java.util.List < String > severities;

        @com.aliyun.core.annotation.NameInMap("TemplateUuid")
        private String templateUuid;

        private CustomChannels(Builder builder) {
            this.channelType = builder.channelType;
            this.severities = builder.severities;
            this.templateUuid = builder.templateUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomChannels create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return severities
         */
        public java.util.List < String > getSeverities() {
            return this.severities;
        }

        /**
         * @return templateUuid
         */
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        public static final class Builder {
            private String channelType; 
            private java.util.List < String > severities; 
            private String templateUuid; 

            /**
             * ChannelType.
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * Severities.
             */
            public Builder severities(java.util.List < String > severities) {
                this.severities = severities;
                return this;
            }

            /**
             * TemplateUuid.
             */
            public Builder templateUuid(String templateUuid) {
                this.templateUuid = templateUuid;
                return this;
            }

            public CustomChannels build() {
                return new CustomChannels(this);
            } 

        } 

    }
    public static class EscalationSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoResolveMin")
        private Long autoResolveMin;

        @com.aliyun.core.annotation.NameInMap("CustomChannels")
        private java.util.List < CustomChannels> customChannels;

        @com.aliyun.core.annotation.NameInMap("EscalationLevel")
        private String escalationLevel;

        @com.aliyun.core.annotation.NameInMap("EscalationUuid")
        private String escalationUuid;

        @com.aliyun.core.annotation.NameInMap("Range")
        private String range;

        @com.aliyun.core.annotation.NameInMap("RetriggerMin")
        private Long retriggerMin;

        private EscalationSetting(Builder builder) {
            this.autoResolveMin = builder.autoResolveMin;
            this.customChannels = builder.customChannels;
            this.escalationLevel = builder.escalationLevel;
            this.escalationUuid = builder.escalationUuid;
            this.range = builder.range;
            this.retriggerMin = builder.retriggerMin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EscalationSetting create() {
            return builder().build();
        }

        /**
         * @return autoResolveMin
         */
        public Long getAutoResolveMin() {
            return this.autoResolveMin;
        }

        /**
         * @return customChannels
         */
        public java.util.List < CustomChannels> getCustomChannels() {
            return this.customChannels;
        }

        /**
         * @return escalationLevel
         */
        public String getEscalationLevel() {
            return this.escalationLevel;
        }

        /**
         * @return escalationUuid
         */
        public String getEscalationUuid() {
            return this.escalationUuid;
        }

        /**
         * @return range
         */
        public String getRange() {
            return this.range;
        }

        /**
         * @return retriggerMin
         */
        public Long getRetriggerMin() {
            return this.retriggerMin;
        }

        public static final class Builder {
            private Long autoResolveMin; 
            private java.util.List < CustomChannels> customChannels; 
            private String escalationLevel; 
            private String escalationUuid; 
            private String range; 
            private Long retriggerMin; 

            /**
             * AutoResolveMin.
             */
            public Builder autoResolveMin(Long autoResolveMin) {
                this.autoResolveMin = autoResolveMin;
                return this;
            }

            /**
             * CustomChannels.
             */
            public Builder customChannels(java.util.List < CustomChannels> customChannels) {
                this.customChannels = customChannels;
                return this;
            }

            /**
             * EscalationLevel.
             */
            public Builder escalationLevel(String escalationLevel) {
                this.escalationLevel = escalationLevel;
                return this;
            }

            /**
             * EscalationUuid.
             */
            public Builder escalationUuid(String escalationUuid) {
                this.escalationUuid = escalationUuid;
                return this;
            }

            /**
             * Range.
             */
            public Builder range(String range) {
                this.range = range;
                return this;
            }

            /**
             * RetriggerMin.
             */
            public Builder retriggerMin(Long retriggerMin) {
                this.retriggerMin = retriggerMin;
                return this;
            }

            public EscalationSetting build() {
                return new EscalationSetting(this);
            } 

        } 

    }
    public static class BlackList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Field")
        @com.aliyun.core.annotation.Validation(required = true)
        private String field;

        @com.aliyun.core.annotation.NameInMap("Op")
        @com.aliyun.core.annotation.Validation(required = true)
        private String op;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private BlackList(Builder builder) {
            this.field = builder.field;
            this.op = builder.op;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlackList create() {
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

            public BlackList build() {
                return new BlackList(this);
            } 

        } 

    }
    public static class WhiteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Field")
        @com.aliyun.core.annotation.Validation(required = true)
        private String field;

        @com.aliyun.core.annotation.NameInMap("Op")
        @com.aliyun.core.annotation.Validation(required = true)
        private String op;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private WhiteList(Builder builder) {
            this.field = builder.field;
            this.op = builder.op;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteList create() {
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

            public WhiteList build() {
                return new WhiteList(this);
            } 

        } 

    }
    public static class FilterSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackList")
        private java.util.List < java.util.List < BlackList> > blackList;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
        private java.util.List < java.util.List < WhiteList> > whiteList;

        private FilterSetting(Builder builder) {
            this.blackList = builder.blackList;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterSetting create() {
            return builder().build();
        }

        /**
         * @return blackList
         */
        public java.util.List < java.util.List < BlackList> > getBlackList() {
            return this.blackList;
        }

        /**
         * @return whiteList
         */
        public java.util.List < java.util.List < WhiteList> > getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private java.util.List < java.util.List < BlackList> > blackList; 
            private java.util.List < java.util.List < WhiteList> > whiteList; 

            /**
             * BlackList.
             */
            public Builder blackList(java.util.List < java.util.List < BlackList> > blackList) {
                this.blackList = blackList;
                return this;
            }

            /**
             * WhiteList.
             */
            public Builder whiteList(java.util.List < java.util.List < WhiteList> > whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public FilterSetting build() {
                return new FilterSetting(this);
            } 

        } 

    }
    public static class GroupingItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keys")
        private java.util.List < String > keys;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private GroupingItems(Builder builder) {
            this.keys = builder.keys;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupingItems create() {
            return builder().build();
        }

        /**
         * @return keys
         */
        public java.util.List < String > getKeys() {
            return this.keys;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < String > keys; 
            private String type; 

            /**
             * Keys.
             */
            public Builder keys(java.util.List < String > keys) {
                this.keys = keys;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public GroupingItems build() {
                return new GroupingItems(this);
            } 

        } 

    }
    public static class GroupingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableRawAlertDispatching")
        private Boolean enableRawAlertDispatching;

        @com.aliyun.core.annotation.NameInMap("GroupingItems")
        private java.util.List < GroupingItems> groupingItems;

        @com.aliyun.core.annotation.NameInMap("PeriodMin")
        private Integer periodMin;

        @com.aliyun.core.annotation.NameInMap("SilenceSec")
        private Integer silenceSec;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private GroupingSetting(Builder builder) {
            this.enableRawAlertDispatching = builder.enableRawAlertDispatching;
            this.groupingItems = builder.groupingItems;
            this.periodMin = builder.periodMin;
            this.silenceSec = builder.silenceSec;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupingSetting create() {
            return builder().build();
        }

        /**
         * @return enableRawAlertDispatching
         */
        public Boolean getEnableRawAlertDispatching() {
            return this.enableRawAlertDispatching;
        }

        /**
         * @return groupingItems
         */
        public java.util.List < GroupingItems> getGroupingItems() {
            return this.groupingItems;
        }

        /**
         * @return periodMin
         */
        public Integer getPeriodMin() {
            return this.periodMin;
        }

        /**
         * @return silenceSec
         */
        public Integer getSilenceSec() {
            return this.silenceSec;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private Boolean enableRawAlertDispatching; 
            private java.util.List < GroupingItems> groupingItems; 
            private Integer periodMin; 
            private Integer silenceSec; 
            private Integer times; 

            /**
             * EnableRawAlertDispatching.
             */
            public Builder enableRawAlertDispatching(Boolean enableRawAlertDispatching) {
                this.enableRawAlertDispatching = enableRawAlertDispatching;
                return this;
            }

            /**
             * GroupingItems.
             */
            public Builder groupingItems(java.util.List < GroupingItems> groupingItems) {
                this.groupingItems = groupingItems;
                return this;
            }

            /**
             * PeriodMin.
             */
            public Builder periodMin(Integer periodMin) {
                this.periodMin = periodMin;
                return this;
            }

            /**
             * SilenceSec.
             */
            public Builder silenceSec(Integer silenceSec) {
                this.silenceSec = silenceSec;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public GroupingSetting build() {
                return new GroupingSetting(this);
            } 

        } 

    }
    public static class PushingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PushingDataFormat")
        private String pushingDataFormat;

        @com.aliyun.core.annotation.NameInMap("Range")
        private String range;

        @com.aliyun.core.annotation.NameInMap("TargetUuids")
        private java.util.List < String > targetUuids;

        @com.aliyun.core.annotation.NameInMap("TemplateUuid")
        private String templateUuid;

        private PushingSetting(Builder builder) {
            this.pushingDataFormat = builder.pushingDataFormat;
            this.range = builder.range;
            this.targetUuids = builder.targetUuids;
            this.templateUuid = builder.templateUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushingSetting create() {
            return builder().build();
        }

        /**
         * @return pushingDataFormat
         */
        public String getPushingDataFormat() {
            return this.pushingDataFormat;
        }

        /**
         * @return range
         */
        public String getRange() {
            return this.range;
        }

        /**
         * @return targetUuids
         */
        public java.util.List < String > getTargetUuids() {
            return this.targetUuids;
        }

        /**
         * @return templateUuid
         */
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        public static final class Builder {
            private String pushingDataFormat; 
            private String range; 
            private java.util.List < String > targetUuids; 
            private String templateUuid; 

            /**
             * PushingDataFormat.
             */
            public Builder pushingDataFormat(String pushingDataFormat) {
                this.pushingDataFormat = pushingDataFormat;
                return this;
            }

            /**
             * Range.
             */
            public Builder range(String range) {
                this.range = range;
                return this;
            }

            /**
             * TargetUuids.
             */
            public Builder targetUuids(java.util.List < String > targetUuids) {
                this.targetUuids = targetUuids;
                return this;
            }

            /**
             * TemplateUuid.
             */
            public Builder templateUuid(String templateUuid) {
                this.templateUuid = templateUuid;
                return this;
            }

            public PushingSetting build() {
                return new PushingSetting(this);
            } 

        } 

    }
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("Value")
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
    public static class Routes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("EscalationUuid")
        private String escalationUuid;

        private Routes(Builder builder) {
            this.conditions = builder.conditions;
            this.escalationUuid = builder.escalationUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routes create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return escalationUuid
         */
        public String getEscalationUuid() {
            return this.escalationUuid;
        }

        public static final class Builder {
            private java.util.List < Conditions> conditions; 
            private String escalationUuid; 

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * EscalationUuid.
             */
            public Builder escalationUuid(String escalationUuid) {
                this.escalationUuid = escalationUuid;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
    public static class RouteSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Routes")
        private java.util.List < Routes> routes;

        private RouteSetting(Builder builder) {
            this.routes = builder.routes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteSetting create() {
            return builder().build();
        }

        /**
         * @return routes
         */
        public java.util.List < Routes> getRoutes() {
            return this.routes;
        }

        public static final class Builder {
            private java.util.List < Routes> routes; 

            /**
             * Routes.
             */
            public Builder routes(java.util.List < Routes> routes) {
                this.routes = routes;
                return this;
            }

            public RouteSetting build() {
                return new RouteSetting(this);
            } 

        } 

    }
}
