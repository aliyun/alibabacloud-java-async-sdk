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
 * {@link AddCasterProgramResponseBody} extends {@link TeaModel}
 *
 * <p>AddCasterProgramResponseBody</p>
 */
public class AddCasterProgramResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EpisodeIds")
    private EpisodeIds episodeIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCasterProgramResponseBody(Builder builder) {
        this.episodeIds = builder.episodeIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterProgramResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return episodeIds
     */
    public EpisodeIds getEpisodeIds() {
        return this.episodeIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EpisodeIds episodeIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddCasterProgramResponseBody model) {
            this.episodeIds = model.episodeIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the episodes. The episode IDs are listed in the same order as specified by the variable N.</p>
         */
        public Builder episodeIds(EpisodeIds episodeIds) {
            this.episodeIds = episodeIds;
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

        public AddCasterProgramResponseBody build() {
            return new AddCasterProgramResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddCasterProgramResponseBody} extends {@link TeaModel}
     *
     * <p>AddCasterProgramResponseBody</p>
     */
    public static class EpisodeId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EpisodeId")
        private String episodeId;

        private EpisodeId(Builder builder) {
            this.episodeId = builder.episodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EpisodeId create() {
            return builder().build();
        }

        /**
         * @return episodeId
         */
        public String getEpisodeId() {
            return this.episodeId;
        }

        public static final class Builder {
            private String episodeId; 

            private Builder() {
            } 

            private Builder(EpisodeId model) {
                this.episodeId = model.episodeId;
            } 

            /**
             * <p>The ID of the episode. You can use the ID as a request parameter in the API operation that is used to modify the episode list, query the information about the episode list, delete the episode, or modify the configurations of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
             */
            public Builder episodeId(String episodeId) {
                this.episodeId = episodeId;
                return this;
            }

            public EpisodeId build() {
                return new EpisodeId(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddCasterProgramResponseBody} extends {@link TeaModel}
     *
     * <p>AddCasterProgramResponseBody</p>
     */
    public static class EpisodeIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EpisodeId")
        private java.util.List<EpisodeId> episodeId;

        private EpisodeIds(Builder builder) {
            this.episodeId = builder.episodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EpisodeIds create() {
            return builder().build();
        }

        /**
         * @return episodeId
         */
        public java.util.List<EpisodeId> getEpisodeId() {
            return this.episodeId;
        }

        public static final class Builder {
            private java.util.List<EpisodeId> episodeId; 

            private Builder() {
            } 

            private Builder(EpisodeIds model) {
                this.episodeId = model.episodeId;
            } 

            /**
             * <p>The ID of the episode. You can use the ID as a request parameter in the API operation that is used to modify the episode list, query the information about the episode list, delete the episode, or modify the configurations of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
             */
            public Builder episodeId(java.util.List<EpisodeId> episodeId) {
                this.episodeId = episodeId;
                return this;
            }

            public EpisodeIds build() {
                return new EpisodeIds(this);
            } 

        } 

    }
}
