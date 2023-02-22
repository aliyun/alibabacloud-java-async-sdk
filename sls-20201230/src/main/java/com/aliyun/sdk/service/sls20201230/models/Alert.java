// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Alert} extends {@link TeaModel}
 *
 * <p>Alert</p>
 */
public class Alert extends TeaModel {
    @NameInMap("configuration")
    @Validation(required = true)
    private Configuration configuration;

    @NameInMap("description")
    private String description;

    @NameInMap("displayName")
    @Validation(required = true)
    private String displayName;

    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("schedule")
    @Validation(required = true)
    private Schedule schedule;

    @NameInMap("state")
    private String state;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private Alert(Builder builder) {
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.name = builder.name;
        this.schedule = builder.schedule;
        this.state = builder.state;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Alert create() {
        return builder().build();
    }

    /**
     * @return configuration
     */
    public Configuration getConfiguration() {
        return this.configuration;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return schedule
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Configuration configuration; 
        private String description; 
        private String displayName; 
        private String name; 
        private Schedule schedule; 
        private String state; 
        private String type; 

        /**
         * configuration.
         */
        public Builder configuration(Configuration configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * 兼容字段，设置为空字符串即可。
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 告警监控规则名称。在告警列表中展示。
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * 告警监控规则ID。在URL中展示。
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * schedule.
         */
        public Builder schedule(Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * 告警监控规则的状态。取值如下： Enabled：启用。 Disabled（默认值）：禁用。
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * 固定为Alert。
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Alert build() {
            return new Alert(this);
        } 

    } 

}
