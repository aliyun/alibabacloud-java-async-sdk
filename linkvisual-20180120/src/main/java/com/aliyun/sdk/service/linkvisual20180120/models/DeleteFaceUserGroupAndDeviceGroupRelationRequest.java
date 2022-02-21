// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceUserGroupAndDeviceGroupRelationRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceUserGroupAndDeviceGroupRelationRequest</p>
 */
public class DeleteFaceUserGroupAndDeviceGroupRelationRequest extends Request {
    @Query
    @NameInMap("ControlId")
    @Validation(required = true)
    private String controlId;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    private DeleteFaceUserGroupAndDeviceGroupRelationRequest(Builder builder) {
        super(builder);
        this.controlId = builder.controlId;
        this.isolationId = builder.isolationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceUserGroupAndDeviceGroupRelationRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFaceUserGroupAndDeviceGroupRelationRequest, Builder> {
        private String controlId; 
        private String isolationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceUserGroupAndDeviceGroupRelationRequest response) {
            super(response);
            this.controlId = response.controlId;
            this.isolationId = response.isolationId;
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

        @Override
        public DeleteFaceUserGroupAndDeviceGroupRelationRequest build() {
            return new DeleteFaceUserGroupAndDeviceGroupRelationRequest(this);
        } 

    } 

}
