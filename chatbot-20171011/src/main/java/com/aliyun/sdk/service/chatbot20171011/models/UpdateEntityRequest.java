// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEntityRequest} extends {@link RequestModel}
 *
 * <p>UpdateEntityRequest</p>
 */
public class UpdateEntityRequest extends Request {
    @Query
    @NameInMap("EntityId")
    @Validation(required = true)
    private Long entityId;

    @Query
    @NameInMap("EntityName")
    @Validation(required = true)
    private String entityName;

    @Query
    @NameInMap("EntityType")
    @Validation(required = true)
    private String entityType;

    @Body
    @NameInMap("Members")
    private java.util.List < Members> members;

    @Query
    @NameInMap("Regex")
    private String regex;

    private UpdateEntityRequest(Builder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.entityName = builder.entityName;
        this.entityType = builder.entityType;
        this.members = builder.members;
        this.regex = builder.regex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityName
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return members
     */
    public java.util.List < Members> getMembers() {
        return this.members;
    }

    /**
     * @return regex
     */
    public String getRegex() {
        return this.regex;
    }

    public static final class Builder extends Request.Builder<UpdateEntityRequest, Builder> {
        private Long entityId; 
        private String entityName; 
        private String entityType; 
        private java.util.List < Members> members; 
        private String regex; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEntityRequest response) {
            super(response);
            this.entityId = response.entityId;
            this.entityName = response.entityName;
            this.entityType = response.entityType;
            this.members = response.members;
            this.regex = response.regex;
        } 

        /**
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * EntityName.
         */
        public Builder entityName(String entityName) {
            this.putQueryParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * Members.
         */
        public Builder members(java.util.List < Members> members) {
            this.putBodyParameter("Members", members);
            this.members = members;
            return this;
        }

        /**
         * Regex.
         */
        public Builder regex(String regex) {
            this.putQueryParameter("Regex", regex);
            this.regex = regex;
            return this;
        }

        @Override
        public UpdateEntityRequest build() {
            return new UpdateEntityRequest(this);
        } 

    } 

    public static class Members extends TeaModel {
        @NameInMap("MemberName")
        private String memberName;

        @NameInMap("Synonyms")
        private java.util.List < String > synonyms;

        private Members(Builder builder) {
            this.memberName = builder.memberName;
            this.synonyms = builder.synonyms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return synonyms
         */
        public java.util.List < String > getSynonyms() {
            return this.synonyms;
        }

        public static final class Builder {
            private String memberName; 
            private java.util.List < String > synonyms; 

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * Synonyms.
             */
            public Builder synonyms(java.util.List < String > synonyms) {
                this.synonyms = synonyms;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}
