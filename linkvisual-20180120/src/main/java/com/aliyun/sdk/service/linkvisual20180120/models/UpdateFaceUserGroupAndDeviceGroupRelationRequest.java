// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFaceUserGroupAndDeviceGroupRelationRequest} extends {@link RequestModel}
 *
 * <p>UpdateFaceUserGroupAndDeviceGroupRelationRequest</p>
 */
public class UpdateFaceUserGroupAndDeviceGroupRelationRequest extends Request {
    @Query
    @NameInMap("ControlId")
    @Validation(required = true)
    private String controlId;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("Relation")
    @Validation(required = true)
    private String relation;

    private UpdateFaceUserGroupAndDeviceGroupRelationRequest(Builder builder) {
        super(builder);
        this.controlId = builder.controlId;
        this.isolationId = builder.isolationId;
        this.relation = builder.relation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFaceUserGroupAndDeviceGroupRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return controlId
     */
    public String getControlId() {
        return this.controlId;
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
    }

    public static final class Builder extends Request.Builder<UpdateFaceUserGroupAndDeviceGroupRelationRequest, Builder> {
        private String controlId; 
        private String isolationId; 
        private String relation; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFaceUserGroupAndDeviceGroupRelationRequest request) {
            super(request);
            this.controlId = request.controlId;
            this.isolationId = request.isolationId;
            this.relation = request.relation;
        } 

        /**
         * ControlId.
         */
        public Builder controlId(String controlId) {
            this.putQueryParameter("ControlId", controlId);
            this.controlId = controlId;
            return this;
        }

        /**
         * IsolationId.
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * Relation.
         */
        public Builder relation(String relation) {
            this.putQueryParameter("Relation", relation);
            this.relation = relation;
            return this;
        }

        @Override
        public UpdateFaceUserGroupAndDeviceGroupRelationRequest build() {
            return new UpdateFaceUserGroupAndDeviceGroupRelationRequest(this);
        } 

    } 

}
