// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateColdStorageInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateColdStorageInstanceResponseBody</p>
 */
public class CreateColdStorageInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColdStorageInstanceId")
    private String coldStorageInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateColdStorageInstanceResponseBody(Builder builder) {
        this.coldStorageInstanceId = builder.coldStorageInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateColdStorageInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return coldStorageInstanceId
     */
    public String getColdStorageInstanceId() {
        return this.coldStorageInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String coldStorageInstanceId; 
        private String requestId; 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pcs_2zeth2gf4i83e578t</p>
         */
        public Builder coldStorageInstanceId(String coldStorageInstanceId) {
            this.coldStorageInstanceId = coldStorageInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F6EBB4ED-D12F-5F49-824C-9DD9C0EC4CF2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateColdStorageInstanceResponseBody build() {
            return new CreateColdStorageInstanceResponseBody(this);
        } 

    } 

}
