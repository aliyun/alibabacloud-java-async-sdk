// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetTotalStatisResponseBody} extends {@link TeaModel}
 *
 * <p>GetTotalStatisResponseBody</p>
 */
public class GetTotalStatisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkOut")
    private Long networkOut;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageUtilization")
    private Long storageUtilization;

    @com.aliyun.core.annotation.NameInMap("TranscodeDuration")
    private Long transcodeDuration;

    private GetTotalStatisResponseBody(Builder builder) {
        this.networkOut = builder.networkOut;
        this.requestId = builder.requestId;
        this.storageUtilization = builder.storageUtilization;
        this.transcodeDuration = builder.transcodeDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTotalStatisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkOut
     */
    public Long getNetworkOut() {
        return this.networkOut;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageUtilization
     */
    public Long getStorageUtilization() {
        return this.storageUtilization;
    }

    /**
     * @return transcodeDuration
     */
    public Long getTranscodeDuration() {
        return this.transcodeDuration;
    }

    public static final class Builder {
        private Long networkOut; 
        private String requestId; 
        private Long storageUtilization; 
        private Long transcodeDuration; 

        private Builder() {
        } 

        private Builder(GetTotalStatisResponseBody model) {
            this.networkOut = model.networkOut;
            this.requestId = model.requestId;
            this.storageUtilization = model.storageUtilization;
            this.transcodeDuration = model.transcodeDuration;
        } 

        /**
         * NetworkOut.
         */
        public Builder networkOut(Long networkOut) {
            this.networkOut = networkOut;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StorageUtilization.
         */
        public Builder storageUtilization(Long storageUtilization) {
            this.storageUtilization = storageUtilization;
            return this;
        }

        /**
         * TranscodeDuration.
         */
        public Builder transcodeDuration(Long transcodeDuration) {
            this.transcodeDuration = transcodeDuration;
            return this;
        }

        public GetTotalStatisResponseBody build() {
            return new GetTotalStatisResponseBody(this);
        } 

    } 

}
