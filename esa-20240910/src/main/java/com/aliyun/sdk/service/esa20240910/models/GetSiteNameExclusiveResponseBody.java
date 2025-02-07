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
 * {@link GetSiteNameExclusiveResponseBody} extends {@link TeaModel}
 *
 * <p>GetSiteNameExclusiveResponseBody</p>
 */
public class GetSiteNameExclusiveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSiteNameExclusiveResponseBody(Builder builder) {
        this.enable = builder.enable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSiteNameExclusiveResponseBody create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String enable; 
        private String requestId; 

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSiteNameExclusiveResponseBody build() {
            return new GetSiteNameExclusiveResponseBody(this);
        } 

    } 

}
