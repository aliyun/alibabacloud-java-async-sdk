// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkInsightsPathResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkInsightsPathResponseBody</p>
 */
public class CreateNetworkInsightsPathResponseBody extends TeaModel {
    @NameInMap("NetworkInsightsPathId")
    private String networkInsightsPathId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateNetworkInsightsPathResponseBody(Builder builder) {
        this.networkInsightsPathId = builder.networkInsightsPathId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkInsightsPathResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkInsightsPathId
     */
    public String getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkInsightsPathId; 
        private String requestId; 

        /**
         * NetworkInsightsPathId.
         */
        public Builder networkInsightsPathId(String networkInsightsPathId) {
            this.networkInsightsPathId = networkInsightsPathId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkInsightsPathResponseBody build() {
            return new CreateNetworkInsightsPathResponseBody(this);
        } 

    } 

}
