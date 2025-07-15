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
 * {@link DescribeLiveStreamAuthCheckingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamAuthCheckingResponseBody</p>
 */
public class DescribeLiveStreamAuthCheckingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeLiveStreamAuthCheckingResponseBody(Builder builder) {
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamAuthCheckingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String description; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamAuthCheckingResponseBody model) {
            this.description = model.description;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The error message for failed authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID AUTH_KEY</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16F08B4E-14FD-5D72-AB2F-BAFA4C4D57F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the signed URL is valid. Valid values:</p>
         * <ul>
         * <li>pass: valid.</li>
         * <li>false: invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeLiveStreamAuthCheckingResponseBody build() {
            return new DescribeLiveStreamAuthCheckingResponseBody(this);
        } 

    } 

}
