// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateParamResponseBody} extends {@link TeaModel}
 *
 * <p>CreateParamResponseBody</p>
 */
public class CreateParamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParamId")
    private Long paramId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateParamResponseBody(Builder builder) {
        this.paramId = builder.paramId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateParamResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paramId
     */
    public Long getParamId() {
        return this.paramId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long paramId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateParamResponseBody model) {
            this.paramId = model.paramId;
            this.requestId = model.requestId;
        } 

        /**
         * ParamId.
         */
        public Builder paramId(Long paramId) {
            this.paramId = paramId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F8F613A9-DF1C-551A-88E1-397A3981A785</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateParamResponseBody build() {
            return new CreateParamResponseBody(this);
        } 

    } 

}
