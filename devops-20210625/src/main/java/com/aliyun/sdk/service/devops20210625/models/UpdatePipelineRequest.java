// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePipelineRequest} extends {@link RequestModel}
 *
 * <p>UpdatePipelineRequest</p>
 */
public class UpdatePipelineRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("basicInfo")
    @Validation(required = true)
    private BasicInfo basicInfo;

    @Body
    @NameInMap("pipelineYaml")
    @Validation(required = true)
    private String pipelineYaml;

    @Body
    @NameInMap("settings")
    private Settings settings;

    @Body
    @NameInMap("triggerInfo")
    private TriggerInfo triggerInfo;

    private UpdatePipelineRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.basicInfo = builder.basicInfo;
        this.pipelineYaml = builder.pipelineYaml;
        this.settings = builder.settings;
        this.triggerInfo = builder.triggerInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePipelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return basicInfo
     */
    public BasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    /**
     * @return pipelineYaml
     */
    public String getPipelineYaml() {
        return this.pipelineYaml;
    }

    /**
     * @return settings
     */
    public Settings getSettings() {
        return this.settings;
    }

    /**
     * @return triggerInfo
     */
    public TriggerInfo getTriggerInfo() {
        return this.triggerInfo;
    }

    public static final class Builder extends Request.Builder<UpdatePipelineRequest, Builder> {
        private String organizationId; 
        private BasicInfo basicInfo; 
        private String pipelineYaml; 
        private Settings settings; 
        private TriggerInfo triggerInfo; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePipelineRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.basicInfo = request.basicInfo;
            this.pipelineYaml = request.pipelineYaml;
            this.settings = request.settings;
            this.triggerInfo = request.triggerInfo;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * basicInfo.
         */
        public Builder basicInfo(BasicInfo basicInfo) {
            this.putBodyParameter("basicInfo", basicInfo);
            this.basicInfo = basicInfo;
            return this;
        }

        /**
         * pipelineYaml.
         */
        public Builder pipelineYaml(String pipelineYaml) {
            this.putBodyParameter("pipelineYaml", pipelineYaml);
            this.pipelineYaml = pipelineYaml;
            return this;
        }

        /**
         * settings.
         */
        public Builder settings(Settings settings) {
            this.putBodyParameter("settings", settings);
            this.settings = settings;
            return this;
        }

        /**
         * triggerInfo.
         */
        public Builder triggerInfo(TriggerInfo triggerInfo) {
            this.putBodyParameter("triggerInfo", triggerInfo);
            this.triggerInfo = triggerInfo;
            return this;
        }

        @Override
        public UpdatePipelineRequest build() {
            return new UpdatePipelineRequest(this);
        } 

    } 

    public static class BasicInfo extends TeaModel {
        @NameInMap("envId")
        private Long envId;

        @NameInMap("groupId")
        private Long groupId;

        @NameInMap("name")
        @Validation(required = true)
        private String name;

        @NameInMap("pipelineId")
        @Validation(required = true)
        private Long pipelineId;

        @NameInMap("tagIds")
        private String tagIds;

        private BasicInfo(Builder builder) {
            this.envId = builder.envId;
            this.groupId = builder.groupId;
            this.name = builder.name;
            this.pipelineId = builder.pipelineId;
            this.tagIds = builder.tagIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicInfo create() {
            return builder().build();
        }

        /**
         * @return envId
         */
        public Long getEnvId() {
            return this.envId;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pipelineId
         */
        public Long getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return tagIds
         */
        public String getTagIds() {
            return this.tagIds;
        }

        public static final class Builder {
            private Long envId; 
            private Long groupId; 
            private String name; 
            private Long pipelineId; 
            private String tagIds; 

            /**
             * envId.
             */
            public Builder envId(Long envId) {
                this.envId = envId;
                return this;
            }

            /**
             * groupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
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
             * pipelineId.
             */
            public Builder pipelineId(Long pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * tagIds.
             */
            public Builder tagIds(String tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            public BasicInfo build() {
                return new BasicInfo(this);
            } 

        } 

    }
    public static class Caches extends TeaModel {
        @NameInMap("desc")
        private String desc;

        @NameInMap("directory")
        private String directory;

        @NameInMap("disable")
        private Boolean disable;

        private Caches(Builder builder) {
            this.desc = builder.desc;
            this.directory = builder.directory;
            this.disable = builder.disable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Caches create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return disable
         */
        public Boolean getDisable() {
            return this.disable;
        }

        public static final class Builder {
            private String desc; 
            private String directory; 
            private Boolean disable; 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * disable.
             */
            public Builder disable(Boolean disable) {
                this.disable = disable;
                return this;
            }

            public Caches build() {
                return new Caches(this);
            } 

        } 

    }
    public static class GlobalParams extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("mask")
        private Boolean mask;

        @NameInMap("runningConfig")
        private Boolean runningConfig;

        @NameInMap("value")
        private String value;

        private GlobalParams(Builder builder) {
            this.key = builder.key;
            this.mask = builder.mask;
            this.runningConfig = builder.runningConfig;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalParams create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return mask
         */
        public Boolean getMask() {
            return this.mask;
        }

        /**
         * @return runningConfig
         */
        public Boolean getRunningConfig() {
            return this.runningConfig;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private Boolean mask; 
            private Boolean runningConfig; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * mask.
             */
            public Builder mask(Boolean mask) {
                this.mask = mask;
                return this;
            }

            /**
             * runningConfig.
             */
            public Builder runningConfig(Boolean runningConfig) {
                this.runningConfig = runningConfig;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public GlobalParams build() {
                return new GlobalParams(this);
            } 

        } 

    }
    public static class Settings extends TeaModel {
        @NameInMap("caches")
        private java.util.List < Caches> caches;

        @NameInMap("globalParams")
        private java.util.List < GlobalParams> globalParams;

        @NameInMap("runnerCacheMode")
        private String runnerCacheMode;

        private Settings(Builder builder) {
            this.caches = builder.caches;
            this.globalParams = builder.globalParams;
            this.runnerCacheMode = builder.runnerCacheMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Settings create() {
            return builder().build();
        }

        /**
         * @return caches
         */
        public java.util.List < Caches> getCaches() {
            return this.caches;
        }

        /**
         * @return globalParams
         */
        public java.util.List < GlobalParams> getGlobalParams() {
            return this.globalParams;
        }

        /**
         * @return runnerCacheMode
         */
        public String getRunnerCacheMode() {
            return this.runnerCacheMode;
        }

        public static final class Builder {
            private java.util.List < Caches> caches; 
            private java.util.List < GlobalParams> globalParams; 
            private String runnerCacheMode; 

            /**
             * caches.
             */
            public Builder caches(java.util.List < Caches> caches) {
                this.caches = caches;
                return this;
            }

            /**
             * globalParams.
             */
            public Builder globalParams(java.util.List < GlobalParams> globalParams) {
                this.globalParams = globalParams;
                return this;
            }

            /**
             * runnerCacheMode.
             */
            public Builder runnerCacheMode(String runnerCacheMode) {
                this.runnerCacheMode = runnerCacheMode;
                return this;
            }

            public Settings build() {
                return new Settings(this);
            } 

        } 

    }
    public static class Scheduled extends TeaModel {
        @NameInMap("daysOfWeek")
        private String daysOfWeek;

        @NameInMap("fixedTime")
        private String fixedTime;

        @NameInMap("from")
        private String from;

        @NameInMap("interval")
        private Integer interval;

        @NameInMap("onlySourceChange")
        private Boolean onlySourceChange;

        @NameInMap("to")
        private String to;

        @NameInMap("type")
        private String type;

        private Scheduled(Builder builder) {
            this.daysOfWeek = builder.daysOfWeek;
            this.fixedTime = builder.fixedTime;
            this.from = builder.from;
            this.interval = builder.interval;
            this.onlySourceChange = builder.onlySourceChange;
            this.to = builder.to;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scheduled create() {
            return builder().build();
        }

        /**
         * @return daysOfWeek
         */
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        /**
         * @return fixedTime
         */
        public String getFixedTime() {
            return this.fixedTime;
        }

        /**
         * @return from
         */
        public String getFrom() {
            return this.from;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return onlySourceChange
         */
        public Boolean getOnlySourceChange() {
            return this.onlySourceChange;
        }

        /**
         * @return to
         */
        public String getTo() {
            return this.to;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String daysOfWeek; 
            private String fixedTime; 
            private String from; 
            private Integer interval; 
            private Boolean onlySourceChange; 
            private String to; 
            private String type; 

            /**
             * daysOfWeek.
             */
            public Builder daysOfWeek(String daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * fixedTime.
             */
            public Builder fixedTime(String fixedTime) {
                this.fixedTime = fixedTime;
                return this;
            }

            /**
             * from.
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * onlySourceChange.
             */
            public Builder onlySourceChange(Boolean onlySourceChange) {
                this.onlySourceChange = onlySourceChange;
                return this;
            }

            /**
             * to.
             */
            public Builder to(String to) {
                this.to = to;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Scheduled build() {
                return new Scheduled(this);
            } 

        } 

    }
    public static class TriggerInfo extends TeaModel {
        @NameInMap("scheduled")
        private Scheduled scheduled;

        @NameInMap("webhookEnable")
        private Boolean webhookEnable;

        private TriggerInfo(Builder builder) {
            this.scheduled = builder.scheduled;
            this.webhookEnable = builder.webhookEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerInfo create() {
            return builder().build();
        }

        /**
         * @return scheduled
         */
        public Scheduled getScheduled() {
            return this.scheduled;
        }

        /**
         * @return webhookEnable
         */
        public Boolean getWebhookEnable() {
            return this.webhookEnable;
        }

        public static final class Builder {
            private Scheduled scheduled; 
            private Boolean webhookEnable; 

            /**
             * scheduled.
             */
            public Builder scheduled(Scheduled scheduled) {
                this.scheduled = scheduled;
                return this;
            }

            /**
             * webhookEnable.
             */
            public Builder webhookEnable(Boolean webhookEnable) {
                this.webhookEnable = webhookEnable;
                return this;
            }

            public TriggerInfo build() {
                return new TriggerInfo(this);
            } 

        } 

    }
}
