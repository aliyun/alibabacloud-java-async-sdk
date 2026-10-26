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
 * {@link CreateInstanceInspectionRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceInspectionRequest</p>
 */
public class CreateInstanceInspectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("items")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private ResourceScope resourceScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schedule")
    @com.aliyun.core.annotation.Validation(required = true)
    private Schedule schedule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateInstanceInspectionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.items = builder.items;
        this.resourceScope = builder.resourceScope;
        this.schedule = builder.schedule;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceInspectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateInstanceInspectionRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private java.util.List<Items> items; 
        private ResourceScope resourceScope; 
        private Schedule schedule; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceInspectionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.items = request.items;
            this.resourceScope = request.resourceScope;
            this.schedule = request.schedule;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-example</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inspection-request-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.putBodyParameter("items", items);
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
            this.putBodyParameter("resourceScope", resourceScope);
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
            this.putBodyParameter("schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateInstanceInspectionRequest build() {
            return new CreateInstanceInspectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceInspectionRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceInspectionRequest</p>
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
     * {@link CreateInstanceInspectionRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceInspectionRequest</p>
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
     * {@link CreateInstanceInspectionRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceInspectionRequest</p>
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
}
