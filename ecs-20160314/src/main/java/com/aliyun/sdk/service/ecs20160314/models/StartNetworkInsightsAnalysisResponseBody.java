// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartNetworkInsightsAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>StartNetworkInsightsAnalysisResponseBody</p>
 */
public class StartNetworkInsightsAnalysisResponseBody extends TeaModel {
    @NameInMap("NetworkInsightsAnalysisId")
    private String networkInsightsAnalysisId;

    @NameInMap("RequestId")
    private String requestId;

    private StartNetworkInsightsAnalysisResponseBody(Builder builder) {
        this.networkInsightsAnalysisId = builder.networkInsightsAnalysisId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartNetworkInsightsAnalysisResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkInsightsAnalysisId
     */
    public String getNetworkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkInsightsAnalysisId; 
        private String requestId; 

        /**
         * NetworkInsightsAnalysisId.
         */
        public Builder networkInsightsAnalysisId(String networkInsightsAnalysisId) {
            this.networkInsightsAnalysisId = networkInsightsAnalysisId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartNetworkInsightsAnalysisResponseBody build() {
            return new StartNetworkInsightsAnalysisResponseBody(this);
        } 

    } 

}
