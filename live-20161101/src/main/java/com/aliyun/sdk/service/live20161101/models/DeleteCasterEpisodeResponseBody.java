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
 * {@link DeleteCasterEpisodeResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCasterEpisodeResponseBody</p>
 */
public class DeleteCasterEpisodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("EpisodeId")
    private String episodeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCasterEpisodeResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.episodeId = builder.episodeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCasterEpisodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteCasterEpisodeResponseBody model) {
            this.casterId = model.casterId;
            this.episodeId = model.episodeId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the production studio. You can specify the ID as a parameter in the request to modify the episode in the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The ID of the episode. You can specify the ID as a parameter in the request to modify the episode in the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf932738****</p>
         */
        public Builder episodeId(String episodeId) {
            this.episodeId = episodeId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteCasterEpisodeResponseBody build() {
            return new DeleteCasterEpisodeResponseBody(this);
        } 

    } 

}
