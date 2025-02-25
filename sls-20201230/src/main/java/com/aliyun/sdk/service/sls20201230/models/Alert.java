// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link Alert} extends {@link TeaModel}
 *
 * <p>Alert</p>
 */
public class Alert extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private AlertConfiguration configuration;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private Long lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("schedule")
    @com.aliyun.core.annotation.Validation(required = true)
    private Schedule schedule;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private Alert(Builder builder) {
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

    public static Alert create() {
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alertNameExample</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alert-123456</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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

        public Alert build() {
            return new Alert(this);
        } 

    } 

}
