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
 * {@link AddCasterProgramRequest} extends {@link RequestModel}
 *
 * <p>AddCasterProgramRequest</p>
 */
public class AddCasterProgramRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Episode")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Episode> episode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AddCasterProgramRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.episode = builder.episode;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterProgramRequest create() {
        return builder().build();
    }

@Override
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
     * @return episode
     */
    public java.util.List<Episode> getEpisode() {
        return this.episode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddCasterProgramRequest, Builder> {
        private String casterId; 
        private java.util.List<Episode> episode; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddCasterProgramRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.episode = request.episode;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * <ul>
         * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
         * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
         * </ul>
         * <blockquote>
         * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The information about episodes in the episode list.</p>
         * <p>This parameter is required.</p>
         */
        public Builder episode(java.util.List<Episode> episode) {
            this.putQueryParameter("Episode", episode);
            this.episode = episode;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddCasterProgramRequest build() {
            return new AddCasterProgramRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddCasterProgramRequest} extends {@link TeaModel}
     *
     * <p>AddCasterProgramRequest</p>
     */
    public static class Episode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private java.util.List<String> componentId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EpisodeName")
        private String episodeName;

        @com.aliyun.core.annotation.NameInMap("EpisodeType")
        private String episodeType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("SwitchType")
        private String switchType;

        private Episode(Builder builder) {
            this.componentId = builder.componentId;
            this.endTime = builder.endTime;
            this.episodeName = builder.episodeName;
            this.episodeType = builder.episodeType;
            this.resourceId = builder.resourceId;
            this.startTime = builder.startTime;
            this.switchType = builder.switchType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Episode create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
         * @return switchType
         */
        public String getSwitchType() {
            return this.switchType;
        }

        public static final class Builder {
            private java.util.List<String> componentId; 
            private String endTime; 
            private String episodeName; 
            private String episodeType; 
            private String resourceId; 
            private String startTime; 
            private String switchType; 

            private Builder() {
            } 

            private Builder(Episode model) {
                this.componentId = model.componentId;
                this.endTime = model.endTime;
                this.episodeName = model.episodeName;
                this.episodeType = model.episodeType;
                this.resourceId = model.resourceId;
                this.startTime = model.startTime;
                this.switchType = model.switchType;
            } 

            /**
             * <p>The components. Components in the production studio are listed from the bottom to the top in an array.</p>
             * <blockquote>
             * <p> This parameter is required and takes effect when the Episode.N.EpisodeType parameter is set to Component.</p>
             * </blockquote>
             * <p>This parameter is optional when the Episode.N.EpisodeType parameter is set to <strong>Resource</strong>. In this case, if this parameter is specified, the components are bound to and switched together with video resources.</p>
             * 
             * <strong>example:</strong>
             * <p>[ &quot;a2b8e671-2fe5-4642-a2ec-bf931826****&quot;,  &quot;a2b8e671-2fe5-4642-a2ec-28374657****&quot;]</p>
             */
            public Builder componentId(java.util.List<String> componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>The end time of the episode. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-06-29T10:02:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * <p>The type of the episode.</p>
             * <ul>
             * <li><strong>Resource</strong>: a video resource If you set this parameter to Resource, you must specify the Episode.N.ResourceId and Episode.N.SwitchType parameters.</li>
             * <li><strong>Component</strong>: a component If you set this parameter to Component, you must specify the Episode.N.ComponentId.N parameter.</li>
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
             * <blockquote>
             * <p> This parameter takes effect and is required when the Episode.N.EpisodeType parameter is set to Resource.</p>
             * </blockquote>
             * <p><br>This parameter is invalid if you set the Episode.N.EpisodeType parameter to <strong>Component</strong>.</p>
             * <p>If the video resource was added by calling the <a href="https://help.aliyun.com/document_detail/60250.html">AddCasterVideoResource</a> operation, check the value of the response parameter ResourceId to obtain the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The start time of the episode. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-06-29T09:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The policy for switching episodes. Valid values:</p>
             * <blockquote>
             * <p> This parameter takes effect only when the Episode.N.EpisodeType parameter is set to Resource.</p>
             * </blockquote>
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
}
