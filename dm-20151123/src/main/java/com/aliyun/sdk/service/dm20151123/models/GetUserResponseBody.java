// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>Returned Content</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableEventbridge")
        private Boolean enableEventbridge;

        private Data(Builder builder) {
            this.enableEventbridge = builder.enableEventbridge;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enableEventbridge
         */
        public Boolean getEnableEventbridge() {
            return this.enableEventbridge;
        }

        public static final class Builder {
            private Boolean enableEventbridge; 

            /**
             * <p>Whether EventBridge is enabled</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableEventbridge(Boolean enableEventbridge) {
                this.enableEventbridge = enableEventbridge;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
