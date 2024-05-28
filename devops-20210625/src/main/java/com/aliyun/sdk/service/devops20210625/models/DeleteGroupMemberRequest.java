// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteGroupMemberRequest</p>
 */
public class DeleteGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunPk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliyunPk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memberType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private DeleteGroupMemberRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.accessToken = builder.accessToken;
        this.aliyunPk = builder.aliyunPk;
        this.memberType = builder.memberType;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGroupMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return aliyunPk
     */
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    /**
     * @return memberType
     */
    public String getMemberType() {
        return this.memberType;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<DeleteGroupMemberRequest, Builder> {
        private Long groupId; 
        private String accessToken; 
        private String aliyunPk; 
        private String memberType; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGroupMemberRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.accessToken = request.accessToken;
            this.aliyunPk = request.aliyunPk;
            this.memberType = request.memberType;
            this.organizationId = request.organizationId;
        } 

        /**
         * groupId.
         */
        public Builder groupId(Long groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
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
         * aliyunPk.
         */
        public Builder aliyunPk(String aliyunPk) {
            this.putQueryParameter("aliyunPk", aliyunPk);
            this.aliyunPk = aliyunPk;
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
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public DeleteGroupMemberRequest build() {
            return new DeleteGroupMemberRequest(this);
        } 

    } 

}
