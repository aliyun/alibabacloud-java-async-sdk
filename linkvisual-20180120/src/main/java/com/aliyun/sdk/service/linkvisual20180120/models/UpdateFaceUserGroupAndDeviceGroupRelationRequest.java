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
 * {@link UpdateFaceUserGroupAndDeviceGroupRelationRequest} extends {@link RequestModel}
 *
 * <p>UpdateFaceUserGroupAndDeviceGroupRelationRequest</p>
 */
public class UpdateFaceUserGroupAndDeviceGroupRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String controlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Relation")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The control ID of the synchronization relationship between the user group and the device group. Pass the <strong>ControlId</strong> value that you obtained and saved locally when you called the <a href="https://help.aliyun.com/document_detail/288342.html">AddFaceUserGroupAndDeviceGroupRelation</a> operation to add the face synchronization relationship between the user group and the device group.</p>
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
         * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. The value must be the same as the <strong>IsolationId</strong> value that you specified when you called the <a href="https://help.aliyun.com/document_detail/288342.html">AddFaceUserGroupAndDeviceGroupRelation</a> operation to add the face synchronization relationship between the user group and the device group.</p>
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

        /**
         * <p>The face synchronization relationship. Currently, only <strong>SYNC_INFO_PICTURE</strong> is supported, which indicates that user photos and user information are synchronized.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SYNC_INFO_PICTURE</p>
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
