// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyServiceMeshNameResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyServiceMeshNameResponseBody</p>
 */
public class ModifyServiceMeshNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyServiceMeshNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyServiceMeshNameResponseBody create() {
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

        public ModifyServiceMeshNameResponseBody build() {
            return new ModifyServiceMeshNameResponseBody(this);
        } 

    } 

}
