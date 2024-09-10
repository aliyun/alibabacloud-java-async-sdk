// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLocalDefaultRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetLocalDefaultRegionResponseBody</p>
 */
public class GetLocalDefaultRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private GetLocalDefaultRegionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLocalDefaultRegionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private Integer status; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The access type of the multi-cloud site. Valid values:
         * <p>
         * 
         * *   **0**: The current site is not the default site of the multi-cloud site. You can specify a site as the default site of the multi-cloud site.
         * *   **1**: The current site is the default site of the multi-cloud site.
         * *   **2**: Another site is set as the default site of the multi-cloud site.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public GetLocalDefaultRegionResponseBody build() {
            return new GetLocalDefaultRegionResponseBody(this);
        } 

    } 

}
