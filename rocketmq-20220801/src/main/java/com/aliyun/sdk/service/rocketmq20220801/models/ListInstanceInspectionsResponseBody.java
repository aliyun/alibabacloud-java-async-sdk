// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link ListInstanceInspectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceInspectionsResponseBody</p>
 */
public class ListInstanceInspectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListInstanceInspectionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceInspectionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
        } 

        private Builder(ListInstanceInspectionsResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListInstanceInspectionsResponseBody build() {
            return new ListInstanceInspectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceInspectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parameters")
        @com.aliyun.core.annotation.Validation(required = true)
        private Object parameters;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateCode;

        private Items(Builder builder) {
            this.parameters = builder.parameters;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public Object getParameters() {
            return this.parameters;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private Object parameters; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.parameters = model.parameters;
                this.templateCode = model.templateCode;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;lookback&quot;:&quot;1h&quot;,&quot;consumerDelayThresholdSeconds&quot;:600}</p>
             */
            public Builder parameters(Object parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.consumer-health</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceInspectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionsResponseBody</p>
     */
    public static class ResourceScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerGroups")
        private java.util.List<String> consumerGroups;

        @com.aliyun.core.annotation.NameInMap("mode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mode;

        @com.aliyun.core.annotation.NameInMap("topics")
        private java.util.List<String> topics;

        private ResourceScope(Builder builder) {
            this.consumerGroups = builder.consumerGroups;
            this.mode = builder.mode;
            this.topics = builder.topics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceScope create() {
            return builder().build();
        }

        /**
         * @return consumerGroups
         */
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return topics
         */
        public java.util.List<String> getTopics() {
            return this.topics;
        }

        public static final class Builder {
            private java.util.List<String> consumerGroups; 
            private String mode; 
            private java.util.List<String> topics; 

            private Builder() {
            } 

            private Builder(ResourceScope model) {
                this.consumerGroups = model.consumerGroups;
                this.mode = model.mode;
                this.topics = model.topics;
            } 

            /**
             * consumerGroups.
             */
            public Builder consumerGroups(java.util.List<String> consumerGroups) {
                this.consumerGroups = consumerGroups;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * topics.
             */
            public Builder topics(java.util.List<String> topics) {
                this.topics = topics;
                return this;
            }

            public ResourceScope build() {
                return new ResourceScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceInspectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionsResponseBody</p>
     */
    public static class Schedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cron")
        @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
        private String cron;

        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        private Schedule(Builder builder) {
            this.cron = builder.cron;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedule create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String cron; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(Schedule model) {
                this.cron = model.cron;
                this.enabled = model.enabled;
            } 

            /**
             * cron.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Schedule build() {
                return new Schedule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceInspectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionsResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("resourceScope")
        @com.aliyun.core.annotation.Validation(required = true)
        private ResourceScope resourceScope;

        @com.aliyun.core.annotation.NameInMap("schedule")
        @com.aliyun.core.annotation.Validation(required = true)
        private Schedule schedule;

        private Config(Builder builder) {
            this.items = builder.items;
            this.resourceScope = builder.resourceScope;
            this.schedule = builder.schedule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return resourceScope
         */
        public ResourceScope getResourceScope() {
            return this.resourceScope;
        }

        /**
         * @return schedule
         */
        public Schedule getSchedule() {
            return this.schedule;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private ResourceScope resourceScope; 
            private Schedule schedule; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.items = model.items;
                this.resourceScope = model.resourceScope;
                this.schedule = model.schedule;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
             */
            public Builder resourceScope(ResourceScope resourceScope) {
                this.resourceScope = resourceScope;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
             */
            public Builder schedule(Schedule schedule) {
                this.schedule = schedule;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceInspectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionsResponseBody</p>
     */
    public static class DataItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resourceCount")
        private Long resourceCount;

        @com.aliyun.core.annotation.NameInMap("resourceTypes")
        private java.util.List<String> resourceTypes;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        private DataItems(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.resourceCount = builder.resourceCount;
            this.resourceTypes = builder.resourceTypes;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataItems create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceCount
         */
        public Long getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return resourceTypes
         */
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private Long resourceCount; 
            private java.util.List<String> resourceTypes; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(DataItems model) {
                this.description = model.description;
                this.name = model.name;
                this.resourceCount = model.resourceCount;
                this.resourceTypes = model.resourceTypes;
                this.templateCode = model.templateCode;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * resourceCount.
             */
            public Builder resourceCount(Long resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * resourceTypes.
             */
            public Builder resourceTypes(java.util.List<String> resourceTypes) {
                this.resourceTypes = resourceTypes;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.consumer-health</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public DataItems build() {
                return new DataItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceInspectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("configured")
        private Boolean configured;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<DataItems> items;

        @com.aliyun.core.annotation.NameInMap("nextRunAt")
        private String nextRunAt;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("revision")
        private Long revision;

        private Data(Builder builder) {
            this.config = builder.config;
            this.configured = builder.configured;
            this.instanceId = builder.instanceId;
            this.items = builder.items;
            this.nextRunAt = builder.nextRunAt;
            this.regionId = builder.regionId;
            this.revision = builder.revision;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return configured
         */
        public Boolean getConfigured() {
            return this.configured;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return items
         */
        public java.util.List<DataItems> getItems() {
            return this.items;
        }

        /**
         * @return nextRunAt
         */
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return revision
         */
        public Long getRevision() {
            return this.revision;
        }

        public static final class Builder {
            private Config config; 
            private Boolean configured; 
            private String instanceId; 
            private java.util.List<DataItems> items; 
            private String nextRunAt; 
            private String regionId; 
            private Long revision; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.config = model.config;
                this.configured = model.configured;
                this.instanceId = model.instanceId;
                this.items = model.items;
                this.nextRunAt = model.nextRunAt;
                this.regionId = model.regionId;
                this.revision = model.revision;
            } 

            /**
             * config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * configured.
             */
            public Builder configured(Boolean configured) {
                this.configured = configured;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
             */
            public Builder items(java.util.List<DataItems> items) {
                this.items = items;
                return this;
            }

            /**
             * nextRunAt.
             */
            public Builder nextRunAt(String nextRunAt) {
                this.nextRunAt = nextRunAt;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * revision.
             */
            public Builder revision(Long revision) {
                this.revision = revision;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
