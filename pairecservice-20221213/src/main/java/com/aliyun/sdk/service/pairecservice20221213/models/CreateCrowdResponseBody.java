// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateCrowdResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCrowdResponseBody</p>
 */
public class CreateCrowdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrowdId")
    private String crowdId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateCrowdResponseBody model) {
            this.crowdId = model.crowdId;
            this.requestId = model.requestId;
        } 

        /**
         * CrowdId.
         */
        public Builder crowdId(String crowdId) {
            this.crowdId = crowdId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>59CE7EC6-F268-5D71-9215-32922CC50D72</p>
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
