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
 * {@link ModifyCasterEpisodeRequest} extends {@link RequestModel}
 *
 * <p>ModifyCasterEpisodeRequest</p>
 */
public class ModifyCasterEpisodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentId")
    private java.util.List<String> componentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EpisodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String episodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EpisodeName")
    private String episodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchType")
    private String switchType;

    private ModifyCasterEpisodeRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.componentId = builder.componentId;
        this.endTime = builder.endTime;
        this.episodeId = builder.episodeId;
        this.episodeName = builder.episodeName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.startTime = builder.startTime;
        this.switchType = builder.switchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterEpisodeRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyCasterEpisodeRequest, Builder> {
        private String casterId; 
        private java.util.List<String> componentId; 
        private String endTime; 
        private String episodeId; 
        private String episodeName; 
        private Long ownerId; 
        private String regionId; 
        private String resourceId; 
        private String startTime; 
        private String switchType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCasterEpisodeRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.componentId = request.componentId;
            this.endTime = request.endTime;
            this.episodeId = request.episodeId;
            this.episodeName = request.episodeName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.startTime = request.startTime;
            this.switchType = request.switchType;
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
         * <p>The components. Components in the production studio are listed from the bottom to the top in an array. When the production studio switches to another video resource, the components are also switched.</p>
         * <ul>
         * <li>This parameter takes effect and is required only when the EpisodeType parameter is set to <strong>Component</strong>.</li>
         * <li>This parameter is optional when the EpisodeType parameter is set to <strong>Resource</strong>. In this case, if this parameter is specified, the components are bound to and switched together with video resources.</li>
         * </ul>
         * <blockquote>
         * <p> The variable N specifies the sequence number of the component. For example, ComponentId.1 specifies the ID of the first component and ComponentId.2 specifies the ID of the second component.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;16A96B9A-F203-4EC5-8E43-CB92E68F****&quot;]</p>
         */
        public Builder componentId(java.util.List<String> componentId) {
            this.putQueryParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * <p>The time when the episode ends. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T10:20:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the episode. It is included in the response when you call the <a href="~~94745#doc-api-live-AddCasterEpisode~~" title="Adds an episode to a production studio.">AddCasterEpisode</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf938623****</p>
         */
        public Builder episodeId(String episodeId) {
            this.putQueryParameter("EpisodeId", episodeId);
            this.episodeId = episodeId;
            return this;
        }

        /**
         * <p>The name of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>episode_name_1</p>
         */
        public Builder episodeName(String episodeName) {
            this.putQueryParameter("EpisodeName", episodeName);
            this.episodeName = episodeName;
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

        /**
         * <p>The ID of the video resource. It is included in the response when you call the <a href="~~60250#doc-api-live-AddCasterVideoResource~~" title="Adds a video resource to a production studio.">AddCasterVideoResource</a> operation.</p>
         * <ul>
         * <li>This parameter takes effect and is required only when the EpisodeType is set to <strong>Resource</strong>.</li>
         * <li>If the EpisodeType parameter is set to <strong>Component</strong>, this parameter is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E683****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The time when the episode starts. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T09:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The policy for switching episodes. This parameter takes effect only when the EpisodeType parameter is set to <strong>Resource</strong>. Valid values:</p>
         * <ul>
         * <li><strong>TimeFirst</strong>: The episode starts when the preceding episode ends and ends when the next episode starts. If no next episode exists, the episode keeps repeating until a new episode is added or the production studio stops. This parameter must be set to TimeFirst when the video resource is a live stream.</li>
         * <li><strong>ContentFirst</strong>: The episode starts and ends as scheduled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TimeFirst</p>
         */
        public Builder switchType(String switchType) {
            this.putQueryParameter("SwitchType", switchType);
            this.switchType = switchType;
            return this;
        }

        @Override
        public ModifyCasterEpisodeRequest build() {
            return new ModifyCasterEpisodeRequest(this);
        } 

    } 

}
