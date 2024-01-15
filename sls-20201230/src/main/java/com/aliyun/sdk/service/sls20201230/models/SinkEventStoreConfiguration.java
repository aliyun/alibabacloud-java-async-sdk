// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link SinkEventStoreConfiguration} extends {@link TeaModel}
 *
 * <p>SinkEventStoreConfiguration</p>
 */
public class SinkEventStoreConfiguration extends TeaModel {
    @NameInMap("enabled")
    private Boolean enabled;

    @NameInMap("endpoint")
    private String endpoint;

    @NameInMap("eventStore")
    private String eventStore;

    @NameInMap("project")
    private String project;

    @NameInMap("roleArn")
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
