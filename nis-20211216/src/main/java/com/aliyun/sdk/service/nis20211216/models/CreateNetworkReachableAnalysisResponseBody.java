// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateNetworkReachableAnalysisResponseBody model) {
            this.networkReachableAnalysisId = model.networkReachableAnalysisId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the task for analyzing network reachability.</p>
         * 
         * <strong>example:</strong>
         * <p>nra-2fede05617494417****</p>
         */
        public Builder networkReachableAnalysisId(String networkReachableAnalysisId) {
            this.networkReachableAnalysisId = networkReachableAnalysisId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
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
