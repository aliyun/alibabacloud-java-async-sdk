// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMpServerlessRoleExistsResponseBody} extends {@link TeaModel}
 *
 * <p>CheckMpServerlessRoleExistsResponseBody</p>
 */
public class CheckMpServerlessRoleExistsResponseBody extends TeaModel {
    @NameInMap("Exists")
    private Boolean exists;

    @NameInMap("RequestId")
    private String requestId;

    private CheckMpServerlessRoleExistsResponseBody(Builder builder) {
        this.exists = builder.exists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMpServerlessRoleExistsResponseBody create() {
        return builder().build();
    }

    /**
     * @return exists
     */
    public Boolean getExists() {
        return this.exists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean exists; 
        private String requestId; 

        /**
         * Exists.
         */
        public Builder exists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckMpServerlessRoleExistsResponseBody build() {
            return new CheckMpServerlessRoleExistsResponseBody(this);
        } 

    } 

}
