// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link OperationSuspEventsResponseBody} extends {@link TeaModel}
 *
 * <p>OperationSuspEventsResponseBody</p>
 */
public class OperationSuspEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessCode")
    private String accessCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private OperationSuspEventsResponseBody(Builder builder) {
        this.accessCode = builder.accessCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationSuspEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessCode
     */
    public String getAccessCode() {
        return this.accessCode;
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
        private String accessCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Indicates whether you have access permissions. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: yes</li>
         * <li><strong>no_permission</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        public Builder accessCode(String accessCode) {
            this.accessCode = accessCode;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether exceptions are handled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public OperationSuspEventsResponseBody build() {
            return new OperationSuspEventsResponseBody(this);
        } 

    } 

}
