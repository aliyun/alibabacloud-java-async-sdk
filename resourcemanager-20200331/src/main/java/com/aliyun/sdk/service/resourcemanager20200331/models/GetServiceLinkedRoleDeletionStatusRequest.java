// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link GetServiceLinkedRoleDeletionStatusRequest} extends {@link RequestModel}
 *
 * <p>GetServiceLinkedRoleDeletionStatusRequest</p>
 */
public class GetServiceLinkedRoleDeletionStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionTaskId")
    private String deletionTaskId;

    private GetServiceLinkedRoleDeletionStatusRequest(Builder builder) {
        super(builder);
        this.deletionTaskId = builder.deletionTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceLinkedRoleDeletionStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletionTaskId
     */
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

    public static final class Builder extends Request.Builder<GetServiceLinkedRoleDeletionStatusRequest, Builder> {
        private String deletionTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceLinkedRoleDeletionStatusRequest request) {
            super(request);
            this.deletionTaskId = request.deletionTaskId;
        } 

        /**
         * <p>The ID of the deletion task.</p>
         * 
         * <strong>example:</strong>
         * <p>task/acs-service-role/hdr.aliyuncs.com/AliyunServiceRoleForHdr/c4d22c52-247f-4ee1-83a2-6c0460bd****</p>
         */
        public Builder deletionTaskId(String deletionTaskId) {
            this.putQueryParameter("DeletionTaskId", deletionTaskId);
            this.deletionTaskId = deletionTaskId;
            return this;
        }

        @Override
        public GetServiceLinkedRoleDeletionStatusRequest build() {
            return new GetServiceLinkedRoleDeletionStatusRequest(this);
        } 

    } 

}
