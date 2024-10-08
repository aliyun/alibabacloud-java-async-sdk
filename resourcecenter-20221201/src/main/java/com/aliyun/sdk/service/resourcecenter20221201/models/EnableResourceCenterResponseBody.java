// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableResourceCenterResponseBody} extends {@link TeaModel}
 *
 * <p>EnableResourceCenterResponseBody</p>
 */
public class EnableResourceCenterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private EnableResourceCenterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableResourceCenterResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>45357BEF-AB50-5E4D-B05D-5A882A4BE924</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The activation status of the service. Valid values:</p>
         * <ul>
         * <li>Pending: The service is being activated.</li>
         * <li>Enabled: The service is activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public EnableResourceCenterResponseBody build() {
            return new EnableResourceCenterResponseBody(this);
        } 

    } 

}
