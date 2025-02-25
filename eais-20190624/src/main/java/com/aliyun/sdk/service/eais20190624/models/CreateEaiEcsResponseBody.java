// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

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
 * {@link CreateEaiEcsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEaiEcsResponseBody</p>
 */
public class CreateEaiEcsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientInstanceId")
    private String clientInstanceId;

    @com.aliyun.core.annotation.NameInMap("ElasticAcceleratedInstanceId")
    private String elasticAcceleratedInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEaiEcsResponseBody(Builder builder) {
        this.clientInstanceId = builder.clientInstanceId;
        this.elasticAcceleratedInstanceId = builder.elasticAcceleratedInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEaiEcsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientInstanceId
     */
    public String getClientInstanceId() {
        return this.clientInstanceId;
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
        private String clientInstanceId; 
        private String elasticAcceleratedInstanceId; 
        private String requestId; 

        /**
         * ClientInstanceId.
         */
        public Builder clientInstanceId(String clientInstanceId) {
            this.clientInstanceId = clientInstanceId;
            return this;
        }

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

        public CreateEaiEcsResponseBody build() {
            return new CreateEaiEcsResponseBody(this);
        } 

    } 

}
