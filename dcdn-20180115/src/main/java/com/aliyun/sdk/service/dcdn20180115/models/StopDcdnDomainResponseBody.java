// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDcdnDomainResponseBody} extends {@link TeaModel}
 *
 * <p>StopDcdnDomainResponseBody</p>
 */
public class StopDcdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StopDcdnDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDcdnDomainResponseBody create() {
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

        public StopDcdnDomainResponseBody build() {
            return new StopDcdnDomainResponseBody(this);
        } 

    } 

}
