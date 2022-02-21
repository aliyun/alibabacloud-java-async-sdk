// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckZoneNameResponseBody} extends {@link TeaModel}
 *
 * <p>CheckZoneNameResponseBody</p>
 */
public class CheckZoneNameResponseBody extends TeaModel {
    @NameInMap("Check")
    private Boolean check;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CheckZoneNameResponseBody(Builder builder) {
        this.check = builder.check;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckZoneNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return check
     */
    public Boolean getCheck() {
        return this.check;
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
        private Boolean check; 
        private String requestId; 
        private Boolean success; 

        /**
         * Check.
         */
        public Builder check(Boolean check) {
            this.check = check;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckZoneNameResponseBody build() {
            return new CheckZoneNameResponseBody(this);
        } 

    } 

}
