// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMountPointResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyMountPointResponseBody</p>
 */
public class ModifyMountPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyMountPointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMountPointResponseBody create() {
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

        public ModifyMountPointResponseBody build() {
            return new ModifyMountPointResponseBody(this);
        } 

    } 

}
