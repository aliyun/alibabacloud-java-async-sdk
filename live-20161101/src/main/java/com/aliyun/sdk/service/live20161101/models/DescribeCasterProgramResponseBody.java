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
 * {@link DescribeCasterProgramResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterProgramResponseBody</p>
 */
public class DescribeCasterProgramResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("Episodes")
    private Episodes episodes;

    @com.aliyun.core.annotation.NameInMap("ProgramEffect")
    private Integer programEffect;

    @com.aliyun.core.annotation.NameInMap("ProgramName")
    private String programName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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

        private Builder() {
        } 

        private Builder(DescribeCasterProgramResponseBody model) {
            this.casterId = model.casterId;
            this.episodes = model.episodes;
            this.programEffect = model.programEffect;
            this.programName = model.programName;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The list of the episodes.</p>
         */
        public Builder episodes(Episodes episodes) {
            this.episodes = episodes;
            return this;
        }

        /**
         * <p>Indicates whether carousel playback is enabled.</p>
         * <ul>
         * <li><strong>0</strong>: Carousel playback is disabled.</li>
         * <li><strong>1</strong>: Carousel playback is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder programEffect(Integer programEffect) {
            this.programEffect = programEffect;
            return this;
        }

        /**
         * <p>The name of the episode list.</p>
         * 
         * <strong>example:</strong>
         * <p>programs_name</p>
         */
        public Builder programName(String programName) {
            this.programName = programName;
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

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterProgramResponseBody build() {
            return new DescribeCasterProgramResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCasterProgramResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterProgramResponseBody</p>
     */
    public static class ComponentIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private java.util.List<String> componentId;

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
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

        public static final class Builder {
            private java.util.List<String> componentId; 

            private Builder() {
            } 

            private Builder(ComponentIds model) {
                this.componentId = model.componentId;
            } 

            /**
             * ComponentId.
             */
            public Builder componentId(java.util.List<String> componentId) {
                this.componentId = componentId;
                return this;
            }

            public ComponentIds build() {
                return new ComponentIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterProgramResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterProgramResponseBody</p>
     */
    public static class Episode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentIds")
        private ComponentIds componentIds;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EpisodeId")
        private String episodeId;

        @com.aliyun.core.annotation.NameInMap("EpisodeName")
        private String episodeName;

        @com.aliyun.core.annotation.NameInMap("EpisodeType")
        private String episodeType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SwitchType")
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

            private Builder() {
            } 

            private Builder(Episode model) {
                this.componentIds = model.componentIds;
                this.endTime = model.endTime;
                this.episodeId = model.episodeId;
                this.episodeName = model.episodeName;
                this.episodeType = model.episodeType;
                this.resourceId = model.resourceId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.switchType = model.switchType;
            } 

            /**
             * <p>The components.</p>
             */
            public Builder componentIds(ComponentIds componentIds) {
                this.componentIds = componentIds;
                return this;
            }

            /**
             * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-06-29T10:02:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>1872639A-F203-4EC5-8E43-CB92E68F****</p>
             */
            public Builder episodeId(String episodeId) {
                this.episodeId = episodeId;
                return this;
            }

            /**
             * <p>The name of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>program_name_1</p>
             */
            public Builder episodeName(String episodeName) {
                this.episodeName = episodeName;
                return this;
            }

            /**
             * <p>The type of the episode. Valid values:</p>
             * <ul>
             * <li><strong>Resource</strong>: a video resource</li>
             * <li><strong>Component</strong>: a component</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Resource</p>
             */
            public Builder episodeType(String episodeType) {
                this.episodeType = episodeType;
                return this;
            }

            /**
             * <p>The ID of the video resource.</p>
             * 
             * <strong>example:</strong>
             * <p>1872639A-F203-4EC5-8E43-CB92E837****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-06-29T09:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The policy for switching episodes. Valid values:</p>
             * <ul>
             * <li><strong>TimeFirst</strong>: The episode starts when the previous episode ends and ends when the next episode starts. If no next episode exists, the episode keeps repeating until a new episode is added or the production studio stops. This value is required for live video resources.</li>
             * <li><strong>ContentFirst</strong>: The episode starts and ends as scheduled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TimeFirst</p>
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
    /**
     * 
     * {@link DescribeCasterProgramResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterProgramResponseBody</p>
     */
    public static class Episodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Episode")
        private java.util.List<Episode> episode;

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
        public java.util.List<Episode> getEpisode() {
            return this.episode;
        }

        public static final class Builder {
            private java.util.List<Episode> episode; 

            private Builder() {
            } 

            private Builder(Episodes model) {
                this.episode = model.episode;
            } 

            /**
             * Episode.
             */
            public Builder episode(java.util.List<Episode> episode) {
                this.episode = episode;
                return this;
            }

            public Episodes build() {
                return new Episodes(this);
            } 

        } 

    }
}
