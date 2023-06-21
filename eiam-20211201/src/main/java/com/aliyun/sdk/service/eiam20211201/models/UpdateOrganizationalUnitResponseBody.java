// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateOrganizationalUnitResponseBody</p>
 */
public class UpdateOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateOrganizationalUnitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOrganizationalUnitResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateOrganizationalUnitResponseBody build() {
            return new UpdateOrganizationalUnitResponseBody(this);
        } 

    } 

}
