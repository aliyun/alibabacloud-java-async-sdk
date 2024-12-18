// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdatePostgresExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePostgresExtensionsResponseBody</p>
 */
public class UpdatePostgresExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdatePostgresExtensionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePostgresExtensionsResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7E4448A6-9FE6-4474-A0C1-AA7CFC772CAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePostgresExtensionsResponseBody build() {
            return new UpdatePostgresExtensionsResponseBody(this);
        } 

    } 

}
