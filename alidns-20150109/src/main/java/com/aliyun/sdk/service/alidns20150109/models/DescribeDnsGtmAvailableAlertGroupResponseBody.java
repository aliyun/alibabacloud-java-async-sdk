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
 * {@link DescribeDnsGtmAvailableAlertGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAvailableAlertGroupResponseBody</p>
 */
public class DescribeDnsGtmAvailableAlertGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableAlertGroup")
    private String availableAlertGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDnsGtmAvailableAlertGroupResponseBody(Builder builder) {
        this.availableAlertGroup = builder.availableAlertGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAvailableAlertGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDnsGtmAvailableAlertGroupResponseBody model) {
            this.availableAlertGroup = model.availableAlertGroup;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned available alert groups.</p>
         */
        public Builder availableAlertGroup(String availableAlertGroup) {
            this.availableAlertGroup = availableAlertGroup;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDnsGtmAvailableAlertGroupResponseBody build() {
            return new DescribeDnsGtmAvailableAlertGroupResponseBody(this);
        } 

    } 

}
