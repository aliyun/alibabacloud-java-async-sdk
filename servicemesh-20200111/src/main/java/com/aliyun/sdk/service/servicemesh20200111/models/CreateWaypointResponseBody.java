// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWaypointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWaypointResponseBody</p>
 */
public class CreateWaypointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateWaypointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWaypointResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateWaypointResponseBody build() {
            return new CreateWaypointResponseBody(this);
        } 

    } 

}