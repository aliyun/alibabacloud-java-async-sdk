// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RestartCollectorResponseBody} extends {@link TeaModel}
 *
 * <p>RestartCollectorResponseBody</p>
 */
public class RestartCollectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private RestartCollectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartCollectorResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>84B4038A-AF38-4BF4-9FAD-EA92A4FFF00A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the shipper is restarted. Valid values:</p>
         * <ul>
         * <li>true: The shipper is restarted.</li>
         * <li>false: The shipper fails to be restarted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public RestartCollectorResponseBody build() {
            return new RestartCollectorResponseBody(this);
        } 

    } 

}
