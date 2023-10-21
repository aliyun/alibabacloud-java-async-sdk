// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDBNameAvailableResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDBNameAvailableResponseBody</p>
 */
public class CheckDBNameAvailableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CheckDBNameAvailableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDBNameAvailableResponseBody create() {
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
         * <p>
         * 
         * >  If this operation returns only the ID of the request, the database name conforms to the naming conventions. If an error message is returned, the database name is duplicate or does not conform to the naming conventions.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDBNameAvailableResponseBody build() {
            return new CheckDBNameAvailableResponseBody(this);
        } 

    } 

}
