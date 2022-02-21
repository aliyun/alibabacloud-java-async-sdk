// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterProgramResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterProgramResponseBody</p>
 */
public class DescribeCasterProgramResponseBody extends TeaModel {
    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("Episodes")
    private Episodes episodes;

    @NameInMap("ProgramEffect")
    private Integer programEffect;

    @NameInMap("ProgramName")
    private String programName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private DescribeCasterProgramResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.episodes = builder.episodes;
        this.programEffect = builder.programEffect;
        this.programName = builder.programName;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterProgramResponseBody create() {
        return builder().build();
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return episodes
     */
    public Episodes getEpisodes() {
        return this.episodes;
    }

    /**
     * @return programEffect
     */
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    /**
     * @return programName
     */
    public String getProgramName() {
        return this.programName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String casterId; 
        private Episodes episodes; 
        private Integer programEffect; 
        private String programName; 
        private String requestId; 
        private Integer total; 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * Episodes.
         */
        public Builder episodes(Episodes episodes) {
            this.episodes = episodes;
            return this;
        }

        /**
         * ProgramEffect.
         */
        public Builder programEffect(Integer programEffect) {
            this.programEffect = programEffect;
            return this;
        }

        /**
         * ProgramName.
         */
        public Builder programName(String programName) {
            this.programName = programName;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterProgramResponseBody build() {
            return new DescribeCasterProgramResponseBody(this);
        } 

    } 

    public static class ComponentIds extends TeaModel {
        @NameInMap("ComponentId")
        private java.util.List < String > componentId;

        private ComponentIds(Builder builder) {
            this.componentId = builder.componentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentIds create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public java.util.List < String > getComponentId() {
            return this.componentId;
        }

        public static final class Builder {
            private java.util.List < String > componentId; 

            /**
             * ComponentId.
             */
            public Builder componentId(java.util.List < String > componentId) {
                this.componentId = componentId;
                return this;
            }

            public ComponentIds build() {
                return new ComponentIds(this);
            } 

        } 

    }
    public static class Episode extends TeaModel {
        @NameInMap("ComponentIds")
        private ComponentIds componentIds;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EpisodeId")
        private String episodeId;

        @NameInMap("EpisodeName")
        private String episodeName;

        @NameInMap("EpisodeType")
        private String episodeType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SwitchType")
        private String switchType;

        private Episode(Builder builder) {
            this.componentIds = builder.componentIds;
            this.endTime = builder.endTime;
            this.episodeId = builder.episodeId;
            this.episodeName = builder.episodeName;
            this.episodeType = builder.episodeType;
            this.resourceId = builder.resourceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.switchType = builder.switchType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Episode create() {
            return builder().build();
        }

        /**
         * @return componentIds
         */
        public ComponentIds getComponentIds() {
            return this.componentIds;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return episodeId
         */
        public String getEpisodeId() {
            return this.episodeId;
        }

        /**
         * @return episodeName
         */
        public String getEpisodeName() {
            return this.episodeName;
        }

        /**
         * @return episodeType
         */
        public String getEpisodeType() {
            return this.episodeType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return switchType
         */
        public String getSwitchType() {
            return this.switchType;
        }

        public static final class Builder {
            private ComponentIds componentIds; 
            private String endTime; 
            private String episodeId; 
            private String episodeName; 
            private String episodeType; 
            private String resourceId; 
            private String startTime; 
            private Integer status; 
            private String switchType; 

            /**
             * ComponentIds.
             */
            public Builder componentIds(ComponentIds componentIds) {
                this.componentIds = componentIds;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * EpisodeName.
             */
            public Builder episodeName(String episodeName) {
                this.episodeName = episodeName;
                return this;
            }

            /**
             * EpisodeType.
             */
            public Builder episodeType(String episodeType) {
                this.episodeType = episodeType;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SwitchType.
             */
            public Builder switchType(String switchType) {
                this.switchType = switchType;
                return this;
            }

            public Episode build() {
                return new Episode(this);
            } 

        } 

    }
    public static class Episodes extends TeaModel {
        @NameInMap("Episode")
        private java.util.List < Episode> episode;

        private Episodes(Builder builder) {
            this.episode = builder.episode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Episodes create() {
            return builder().build();
        }

        /**
         * @return episode
         */
        public java.util.List < Episode> getEpisode() {
            return this.episode;
        }

        public static final class Builder {
            private java.util.List < Episode> episode; 

            /**
             * Episode.
             */
            public Builder episode(java.util.List < Episode> episode) {
                this.episode = episode;
                return this;
            }

            public Episodes build() {
                return new Episodes(this);
            } 

        } 

    }
}
