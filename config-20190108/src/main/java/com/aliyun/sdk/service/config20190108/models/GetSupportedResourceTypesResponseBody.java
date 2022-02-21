// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSupportedResourceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupportedResourceTypesResponseBody</p>
 */
public class GetSupportedResourceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceTypes")
    private java.util.List < String > resourceTypes;

    private GetSupportedResourceTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupportedResourceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List < String > getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > resourceTypes; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceTypes.
         */
        public Builder resourceTypes(java.util.List < String > resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public GetSupportedResourceTypesResponseBody build() {
            return new GetSupportedResourceTypesResponseBody(this);
        } 

    } 

}
