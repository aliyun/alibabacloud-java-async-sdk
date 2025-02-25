// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DeleteLhMembersRequest} extends {@link RequestModel}
 *
 * <p>DeleteLhMembersRequest</p>
 */
public class DeleteLhMembersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> memberIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long objectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private DeleteLhMembersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.memberIds = builder.memberIds;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLhMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return memberIds
     */
    public java.util.List<Integer> getMemberIds() {
        return this.memberIds;
    }

    /**
     * @return objectId
     */
    public Long getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public Integer getObjectType() {
        return this.objectType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<DeleteLhMembersRequest, Builder> {
        private String regionId; 
        private java.util.List<Integer> memberIds; 
        private Long objectId; 
        private Integer objectType; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLhMembersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.memberIds = request.memberIds;
            this.objectId = request.objectId;
            this.objectType = request.objectType;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the user to be removed. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> operation to obtain the user ID.</p>
         * <p>This parameter is required.</p>
         */
        public Builder memberIds(java.util.List<Integer> memberIds) {
            String memberIdsShrink = shrink(memberIds, "MemberIds", "json");
            this.putQueryParameter("MemberIds", memberIdsShrink);
            this.memberIds = memberIds;
            return this;
        }

        /**
         * <p>The ID of the object.</p>
         * <ul>
         * <li>If the object is a workspace, you can call the <a href="https://help.aliyun.com/document_detail/424379.html">GetLhSpaceByName</a> operation to obtain the workspace ID.</li>
         * <li>If the object is a task flow, you can call the <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to obtain the task flow ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9***</p>
         */
        public Builder objectId(Long objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The type of the object. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: workspace</li>
         * <li><strong>1</strong>: task flow</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder objectType(Integer objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public DeleteLhMembersRequest build() {
            return new DeleteLhMembersRequest(this);
        } 

    } 

}
