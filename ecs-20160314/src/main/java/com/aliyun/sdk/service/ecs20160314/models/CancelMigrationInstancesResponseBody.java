// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelMigrationInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>CancelMigrationInstancesResponseBody</p>
 */
public class CancelMigrationInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelMigrationInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelMigrationInstancesResponseBody create() {
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

        public CancelMigrationInstancesResponseBody build() {
            return new CancelMigrationInstancesResponseBody(this);
        } 

    } 

}
