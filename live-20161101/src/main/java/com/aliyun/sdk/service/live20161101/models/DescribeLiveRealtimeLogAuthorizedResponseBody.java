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
 * {@link DescribeLiveRealtimeLogAuthorizedResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRealtimeLogAuthorizedResponseBody</p>
 */
public class DescribeLiveRealtimeLogAuthorizedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizedStatus")
    private String authorizedStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveRealtimeLogAuthorizedResponseBody(Builder builder) {
        this.authorizedStatus = builder.authorizedStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRealtimeLogAuthorizedResponseBody create() {
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

        private Builder(DescribeLiveRealtimeLogAuthorizedResponseBody model) {
            this.authorizedStatus = model.authorizedStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The authorization status. <strong>true</strong>: authorized <strong>false</strong>: not authorized</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder authorizedStatus(String authorizedStatus) {
            this.authorizedStatus = authorizedStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0df228-4a64- af62-20e91b******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveRealtimeLogAuthorizedResponseBody build() {
            return new DescribeLiveRealtimeLogAuthorizedResponseBody(this);
        } 

    } 

}
