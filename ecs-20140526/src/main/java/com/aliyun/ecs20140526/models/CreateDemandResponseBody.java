// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDemandResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDemandResponseBody</p>
 */
public class CreateDemandResponseBody extends TeaModel {
    @NameInMap("DemandId")
    private String demandId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDemandResponseBody(Builder builder) {
        this.demandId = builder.demandId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDemandResponseBody create() {
        return builder().build();
    }

    /**
     * @return demandId
     */
    public String getDemandId() {
        return this.demandId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String demandId; 
        private String requestId; 

        /**
         * The report ID(DemandId).
         */
        public Builder demandId(String demandId) {
            this.demandId = demandId;
            return this;
        }

        /**
         * The ID of the request.
         * <p>
         * 
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDemandResponseBody build() {
            return new CreateDemandResponseBody(this);
        } 

    } 

}
