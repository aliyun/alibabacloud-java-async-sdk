// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkReachableAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkReachableAnalysisResponseBody</p>
 */
public class CreateNetworkReachableAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkReachableAnalysisId")
    private String networkReachableAnalysisId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNetworkReachableAnalysisResponseBody(Builder builder) {
        this.networkReachableAnalysisId = builder.networkReachableAnalysisId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkReachableAnalysisResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkReachableAnalysisId
     */
    public String getNetworkReachableAnalysisId() {
        return this.networkReachableAnalysisId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkReachableAnalysisId; 
        private String requestId; 

        /**
         * The ID of the task for analyzing network reachability.
         */
        public Builder networkReachableAnalysisId(String networkReachableAnalysisId) {
            this.networkReachableAnalysisId = networkReachableAnalysisId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkReachableAnalysisResponseBody build() {
            return new CreateNetworkReachableAnalysisResponseBody(this);
        } 

    } 

}
