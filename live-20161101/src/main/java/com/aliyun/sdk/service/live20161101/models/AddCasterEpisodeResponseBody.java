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
 * {@link AddCasterEpisodeResponseBody} extends {@link TeaModel}
 *
 * <p>AddCasterEpisodeResponseBody</p>
 */
public class AddCasterEpisodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EpisodeId")
    private String episodeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AddCasterEpisodeResponseBody model) {
            this.episodeId = model.episodeId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the episode. You can use the ID as a request parameter in the API operation that is used to query the information about the episode list, modify the configurations of the episode, and delete the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
         */
        public Builder episodeId(String episodeId) {
            this.episodeId = episodeId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
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
