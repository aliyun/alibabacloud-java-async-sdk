// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDemandResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDemandResponseBody</p>
 */
public class CreateDemandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DemandId")
    private String demandId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the demand.</p>
         * 
         * <strong>example:</strong>
         * <p>ed-bp11n21kq00sl71p****</p>
         */
        public Builder demandId(String demandId) {
            this.demandId = demandId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
