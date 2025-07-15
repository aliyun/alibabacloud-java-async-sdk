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
 * {@link ModifyShowListRequest} extends {@link RequestModel}
 *
 * <p>ModifyShowListRequest</p>
 */
public class ModifyShowListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HighPriorityShowId")
    private String highPriorityShowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HighPriorityShowStartTime")
    private String highPriorityShowStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatTimes")
    private Integer repeatTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowId")
    private String showId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spot")
    private Integer spot;

    private ModifyShowListRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.highPriorityShowId = builder.highPriorityShowId;
        this.highPriorityShowStartTime = builder.highPriorityShowStartTime;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.repeatTimes = builder.repeatTimes;
        this.showId = builder.showId;
        this.spot = builder.spot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyShowListRequest create() {
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
     * @return highPriorityShowId
     */
    public String getHighPriorityShowId() {
        return this.highPriorityShowId;
    }

    /**
     * @return highPriorityShowStartTime
     */
    public String getHighPriorityShowStartTime() {
        return this.highPriorityShowStartTime;
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
     * @return repeatTimes
     */
    public Integer getRepeatTimes() {
        return this.repeatTimes;
    }

    /**
     * @return showId
     */
    public String getShowId() {
        return this.showId;
    }

    /**
     * @return spot
     */
    public Integer getSpot() {
        return this.spot;
    }

    public static final class Builder extends Request.Builder<ModifyShowListRequest, Builder> {
        private String casterId; 
        private String highPriorityShowId; 
        private String highPriorityShowStartTime; 
        private Long ownerId; 
        private String regionId; 
        private Integer repeatTimes; 
        private String showId; 
        private Integer spot; 

        private Builder() {
            super();
        } 

        private Builder(ModifyShowListRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.highPriorityShowId = request.highPriorityShowId;
            this.highPriorityShowStartTime = request.highPriorityShowStartTime;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.repeatTimes = request.repeatTimes;
            this.showId = request.showId;
            this.spot = request.spot;
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
         * <p>The episode of the highest priority.</p>
         * <blockquote>
         * <p> You can configure this parameter only before the playback of the episode list starts.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder highPriorityShowId(String highPriorityShowId) {
            this.putQueryParameter("HighPriorityShowId", highPriorityShowId);
            this.highPriorityShowId = highPriorityShowId;
            return this;
        }

        /**
         * <p>The time at which the episode of the highest priority is played. Format: yyyy-MM-dd&quot;T&quot;HH:mm:ss.</p>
         * <blockquote>
         * <p> You can configure this parameter only before the episode list starts playing.<br>After you configure this parameter, when the specified point in time is reached, any episode that is playing stops and the episode of the highest priority in the episode list starts to play.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-11-23T12:30:00</p>
         */
        public Builder highPriorityShowStartTime(String highPriorityShowStartTime) {
            this.putQueryParameter("HighPriorityShowStartTime", highPriorityShowStartTime);
            this.highPriorityShowStartTime = highPriorityShowStartTime;
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
         * <p>The number of additional times the episode list is played.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The RepeatTimes parameter specifies the number of repetitions. For example, if you set the value to <strong>0</strong>, the episode list is played <strong>once</strong>. If you set the value to <strong>1</strong>, the episode list is played <strong>twice</strong>.********</p>
         * </li>
         * <li><p>If you set the value to -1, the episode list is repeated indefinitely.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder repeatTimes(Integer repeatTimes) {
            this.putQueryParameter("RepeatTimes", repeatTimes);
            this.repeatTimes = repeatTimes;
            return this;
        }

        /**
         * <p>The ID of the episode for which you want to change the position in the playlist.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a> or <a href="https://help.aliyun.com/document_detail/2848054.html">DescribeShowList</a> operation and check the value of the response parameter ShowId to obtain the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder showId(String showId) {
            this.putQueryParameter("ShowId", showId);
            this.showId = showId;
            return this;
        }

        /**
         * <p>The position of the episode in the episode list. If you want to change the position of an episode in a playlist, place the ID of the episode in <strong>Spot</strong>.</p>
         * <blockquote>
         * <p> The value must be greater than or equal to 0 and less than or equal to the total number of episodes in the playlist.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder spot(Integer spot) {
            this.putQueryParameter("Spot", spot);
            this.spot = spot;
            return this;
        }

        @Override
        public ModifyShowListRequest build() {
            return new ModifyShowListRequest(this);
        } 

    } 

}
