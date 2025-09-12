// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link CancelTask2Request} extends {@link RequestModel}
 *
 * <p>CancelTask2Request</p>
 */
public class CancelTask2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bcId")
    private Long bcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    private CancelTask2Request(Builder builder) {
        super(builder);
        this.bcId = builder.bcId;
        this.clientId = builder.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelTask2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bcId
     */
    public Long getBcId() {
        return this.bcId;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    public static final class Builder extends Request.Builder<CancelTask2Request, Builder> {
        private Long bcId; 
        private Long clientId; 

        private Builder() {
            super();
        } 

        private Builder(CancelTask2Request request) {
            super(request);
            this.bcId = request.bcId;
            this.clientId = request.clientId;
        } 

        /**
         * bcId.
         */
        public Builder bcId(Long bcId) {
            this.putBodyParameter("bcId", bcId);
            this.bcId = bcId;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putBodyParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        @Override
        public CancelTask2Request build() {
            return new CancelTask2Request(this);
        } 

    } 

}
