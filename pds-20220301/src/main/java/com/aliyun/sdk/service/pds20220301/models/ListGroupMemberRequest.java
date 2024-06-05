// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>ListGroupMemberRequest</p>
 */
public class ListGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("group_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("member_type")
    private String memberType;

    private ListGroupMemberRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.groupId = builder.groupId;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.memberType = builder.memberType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupMemberRequest create() {
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
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return memberType
     */
    public String getMemberType() {
        return this.memberType;
    }

    public static final class Builder extends Request.Builder<ListGroupMemberRequest, Builder> {
        private String domainId; 
        private String groupId; 
        private Integer limit; 
        private String marker; 
        private String memberType; 

        private Builder() {
            super();
        } 

        private Builder(ListGroupMemberRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.groupId = request.groupId;
            this.limit = request.limit;
            this.marker = request.marker;
            this.memberType = request.memberType;
        } 

        /**
         * A short description of struct
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The ID of the group of which you want to query members.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("group_id", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The maximum number of results to return. Valid values: 1 to 100. Default value: 100.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\
         * <p>
         * By default, this parameter is left empty.
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * The member type. If you do not specify this parameter, both types of members are returned. Valid values:
         * <p>
         * 
         * *   user
         * *   group
         * 
         * Note: A group can be a member of only one group. It cannot be a member of multiple groups. A user can be a member of multiple groups.
         */
        public Builder memberType(String memberType) {
            this.putBodyParameter("member_type", memberType);
            this.memberType = memberType;
            return this;
        }

        @Override
        public ListGroupMemberRequest build() {
            return new ListGroupMemberRequest(this);
        } 

    } 

}
