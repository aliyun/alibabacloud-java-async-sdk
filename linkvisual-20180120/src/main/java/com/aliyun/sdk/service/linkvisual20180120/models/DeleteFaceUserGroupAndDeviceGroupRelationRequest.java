// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link DeleteFaceUserGroupAndDeviceGroupRelationRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceUserGroupAndDeviceGroupRelationRequest</p>
 */
public class DeleteFaceUserGroupAndDeviceGroupRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String controlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeleteFaceUserGroupAndDeviceGroupRelationRequest request) {
            super(request);
            this.controlId = request.controlId;
            this.isolationId = request.isolationId;
        } 

        /**
         * <p>The control ID of the synchronization relationship between the user group and the device group. Set this parameter to the value of <strong>ControlId</strong> that you obtained and saved locally when you called the <a href="https://help.aliyun.com/document_detail/288342.html">AddFaceUserGroupAndDeviceGroupRelation</a> operation to add the face synchronization relationship between the user group and the device group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qcb2yea4ha4d****</p>
         */
        public Builder controlId(String controlId) {
            this.putQueryParameter("ControlId", controlId);
            this.controlId = controlId;
            return this;
        }

        /**
         * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. Set this parameter to the same value of <strong>IsolationId</strong> that you specified when you called the <a href="https://help.aliyun.com/document_detail/288342.html">AddFaceUserGroupAndDeviceGroupRelation</a> operation to add the face synchronization relationship between the user group and the device group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZheJiangHZ</p>
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
