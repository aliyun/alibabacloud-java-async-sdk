// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Revision} extends {@link TeaModel}
 *
 * <p>Revision</p>
 */
public class Revision extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RevisionConfig")
    private RevisionConfig revisionConfig;

    @com.aliyun.core.annotation.NameInMap("RevisionId")
    private String revisionId;

    @com.aliyun.core.annotation.NameInMap("Weight")
    private Float weight;

    private Revision(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.revisionConfig = builder.revisionConfig;
        this.revisionId = builder.revisionId;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Revision create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return revisionConfig
     */
    public RevisionConfig getRevisionConfig() {
        return this.revisionConfig;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * @return weight
     */
    public Float getWeight() {
        return this.weight;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private RevisionConfig revisionConfig; 
        private String revisionId; 
        private Float weight; 

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * RevisionConfig.
         */
        public Builder revisionConfig(RevisionConfig revisionConfig) {
            this.revisionConfig = revisionConfig;
            return this;
        }

        /**
         * RevisionId.
         */
        public Builder revisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        /**
         * Weight.
         */
        public Builder weight(Float weight) {
            this.weight = weight;
            return this;
        }

        public Revision build() {
            return new Revision(this);
        } 

    } 

}
