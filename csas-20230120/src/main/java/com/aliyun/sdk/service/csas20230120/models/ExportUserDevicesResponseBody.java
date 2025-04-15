// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ExportUserDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ExportUserDevicesResponseBody</p>
 */
public class ExportUserDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignedUrl")
    private String signedUrl;

    private ExportUserDevicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.signedUrl = builder.signedUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportUserDevicesResponseBody create() {
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
     * @return signedUrl
     */
    public String getSignedUrl() {
        return this.signedUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String signedUrl; 

        private Builder() {
        } 

        private Builder(ExportUserDevicesResponseBody model) {
            this.requestId = model.requestId;
            this.signedUrl = model.signedUrl;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SignedUrl.
         */
        public Builder signedUrl(String signedUrl) {
            this.signedUrl = signedUrl;
            return this;
        }

        public ExportUserDevicesResponseBody build() {
            return new ExportUserDevicesResponseBody(this);
        } 

    } 

}
