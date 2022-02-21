// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterEpisodeResponseBody} extends {@link TeaModel}
 *
 * <p>AddCasterEpisodeResponseBody</p>
 */
public class AddCasterEpisodeResponseBody extends TeaModel {
    @NameInMap("EpisodeId")
    private String episodeId;

    @NameInMap("RequestId")
    private String requestId;

    private AddCasterEpisodeResponseBody(Builder builder) {
        this.episodeId = builder.episodeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterEpisodeResponseBody create() {
        return builder().build();
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
        private String episodeId; 
        private String requestId; 

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

        public AddCasterEpisodeResponseBody build() {
            return new AddCasterEpisodeResponseBody(this);
        } 

    } 

}
