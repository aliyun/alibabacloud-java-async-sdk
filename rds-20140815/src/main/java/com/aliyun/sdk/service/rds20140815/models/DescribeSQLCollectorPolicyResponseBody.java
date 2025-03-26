// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeSQLCollectorPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLCollectorPolicyResponseBody</p>
 */
public class DescribeSQLCollectorPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLCollectorStatus")
    private String SQLCollectorStatus;

    @com.aliyun.core.annotation.NameInMap("StoragePeriod")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSQLCollectorPolicyResponseBody model) {
            this.requestId = model.requestId;
            this.SQLCollectorStatus = model.SQLCollectorStatus;
            this.storagePeriod = model.storagePeriod;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the SQL Explorer (SQL Audit) feature. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder SQLCollectorStatus(String SQLCollectorStatus) {
            this.SQLCollectorStatus = SQLCollectorStatus;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
