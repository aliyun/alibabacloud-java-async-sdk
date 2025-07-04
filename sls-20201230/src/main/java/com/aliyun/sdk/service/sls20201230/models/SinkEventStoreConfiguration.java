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
 * {@link SinkEventStoreConfiguration} extends {@link TeaModel}
 *
 * <p>SinkEventStoreConfiguration</p>
 */
public class SinkEventStoreConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("eventStore")
    private String eventStore;

    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    private SinkEventStoreConfiguration(Builder builder) {
        this.enabled = builder.enabled;
        this.endpoint = builder.endpoint;
        this.eventStore = builder.eventStore;
        this.project = builder.project;
        this.roleArn = builder.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkEventStoreConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return eventStore
     */
    public String getEventStore() {
        return this.eventStore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static final class Builder {
        private Boolean enabled; 
        private String endpoint; 
        private String eventStore; 
        private String project; 
        private String roleArn; 

        private Builder() {
        } 

        private Builder(SinkEventStoreConfiguration model) {
            this.enabled = model.enabled;
            this.endpoint = model.endpoint;
            this.eventStore = model.eventStore;
            this.project = model.project;
            this.roleArn = model.roleArn;
        } 

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * eventStore.
         */
        public Builder eventStore(String eventStore) {
            this.eventStore = eventStore;
            return this;
        }

        /**
         * project.
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public SinkEventStoreConfiguration build() {
            return new SinkEventStoreConfiguration(this);
        } 

    } 

}
