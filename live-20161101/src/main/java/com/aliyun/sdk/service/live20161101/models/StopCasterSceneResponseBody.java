// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopCasterSceneResponseBody} extends {@link TeaModel}
 *
 * <p>StopCasterSceneResponseBody</p>
 */
public class StopCasterSceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StopCasterSceneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopCasterSceneResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StopCasterSceneResponseBody build() {
            return new StopCasterSceneResponseBody(this);
        } 

    } 

}
