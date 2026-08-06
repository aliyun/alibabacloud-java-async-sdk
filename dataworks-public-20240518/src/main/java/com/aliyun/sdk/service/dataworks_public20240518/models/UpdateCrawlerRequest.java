// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateCrawlerRequest} extends {@link RequestModel}
 *
 * <p>UpdateCrawlerRequest</p>
 */
public class UpdateCrawlerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAiComment")
    private Boolean enableAiComment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private java.util.Map<String, String> options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scope")
    private Scope scope;

    private UpdateCrawlerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.enableAiComment = builder.enableAiComment;
        this.id = builder.id;
        this.options = builder.options;
        this.resourceGroupId = builder.resourceGroupId;
        this.scheduleConfig = builder.scheduleConfig;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCrawlerRequest create() {
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
     * @return enableAiComment
     */
    public Boolean getEnableAiComment() {
        return this.enableAiComment;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return options
     */
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return scope
     */
    public Scope getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<UpdateCrawlerRequest, Builder> {
        private String regionId; 
        private Boolean enableAiComment; 
        private Long id; 
        private java.util.Map<String, String> options; 
        private String resourceGroupId; 
        private ScheduleConfig scheduleConfig; 
        private Scope scope; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCrawlerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.enableAiComment = request.enableAiComment;
            this.id = request.id;
            this.options = request.options;
            this.resourceGroupId = request.resourceGroupId;
            this.scheduleConfig = request.scheduleConfig;
            this.scope = request.scope;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EnableAiComment.
         */
        public Builder enableAiComment(Boolean enableAiComment) {
            this.putBodyParameter("EnableAiComment", enableAiComment);
            this.enableAiComment = enableAiComment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(java.util.Map<String, String> options) {
            String optionsShrink = shrink(options, "Options", "json");
            this.putBodyParameter("Options", optionsShrink);
            this.options = options;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ScheduleConfig.
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putBodyParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(Scope scope) {
            String scopeShrink = shrink(scope, "Scope", "json");
            this.putBodyParameter("Scope", scopeShrink);
            this.scope = scope;
            return this;
        }

        @Override
        public UpdateCrawlerRequest build() {
            return new UpdateCrawlerRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCrawlerRequest} extends {@link TeaModel}
     *
     * <p>UpdateCrawlerRequest</p>
     */
    public static class ScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronExpress")
        private String cronExpress;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private ScheduleConfig(Builder builder) {
            this.cronExpress = builder.cronExpress;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return cronExpress
         */
        public String getCronExpress() {
            return this.cronExpress;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cronExpress; 
            private String type; 

            private Builder() {
            } 

            private Builder(ScheduleConfig model) {
                this.cronExpress = model.cronExpress;
                this.type = model.type;
            } 

            /**
             * CronExpress.
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ScheduleConfig build() {
                return new ScheduleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateCrawlerRequest} extends {@link TeaModel}
     *
     * <p>UpdateCrawlerRequest</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExcludeRegex")
        private String excludeRegex;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<String> items;

        @com.aliyun.core.annotation.NameInMap("Unit")
        @com.aliyun.core.annotation.Validation(required = true)
        private String unit;

        private Scope(Builder builder) {
            this.excludeRegex = builder.excludeRegex;
            this.items = builder.items;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
        }

        /**
         * @return excludeRegex
         */
        public String getExcludeRegex() {
            return this.excludeRegex;
        }

        /**
         * @return items
         */
        public java.util.List<String> getItems() {
            return this.items;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String excludeRegex; 
            private java.util.List<String> items; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Scope model) {
                this.excludeRegex = model.excludeRegex;
                this.items = model.items;
                this.unit = model.unit;
            } 

            /**
             * ExcludeRegex.
             */
            public Builder excludeRegex(String excludeRegex) {
                this.excludeRegex = excludeRegex;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List<String> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DATABASE</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
}
