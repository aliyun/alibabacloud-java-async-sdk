// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link RemoveGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>RemoveGroupMemberRequest</p>
 */
public class RemoveGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("group_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("member_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("member_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberType;

    private RemoveGroupMemberRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.groupId = builder.groupId;
        this.memberId = builder.memberId;
        this.memberType = builder.memberType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveGroupMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return memberType
     */
    public String getMemberType() {
        return this.memberType;
    }

    public static final class Builder extends Request.Builder<RemoveGroupMemberRequest, Builder> {
        private String domainId; 
        private String groupId; 
        private String memberId; 
        private String memberType; 

        private Builder() {
            super();
        } 

        private Builder(RemoveGroupMemberRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.groupId = request.groupId;
            this.memberId = request.memberId;
            this.memberType = request.memberType;
        } 

        /**
         * <p>A short description of struct</p>
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The ID of the group from which you want to remove a member.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3e5***2c2</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("group_id", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the member. If member_type is set to user, set this parameter to the ID of the corresponding user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2e4***1b1</p>
         */
        public Builder memberId(String memberId) {
            this.putBodyParameter("member_id", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The type of the member that you want to remove from the group. Only common users can be removed. If you want to remove all members from a group, you can directly delete the group. Valid value:</p>
         * <ul>
         * <li>user</li>
         * </ul>
         * <p>Note: A group can be a member of only one group. It cannot be a member of multiple groups. A user can be a member of multiple groups.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder memberType(String memberType) {
            this.putBodyParameter("member_type", memberType);
            this.memberType = memberType;
            return this;
        }

        @Override
        public RemoveGroupMemberRequest build() {
            return new RemoveGroupMemberRequest(this);
        } 

    } 

}
