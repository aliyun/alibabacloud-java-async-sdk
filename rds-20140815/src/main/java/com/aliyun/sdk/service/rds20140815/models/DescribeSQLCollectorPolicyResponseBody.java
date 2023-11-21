// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @NameInMap("StoragePeriod")
    private Integer storagePeriod;

    private DescribeSQLCollectorPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SQLCollectorStatus = builder.SQLCollectorStatus;
        this.storagePeriod = builder.storagePeriod;
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

    /**
     * @return storagePeriod
     */
    public Integer getStoragePeriod() {
        return this.storagePeriod;
    }

    public static final class Builder {
        private String requestId; 
        private String SQLCollectorStatus; 
        private Integer storagePeriod; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the SQL Explorer (SQL Audit) feature. Valid values:
         * <p>
         * 
         * *   **Enable**
         * *   **Disabled**
         */
        public Builder SQLCollectorStatus(String SQLCollectorStatus) {
            this.SQLCollectorStatus = SQLCollectorStatus;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder storagePeriod(Integer storagePeriod) {
            this.storagePeriod = storagePeriod;
            return this;
        }

        public DescribeSQLCollectorPolicyResponseBody build() {
            return new DescribeSQLCollectorPolicyResponseBody(this);
        } 

    } 

}
