// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLhMembersRequest} extends {@link RequestModel}
 *
 * <p>DeleteLhMembersRequest</p>
 */
public class DeleteLhMembersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("MemberIds")
    @Validation(required = true)
    private java.util.List < Integer > memberIds;

    @Query
    @NameInMap("ObjectId")
    @Validation(required = true)
    private Long objectId;

    @Query
    @NameInMap("ObjectType")
    @Validation(required = true)
    private Integer objectType;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
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
    public java.util.List < Integer > getMemberIds() {
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
        private java.util.List < Integer > memberIds; 
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
         * MemberIds.
         */
        public Builder memberIds(java.util.List < Integer > memberIds) {
            String memberIdsShrink = shrink(memberIds, "MemberIds", "json");
            this.putQueryParameter("MemberIds", memberIdsShrink);
            this.memberIds = memberIds;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(Long objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(Integer objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * Tid.
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
