// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateRtcMPUEventSubResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRtcMPUEventSubResponseBody</p>
 */
public class CreateRtcMPUEventSubResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubId")
    private String subId;

    private CreateRtcMPUEventSubResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subId = builder.subId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRtcMPUEventSubResponseBody create() {
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
     * @return subId
     */
    public String getSubId() {
        return this.subId;
    }

    public static final class Builder {
        private String requestId; 
        private String subId; 

        private Builder() {
        } 

        private Builder(CreateRtcMPUEventSubResponseBody model) {
            this.requestId = model.requestId;
            this.subId = model.subId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>Sub-<strong><strong><strong>9799B2C4500</strong></strong></strong></p>
         */
        public Builder subId(String subId) {
            this.subId = subId;
            return this;
        }

        public CreateRtcMPUEventSubResponseBody build() {
            return new CreateRtcMPUEventSubResponseBody(this);
        } 

    } 

}
