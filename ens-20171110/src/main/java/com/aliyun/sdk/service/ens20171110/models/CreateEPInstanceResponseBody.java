// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEPInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEPInstanceResponseBody</p>
 */
public class CreateEPInstanceResponseBody extends TeaModel {
    @NameInMap("EPNInstanceId")
    private String EPNInstanceId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateEPInstanceResponseBody(Builder builder) {
        this.EPNInstanceId = builder.EPNInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEPInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String EPNInstanceId; 
        private String requestId; 

        /**
         * EPNInstanceId.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEPInstanceResponseBody build() {
            return new CreateEPInstanceResponseBody(this);
        } 

    } 

}
