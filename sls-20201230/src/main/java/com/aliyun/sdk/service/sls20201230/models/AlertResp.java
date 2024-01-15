// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link AlertResp} extends {@link TeaModel}
 *
 * <p>AlertResp</p>
 */
public class AlertResp extends TeaModel {
    @NameInMap("configuration")
    @Validation(required = true)
    private AlertConfiguration configuration;

    @NameInMap("createTime")
    private Long createTime;

    @NameInMap("description")
    private String description;

    @NameInMap("displayName")
    @Validation(required = true)
    private String displayName;

    @NameInMap("lastModifiedTime")
    private Long lastModifiedTime;

    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("schedule")
    @Validation(required = true)
    private Schedule schedule;

    @NameInMap("status")
    private String status;

    private AlertResp(Builder builder) {
        this.configuration = builder.configuration;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.name = builder.name;
        this.schedule = builder.schedule;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertResp create() {
        return builder().build();
    }

    /**
     * @return configuration
     */
    public AlertConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
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
     * @return lastModifiedTime
     */
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private AlertConfiguration configuration; 
        private Long createTime; 
        private String description; 
        private String displayName; 
        private Long lastModifiedTime; 
        private String name; 
        private Schedule schedule; 
        private String status; 

        /**
         * configuration.
         */
        public Builder configuration(AlertConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
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
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
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

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AlertResp build() {
            return new AlertResp(this);
        } 

    } 

}
