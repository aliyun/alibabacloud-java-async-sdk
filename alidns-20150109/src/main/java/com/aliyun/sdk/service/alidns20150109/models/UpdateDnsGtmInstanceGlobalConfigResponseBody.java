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
 * {@link UpdateDnsGtmInstanceGlobalConfigResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDnsGtmInstanceGlobalConfigResponseBody</p>
 */
public class UpdateDnsGtmInstanceGlobalConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateDnsGtmInstanceGlobalConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDnsGtmInstanceGlobalConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>29D0F8F8-5499-4F6C-9FDC-1EE13BF55925</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateDnsGtmInstanceGlobalConfigResponseBody build() {
            return new UpdateDnsGtmInstanceGlobalConfigResponseBody(this);
        } 

    } 

}
