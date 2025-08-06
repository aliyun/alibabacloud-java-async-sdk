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
 * {@link GetPlayerConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetPlayerConfigResponseBody</p>
 */
public class GetPlayerConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlayerConfig")
    private String playerConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPlayerConfigResponseBody(Builder builder) {
        this.playerConfig = builder.playerConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlayerConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return playerConfig
     */
    public String getPlayerConfig() {
        return this.playerConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String playerConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPlayerConfigResponseBody model) {
            this.playerConfig = model.playerConfig;
            this.requestId = model.requestId;
        } 

        /**
         * PlayerConfig.
         */
        public Builder playerConfig(String playerConfig) {
            this.playerConfig = playerConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPlayerConfigResponseBody build() {
            return new GetPlayerConfigResponseBody(this);
        } 

    } 

}
