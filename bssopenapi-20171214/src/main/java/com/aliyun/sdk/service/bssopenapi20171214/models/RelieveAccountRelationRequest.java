// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RelieveAccountRelationRequest} extends {@link RequestModel}
 *
 * <p>RelieveAccountRelationRequest</p>
 */
public class RelieveAccountRelationRequest extends Request {
    @Query
    @NameInMap("ChildUserId")
    @Validation()
    private Long childUserId;

    @Query
    @NameInMap("ParentUserId")
    @Validation()
    private Long parentUserId;

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

    private RelieveAccountRelationRequest(Builder builder) {
        super(builder);
        this.childUserId = builder.childUserId;
        this.parentUserId = builder.parentUserId;
        this.relationId = builder.relationId;
        this.relationType = builder.relationType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RelieveAccountRelationRequest create() {
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
     * @return parentUserId
     */
    public Long getParentUserId() {
        return this.parentUserId;
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

    public static final class Builder extends Request.Builder<RelieveAccountRelationRequest, Builder> {
        private Long childUserId; 
        private Long parentUserId; 
        private Long relationId; 
        private String relationType; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(RelieveAccountRelationRequest response) {
            super(response);
            this.childUserId = response.childUserId;
            this.parentUserId = response.parentUserId;
            this.relationId = response.relationId;
            this.relationType = response.relationType;
            this.requestId = response.requestId;
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
        public RelieveAccountRelationRequest build() {
            return new RelieveAccountRelationRequest(this);
        } 

    } 

}
