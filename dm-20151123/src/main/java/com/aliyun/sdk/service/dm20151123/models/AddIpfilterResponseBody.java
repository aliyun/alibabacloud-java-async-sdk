// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link AddIpfilterResponseBody} extends {@link TeaModel}
 *
 * <p>AddIpfilterResponseBody</p>
 */
public class AddIpfilterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpFilterId")
    private String ipFilterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddIpfilterResponseBody(Builder builder) {
        this.ipFilterId = builder.ipFilterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpfilterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipFilterId
     */
    public String getIpFilterId() {
        return this.ipFilterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipFilterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddIpfilterResponseBody model) {
            this.ipFilterId = model.ipFilterId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>ID corresponding to the IP</p>
         * 
         * <strong>example:</strong>
         * <p>10795</p>
         */
        public Builder ipFilterId(String ipFilterId) {
            this.ipFilterId = ipFilterId;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>0E9282E8-DC08-5445-8FB0-B9F0CA28B249</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddIpfilterResponseBody build() {
            return new AddIpfilterResponseBody(this);
        } 

    } 

}
