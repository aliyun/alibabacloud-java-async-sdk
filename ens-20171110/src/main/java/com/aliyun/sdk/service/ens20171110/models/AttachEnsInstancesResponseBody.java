// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachEnsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>AttachEnsInstancesResponseBody</p>
 */
public class AttachEnsInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AttachEnsInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachEnsInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AttachEnsInstancesResponseBody build() {
            return new AttachEnsInstancesResponseBody(this);
        } 

    } 

}
