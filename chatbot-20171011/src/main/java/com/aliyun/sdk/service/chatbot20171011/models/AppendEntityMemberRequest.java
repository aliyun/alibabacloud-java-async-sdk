// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppendEntityMemberRequest} extends {@link RequestModel}
 *
 * <p>AppendEntityMemberRequest</p>
 */
public class AppendEntityMemberRequest extends Request {
    @Query
    @NameInMap("ApplyType")
    @Validation(required = true)
    private String applyType;

    @Query
    @NameInMap("EntityId")
    @Validation(required = true)
    private Long entityId;

    @Query
    @NameInMap("Member")
    @Validation(required = true)
    private Member member;

    private AppendEntityMemberRequest(Builder builder) {
        super(builder);
        this.applyType = builder.applyType;
        this.entityId = builder.entityId;
        this.member = builder.member;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppendEntityMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyType
     */
    public String getApplyType() {
        return this.applyType;
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

    public static final class Builder extends Request.Builder<AppendEntityMemberRequest, Builder> {
        private String applyType; 
        private Long entityId; 
        private Member member; 

        private Builder() {
            super();
        } 

        private Builder(AppendEntityMemberRequest response) {
            super(response);
            this.applyType = response.applyType;
            this.entityId = response.entityId;
            this.member = response.member;
        } 

        /**
         * ApplyType.
         */
        public Builder applyType(String applyType) {
            this.putQueryParameter("ApplyType", applyType);
            this.applyType = applyType;
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
            this.putQueryParameter("Member", member);
            this.member = member;
            return this;
        }

        @Override
        public AppendEntityMemberRequest build() {
            return new AppendEntityMemberRequest(this);
        } 

    } 

    public static class Member extends TeaModel {
        @NameInMap("MemberName")
        @Validation(required = true)
        private String memberName;

        @NameInMap("Synonyms")
        @Validation(required = true)
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
