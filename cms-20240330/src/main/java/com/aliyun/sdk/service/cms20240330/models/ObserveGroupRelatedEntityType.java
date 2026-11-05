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
 * {@link ObserveGroupRelatedEntityType} extends {@link TeaModel}
 *
 * <p>ObserveGroupRelatedEntityType</p>
 */
public class ObserveGroupRelatedEntityType extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cnName")
    private String cnName;

    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("enName")
    private String enName;

    @com.aliyun.core.annotation.NameInMap("entityGroup")
    private String entityGroup;

    @com.aliyun.core.annotation.NameInMap("relation")
    private String relation;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private ObserveGroupRelatedEntityType(Builder builder) {
        this.cnName = builder.cnName;
        this.direction = builder.direction;
        this.domain = builder.domain;
        this.enName = builder.enName;
        this.entityGroup = builder.entityGroup;
        this.relation = builder.relation;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveGroupRelatedEntityType create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cnName
     */
    public String getCnName() {
        return this.cnName;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return enName
     */
    public String getEnName() {
        return this.enName;
    }

    /**
     * @return entityGroup
     */
    public String getEntityGroup() {
        return this.entityGroup;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String cnName; 
        private String direction; 
        private String domain; 
        private String enName; 
        private String entityGroup; 
        private String relation; 
        private String type; 
        private String version; 

        private Builder() {
        } 

        private Builder(ObserveGroupRelatedEntityType model) {
            this.cnName = model.cnName;
            this.direction = model.direction;
            this.domain = model.domain;
            this.enName = model.enName;
            this.entityGroup = model.entityGroup;
            this.relation = model.relation;
            this.type = model.type;
            this.version = model.version;
        } 

        /**
         * <p>The Chinese name of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>RocketMQ Topic</p>
         */
        public Builder cnName(String cnName) {
            this.cnName = cnName;
            return this;
        }

        /**
         * <p>The association direction, which is currently fixed as outgoing, indicating that associated entities are searched along the direct outgoing edges of the primary entity.</p>
         * 
         * <strong>example:</strong>
         * <p>outgoing</p>
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * <p>The entity domain.</p>
         * 
         * <strong>example:</strong>
         * <p>acs</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The English name of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>RocketMQ Topic</p>
         */
        public Builder enName(String enName) {
            this.enName = enName;
            return this;
        }

        /**
         * <p>The CommonSchema group to which the entity belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>acs-rocketmq</p>
         */
        public Builder entityGroup(String entityGroup) {
            this.entityGroup = entityGroup;
            return this;
        }

        /**
         * <p>The direct outgoing edge relationship, such as use, run_on, calls, or contains.</p>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        /**
         * <p>The associated entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>acs.rocketmq.topic</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The effective CommonSchema version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.14</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public ObserveGroupRelatedEntityType build() {
            return new ObserveGroupRelatedEntityType(this);
        } 

    } 

}
