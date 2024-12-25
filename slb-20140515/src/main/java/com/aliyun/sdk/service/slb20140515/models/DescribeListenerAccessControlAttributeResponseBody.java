// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link DescribeListenerAccessControlAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeListenerAccessControlAttributeResponseBody</p>
 */
public class DescribeListenerAccessControlAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessControlStatus")
    private String accessControlStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceItems")
    private String sourceItems;

    private DescribeListenerAccessControlAttributeResponseBody(Builder builder) {
        this.accessControlStatus = builder.accessControlStatus;
        this.requestId = builder.requestId;
        this.sourceItems = builder.sourceItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListenerAccessControlAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessControlStatus
     */
    public String getAccessControlStatus() {
        return this.accessControlStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceItems
     */
    public String getSourceItems() {
        return this.sourceItems;
    }

    public static final class Builder {
        private String accessControlStatus; 
        private String requestId; 
        private String sourceItems; 

        /**
         * <p>Indicates whether the whitelist is enabled. Valid values:</p>
         * <ul>
         * <li><strong>open_white_list</strong>: the whitelist is enabled.</li>
         * <li><strong>close</strong>: the whitelist is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open_white_list</p>
         */
        public Builder accessControlStatus(String accessControlStatus) {
            this.accessControlStatus = accessControlStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried ACLs.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceItems(String sourceItems) {
            this.sourceItems = sourceItems;
            return this;
        }

        public DescribeListenerAccessControlAttributeResponseBody build() {
            return new DescribeListenerAccessControlAttributeResponseBody(this);
        } 

    } 

}
