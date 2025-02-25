// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveRecycleBinTableResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveRecycleBinTableResponseBody</p>
 */
public class RemoveRecycleBinTableResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RemoveRecycleBinTableResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveRecycleBinTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Indicates whether the table in the recycle bin is deleted.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result of the request.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RemoveRecycleBinTableResponseBody build() {
            return new RemoveRecycleBinTableResponseBody(this);
        } 

    } 

}
