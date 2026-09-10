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
 * {@link EventResourceForIncidentView} extends {@link TeaModel}
 *
 * <p>EventResourceForIncidentView</p>
 */
public class EventResourceForIncidentView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("entityId")
    private String entityId;

    @com.aliyun.core.annotation.NameInMap("entityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("probs")
    private String probs;

    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    private EventResourceForIncidentView(Builder builder) {
        this.domain = builder.domain;
        this.entityId = builder.entityId;
        this.entityType = builder.entityType;
        this.probs = builder.probs;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventResourceForIncidentView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return probs
     */
    public String getProbs() {
        return this.probs;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String domain; 
        private String entityId; 
        private String entityType; 
        private String probs; 
        private String tags; 

        private Builder() {
        } 

        private Builder(EventResourceForIncidentView model) {
            this.domain = model.domain;
            this.entityId = model.entityId;
            this.entityType = model.entityType;
            this.probs = model.probs;
            this.tags = model.tags;
        } 

        /**
         * <p>The domain of the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>rum</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Instance&quot;</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The string that describes the properties of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;name&quot;:&quot;web-server-01&quot;,&quot;ip&quot;:&quot;10.0.0.1&quot;}&quot;</p>
         */
        public Builder probs(String probs) {
            this.probs = probs;
            return this;
        }

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;value\&quot;:\&quot;测试\&quot;,\&quot;key\&quot;:\&quot;环境\&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        public EventResourceForIncidentView build() {
            return new EventResourceForIncidentView(this);
        } 

    } 

}
