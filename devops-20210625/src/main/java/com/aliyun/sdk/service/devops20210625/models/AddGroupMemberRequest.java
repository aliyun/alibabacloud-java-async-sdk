// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>AddGroupMemberRequest</p>
 */
public class AddGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("accessLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer accessLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aliyunPks")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliyunPks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private AddGroupMemberRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.accessToken = builder.accessToken;
        this.accessLevel = builder.accessLevel;
        this.aliyunPks = builder.aliyunPks;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGroupMemberRequest create() {
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
     * @return accessLevel
     */
    public Integer getAccessLevel() {
        return this.accessLevel;
    }

    /**
     * @return aliyunPks
     */
    public String getAliyunPks() {
        return this.aliyunPks;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<AddGroupMemberRequest, Builder> {
        private Long groupId; 
        private String accessToken; 
        private Integer accessLevel; 
        private String aliyunPks; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(AddGroupMemberRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.accessToken = request.accessToken;
            this.accessLevel = request.accessLevel;
            this.aliyunPks = request.aliyunPks;
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
         * accessLevel.
         */
        public Builder accessLevel(Integer accessLevel) {
            this.putBodyParameter("accessLevel", accessLevel);
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * aliyunPks.
         */
        public Builder aliyunPks(String aliyunPks) {
            this.putBodyParameter("aliyunPks", aliyunPks);
            this.aliyunPks = aliyunPks;
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
        public AddGroupMemberRequest build() {
            return new AddGroupMemberRequest(this);
        } 

    } 

}
