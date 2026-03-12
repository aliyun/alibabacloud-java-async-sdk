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
 * {@link UpdateSkillResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSkillResponseBody</p>
 */
public class UpdateSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map<String, ?> content;

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

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    private UpdateSkillResponseBody(Builder builder) {
        this.content = builder.content;
        this.dbtypes = builder.dbtypes;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.skillType = builder.skillType;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillResponseBody create() {
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

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private java.util.Map<String, ?> content; 
        private java.util.List<String> dbtypes; 
        private String description; 
        private String id; 
        private String name; 
        private String requestId; 
        private String skillType; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(UpdateSkillResponseBody model) {
            this.content = model.content;
            this.dbtypes = model.dbtypes;
            this.description = model.description;
            this.id = model.id;
            this.name = model.name;
            this.requestId = model.requestId;
            this.skillType = model.skillType;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The content of the skill.</p>
         */
        public Builder content(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The list of database engines.</p>
         */
        public Builder dbtypes(java.util.List<String> dbtypes) {
            this.dbtypes = dbtypes;
            return this;
        }

        /**
         * <p>The description of the skill. It can be up to 1000 characters in length.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The unique identifier of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the skill, which can contain only lowercase letters, numbers, and hyphens.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-review</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The skill type.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder skillType(String skillType) {
            this.skillType = skillType;
            return this;
        }

        /**
         * <p>The update time of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-04T21:14:45Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public UpdateSkillResponseBody build() {
            return new UpdateSkillResponseBody(this);
        } 

    } 

}
