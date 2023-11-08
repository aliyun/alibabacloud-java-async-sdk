// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWaypointResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWaypointResponseBody</p>
 */
public class UpdateWaypointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateWaypointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWaypointResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateWaypointResponseBody build() {
            return new UpdateWaypointResponseBody(this);
        } 

    } 

}
