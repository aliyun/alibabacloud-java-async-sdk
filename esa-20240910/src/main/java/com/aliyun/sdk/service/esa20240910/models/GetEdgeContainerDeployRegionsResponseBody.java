// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEdgeContainerDeployRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerDeployRegionsResponseBody</p>
 */
public class GetEdgeContainerDeployRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List < String > regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEdgeContainerDeployRegionsResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerDeployRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return regions
     */
    public java.util.List < String > getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > regions; 
        private String requestId; 

        /**
         * Regions.
         */
        public Builder regions(java.util.List < String > regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEdgeContainerDeployRegionsResponseBody build() {
            return new GetEdgeContainerDeployRegionsResponseBody(this);
        } 

    } 

}
