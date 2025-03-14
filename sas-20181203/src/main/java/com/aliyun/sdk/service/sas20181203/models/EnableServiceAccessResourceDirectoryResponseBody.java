// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link EnableServiceAccessResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>EnableServiceAccessResourceDirectoryResponseBody</p>
 */
public class EnableServiceAccessResourceDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableServiceAccessResourceDirectoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableServiceAccessResourceDirectoryResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(EnableServiceAccessResourceDirectoryResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableServiceAccessResourceDirectoryResponseBody build() {
            return new EnableServiceAccessResourceDirectoryResponseBody(this);
        } 

    } 

}
