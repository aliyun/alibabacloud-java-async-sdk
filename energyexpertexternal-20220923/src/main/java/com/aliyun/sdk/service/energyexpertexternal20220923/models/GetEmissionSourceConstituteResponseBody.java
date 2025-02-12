// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetEmissionSourceConstituteResponseBody} extends {@link TeaModel}
 *
 * <p>GetEmissionSourceConstituteResponseBody</p>
 */
public class GetEmissionSourceConstituteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<ConstituteItem> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetEmissionSourceConstituteResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEmissionSourceConstituteResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<ConstituteItem> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ConstituteItem> data; 
        private String requestId; 

        /**
         * <p>Response parameters</p>
         */
        public Builder data(java.util.List<ConstituteItem> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9bc20a5a-b26b-4c28-922a-7cd10b61f96f</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEmissionSourceConstituteResponseBody build() {
            return new GetEmissionSourceConstituteResponseBody(this);
        } 

    } 

}
