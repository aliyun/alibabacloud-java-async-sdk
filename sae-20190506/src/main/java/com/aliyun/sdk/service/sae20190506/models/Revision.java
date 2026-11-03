// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(Revision model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.revisionConfig = model.revisionConfig;
            this.revisionId = model.revisionId;
            this.weight = model.weight;
        } 

        /**
         * <p>The time when the revision version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-09T14:24:42</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The description of the revision version.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The configurations of the revision version.</p>
         */
        public Builder revisionConfig(RevisionConfig revisionConfig) {
            this.revisionConfig = revisionConfig;
            return this;
        }

        /**
         * <p>The ID of the revision version.</p>
         * 
         * <strong>example:</strong>
         * <p>001</p>
         */
        public Builder revisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        /**
         * <p>The traffic weight of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
