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
 * {@link ObserveGroupEntitySummary} extends {@link TeaModel}
 *
 * <p>ObserveGroupEntitySummary</p>
 */
public class ObserveGroupEntitySummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("entityCategory")
    private String entityCategory;

    @com.aliyun.core.annotation.NameInMap("entityCount")
    private Integer entityCount;

    @com.aliyun.core.annotation.NameInMap("entityDomain")
    private String entityDomain;

    @com.aliyun.core.annotation.NameInMap("entityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("mainCount")
    private Long mainCount;

    @com.aliyun.core.annotation.NameInMap("relatedCount")
    private Long relatedCount;

    private ObserveGroupEntitySummary(Builder builder) {
        this.entityCategory = builder.entityCategory;
        this.entityCount = builder.entityCount;
        this.entityDomain = builder.entityDomain;
        this.entityType = builder.entityType;
        this.mainCount = builder.mainCount;
        this.relatedCount = builder.relatedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveGroupEntitySummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityCategory
     */
    public String getEntityCategory() {
        return this.entityCategory;
    }

    /**
     * @return entityCount
     */
    public Integer getEntityCount() {
        return this.entityCount;
    }

    /**
     * @return entityDomain
     */
    public String getEntityDomain() {
        return this.entityDomain;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return mainCount
     */
    public Long getMainCount() {
        return this.mainCount;
    }

    /**
     * @return relatedCount
     */
    public Long getRelatedCount() {
        return this.relatedCount;
    }

    public static final class Builder {
        private String entityCategory; 
        private Integer entityCount; 
        private String entityDomain; 
        private String entityType; 
        private Long mainCount; 
        private Long relatedCount; 

        private Builder() {
        } 

        private Builder(ObserveGroupEntitySummary model) {
            this.entityCategory = model.entityCategory;
            this.entityCount = model.entityCount;
            this.entityDomain = model.entityDomain;
            this.entityType = model.entityType;
            this.mainCount = model.mainCount;
            this.relatedCount = model.relatedCount;
        } 

        /**
         * <p>The entity category.</p>
         * 
         * <strong>example:</strong>
         * <p>acs</p>
         */
        public Builder entityCategory(String entityCategory) {
            this.entityCategory = entityCategory;
            return this;
        }

        /**
         * <p>The total count of entities of this type.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder entityCount(Integer entityCount) {
            this.entityCount = entityCount;
            return this;
        }

        /**
         * <p>The entity domain.</p>
         * 
         * <strong>example:</strong>
         * <p>acs</p>
         */
        public Builder entityDomain(String entityDomain) {
            this.entityDomain = entityDomain;
            return this;
        }

        /**
         * <p>The entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>acs.rocketmq.topic</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The count of primary entities of this type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder mainCount(Long mainCount) {
            this.mainCount = mainCount;
            return this;
        }

        /**
         * <p>The count of associated child entities of this type.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder relatedCount(Long relatedCount) {
            this.relatedCount = relatedCount;
            return this;
        }

        public ObserveGroupEntitySummary build() {
            return new ObserveGroupEntitySummary(this);
        } 

    } 

}
