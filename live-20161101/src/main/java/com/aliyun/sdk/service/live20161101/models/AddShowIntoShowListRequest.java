// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShowIntoShowListRequest} extends {@link RequestModel}
 *
 * <p>AddShowIntoShowListRequest</p>
 */
public class AddShowIntoShowListRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("Duration")
    private Long duration;

    @Query
    @NameInMap("LiveInputType")
    private Integer liveInputType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RepeatTimes")
    private Integer repeatTimes;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("ResourceUrl")
    private String resourceUrl;

    @Query
    @NameInMap("ShowName")
    private String showName;

    @Query
    @NameInMap("Spot")
    private Integer spot;

    @Query
    @NameInMap("isBatchMode")
    private Boolean isBatchMode;

    @Query
    @NameInMap("showList")
    private java.util.List < ShowList> showList;

    private AddShowIntoShowListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.duration = builder.duration;
        this.liveInputType = builder.liveInputType;
        this.ownerId = builder.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public java.util.List < ShowList> getShowList() {
        return this.showList;
    }

    public static final class Builder extends Request.Builder<AddShowIntoShowListRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private Long duration; 
        private Integer liveInputType; 
        private Long ownerId; 
        private Integer repeatTimes; 
        private String resourceId; 
        private String resourceType; 
        private String resourceUrl; 
        private String showName; 
        private Integer spot; 
        private Boolean isBatchMode; 
        private java.util.List < ShowList> showList; 

        private Builder() {
            super();
        } 

        private Builder(AddShowIntoShowListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.duration = request.duration;
            this.liveInputType = request.liveInputType;
            this.ownerId = request.ownerId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Long duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * LiveInputType.
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
         * RepeatTimes.
         */
        public Builder repeatTimes(Integer repeatTimes) {
            this.putQueryParameter("RepeatTimes", repeatTimes);
            this.repeatTimes = repeatTimes;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ResourceUrl.
         */
        public Builder resourceUrl(String resourceUrl) {
            this.putQueryParameter("ResourceUrl", resourceUrl);
            this.resourceUrl = resourceUrl;
            return this;
        }

        /**
         * ShowName.
         */
        public Builder showName(String showName) {
            this.putQueryParameter("ShowName", showName);
            this.showName = showName;
            return this;
        }

        /**
         * Spot.
         */
        public Builder spot(Integer spot) {
            this.putQueryParameter("Spot", spot);
            this.spot = spot;
            return this;
        }

        /**
         * isBatchMode.
         */
        public Builder isBatchMode(Boolean isBatchMode) {
            this.putQueryParameter("isBatchMode", isBatchMode);
            this.isBatchMode = isBatchMode;
            return this;
        }

        /**
         * showList.
         */
        public Builder showList(java.util.List < ShowList> showList) {
            this.putQueryParameter("showList", showList);
            this.showList = showList;
            return this;
        }

        @Override
        public AddShowIntoShowListRequest build() {
            return new AddShowIntoShowListRequest(this);
        } 

    } 

    public static class ShowList extends TeaModel {
        @NameInMap("duration")
        private Long duration;

        @NameInMap("liveInputType")
        private Integer liveInputType;

        @NameInMap("repeatTimes")
        private Integer repeatTimes;

        @NameInMap("resourceId")
        private String resourceId;

        @NameInMap("resourceType")
        private String resourceType;

        @NameInMap("resourceUrl")
        private String resourceUrl;

        @NameInMap("showName")
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

            /**
             * duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * liveInputType.
             */
            public Builder liveInputType(Integer liveInputType) {
                this.liveInputType = liveInputType;
                return this;
            }

            /**
             * repeatTimes.
             */
            public Builder repeatTimes(Integer repeatTimes) {
                this.repeatTimes = repeatTimes;
                return this;
            }

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * resourceUrl.
             */
            public Builder resourceUrl(String resourceUrl) {
                this.resourceUrl = resourceUrl;
                return this;
            }

            /**
             * showName.
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
