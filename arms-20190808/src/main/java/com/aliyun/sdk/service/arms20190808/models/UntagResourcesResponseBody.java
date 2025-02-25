// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UntagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>UntagResourcesResponseBody</p>
 */
public class UntagResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UntagResourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * <p>The returned struct.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FC183B5E-C9AD-5E9E-937F-*******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UntagResourcesResponseBody build() {
            return new UntagResourcesResponseBody(this);
        } 

    } 

}
