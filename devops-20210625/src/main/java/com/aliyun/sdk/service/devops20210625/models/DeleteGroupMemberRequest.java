// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteGroupMemberRequest</p>
 */
public class DeleteGroupMemberRequest extends Request {
    @Path
    @NameInMap("groupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("aliyunPk")
    @Validation(required = true)
    private String aliyunPk;

    @Body
    @NameInMap("memberType")
    @Validation(required = true)
    private String memberType;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
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
         * A short description of struct
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
