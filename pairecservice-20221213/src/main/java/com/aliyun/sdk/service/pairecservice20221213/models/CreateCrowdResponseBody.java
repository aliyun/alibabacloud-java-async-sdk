// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCrowdResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCrowdResponseBody</p>
 */
public class CreateCrowdResponseBody extends TeaModel {
    @NameInMap("CrowdId")
    private String crowdId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCrowdResponseBody(Builder builder) {
        this.crowdId = builder.crowdId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCrowdResponseBody create() {
        return builder().build();
    }

    /**
     * @return crowdId
     */
    public String getCrowdId() {
        return this.crowdId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String crowdId; 
        private String requestId; 

        /**
         * CrowdId.
         */
        public Builder crowdId(String crowdId) {
            this.crowdId = crowdId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCrowdResponseBody build() {
            return new CreateCrowdResponseBody(this);
        } 

    } 

}
