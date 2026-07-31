// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetReleaseTimeResponseBody} extends {@link TeaModel}
 *
 * <p>GetReleaseTimeResponseBody</p>
 */
public class GetReleaseTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReleaseTime")
    private String releaseTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetReleaseTimeResponseBody(Builder builder) {
        this.releaseTime = builder.releaseTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReleaseTimeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return releaseTime
     */
    public String getReleaseTime() {
        return this.releaseTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String releaseTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetReleaseTimeResponseBody model) {
            this.releaseTime = model.releaseTime;
            this.requestId = model.requestId;
        } 

        /**
         * ReleaseTime.
         */
        public Builder releaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetReleaseTimeResponseBody build() {
            return new GetReleaseTimeResponseBody(this);
        } 

    } 

}
