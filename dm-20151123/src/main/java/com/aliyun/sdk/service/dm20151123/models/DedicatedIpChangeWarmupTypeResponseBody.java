// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link DedicatedIpChangeWarmupTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DedicatedIpChangeWarmupTypeResponseBody</p>
 */
public class DedicatedIpChangeWarmupTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DedicatedIpChangeWarmupTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DedicatedIpChangeWarmupTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(DedicatedIpChangeWarmupTypeResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DedicatedIpChangeWarmupTypeResponseBody build() {
            return new DedicatedIpChangeWarmupTypeResponseBody(this);
        } 

    } 

}
