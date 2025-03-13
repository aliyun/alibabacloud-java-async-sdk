// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link KnowledgeBaseInfo} extends {@link TeaModel}
 *
 * <p>KnowledgeBaseInfo</p>
 */
public class KnowledgeBaseInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    @com.aliyun.core.annotation.NameInMap("knowledgeBaseType")
    private String knowledgeBaseType;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private KnowledgeBaseInfo(Builder builder) {
        this.description = builder.description;
        this.id = builder.id;
        this.industry = builder.industry;
        this.knowledgeBaseType = builder.knowledgeBaseType;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBaseInfo create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return knowledgeBaseType
     */
    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String description; 
        private String id; 
        private String industry; 
        private String knowledgeBaseType; 
        private String name; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * industry.
         */
        public Builder industry(String industry) {
            this.industry = industry;
            return this;
        }

        /**
         * knowledgeBaseType.
         */
        public Builder knowledgeBaseType(String knowledgeBaseType) {
            this.knowledgeBaseType = knowledgeBaseType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public KnowledgeBaseInfo build() {
            return new KnowledgeBaseInfo(this);
        } 

    } 

}
