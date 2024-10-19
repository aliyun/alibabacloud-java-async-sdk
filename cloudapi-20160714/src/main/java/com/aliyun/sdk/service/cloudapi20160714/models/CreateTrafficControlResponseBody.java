// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTrafficControlResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrafficControlResponseBody</p>
 */
public class CreateTrafficControlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficControlId")
    private String trafficControlId;

    private CreateTrafficControlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficControlId = builder.trafficControlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficControlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficControlId
     */
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public static final class Builder {
        private String requestId; 
        private String trafficControlId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the throttling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>tf123456</p>
         */
        public Builder trafficControlId(String trafficControlId) {
            this.trafficControlId = trafficControlId;
            return this;
        }

        public CreateTrafficControlResponseBody build() {
            return new CreateTrafficControlResponseBody(this);
        } 

    } 

}
