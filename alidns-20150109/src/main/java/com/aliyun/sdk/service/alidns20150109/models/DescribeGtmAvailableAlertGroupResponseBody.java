// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeGtmAvailableAlertGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmAvailableAlertGroupResponseBody</p>
 */
public class DescribeGtmAvailableAlertGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableAlertGroup")
    private String availableAlertGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGtmAvailableAlertGroupResponseBody(Builder builder) {
        this.availableAlertGroup = builder.availableAlertGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmAvailableAlertGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableAlertGroup
     */
    public String getAvailableAlertGroup() {
        return this.availableAlertGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String availableAlertGroup; 
        private String requestId; 

        /**
         * <p>The available alert groups of the GTM instance.</p>
         */
        public Builder availableAlertGroup(String availableAlertGroup) {
            this.availableAlertGroup = availableAlertGroup;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>29D0F8F8-5499-4F6C-9FDC-1EE13BF55925</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGtmAvailableAlertGroupResponseBody build() {
            return new DescribeGtmAvailableAlertGroupResponseBody(this);
        } 

    } 

}
