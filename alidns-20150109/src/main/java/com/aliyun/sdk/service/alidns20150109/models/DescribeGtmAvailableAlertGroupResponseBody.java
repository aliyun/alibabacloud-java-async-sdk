// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The available alert groups of the GTM instance.
         */
        public Builder availableAlertGroup(String availableAlertGroup) {
            this.availableAlertGroup = availableAlertGroup;
            return this;
        }

        /**
         * The ID of the request.
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
