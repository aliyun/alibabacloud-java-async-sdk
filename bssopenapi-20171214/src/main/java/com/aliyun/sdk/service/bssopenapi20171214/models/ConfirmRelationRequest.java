// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmRelationRequest} extends {@link RequestModel}
 *
 * <p>ConfirmRelationRequest</p>
 */
public class ConfirmRelationRequest extends Request {
    @Query
    @NameInMap("ChildUserId")
    @Validation()
    private Long childUserId;

    @Query
    @NameInMap("ConfirmCode")
    @Validation(required = true)
    private String confirmCode;

    @Query
    @NameInMap("ParentUserId")
    @Validation()
    private Long parentUserId;

    @Query
    @NameInMap("PermissionCodes")
    @Validation(required = true)
    private java.util.List < String > permissionCodes;

    @Query
    @NameInMap("RelationId")
    private Long relationId;

    @Query
    @NameInMap("RelationType")
    private String relationType;

    @Query
    @NameInMap("RequestId")
    @Validation(required = true)
    private String requestId;

    private ConfirmRelationRequest(Builder builder) {
        super(builder);
        this.childUserId = builder.childUserId;
        this.confirmCode = builder.confirmCode;
        this.parentUserId = builder.parentUserId;
        this.permissionCodes = builder.permissionCodes;
        this.relationId = builder.relationId;
        this.relationType = builder.relationType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childUserId
     */
    public Long getChildUserId() {
        return this.childUserId;
    }

    /**
     * @return confirmCode
     */
    public String getConfirmCode() {
        return this.confirmCode;
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

    public static final class Builder extends Request.Builder<ConfirmRelationRequest, Builder> {
        private Long childUserId; 
        private String confirmCode; 
        private Long parentUserId; 
        private java.util.List < String > permissionCodes; 
        private Long relationId; 
        private String relationType; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmRelationRequest request) {
            super(request);
            this.childUserId = request.childUserId;
            this.confirmCode = request.confirmCode;
            this.parentUserId = request.parentUserId;
            this.permissionCodes = request.permissionCodes;
            this.relationId = request.relationId;
            this.relationType = request.relationType;
            this.requestId = request.requestId;
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
         * ConfirmCode.
         */
        public Builder confirmCode(String confirmCode) {
            this.putQueryParameter("ConfirmCode", confirmCode);
            this.confirmCode = confirmCode;
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

        @Override
        public ConfirmRelationRequest build() {
            return new ConfirmRelationRequest(this);
        } 

    } 

}
