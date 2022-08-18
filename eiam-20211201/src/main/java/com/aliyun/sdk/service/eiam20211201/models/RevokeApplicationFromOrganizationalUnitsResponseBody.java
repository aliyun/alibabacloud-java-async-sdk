// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeApplicationFromOrganizationalUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>RevokeApplicationFromOrganizationalUnitsResponseBody</p>
 */
public class RevokeApplicationFromOrganizationalUnitsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RevokeApplicationFromOrganizationalUnitsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeApplicationFromOrganizationalUnitsResponseBody create() {
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RevokeApplicationFromOrganizationalUnitsResponseBody build() {
            return new RevokeApplicationFromOrganizationalUnitsResponseBody(this);
        } 

    } 

}
