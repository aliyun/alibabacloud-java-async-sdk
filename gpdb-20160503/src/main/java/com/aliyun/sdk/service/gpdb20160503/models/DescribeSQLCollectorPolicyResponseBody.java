// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLCollectorPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLCollectorPolicyResponseBody</p>
 */
public class DescribeSQLCollectorPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SQLCollectorStatus")
    private String SQLCollectorStatus;

    private DescribeSQLCollectorPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SQLCollectorStatus = builder.SQLCollectorStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLCollectorPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQLCollectorStatus
     */
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

    public static final class Builder {
        private String requestId; 
        private String SQLCollectorStatus; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SQLCollectorStatus.
         */
        public Builder SQLCollectorStatus(String SQLCollectorStatus) {
            this.SQLCollectorStatus = SQLCollectorStatus;
            return this;
        }

        public DescribeSQLCollectorPolicyResponseBody build() {
            return new DescribeSQLCollectorPolicyResponseBody(this);
        } 

    } 

}
