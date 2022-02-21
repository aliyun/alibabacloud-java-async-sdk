// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDcdnUserRealTimeDeliveryFieldResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDcdnUserRealTimeDeliveryFieldResponseBody</p>
 */
public class UpdateDcdnUserRealTimeDeliveryFieldResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateDcdnUserRealTimeDeliveryFieldResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDcdnUserRealTimeDeliveryFieldResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateDcdnUserRealTimeDeliveryFieldResponseBody build() {
            return new UpdateDcdnUserRealTimeDeliveryFieldResponseBody(this);
        } 

    } 

}
