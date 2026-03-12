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
 * {@link UpdateSkillRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillRequest</p>
 */
public class UpdateSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map<String, ?> content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dbtypes")
    private java.util.List<String> dbtypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillId;

    private UpdateSkillRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.dbtypes = builder.dbtypes;
        this.description = builder.description;
        this.name = builder.name;
        this.skillId = builder.skillId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillRequest create() {
        return builder().build();
    }

@Override
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    public static final class Builder extends Request.Builder<UpdateSkillRequest, Builder> {
        private java.util.Map<String, ?> content; 
        private java.util.List<String> dbtypes; 
        private String description; 
        private String name; 
        private String skillId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillRequest request) {
            super(request);
            this.content = request.content;
            this.dbtypes = request.dbtypes;
            this.description = request.description;
            this.name = request.name;
            this.skillId = request.skillId;
        } 

        /**
         * <p>The content of the skill.</p>
         */
        public Builder content(java.util.Map<String, ?> content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * <p>The list of database engines.</p>
         */
        public Builder dbtypes(java.util.List<String> dbtypes) {
            String dbtypesShrink = shrink(dbtypes, "Dbtypes", "json");
            this.putQueryParameter("Dbtypes", dbtypesShrink);
            this.dbtypes = dbtypes;
            return this;
        }

        /**
         * <p>The description of the Skill. It can be up to 1000 characters in length.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the skill, which can contain only lowercase letters, numbers, and hyphens.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-optimization</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The unique identifier of the skill.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8f6a2111-3828-4a9f-a3ce-51ce73c6****</p>
         */
        public Builder skillId(String skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        @Override
        public UpdateSkillRequest build() {
            return new UpdateSkillRequest(this);
        } 

    } 

}
