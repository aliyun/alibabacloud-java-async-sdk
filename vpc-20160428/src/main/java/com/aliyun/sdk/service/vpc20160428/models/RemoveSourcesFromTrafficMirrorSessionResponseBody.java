// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSourcesFromTrafficMirrorSessionResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveSourcesFromTrafficMirrorSessionResponseBody</p>
 */
public class RemoveSourcesFromTrafficMirrorSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RemoveSourcesFromTrafficMirrorSessionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveSourcesFromTrafficMirrorSessionResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveSourcesFromTrafficMirrorSessionResponseBody build() {
            return new RemoveSourcesFromTrafficMirrorSessionResponseBody(this);
        } 

    } 

}
