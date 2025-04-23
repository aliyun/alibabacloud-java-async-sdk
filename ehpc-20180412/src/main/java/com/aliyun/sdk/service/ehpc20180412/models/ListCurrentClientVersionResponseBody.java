// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListCurrentClientVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ListCurrentClientVersionResponseBody</p>
 */
public class ListCurrentClientVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCurrentClientVersionResponseBody(Builder builder) {
        this.clientVersion = builder.clientVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCurrentClientVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clientVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCurrentClientVersionResponseBody model) {
            this.clientVersion = model.clientVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The latest version number of ehpcutil.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCurrentClientVersionResponseBody build() {
            return new ListCurrentClientVersionResponseBody(this);
        } 

    } 

}
