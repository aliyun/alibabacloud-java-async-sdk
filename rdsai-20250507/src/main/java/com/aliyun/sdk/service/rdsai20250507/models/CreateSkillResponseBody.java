// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateSkillResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSkillResponseBody</p>
 */
public class CreateSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map<String, ?> content;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("Dbtypes")
    private java.util.List<String> dbtypes;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillType")
    private String skillType;

    private CreateSkillResponseBody(Builder builder) {
        this.content = builder.content;
        this.createdAt = builder.createdAt;
        this.dbtypes = builder.dbtypes;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.skillType = builder.skillType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return dbtypes
     */
    public java.util.List<String> getDbtypes() {
        return this.dbtypes;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillType
     */
    public String getSkillType() {
        return this.skillType;
    }

    public static final class Builder {
        private java.util.Map<String, ?> content; 
        private String createdAt; 
        private java.util.List<String> dbtypes; 
        private String description; 
        private String id; 
        private String name; 
        private String requestId; 
        private String skillType; 

        private Builder() {
        } 

        private Builder(CreateSkillResponseBody model) {
            this.content = model.content;
            this.createdAt = model.createdAt;
            this.dbtypes = model.dbtypes;
            this.description = model.description;
            this.id = model.id;
            this.name = model.name;
            this.requestId = model.requestId;
            this.skillType = model.skillType;
        } 

        /**
         * Content.
         */
        public Builder content(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }

        /**
         * CreatedAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Dbtypes.
         */
        public Builder dbtypes(java.util.List<String> dbtypes) {
            this.dbtypes = dbtypes;
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
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SkillType.
         */
        public Builder skillType(String skillType) {
            this.skillType = skillType;
            return this;
        }

        public CreateSkillResponseBody build() {
            return new CreateSkillResponseBody(this);
        } 

    } 

}
