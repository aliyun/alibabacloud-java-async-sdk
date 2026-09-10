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
 * {@link EventResourceForEventView} extends {@link TeaModel}
 *
 * <p>EventResourceForEventView</p>
 */
public class EventResourceForEventView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("entity")
    private Entity entity;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.Map<String, ?> tags;

    private EventResourceForEventView(Builder builder) {
        this.entity = builder.entity;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventResourceForEventView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entity
     */
    public Entity getEntity() {
        return this.entity;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private Entity entity; 
        private java.util.Map<String, ?> tags; 

        private Builder() {
        } 

        private Builder(EventResourceForEventView model) {
            this.entity = model.entity;
            this.tags = model.tags;
        } 

        /**
         * <p>The resource entity.</p>
         */
        public Builder entity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;env&quot;: &quot;prod&quot;, &quot;project&quot;: &quot;payment-gateway&quot; }</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }

        public EventResourceForEventView build() {
            return new EventResourceForEventView(this);
        } 

    } 

    /**
     * 
     * {@link EventResourceForEventView} extends {@link TeaModel}
     *
     * <p>EventResourceForEventView</p>
     */
    public static class Entity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("prop")
        private java.util.Map<String, ?> prop;

        private Entity(Builder builder) {
            this.domain = builder.domain;
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.prop = builder.prop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entity create() {
            return builder().build();
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
         * @return prop
         */
        public java.util.Map<String, ?> getProp() {
            return this.prop;
        }

        public static final class Builder {
            private String domain; 
            private String entityId; 
            private String entityType; 
            private java.util.Map<String, ?> prop; 

            private Builder() {
            } 

            private Builder(Entity model) {
                this.domain = model.domain;
                this.entityId = model.entityId;
                this.entityType = model.entityType;
                this.prop = model.prop;
            } 

            /**
             * <p>The product domain to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;ECS&quot;</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;i-bp123456&quot;</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The specific type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;Instance&quot;</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>Extra properties of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;name&quot;: &quot;web-server-01&quot;, &quot;ip&quot;: &quot;10.0.0.1&quot; }</p>
             */
            public Builder prop(java.util.Map<String, ?> prop) {
                this.prop = prop;
                return this;
            }

            public Entity build() {
                return new Entity(this);
            } 

        } 

    }
}
