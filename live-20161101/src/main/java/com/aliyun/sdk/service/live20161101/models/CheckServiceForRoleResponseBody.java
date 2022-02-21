// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceForRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceForRoleResponseBody</p>
 */
public class CheckServiceForRoleResponseBody extends TeaModel {
    @NameInMap("Deletable")
    private Boolean deletable;

    @NameInMap("RequestId")
    private String requestId;

    private CheckServiceForRoleResponseBody(Builder builder) {
        this.deletable = builder.deletable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceForRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return deletable
     */
    public Boolean getDeletable() {
        return this.deletable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean deletable; 
        private String requestId; 

        /**
         * Deletable.
         */
        public Builder deletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckServiceForRoleResponseBody build() {
            return new CheckServiceForRoleResponseBody(this);
        } 

    } 

}
