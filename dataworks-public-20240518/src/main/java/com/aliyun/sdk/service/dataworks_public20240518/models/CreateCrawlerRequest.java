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
 * {@link CreateCrawlerRequest} extends {@link RequestModel}
 *
 * <p>CreateCrawlerRequest</p>
 */
public class CreateCrawlerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAiComment")
    private Boolean enableAiComment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String name;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateCrawlerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataSourceId = builder.dataSourceId;
        this.enableAiComment = builder.enableAiComment;
        this.name = builder.name;
        this.options = builder.options;
        this.resourceGroupId = builder.resourceGroupId;
        this.scheduleConfig = builder.scheduleConfig;
        this.scope = builder.scope;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCrawlerRequest create() {
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
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return enableAiComment
     */
    public Boolean getEnableAiComment() {
        return this.enableAiComment;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateCrawlerRequest, Builder> {
        private String regionId; 
        private Long dataSourceId; 
        private Boolean enableAiComment; 
        private String name; 
        private java.util.Map<String, String> options; 
        private String resourceGroupId; 
        private ScheduleConfig scheduleConfig; 
        private Scope scope; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateCrawlerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataSourceId = request.dataSourceId;
            this.enableAiComment = request.enableAiComment;
            this.name = request.name;
            this.options = request.options;
            this.resourceGroupId = request.resourceGroupId;
            this.scheduleConfig = request.scheduleConfig;
            this.scope = request.scope;
            this.type = request.type;
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
         * <p>The ID of the data source associated with the crawler. The data source must be bound to a DataWorks workspace, and the data source type must match the Type value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable AI metadata descriptions. This parameter is supported only when the SupportAiComment value returned by GetCrawlerTypeCapabilities is true.</p>
         */
        public Builder enableAiComment(Boolean enableAiComment) {
            this.putBodyParameter("EnableAiComment", enableAiComment);
            this.enableAiComment = enableAiComment;
            return this;
        }

        /**
         * <p>The name of the metadata crawler. The name can be up to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example_crawler</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The extended configuration for the crawler type. The key names, value types, required fields, default values, and valid values are determined by the SupportedOptionKeys value returned by GetCrawlerTypeCapabilities.</p>
         */
        public Builder options(java.util.Map<String, String> options) {
            String optionsShrink = shrink(options, "Options", "json");
            this.putBodyParameter("Options", optionsShrink);
            this.options = options;
            return this;
        }

        /**
         * <p>The ID of the Serverless 2.0 resource group used to run the collection task. Whether this parameter is required depends on the RequireResourceGroup value returned by GetCrawlerTypeCapabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_1234567890123456_1234567890</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The scheduling configuration. If this parameter is not specified, manual scheduling is used.</p>
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putBodyParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * <p>The collection scope configuration. If this parameter is not specified, the DefaultScopeUnit value returned by GetCrawlerTypeCapabilities is used.</p>
         */
        public Builder scope(Scope scope) {
            String scopeShrink = shrink(scope, "Scope", "json");
            this.putBodyParameter("Scope", scopeShrink);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The crawler type. Call GetCrawlerTypeCapabilities to query the valid values supported in the current region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>starrocks</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateCrawlerRequest build() {
            return new CreateCrawlerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCrawlerRequest} extends {@link TeaModel}
     *
     * <p>CreateCrawlerRequest</p>
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
             * <p>The six-field cron expression for periodic scheduling. This parameter is required when Type is set to NORMAL. The seconds field must be 0, and the scheduling frequency cannot exceed once per hour.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 ? * *</p>
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * <p>The scheduling type. MANUAL indicates manual execution, and NORMAL indicates periodic scheduling. Data sources in the development environment support only MANUAL. Whether NORMAL is available depends on the SupportSchedule value returned by GetCrawlerTypeCapabilities.</p>
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
     * {@link CreateCrawlerRequest} extends {@link TeaModel}
     *
     * <p>CreateCrawlerRequest</p>
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
             * <p>The regular expression used to exclude objects from the collection scope. This parameter is supported only when the SupportExcludeRegex value returned by GetCrawlerTypeCapabilities is true.</p>
             * 
             * <strong>example:</strong>
             * <p>^tmp_.*</p>
             */
            public Builder excludeRegex(String excludeRegex) {
                this.excludeRegex = excludeRegex;
                return this;
            }

            /**
             * <p>The list of database names. This parameter is supported only when Unit is set to DATABASE. A maximum of 1000 entries are allowed. Names cannot be empty or duplicated.</p>
             */
            public Builder items(java.util.List<String> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The collection scope granularity. Valid values are determined by the SupportedScopeUnits value returned by GetCrawlerTypeCapabilities.</p>
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
