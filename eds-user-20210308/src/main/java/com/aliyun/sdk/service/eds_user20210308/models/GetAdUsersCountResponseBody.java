// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link GetAdUsersCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAdUsersCountResponseBody</p>
 */
public class GetAdUsersCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdUserCount")
    private Integer adUserCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAdUsersCountResponseBody(Builder builder) {
        this.adUserCount = builder.adUserCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdUsersCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adUserCount
     */
    public Integer getAdUserCount() {
        return this.adUserCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer adUserCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAdUsersCountResponseBody model) {
            this.adUserCount = model.adUserCount;
            this.requestId = model.requestId;
        } 

        /**
         * AdUserCount.
         */
        public Builder adUserCount(Integer adUserCount) {
            this.adUserCount = adUserCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAdUsersCountResponseBody build() {
            return new GetAdUsersCountResponseBody(this);
        } 

    } 

}
