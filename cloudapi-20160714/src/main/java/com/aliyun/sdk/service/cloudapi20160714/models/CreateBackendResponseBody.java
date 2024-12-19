// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreateBackendResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackendResponseBody</p>
 */
public class CreateBackendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendId")
    private String backendId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBackendResponseBody(Builder builder) {
        this.backendId = builder.backendId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackendResponseBody create() {
        return builder().build();
    }

    /**
     * @return backendId
     */
    public String getBackendId() {
        return this.backendId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String backendId; 
        private String requestId; 

        /**
         * <p>The ID of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>0d105f80a8f340408bd34954d4e4ff22</p>
         */
        public Builder backendId(String backendId) {
            this.backendId = backendId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>66D84355-164D-53ED-81FF-03DCF181DE24</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBackendResponseBody build() {
            return new CreateBackendResponseBody(this);
        } 

    } 

}
