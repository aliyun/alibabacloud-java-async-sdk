// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterProgramResponseBody} extends {@link TeaModel}
 *
 * <p>AddCasterProgramResponseBody</p>
 */
public class AddCasterProgramResponseBody extends TeaModel {
    @NameInMap("EpisodeIds")
    private EpisodeIds episodeIds;

    @NameInMap("RequestId")
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

        /**
         * EpisodeIds.
         */
        public Builder episodeIds(EpisodeIds episodeIds) {
            this.episodeIds = episodeIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCasterProgramResponseBody build() {
            return new AddCasterProgramResponseBody(this);
        } 

    } 

    public static class EpisodeId extends TeaModel {
        @NameInMap("EpisodeId")
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

            /**
             * EpisodeId.
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
    public static class EpisodeIds extends TeaModel {
        @NameInMap("EpisodeId")
        private java.util.List < EpisodeId> episodeId;

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
        public java.util.List < EpisodeId> getEpisodeId() {
            return this.episodeId;
        }

        public static final class Builder {
            private java.util.List < EpisodeId> episodeId; 

            /**
             * EpisodeId.
             */
            public Builder episodeId(java.util.List < EpisodeId> episodeId) {
                this.episodeId = episodeId;
                return this;
            }

            public EpisodeIds build() {
                return new EpisodeIds(this);
            } 

        } 

    }
}
