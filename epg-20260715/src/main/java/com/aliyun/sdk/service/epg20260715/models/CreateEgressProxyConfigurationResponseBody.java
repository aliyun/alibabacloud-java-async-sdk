// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link CreateEgressProxyConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEgressProxyConfigurationResponseBody</p>
 */
public class CreateEgressProxyConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationId")
    private String egressProxyConfigurationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEgressProxyConfigurationResponseBody(Builder builder) {
        this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEgressProxyConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyConfigurationId
     */
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String egressProxyConfigurationId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateEgressProxyConfigurationResponseBody model) {
            this.egressProxyConfigurationId = model.egressProxyConfigurationId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the egress proxy configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>epc-uf609a6a8fdf9f4d****</p>
         */
        public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C79118A9-CA6D-5359-B53E-111BE8A03DCF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEgressProxyConfigurationResponseBody build() {
            return new CreateEgressProxyConfigurationResponseBody(this);
        } 

    } 

}
