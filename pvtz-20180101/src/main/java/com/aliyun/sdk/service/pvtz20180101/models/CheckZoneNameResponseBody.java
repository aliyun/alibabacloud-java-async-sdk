// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckZoneNameResponseBody} extends {@link TeaModel}
 *
 * <p>CheckZoneNameResponseBody</p>
 */
public class CheckZoneNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Check")
    private Boolean check;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * Indicates whether the zone name is valid. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder check(Boolean check) {
            this.check = check;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
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
