// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchedruleOnDemandResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSchedruleOnDemandResponseBody</p>
 */
public class CreateSchedruleOnDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateSchedruleOnDemandResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSchedruleOnDemandResponseBody create() {
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
         * Creates a scheduling rule for an on-demand instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSchedruleOnDemandResponseBody build() {
            return new CreateSchedruleOnDemandResponseBody(this);
        } 

    } 

}
