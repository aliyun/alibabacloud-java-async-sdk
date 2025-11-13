// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link AddRecursionZoneResponseBody} extends {@link TeaModel}
 *
 * <p>AddRecursionZoneResponseBody</p>
 */
public class AddRecursionZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private AddRecursionZoneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRecursionZoneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(AddRecursionZoneResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
            this.zoneId = model.zoneId;
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

        /**
         * <p>Zone ID。</p>
         * 
         * <strong>example:</strong>
         * <p>173671468000011</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public AddRecursionZoneResponseBody build() {
            return new AddRecursionZoneResponseBody(this);
        } 

    } 

}
