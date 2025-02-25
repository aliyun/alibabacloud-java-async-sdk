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
         * <p>A short description of struct</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The ID of the group of which you want to query members.</p>
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
         * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.<br>By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The member type. If you do not specify this parameter, both types of members are returned. Valid values:</p>
         * <ul>
         * <li>user</li>
         * <li>group</li>
         * </ul>
         * <p>Note: A group can be a member of only one group. It cannot be a member of multiple groups. A user can be a member of multiple groups.</p>
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
        public ListGroupMemberRequest build() {
            return new ListGroupMemberRequest(this);
        } 

    } 

}
