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
 * {@link BucUserEnterpriseListResult} extends {@link TeaModel}
 *
 * <p>BucUserEnterpriseListResult</p>
 */
public class BucUserEnterpriseListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<BucEnterprise> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private BucUserEnterpriseListResult(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BucUserEnterpriseListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<BucEnterprise> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<BucEnterprise> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BucUserEnterpriseListResult model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<BucEnterprise> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BucUserEnterpriseListResult build() {
            return new BucUserEnterpriseListResult(this);
        } 

    } 

}
