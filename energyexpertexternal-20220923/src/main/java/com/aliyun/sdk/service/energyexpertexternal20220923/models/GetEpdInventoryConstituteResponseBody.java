// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEpdInventoryConstituteResponseBody} extends {@link TeaModel}
 *
 * <p>GetEpdInventoryConstituteResponseBody</p>
 */
public class GetEpdInventoryConstituteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < EpdInventoryConstituteItem > data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetEpdInventoryConstituteResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEpdInventoryConstituteResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < EpdInventoryConstituteItem > getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EpdInventoryConstituteItem > data; 
        private String requestId; 

        /**
         * List of environmental impact results.
         */
        public Builder data(java.util.List < EpdInventoryConstituteItem > data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEpdInventoryConstituteResponseBody build() {
            return new GetEpdInventoryConstituteResponseBody(this);
        } 

    } 

}
