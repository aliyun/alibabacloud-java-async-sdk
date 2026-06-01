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
 * {@link GetRayHistoryServerRequest} extends {@link RequestModel}
 *
 * <p>GetRayHistoryServerRequest</p>
 */
public class GetRayHistoryServerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RayHistoryServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rayHistoryServerId;

    private GetRayHistoryServerRequest(Builder builder) {
        super(builder);
        this.rayHistoryServerId = builder.rayHistoryServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRayHistoryServerRequest create() {
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

    public static final class Builder extends Request.Builder<GetRayHistoryServerRequest, Builder> {
        private String rayHistoryServerId; 

        private Builder() {
            super();
        } 

        private Builder(GetRayHistoryServerRequest request) {
            super(request);
            this.rayHistoryServerId = request.rayHistoryServerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rhsxxx</p>
         */
        public Builder rayHistoryServerId(String rayHistoryServerId) {
            this.putPathParameter("RayHistoryServerId", rayHistoryServerId);
            this.rayHistoryServerId = rayHistoryServerId;
            return this;
        }

        @Override
        public GetRayHistoryServerRequest build() {
            return new GetRayHistoryServerRequest(this);
        } 

    } 

}
