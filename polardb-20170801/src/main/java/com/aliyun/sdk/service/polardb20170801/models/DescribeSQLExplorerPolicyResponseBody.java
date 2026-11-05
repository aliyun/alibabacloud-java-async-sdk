// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeSQLExplorerPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLExplorerPolicyResponseBody</p>
 */
public class DescribeSQLExplorerPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLCollectorStatus")
    private String SQLCollectorStatus;

    private DescribeSQLExplorerPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SQLCollectorStatus = builder.SQLCollectorStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLExplorerPolicyResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private String SQLCollectorStatus; 

        private Builder() {
        } 

        private Builder(DescribeSQLExplorerPolicyResponseBody model) {
            this.requestId = model.requestId;
            this.SQLCollectorStatus = model.SQLCollectorStatus;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3655211B-4D74-4E13-91E6-FF2AFE******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the SQL Explorer feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder SQLCollectorStatus(String SQLCollectorStatus) {
            this.SQLCollectorStatus = SQLCollectorStatus;
            return this;
        }

        public DescribeSQLExplorerPolicyResponseBody build() {
            return new DescribeSQLExplorerPolicyResponseBody(this);
        } 

    } 

}
