// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterEpisodeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCasterEpisodeResponseBody</p>
 */
public class ModifyCasterEpisodeResponseBody extends TeaModel {
    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("EpisodeId")
    private String episodeId;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyCasterEpisodeResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.episodeId = builder.episodeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterEpisodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return episodeId
     */
    public String getEpisodeId() {
        return this.episodeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String casterId; 
        private String episodeId; 
        private String requestId; 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * EpisodeId.
         */
        public Builder episodeId(String episodeId) {
            this.episodeId = episodeId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyCasterEpisodeResponseBody build() {
            return new ModifyCasterEpisodeResponseBody(this);
        } 

    } 

}
