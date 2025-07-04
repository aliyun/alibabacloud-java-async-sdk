// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link AcceptDemandResponseBody} extends {@link TeaModel}
 *
 * <p>AcceptDemandResponseBody</p>
 */
public class AcceptDemandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BindUrl")
    private String bindUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AcceptDemandResponseBody(Builder builder) {
        this.bindUrl = builder.bindUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptDemandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindUrl
     */
    public String getBindUrl() {
        return this.bindUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bindUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AcceptDemandResponseBody model) {
            this.bindUrl = model.bindUrl;
            this.requestId = model.requestId;
        } 

        /**
         * BindUrl.
         */
        public Builder bindUrl(String bindUrl) {
            this.bindUrl = bindUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AcceptDemandResponseBody build() {
            return new AcceptDemandResponseBody(this);
        } 

    } 

}
