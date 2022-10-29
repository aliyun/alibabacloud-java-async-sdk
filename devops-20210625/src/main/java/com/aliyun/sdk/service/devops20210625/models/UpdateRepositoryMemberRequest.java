// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepositoryMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepositoryMemberRequest</p>
 */
public class UpdateRepositoryMemberRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Path
    @NameInMap("userId")
    @Validation(required = true)
    private Long userId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("accessLevel")
    private Integer accessLevel;

    @Body
    @NameInMap("expireAt")
    private String expireAt;

    @Body
    @NameInMap("memberType")
    private String memberType;

    @Body
    @NameInMap("relatedId")
    private String relatedId;

    @Body
    @NameInMap("relatedInfos")
    private java.util.List < RelatedInfos> relatedInfos;

    @Query
    @NameInMap("organizationId")
    private String organizationId;

    private UpdateRepositoryMemberRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.userId = builder.userId;
        this.accessToken = builder.accessToken;
        this.accessLevel = builder.accessLevel;
        this.expireAt = builder.expireAt;
        this.memberType = builder.memberType;
        this.relatedId = builder.relatedId;
        this.relatedInfos = builder.relatedInfos;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepositoryMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return accessLevel
     */
    public Integer getAccessLevel() {
        return this.accessLevel;
    }

    /**
     * @return expireAt
     */
    public String getExpireAt() {
        return this.expireAt;
    }

    /**
     * @return memberType
     */
    public String getMemberType() {
        return this.memberType;
    }

    /**
     * @return relatedId
     */
    public String getRelatedId() {
        return this.relatedId;
    }

    /**
     * @return relatedInfos
     */
    public java.util.List < RelatedInfos> getRelatedInfos() {
        return this.relatedInfos;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<UpdateRepositoryMemberRequest, Builder> {
        private Long repositoryId; 
        private Long userId; 
        private String accessToken; 
        private Integer accessLevel; 
        private String expireAt; 
        private String memberType; 
        private String relatedId; 
        private java.util.List < RelatedInfos> relatedInfos; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepositoryMemberRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.userId = request.userId;
            this.accessToken = request.accessToken;
            this.accessLevel = request.accessLevel;
            this.expireAt = request.expireAt;
            this.memberType = request.memberType;
            this.relatedId = request.relatedId;
            this.relatedInfos = request.relatedInfos;
            this.organizationId = request.organizationId;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.putPathParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * accessLevel.
         */
        public Builder accessLevel(Integer accessLevel) {
            this.putBodyParameter("accessLevel", accessLevel);
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * expireAt.
         */
        public Builder expireAt(String expireAt) {
            this.putBodyParameter("expireAt", expireAt);
            this.expireAt = expireAt;
            return this;
        }

        /**
         * memberType.
         */
        public Builder memberType(String memberType) {
            this.putBodyParameter("memberType", memberType);
            this.memberType = memberType;
            return this;
        }

        /**
         * relatedId.
         */
        public Builder relatedId(String relatedId) {
            this.putBodyParameter("relatedId", relatedId);
            this.relatedId = relatedId;
            return this;
        }

        /**
         * relatedInfos.
         */
        public Builder relatedInfos(java.util.List < RelatedInfos> relatedInfos) {
            this.putBodyParameter("relatedInfos", relatedInfos);
            this.relatedInfos = relatedInfos;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public UpdateRepositoryMemberRequest build() {
            return new UpdateRepositoryMemberRequest(this);
        } 

    } 

    public static class RelatedInfos extends TeaModel {
        @NameInMap("relatedId")
        private String relatedId;

        @NameInMap("sourceId")
        private Long sourceId;

        @NameInMap("sourceType")
        private String sourceType;

        private RelatedInfos(Builder builder) {
            this.relatedId = builder.relatedId;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedInfos create() {
            return builder().build();
        }

        /**
         * @return relatedId
         */
        public String getRelatedId() {
            return this.relatedId;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String relatedId; 
            private Long sourceId; 
            private String sourceType; 

            /**
             * relatedId.
             */
            public Builder relatedId(String relatedId) {
                this.relatedId = relatedId;
                return this;
            }

            /**
             * sourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public RelatedInfos build() {
                return new RelatedInfos(this);
            } 

        } 

    }
}
