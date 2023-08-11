// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCCMVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCCMVersionResponseBody</p>
 */
public class DescribeCCMVersionResponseBody extends TeaModel {
    @NameInMap("CCMVersions")
    private java.util.Map < String, CCMVersionsValue > CCMVersions;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCCMVersionResponseBody(Builder builder) {
        this.CCMVersions = builder.CCMVersions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCCMVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return CCMVersions
     */
    public java.util.Map < String, CCMVersionsValue > getCCMVersions() {
        return this.CCMVersions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, CCMVersionsValue > CCMVersions; 
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder CCMVersions(java.util.Map < String, CCMVersionsValue > CCMVersions) {
            this.CCMVersions = CCMVersions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCCMVersionResponseBody build() {
            return new DescribeCCMVersionResponseBody(this);
        } 

    } 

}
