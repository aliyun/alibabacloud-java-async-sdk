// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateGlobalDataNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGlobalDataNetworkResponseBody</p>
 */
public class CreateGlobalDataNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGlobalDataNetworkResponseBody(Builder builder) {
        this.channelId = builder.channelId;
        this.networkId = builder.networkId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGlobalDataNetworkResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String channelId; 
        private String networkId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateGlobalDataNetworkResponseBody model) {
            this.channelId = model.channelId;
            this.networkId = model.networkId;
            this.requestId = model.requestId;
        } 

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>GDN ID</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-xxx</p>
         */
        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGlobalDataNetworkResponseBody build() {
            return new CreateGlobalDataNetworkResponseBody(this);
        } 

    } 

}
