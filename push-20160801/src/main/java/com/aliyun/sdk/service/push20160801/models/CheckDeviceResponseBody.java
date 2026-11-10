// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link CheckDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDeviceResponseBody</p>
 */
public class CheckDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Available")
    private Boolean available;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckDeviceResponseBody(Builder builder) {
        this.available = builder.available;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDeviceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return available
     */
    public Boolean getAvailable() {
        return this.available;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean available; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckDeviceResponseBody model) {
            this.available = model.available;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the device is active.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder available(Boolean available) {
            this.available = available;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDeviceResponseBody build() {
            return new CheckDeviceResponseBody(this);
        } 

    } 

}
