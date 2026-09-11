// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetScheduledTaskPushOptionsRequest} extends {@link RequestModel}
 *
 * <p>GetScheduledTaskPushOptionsRequest</p>
 */
public class GetScheduledTaskPushOptionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private String digitalEmployeeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetScheduledTaskPushOptionsRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledTaskPushOptionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return digitalEmployeeName
     */
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetScheduledTaskPushOptionsRequest, Builder> {
        private String collaborationGroupId; 
        private String digitalEmployeeName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetScheduledTaskPushOptionsRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.digitalEmployeeName = request.digitalEmployeeName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The ID of the collaboration group (such as cg_101). If specified, a group workspace task is created (the caller must be a valid group member). If left empty, a personal task is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_401</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The name of the currently active digital employee. This value is empty if not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDigitalEmployeeName</p>
         */
        public Builder digitalEmployeeName(String digitalEmployeeName) {
            this.putBodyParameter("digitalEmployeeName", digitalEmployeeName);
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly with --tenant-id.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetScheduledTaskPushOptionsRequest build() {
            return new GetScheduledTaskPushOptionsRequest(this);
        } 

    } 

}
