// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link GetDeveloperEnterpriseResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeveloperEnterpriseResponseBody</p>
 */
public class GetDeveloperEnterpriseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enterprise")
    private Enterprise enterprise;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDeveloperEnterpriseResponseBody(Builder builder) {
        this.enterprise = builder.enterprise;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeveloperEnterpriseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterprise
     */
    public Enterprise getEnterprise() {
        return this.enterprise;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Enterprise enterprise; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDeveloperEnterpriseResponseBody model) {
            this.enterprise = model.enterprise;
            this.requestId = model.requestId;
        } 

        /**
         * enterprise.
         */
        public Builder enterprise(Enterprise enterprise) {
            this.enterprise = enterprise;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeveloperEnterpriseResponseBody build() {
            return new GetDeveloperEnterpriseResponseBody(this);
        } 

    } 

}
