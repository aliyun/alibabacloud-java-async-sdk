// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountRelationRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountRelationRequest</p>
 */
public class ModifyAccountRelationRequest extends Request {
    @Query
    @NameInMap("ChildNick")
    private String childNick;

    @Query
    @NameInMap("ChildUserId")
    @Validation()
    private Long childUserId;

    @Query
    @NameInMap("ParentUserId")
    @Validation()
    private Long parentUserId;

    @Query
    @NameInMap("PermissionCodes")
    private java.util.List < String > permissionCodes;

    @Query
    @NameInMap("RelationId")
    private Long relationId;

    @Query
    @NameInMap("RelationOperation")
    @Validation(required = true)
    private String relationOperation;

    @Query
    @NameInMap("RelationType")
    private String relationType;

    @Query
    @NameInMap("RequestId")
    @Validation(required = true)
    private String requestId;

    @Query
    @NameInMap("RoleCodes")
    private java.util.List < String > roleCodes;

    private ModifyAccountRelationRequest(Builder builder) {
        super(builder);
        this.childNick = builder.childNick;
        this.childUserId = builder.childUserId;
        this.parentUserId = builder.parentUserId;
        this.permissionCodes = builder.permissionCodes;
        this.relationId = builder.relationId;
        this.relationOperation = builder.relationOperation;
        this.relationType = builder.relationType;
        this.requestId = builder.requestId;
        this.roleCodes = builder.roleCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childNick
     */
    public String getChildNick() {
        return this.childNick;
    }

    /**
     * @return childUserId
     */
    public Long getChildUserId() {
        return this.childUserId;
    }

    /**
     * @return parentUserId
     */
    public Long getParentUserId() {
        return this.parentUserId;
    }

    /**
     * @return permissionCodes
     */
    public java.util.List < String > getPermissionCodes() {
        return this.permissionCodes;
    }

    /**
     * @return relationId
     */
    public Long getRelationId() {
        return this.relationId;
    }

    /**
     * @return relationOperation
     */
    public String getRelationOperation() {
        return this.relationOperation;
    }

    /**
     * @return relationType
     */
    public String getRelationType() {
        return this.relationType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleCodes
     */
    public java.util.List < String > getRoleCodes() {
        return this.roleCodes;
    }

    public static final class Builder extends Request.Builder<ModifyAccountRelationRequest, Builder> {
        private String childNick; 
        private Long childUserId; 
        private Long parentUserId; 
        private java.util.List < String > permissionCodes; 
        private Long relationId; 
        private String relationOperation; 
        private String relationType; 
        private String requestId; 
        private java.util.List < String > roleCodes; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountRelationRequest response) {
            super(response);
            this.childNick = response.childNick;
            this.childUserId = response.childUserId;
            this.parentUserId = response.parentUserId;
            this.permissionCodes = response.permissionCodes;
            this.relationId = response.relationId;
            this.relationOperation = response.relationOperation;
            this.relationType = response.relationType;
            this.requestId = response.requestId;
            this.roleCodes = response.roleCodes;
        } 

        /**
         * ChildNick.
         */
        public Builder childNick(String childNick) {
            this.putQueryParameter("ChildNick", childNick);
            this.childNick = childNick;
            return this;
        }

        /**
         * ChildUserId.
         */
        public Builder childUserId(Long childUserId) {
            this.putQueryParameter("ChildUserId", childUserId);
            this.childUserId = childUserId;
            return this;
        }

        /**
         * ParentUserId.
         */
        public Builder parentUserId(Long parentUserId) {
            this.putQueryParameter("ParentUserId", parentUserId);
            this.parentUserId = parentUserId;
            return this;
        }

        /**
         * PermissionCodes.
         */
        public Builder permissionCodes(java.util.List < String > permissionCodes) {
            this.putQueryParameter("PermissionCodes", permissionCodes);
            this.permissionCodes = permissionCodes;
            return this;
        }

        /**
         * RelationId.
         */
        public Builder relationId(Long relationId) {
            this.putQueryParameter("RelationId", relationId);
            this.relationId = relationId;
            return this;
        }

        /**
         * RelationOperation.
         */
        public Builder relationOperation(String relationOperation) {
            this.putQueryParameter("RelationOperation", relationOperation);
            this.relationOperation = relationOperation;
            return this;
        }

        /**
         * RelationType.
         */
        public Builder relationType(String relationType) {
            this.putQueryParameter("RelationType", relationType);
            this.relationType = relationType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * RoleCodes.
         */
        public Builder roleCodes(java.util.List < String > roleCodes) {
            this.putQueryParameter("RoleCodes", roleCodes);
            this.roleCodes = roleCodes;
            return this;
        }

        @Override
        public ModifyAccountRelationRequest build() {
            return new ModifyAccountRelationRequest(this);
        } 

    } 

}
