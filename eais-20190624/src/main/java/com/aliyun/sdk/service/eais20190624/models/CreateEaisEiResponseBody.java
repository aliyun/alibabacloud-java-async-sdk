// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEaisEiResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEaisEiResponseBody</p>
 */
public class CreateEaisEiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EiInstanceId")
    private String eiInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEaisEiResponseBody(Builder builder) {
        this.eiInstanceId = builder.eiInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEaisEiResponseBody create() {
        return builder().build();
    }

    /**
     * @return eiInstanceId
     */
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String eiInstanceId; 
        private String requestId; 

        /**
         * EiInstanceId.
         */
        public Builder eiInstanceId(String eiInstanceId) {
            this.eiInstanceId = eiInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEaisEiResponseBody build() {
            return new CreateEaisEiResponseBody(this);
        } 

    } 

}
