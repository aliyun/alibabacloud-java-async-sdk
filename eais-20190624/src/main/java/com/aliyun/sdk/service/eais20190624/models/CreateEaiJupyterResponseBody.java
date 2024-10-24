// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEaiJupyterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEaiJupyterResponseBody</p>
 */
public class CreateEaiJupyterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticAcceleratedInstanceId")
    private String elasticAcceleratedInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEaiJupyterResponseBody(Builder builder) {
        this.elasticAcceleratedInstanceId = builder.elasticAcceleratedInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEaiJupyterResponseBody create() {
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

        public CreateEaiJupyterResponseBody build() {
            return new CreateEaiJupyterResponseBody(this);
        } 

    } 

}
