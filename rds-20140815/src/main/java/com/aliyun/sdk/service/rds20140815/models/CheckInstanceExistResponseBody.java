// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckInstanceExistResponseBody} extends {@link TeaModel}
 *
 * <p>CheckInstanceExistResponseBody</p>
 */
public class CheckInstanceExistResponseBody extends TeaModel {
    @NameInMap("IsExistInstance")
    private Boolean isExistInstance;

    @NameInMap("RequestId")
    private String requestId;

    private CheckInstanceExistResponseBody(Builder builder) {
        this.isExistInstance = builder.isExistInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckInstanceExistResponseBody create() {
        return builder().build();
    }

    /**
     * @return isExistInstance
     */
    public Boolean getIsExistInstance() {
        return this.isExistInstance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isExistInstance; 
        private String requestId; 

        /**
         * Indicates whether the instance exists. Valid values:
         * <p>
         * 
         * *   **true**: The instance exists.
         * *   **false**: The instance does not exist.
         */
        public Builder isExistInstance(Boolean isExistInstance) {
            this.isExistInstance = isExistInstance;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckInstanceExistResponseBody build() {
            return new CheckInstanceExistResponseBody(this);
        } 

    } 

}
