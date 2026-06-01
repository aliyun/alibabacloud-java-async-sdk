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
 * {@link CreateRayHistoryServerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRayHistoryServerResponseBody</p>
 */
public class CreateRayHistoryServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RayHistoryServerId")
    private String rayHistoryServerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRayHistoryServerResponseBody(Builder builder) {
        this.rayHistoryServerId = builder.rayHistoryServerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRayHistoryServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rayHistoryServerId
     */
    public String getRayHistoryServerId() {
        return this.rayHistoryServerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String rayHistoryServerId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRayHistoryServerResponseBody model) {
            this.rayHistoryServerId = model.rayHistoryServerId;
            this.requestId = model.requestId;
        } 

        /**
         * RayHistoryServerId.
         */
        public Builder rayHistoryServerId(String rayHistoryServerId) {
            this.rayHistoryServerId = rayHistoryServerId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRayHistoryServerResponseBody build() {
            return new CreateRayHistoryServerResponseBody(this);
        } 

    } 

}
