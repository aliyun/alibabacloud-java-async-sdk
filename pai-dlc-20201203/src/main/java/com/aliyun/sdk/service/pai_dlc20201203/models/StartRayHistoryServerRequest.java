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
 * {@link StartRayHistoryServerRequest} extends {@link RequestModel}
 *
 * <p>StartRayHistoryServerRequest</p>
 */
public class StartRayHistoryServerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RayHistoryServerId")
    private String rayHistoryServerId;

    private StartRayHistoryServerRequest(Builder builder) {
        super(builder);
        this.rayHistoryServerId = builder.rayHistoryServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRayHistoryServerRequest create() {
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

    public static final class Builder extends Request.Builder<StartRayHistoryServerRequest, Builder> {
        private String rayHistoryServerId; 

        private Builder() {
            super();
        } 

        private Builder(StartRayHistoryServerRequest request) {
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
        public StartRayHistoryServerRequest build() {
            return new StartRayHistoryServerRequest(this);
        } 

    } 

}
