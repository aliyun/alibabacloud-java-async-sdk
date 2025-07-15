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
 * {@link AddCasterEpisodeRequest} extends {@link RequestModel}
 *
 * <p>AddCasterEpisodeRequest</p>
 */
public class AddCasterEpisodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentId")
    private java.util.List<String> componentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EpisodeName")
    private String episodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EpisodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String episodeType;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String switchType;

    private AddCasterEpisodeRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.componentId = builder.componentId;
        this.endTime = builder.endTime;
        this.episodeName = builder.episodeName;
        this.episodeType = builder.episodeType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.startTime = builder.startTime;
        this.switchType = builder.switchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterEpisodeRequest create() {
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

    public static final class Builder extends Request.Builder<AddCasterEpisodeRequest, Builder> {
        private String casterId; 
        private java.util.List<String> componentId; 
        private String endTime; 
        private String episodeName; 
        private String episodeType; 
        private Long ownerId; 
        private String regionId; 
        private String resourceId; 
        private String startTime; 
        private String switchType; 

        private Builder() {
            super();
        } 

        private Builder(AddCasterEpisodeRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.componentId = request.componentId;
            this.endTime = request.endTime;
            this.episodeName = request.episodeName;
            this.episodeType = request.episodeType;
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
         * <p>The components. Components in the production studio are listed from the bottom to the top in an array.</p>
         * <p>If a component was added by calling the <a href="https://help.aliyun.com/document_detail/2848030.html">AddCasterComponent</a> operation, check the value of the response parameter ComponentId to obtain the component ID.</p>
         * <ul>
         * <li>This parameter takes effect and is required when the EpisodeType parameter is set to <strong>Component</strong>.</li>
         * <li>This parameter is optional when the EpisodeType parameter is set to <strong>Resource</strong>. In this case, if this parameter is specified, the components are bound to and switched together with video resources.</li>
         * </ul>
         * <blockquote>
         * <p> The variable N specifies the sequence number of the component. For example, <strong>ComponentId.1</strong> specifies the ID of the first component and <strong>ComponentId.2</strong> specifies the ID of the second component.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a2b8e671-2fe5-4642-a2ec-bf93880e****&quot;]</p>
         */
        public Builder componentId(java.util.List<String> componentId) {
            this.putQueryParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * <p>The time when the episode ends. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T09:10:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>episode_1</p>
         */
        public Builder episodeName(String episodeName) {
            this.putQueryParameter("EpisodeName", episodeName);
            this.episodeName = episodeName;
            return this;
        }

        /**
         * <p>The type of the episode. Valid values:</p>
         * <ul>
         * <li><strong>Resource</strong>: a video resource.</li>
         * <li><strong>Component</strong>: a component.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
        public Builder episodeType(String episodeType) {
            this.putQueryParameter("EpisodeType", episodeType);
            this.episodeType = episodeType;
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
         * <p>The ID of the video resource.</p>
         * <blockquote>
         * <p> This parameter takes effect and is required when the EpisodeType parameter is set to Resource.</p>
         * </blockquote>
         * <p><br>If the video resource was added by calling the <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a> operation, check the value of the response parameter ResourceId to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The time when the episode starts. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T08:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The policy for switching episodes. Valid values:</p>
         * <ul>
         * <li><strong>TimeFirst</strong>: The episode starts when the preceding episode ends and ends when the next episode starts. If no next episode exists, the episode keeps repeating until a new episode is added or the production studio stops.</li>
         * <li><strong>ContentFirst</strong>: The episode starts and ends as scheduled.</li>
         * </ul>
         * <p>This parameter takes effect only when the EpisodeType parameter is set to Resource.</p>
         * <blockquote>
         * <p> This parameter must be set to TimeFirst when the video resource is a live stream.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
        public AddCasterEpisodeRequest build() {
            return new AddCasterEpisodeRequest(this);
        } 

    } 

}
