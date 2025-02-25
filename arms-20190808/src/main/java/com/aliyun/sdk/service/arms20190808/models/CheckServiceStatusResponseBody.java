// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CheckServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceStatusResponseBody</p>
 */
public class CheckServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckServiceStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true.</li>
         * <li>false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to find logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5710C923-AD09-4293-9E11-DCBE3D15F8D4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckServiceStatusResponseBody build() {
            return new CheckServiceStatusResponseBody(this);
        } 

    } 

}
