// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link DeleteRayHistoryServerRequest} extends {@link RequestModel}
 *
 * <p>DeleteRayHistoryServerRequest</p>
 */
public class DeleteRayHistoryServerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RayHistoryServerId")
    private String rayHistoryServerId;

    private DeleteRayHistoryServerRequest(Builder builder) {
        super(builder);
        this.rayHistoryServerId = builder.rayHistoryServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRayHistoryServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rayHistoryServerId
     */
    public String getRayHistoryServerId() {
        return this.rayHistoryServerId;
    }

    public static final class Builder extends Request.Builder<DeleteRayHistoryServerRequest, Builder> {
        private String rayHistoryServerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRayHistoryServerRequest request) {
            super(request);
            this.rayHistoryServerId = request.rayHistoryServerId;
        } 

        /**
         * RayHistoryServerId.
         */
        public Builder rayHistoryServerId(String rayHistoryServerId) {
            this.putPathParameter("RayHistoryServerId", rayHistoryServerId);
            this.rayHistoryServerId = rayHistoryServerId;
            return this;
        }

        @Override
        public DeleteRayHistoryServerRequest build() {
            return new DeleteRayHistoryServerRequest(this);
        } 

    } 

}
