// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAccountRelationRequest} extends {@link RequestModel}
 *
 * <p>AddAccountRelationRequest</p>
 */
public class AddAccountRelationRequest extends Request {
    @Query
    @NameInMap("ChildNick")
    private String childNick;

    @Query
    @NameInMap("ChildUserId")
    @Validation(required = true)
    private Long childUserId;

    @Query
    @NameInMap("ParentUserId")
    @Validation(required = true)
    private Long parentUserId;

    @Query
    @NameInMap("PermissionCodes")
    private java.util.List < String > permissionCodes;

    @Query
    @NameInMap("RelationType")
    @Validation(required = true)
    private String relationType;

    @Query
    @NameInMap("RequestId")
    @Validation(required = true)
    private String requestId;

    @Query
    @NameInMap("RoleCodes")
    private java.util.List < String > roleCodes;

    private AddAccountRelationRequest(Builder builder) {
        super(builder);
        this.childNick = builder.childNick;
        this.childUserId = builder.childUserId;
        this.parentUserId = builder.parentUserId;
        this.permissionCodes = builder.permissionCodes;
        this.relationType = builder.relationType;
        this.requestId = builder.requestId;
        this.roleCodes = builder.roleCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAccountRelationRequest create() {
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

    public static final class Builder extends Request.Builder<AddAccountRelationRequest, Builder> {
        private String childNick; 
        private Long childUserId; 
        private Long parentUserId; 
        private java.util.List < String > permissionCodes; 
        private String relationType; 
        private String requestId; 
        private java.util.List < String > roleCodes; 

        private Builder() {
            super();
        } 

        private Builder(AddAccountRelationRequest request) {
            super(request);
            this.childNick = request.childNick;
            this.childUserId = request.childUserId;
            this.parentUserId = request.parentUserId;
            this.permissionCodes = request.permissionCodes;
            this.relationType = request.relationType;
            this.requestId = request.requestId;
            this.roleCodes = request.roleCodes;
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
        public AddAccountRelationRequest build() {
            return new AddAccountRelationRequest(this);
        } 

    } 

}
