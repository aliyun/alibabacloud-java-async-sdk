// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepositoryMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepositoryMemberRequest</p>
 */
public class UpdateRepositoryMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("aliyunPk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliyunPk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("accessLevel")
    private Integer accessLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireAt")
    private String expireAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memberType")
    private String memberType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("relatedId")
    private String relatedId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("relatedInfos")
    private java.util.List < RelatedInfos> relatedInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private UpdateRepositoryMemberRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.aliyunPk = builder.aliyunPk;
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
     * @return aliyunPk
     */
    public String getAliyunPk() {
        return this.aliyunPk;
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
        private String aliyunPk; 
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
            this.aliyunPk = request.aliyunPk;
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
         * aliyunPk.
         */
        public Builder aliyunPk(String aliyunPk) {
            this.putPathParameter("aliyunPk", aliyunPk);
            this.aliyunPk = aliyunPk;
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
        @com.aliyun.core.annotation.NameInMap("relatedId")
        private String relatedId;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceType")
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
