// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEntityRequest} extends {@link RequestModel}
 *
 * <p>CreateEntityRequest</p>
 */
public class CreateEntityRequest extends Request {
    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    @Query
    @NameInMap("EntityName")
    @Validation(required = true)
    private String entityName;

    @Query
    @NameInMap("EntityType")
    @Validation(required = true)
    private String entityType;

    @Query
    @NameInMap("Members")
    private java.util.List < Members> members;

    @Query
    @NameInMap("Regex")
    private String regex;

    private CreateEntityRequest(Builder builder) {
        super(builder);
        this.dialogId = builder.dialogId;
        this.entityName = builder.entityName;
        this.entityType = builder.entityType;
        this.members = builder.members;
        this.regex = builder.regex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
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

    public static final class Builder extends Request.Builder<CreateEntityRequest, Builder> {
        private Long dialogId; 
        private String entityName; 
        private String entityType; 
        private java.util.List < Members> members; 
        private String regex; 

        private Builder() {
            super();
        } 

        private Builder(CreateEntityRequest response) {
            super(response);
            this.dialogId = response.dialogId;
            this.entityName = response.entityName;
            this.entityType = response.entityType;
            this.members = response.members;
            this.regex = response.regex;
        } 

        /**
         * DialogId.
         */
        public Builder dialogId(Long dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
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
            this.putQueryParameter("Members", members);
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
        public CreateEntityRequest build() {
            return new CreateEntityRequest(this);
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
