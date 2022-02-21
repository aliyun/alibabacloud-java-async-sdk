// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMultiZoneClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMultiZoneClusterResponseBody</p>
 */
public class DeleteMultiZoneClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteMultiZoneClusterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultiZoneClusterResponseBody create() {
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

        public DeleteMultiZoneClusterResponseBody build() {
            return new DeleteMultiZoneClusterResponseBody(this);
        } 

    } 

}
