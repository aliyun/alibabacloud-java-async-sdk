// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentResourceStruct} extends {@link TeaModel}
 *
 * <p>IncidentResourceStruct</p>
 */
public class IncidentResourceStruct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("incidentId")
    private String incidentId;

    @com.aliyun.core.annotation.NameInMap("incidentResourceId")
    private String incidentResourceId;

    @com.aliyun.core.annotation.NameInMap("resource")
    private IncidentResourceDetail resource;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private IncidentResourceStruct(Builder builder) {
        this.description = builder.description;
        this.incidentId = builder.incidentId;
        this.incidentResourceId = builder.incidentResourceId;
        this.resource = builder.resource;
        this.source = builder.source;
        this.time = builder.time;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentResourceStruct create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return incidentId
     */
    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return incidentResourceId
     */
    public String getIncidentResourceId() {
        return this.incidentResourceId;
    }

    /**
     * @return resource
     */
    public IncidentResourceDetail getResource() {
        return this.resource;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String description; 
        private String incidentId; 
        private String incidentResourceId; 
        private IncidentResourceDetail resource; 
        private String source; 
        private Long time; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(IncidentResourceStruct model) {
            this.description = model.description;
            this.incidentId = model.incidentId;
            this.incidentResourceId = model.incidentResourceId;
            this.resource = model.resource;
            this.source = model.source;
            this.time = model.time;
            this.userId = model.userId;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * incidentId.
         */
        public Builder incidentId(String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        /**
         * incidentResourceId.
         */
        public Builder incidentResourceId(String incidentResourceId) {
            this.incidentResourceId = incidentResourceId;
            return this;
        }

        /**
         * resource.
         */
        public Builder resource(IncidentResourceDetail resource) {
            this.resource = resource;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * time.
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public IncidentResourceStruct build() {
            return new IncidentResourceStruct(this);
        } 

    } 

}
