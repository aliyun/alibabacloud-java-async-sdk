// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateAlertReq} extends {@link TeaModel}
 *
 * <p>UpdateAlertReq</p>
 */
public class UpdateAlertReq extends TeaModel {
    @NameInMap("configuration")
    @Validation(required = true)
    private AlertConfiguration configuration;

    @NameInMap("description")
    private String description;

    @NameInMap("displayName")
    @Validation(required = true)
    private String displayName;

    @NameInMap("schedule")
    @Validation(required = true)
    private Schedule schedule;

    private UpdateAlertReq(Builder builder) {
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertReq create() {
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
     * @return schedule
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    public static final class Builder {
        private AlertConfiguration configuration; 
        private String description; 
        private String displayName; 
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
         * schedule.
         */
        public Builder schedule(Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

        public UpdateAlertReq build() {
            return new UpdateAlertReq(this);
        } 

    } 

}
