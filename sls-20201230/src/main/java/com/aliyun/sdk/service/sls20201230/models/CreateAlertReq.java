// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateAlertReq} extends {@link TeaModel}
 *
 * <p>CreateAlertReq</p>
 */
public class CreateAlertReq extends TeaModel {
    @NameInMap("configuration")
    @Validation(required = true)
    private AlertConfiguration configuration;

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

    private CreateAlertReq(Builder builder) {
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.name = builder.name;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertReq create() {
        return builder().build();
    }

    /**
     * @return configuration
     */
    public AlertConfiguration getConfiguration() {
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

    public static final class Builder {
        private AlertConfiguration configuration; 
        private String description; 
        private String displayName; 
        private String name; 
        private Schedule schedule; 

        /**
         * configuration.
         */
        public Builder configuration(AlertConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
         * schedule.
         */
        public Builder schedule(Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

        public CreateAlertReq build() {
            return new CreateAlertReq(this);
        } 

    } 

}
