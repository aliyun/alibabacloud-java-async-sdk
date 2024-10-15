// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetErServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetErServiceResponseBody</p>
 */
public class GetErServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlanName")
    private String planName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetErServiceResponseBody(Builder builder) {
        this.planName = builder.planName;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String planName; 
        private String requestId; 
        private String status; 

        /**
         * PlanName.
         */
        public Builder planName(String planName) {
            this.planName = planName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetErServiceResponseBody build() {
            return new GetErServiceResponseBody(this);
        } 

    } 

}
