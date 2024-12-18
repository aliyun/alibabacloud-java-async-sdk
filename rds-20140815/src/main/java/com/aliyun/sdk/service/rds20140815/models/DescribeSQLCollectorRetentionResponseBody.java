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
 * {@link DescribeSQLCollectorRetentionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLCollectorRetentionResponseBody</p>
 */
public class DescribeSQLCollectorRetentionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSQLCollectorRetentionResponseBody(Builder builder) {
        this.configValue = builder.configValue;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLCollectorRetentionResponseBody create() {
        return builder().build();
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configValue; 
        private String requestId; 

        /**
         * <p>The retention period of the log files that are generated by the SQL Explorer feature. Valid values:</p>
         * <ul>
         * <li><strong>30:</strong> 30 days</li>
         * <li><strong>180:</strong> 180 days</li>
         * <li><strong>365</strong>: one year</li>
         * <li><strong>1095</strong>: three years</li>
         * <li><strong>1825</strong>: five years</li>
         * </ul>
         * <blockquote>
         * <p> The retention period of the log files that are generated by the SQL Explorer feature on ApsaraDB RDS for PostgreSQL instances and ApsaraDB RDS for SQL Server instances is fixed as 30 days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D5CEDCC2-CA75-43F7-9508-92F418CE6391</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSQLCollectorRetentionResponseBody build() {
            return new DescribeSQLCollectorRetentionResponseBody(this);
        } 

    } 

}
