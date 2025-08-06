// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodRealtimeLogAuthorizedResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodRealtimeLogAuthorizedResponseBody</p>
 */
public class DescribeVodRealtimeLogAuthorizedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizedStatus")
    private String authorizedStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodRealtimeLogAuthorizedResponseBody(Builder builder) {
        this.authorizedStatus = builder.authorizedStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodRealtimeLogAuthorizedResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizedStatus
     */
    public String getAuthorizedStatus() {
        return this.authorizedStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authorizedStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVodRealtimeLogAuthorizedResponseBody model) {
            this.authorizedStatus = model.authorizedStatus;
            this.requestId = model.requestId;
        } 

        /**
         * AuthorizedStatus.
         */
        public Builder authorizedStatus(String authorizedStatus) {
            this.authorizedStatus = authorizedStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodRealtimeLogAuthorizedResponseBody build() {
            return new DescribeVodRealtimeLogAuthorizedResponseBody(this);
        } 

    } 

}
