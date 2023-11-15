// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVscMountPointResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteVscMountPointResponseBody</p>
 */
public class DeleteVscMountPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteVscMountPointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVscMountPointResponseBody create() {
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

        public DeleteVscMountPointResponseBody build() {
            return new DeleteVscMountPointResponseBody(this);
        } 

    } 

}
