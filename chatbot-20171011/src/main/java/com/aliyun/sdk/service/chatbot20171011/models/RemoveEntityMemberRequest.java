// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveEntityMemberRequest} extends {@link RequestModel}
 *
 * <p>RemoveEntityMemberRequest</p>
 */
public class RemoveEntityMemberRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("EntityId")
    @Validation(required = true)
    private Long entityId;

    @Query
    @NameInMap("Member")
    @Validation(required = true)
    private Member member;

    @Query
    @NameInMap("RemoveType")
    @Validation(required = true)
    private String removeType;

    private RemoveEntityMemberRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.entityId = builder.entityId;
        this.member = builder.member;
        this.removeType = builder.removeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveEntityMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return member
     */
    public Member getMember() {
        return this.member;
    }

    /**
     * @return removeType
     */
    public String getRemoveType() {
        return this.removeType;
    }

    public static final class Builder extends Request.Builder<RemoveEntityMemberRequest, Builder> {
        private String agentKey; 
        private Long entityId; 
        private Member member; 
        private String removeType; 

        private Builder() {
            super();
        } 

        private Builder(RemoveEntityMemberRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.entityId = request.entityId;
            this.member = request.member;
            this.removeType = request.removeType;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
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
         * Member.
         */
        public Builder member(Member member) {
            String memberShrink = shrink(member, "Member", "json");
            this.putQueryParameter("Member", memberShrink);
            this.member = member;
            return this;
        }

        /**
         * RemoveType.
         */
        public Builder removeType(String removeType) {
            this.putQueryParameter("RemoveType", removeType);
            this.removeType = removeType;
            return this;
        }

        @Override
        public RemoveEntityMemberRequest build() {
            return new RemoveEntityMemberRequest(this);
        } 

    } 

    public static class Member extends TeaModel {
        @NameInMap("MemberName")
        private String memberName;

        @NameInMap("Synonyms")
        private java.util.List < String > synonyms;

        private Member(Builder builder) {
            this.memberName = builder.memberName;
            this.synonyms = builder.synonyms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Member create() {
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

            public Member build() {
                return new Member(this);
            } 

        } 

    }
}
