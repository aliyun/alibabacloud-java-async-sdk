// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceLinkedRoleDeletionStatusRequest} extends {@link RequestModel}
 *
 * <p>GetServiceLinkedRoleDeletionStatusRequest</p>
 */
public class GetServiceLinkedRoleDeletionStatusRequest extends Request {
    @Query
    @NameInMap("DeletionTaskId")
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
         * DeletionTaskId.
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
