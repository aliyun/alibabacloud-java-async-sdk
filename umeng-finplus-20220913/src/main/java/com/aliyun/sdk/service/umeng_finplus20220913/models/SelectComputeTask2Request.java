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
 * {@link SelectComputeTask2Request} extends {@link RequestModel}
 *
 * <p>SelectComputeTask2Request</p>
 */
public class SelectComputeTask2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bcConfirm")
    private Boolean bcConfirm;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bcId")
    private Long bcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    private SelectComputeTask2Request(Builder builder) {
        super(builder);
        this.bcConfirm = builder.bcConfirm;
        this.bcId = builder.bcId;
        this.clientId = builder.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectComputeTask2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bcConfirm
     */
    public Boolean getBcConfirm() {
        return this.bcConfirm;
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

    public static final class Builder extends Request.Builder<SelectComputeTask2Request, Builder> {
        private Boolean bcConfirm; 
        private Long bcId; 
        private Long clientId; 

        private Builder() {
            super();
        } 

        private Builder(SelectComputeTask2Request request) {
            super(request);
            this.bcConfirm = request.bcConfirm;
            this.bcId = request.bcId;
            this.clientId = request.clientId;
        } 

        /**
         * bcConfirm.
         */
        public Builder bcConfirm(Boolean bcConfirm) {
            this.putBodyParameter("bcConfirm", bcConfirm);
            this.bcConfirm = bcConfirm;
            return this;
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
        public SelectComputeTask2Request build() {
            return new SelectComputeTask2Request(this);
        } 

    } 

}
