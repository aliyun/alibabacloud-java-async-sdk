// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link UpdateSharedAccountPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSharedAccountPermissionResponseBody</p>
 */
public class UpdateSharedAccountPermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateSharedAccountPermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSharedAccountPermissionResponseBody create() {
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
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p>C68B41B4-A646-5680-8A33-67884E3823A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateSharedAccountPermissionResponseBody build() {
            return new UpdateSharedAccountPermissionResponseBody(this);
        } 

    } 

}
