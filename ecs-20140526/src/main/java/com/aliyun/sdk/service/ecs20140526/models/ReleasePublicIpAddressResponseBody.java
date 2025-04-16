// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ReleasePublicIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>ReleasePublicIpAddressResponseBody</p>
 */
public class ReleasePublicIpAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemainTimes")
    private String remainTimes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReleasePublicIpAddressResponseBody(Builder builder) {
        this.remainTimes = builder.remainTimes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleasePublicIpAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return remainTimes
     */
    public String getRemainTimes() {
        return this.remainTimes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String remainTimes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ReleasePublicIpAddressResponseBody model) {
            this.remainTimes = model.remainTimes;
            this.requestId = model.requestId;
        } 

        /**
         * <blockquote>
         * <p>This parameter is unavailable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder remainTimes(String remainTimes) {
            this.remainTimes = remainTimes;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReleasePublicIpAddressResponseBody build() {
            return new ReleasePublicIpAddressResponseBody(this);
        } 

    } 

}
