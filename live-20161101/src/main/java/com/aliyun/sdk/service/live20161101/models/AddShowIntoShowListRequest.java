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
 * {@link AddShowIntoShowListRequest} extends {@link RequestModel}
 *
 * <p>AddShowIntoShowListRequest</p>
 */
public class AddShowIntoShowListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Long duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiveInputType")
    private Integer liveInputType;

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
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceUrl")
    private String resourceUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowName")
    private String showName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spot")
    private Integer spot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isBatchMode")
    private Boolean isBatchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("showList")
    private java.util.List<ShowList> showList;

    private AddShowIntoShowListRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.duration = builder.duration;
        this.liveInputType = builder.liveInputType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.repeatTimes = builder.repeatTimes;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.resourceUrl = builder.resourceUrl;
        this.showName = builder.showName;
        this.spot = builder.spot;
        this.isBatchMode = builder.isBatchMode;
        this.showList = builder.showList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddShowIntoShowListRequest create() {
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
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return liveInputType
     */
    public Integer getLiveInputType() {
        return this.liveInputType;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resourceUrl
     */
    public String getResourceUrl() {
        return this.resourceUrl;
    }

    /**
     * @return showName
     */
    public String getShowName() {
        return this.showName;
    }

    /**
     * @return spot
     */
    public Integer getSpot() {
        return this.spot;
    }

    /**
     * @return isBatchMode
     */
    public Boolean getIsBatchMode() {
        return this.isBatchMode;
    }

    /**
     * @return showList
     */
    public java.util.List<ShowList> getShowList() {
        return this.showList;
    }

    public static final class Builder extends Request.Builder<AddShowIntoShowListRequest, Builder> {
        private String casterId; 
        private Long duration; 
        private Integer liveInputType; 
        private Long ownerId; 
        private String regionId; 
        private Integer repeatTimes; 
        private String resourceId; 
        private String resourceType; 
        private String resourceUrl; 
        private String showName; 
        private Integer spot; 
        private Boolean isBatchMode; 
        private java.util.List<ShowList> showList; 

        private Builder() {
            super();
        } 

        private Builder(AddShowIntoShowListRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.duration = request.duration;
            this.liveInputType = request.liveInputType;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.repeatTimes = request.repeatTimes;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.resourceUrl = request.resourceUrl;
            this.showName = request.showName;
            this.spot = request.spot;
            this.isBatchMode = request.isBatchMode;
            this.showList = request.showList;
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
         * <p>The duration of the episode. Unit: seconds.</p>
         * <blockquote>
         * <p>You can specify only one of the <strong>RepeatTimes</strong> and <strong>Duration</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder duration(Long duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The custom type label.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder liveInputType(Integer liveInputType) {
            this.putQueryParameter("LiveInputType", liveInputType);
            this.liveInputType = liveInputType;
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
         * <p>The number of times the episode repeats after the first playback is complete. The default value is 0.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>You can specify only one of the <strong>RepeatTimes</strong> and <strong>Duration</strong> parameters. - The RepeatTimes parameter specifies the number of repetitions. For example, if you set the value to -1, the episode is to be played for infinite times. If you set the value to 0, the episode is to be played once. If you set the value to 1, the episode is to be played twice.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder repeatTimes(Integer repeatTimes) {
            this.putQueryParameter("RepeatTimes", repeatTimes);
            this.repeatTimes = repeatTimes;
            return this;
        }

        /**
         * <p>The ID of the resource.</p>
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
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>live: live stream</li>
         * <li>vod: on-demand video</li>
         * <li>pic: image</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>When you select media resources from ApsaraVideo VOD, we recommend that you select resources that are stored in hosted OSS buckets. Resources stored in non-hosted OSS buckets have a validity period. Pay attention to the validity if you select resources that are stored in non-hosted OSS buckets. - You can add a live stream from ApsaraVideo Live or by using a third-party URL. - You can add an on-demand video from ApsaraVideo VOD or by using a third-party URL, or add an on-demand image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vod</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The URL of the resource.</p>
         */
        public Builder resourceUrl(String resourceUrl) {
            this.putQueryParameter("ResourceUrl", resourceUrl);
            this.resourceUrl = resourceUrl;
            return this;
        }

        /**
         * <p>The name of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>liveShow****</p>
         */
        public Builder showName(String showName) {
            this.putQueryParameter("ShowName", showName);
            this.showName = showName;
            return this;
        }

        /**
         * <p>The position of the episode in the episode list. Position indexes start from 0. By default, the episode is added to the end of the episode list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder spot(Integer spot) {
            this.putQueryParameter("Spot", spot);
            this.spot = spot;
            return this;
        }

        /**
         * <p>Specifies whether to add multiple episodes to the episode list at a time. Valid values:</p>
         * <ul>
         * <li>true: adds multiple episodes to the episode list at a time.</li>
         * <li>false: adds a single episode to the episode list.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter or this parameter is left empty, a single episode is to be added to the episode list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isBatchMode(Boolean isBatchMode) {
            this.putQueryParameter("isBatchMode", isBatchMode);
            this.isBatchMode = isBatchMode;
            return this;
        }

        /**
         * <p>The episodes that you want to add to the episode list. Each episode has a unique name and resource URL.</p>
         */
        public Builder showList(java.util.List<ShowList> showList) {
            this.putQueryParameter("showList", showList);
            this.showList = showList;
            return this;
        }

        @Override
        public AddShowIntoShowListRequest build() {
            return new AddShowIntoShowListRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddShowIntoShowListRequest} extends {@link TeaModel}
     *
     * <p>AddShowIntoShowListRequest</p>
     */
    public static class ShowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("liveInputType")
        private Integer liveInputType;

        @com.aliyun.core.annotation.NameInMap("repeatTimes")
        private Integer repeatTimes;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("resourceUrl")
        private String resourceUrl;

        @com.aliyun.core.annotation.NameInMap("showName")
        private String showName;

        private ShowList(Builder builder) {
            this.duration = builder.duration;
            this.liveInputType = builder.liveInputType;
            this.repeatTimes = builder.repeatTimes;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.resourceUrl = builder.resourceUrl;
            this.showName = builder.showName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShowList create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return liveInputType
         */
        public Integer getLiveInputType() {
            return this.liveInputType;
        }

        /**
         * @return repeatTimes
         */
        public Integer getRepeatTimes() {
            return this.repeatTimes;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceUrl
         */
        public String getResourceUrl() {
            return this.resourceUrl;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        public static final class Builder {
            private Long duration; 
            private Integer liveInputType; 
            private Integer repeatTimes; 
            private String resourceId; 
            private String resourceType; 
            private String resourceUrl; 
            private String showName; 

            private Builder() {
            } 

            private Builder(ShowList model) {
                this.duration = model.duration;
                this.liveInputType = model.liveInputType;
                this.repeatTimes = model.repeatTimes;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.resourceUrl = model.resourceUrl;
                this.showName = model.showName;
            } 

            /**
             * <p>The duration of the episode. Unit: seconds.</p>
             * <blockquote>
             * <p> You can specify only one of the <strong>RepeatTimes</strong> and <strong>Duration</strong> parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The custom type label.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder liveInputType(Integer liveInputType) {
                this.liveInputType = liveInputType;
                return this;
            }

            /**
             * <p>The number of times the episode repeats after the first playback is complete. Default value: 0.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>You can specify only one of the <strong>RepeatTimes</strong> and <strong>Duration</strong> parameters.</p>
             * </li>
             * <li><p>The RepeatTimes parameter specifies the number of repetitions. For example, if you set the value to 0, the episode is to be played once. If you set the value to 1, the episode is to be played twice.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder repeatTimes(Integer repeatTimes) {
                this.repeatTimes = repeatTimes;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type. Valid values:</p>
             * <ul>
             * <li>live: live stream</li>
             * <li>vod: on-demand video</li>
             * <li>pic: image</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>When you select media resources from ApsaraVideo VOD, we recommend that you select resources that are stored in hosted OSS buckets. Resources stored in non-hosted OSS buckets have a validity period. Pay attention to the validity if you select resources that are stored in non-hosted OSS buckets.</p>
             * </li>
             * <li><p>You can add a live stream from ApsaraVideo Live or by using a third-party URL.</p>
             * </li>
             * <li><p>You can add an on-demand video from ApsaraVideo VOD or by using a third-party URL, or add an on-demand image.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vod</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The URL of the resource.</p>
             */
            public Builder resourceUrl(String resourceUrl) {
                this.resourceUrl = resourceUrl;
                return this;
            }

            /**
             * <p>The name of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>liveShow****</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            public ShowList build() {
                return new ShowList(this);
            } 

        } 

    }
}
