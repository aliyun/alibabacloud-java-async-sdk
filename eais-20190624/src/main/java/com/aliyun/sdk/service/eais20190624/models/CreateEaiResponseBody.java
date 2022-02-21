// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEaiResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEaiResponseBody</p>
 */
public class CreateEaiResponseBody extends TeaModel {
    @NameInMap("ElasticAcceleratedInstanceId")
    private String elasticAcceleratedInstanceId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateEaiResponseBody(Builder builder) {
        this.elasticAcceleratedInstanceId = builder.elasticAcceleratedInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEaiResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticAcceleratedInstanceId
     */
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String elasticAcceleratedInstanceId; 
        private String requestId; 

        /**
         * ElasticAcceleratedInstanceId.
         */
        public Builder elasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
            this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEaiResponseBody build() {
            return new CreateEaiResponseBody(this);
        } 

    } 

}
