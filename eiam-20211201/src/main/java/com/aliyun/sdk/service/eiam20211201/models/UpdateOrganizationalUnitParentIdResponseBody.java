// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOrganizationalUnitParentIdResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateOrganizationalUnitParentIdResponseBody</p>
 */
public class UpdateOrganizationalUnitParentIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateOrganizationalUnitParentIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOrganizationalUnitParentIdResponseBody create() {
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

        public UpdateOrganizationalUnitParentIdResponseBody build() {
            return new UpdateOrganizationalUnitParentIdResponseBody(this);
        } 

    } 

}
