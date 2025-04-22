// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListMembersRequest} extends {@link RequestModel}
 *
 * <p>ListMembersRequest</p>
 */
public class ListMembersRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberName")
    private String memberName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Roles")
    private String roles;

    private ListMembersRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memberName = builder.memberName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.roles = builder.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMembersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return memberName
     */
    public String getMemberName() {
        return this.memberName;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return roles
     */
    public String getRoles() {
        return this.roles;
    }

    public static final class Builder extends Request.Builder<ListMembersRequest, Builder> {
        private String workspaceId; 
        private String memberName; 
        private Long pageNumber; 
        private Integer pageSize; 
        private String roles; 

        private Builder() {
            super();
        } 

        private Builder(ListMembersRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memberName = request.memberName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.roles = request.roles;
        } 

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The member name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder memberName(String memberName) {
            this.putQueryParameter("MemberName", memberName);
            this.memberName = memberName;
            return this;
        }

        /**
         * <p>The page number of the workspace list. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The roles that are used to filter members. Multiple roles are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>PAI.AlgoDeveloper: algorithm developer</li>
         * <li>PAI.AlgoOperator: algorithm O&amp;M engineer</li>
         * <li>PAI.LabelManager: labeling administrator</li>
         * <li>PAI.MaxComputeDeveloper: MaxCompute developer</li>
         * <li>PAI.WorkspaceAdmin: administrator</li>
         * <li>PAI.WorkspaceGuest: guest</li>
         * <li>PAI.WorkspaceOwner: owner</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAI.AlgoDeveloper</p>
         */
        public Builder roles(String roles) {
            this.putQueryParameter("Roles", roles);
            this.roles = roles;
            return this;
        }

        @Override
        public ListMembersRequest build() {
            return new ListMembersRequest(this);
        } 

    } 

}
