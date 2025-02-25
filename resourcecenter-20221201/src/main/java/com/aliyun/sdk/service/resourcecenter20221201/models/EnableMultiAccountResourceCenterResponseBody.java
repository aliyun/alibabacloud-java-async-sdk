// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableMultiAccountResourceCenterResponseBody} extends {@link TeaModel}
 *
 * <p>EnableMultiAccountResourceCenterResponseBody</p>
 */
public class EnableMultiAccountResourceCenterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private EnableMultiAccountResourceCenterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableMultiAccountResourceCenterResponseBody create() {
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
         * <p>767038B7-2027-5508-858B-E213232D57D5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the feature. Valid values:</p>
         * <ul>
         * <li>Pending: The feature is being enabled.</li>
         * <li>Enabled: The feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public EnableMultiAccountResourceCenterResponseBody build() {
            return new EnableMultiAccountResourceCenterResponseBody(this);
        } 

    } 

}
