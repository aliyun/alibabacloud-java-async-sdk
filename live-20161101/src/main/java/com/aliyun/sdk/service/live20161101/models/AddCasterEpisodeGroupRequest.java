// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterEpisodeGroupRequest} extends {@link RequestModel}
 *
 * <p>AddCasterEpisodeGroupRequest</p>
 */
public class AddCasterEpisodeGroupRequest extends Request {
    @Query
    @NameInMap("CallbackUrl")
    @Validation(required = true)
    private String callbackUrl;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Item")
    @Validation(required = true)
    private java.util.List < Item> item;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RepeatNum")
    @Validation(required = true)
    private Integer repeatNum;

    @Query
    @NameInMap("SideOutputUrl")
    @Validation(required = true)
    private String sideOutputUrl;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private AddCasterEpisodeGroupRequest(Builder builder) {
        super(builder);
        this.callbackUrl = builder.callbackUrl;
        this.clientToken = builder.clientToken;
        this.domainName = builder.domainName;
        this.item = builder.item;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.repeatNum = builder.repeatNum;
        this.sideOutputUrl = builder.sideOutputUrl;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterEpisodeGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return item
     */
    public java.util.List < Item> getItem() {
        return this.item;
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
     * @return repeatNum
     */
    public Integer getRepeatNum() {
        return this.repeatNum;
    }

    /**
     * @return sideOutputUrl
     */
    public String getSideOutputUrl() {
        return this.sideOutputUrl;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<AddCasterEpisodeGroupRequest, Builder> {
        private String callbackUrl; 
        private String clientToken; 
        private String domainName; 
        private java.util.List < Item> item; 
        private Long ownerId; 
        private String regionId; 
        private Integer repeatNum; 
        private String sideOutputUrl; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(AddCasterEpisodeGroupRequest response) {
            super(response);
            this.callbackUrl = response.callbackUrl;
            this.clientToken = response.clientToken;
            this.domainName = response.domainName;
            this.item = response.item;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.repeatNum = response.repeatNum;
            this.sideOutputUrl = response.sideOutputUrl;
            this.startTime = response.startTime;
        } 

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Item.
         */
        public Builder item(java.util.List < Item> item) {
            this.putQueryParameter("Item", item);
            this.item = item;
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RepeatNum.
         */
        public Builder repeatNum(Integer repeatNum) {
            this.putQueryParameter("RepeatNum", repeatNum);
            this.repeatNum = repeatNum;
            return this;
        }

        /**
         * SideOutputUrl.
         */
        public Builder sideOutputUrl(String sideOutputUrl) {
            this.putQueryParameter("SideOutputUrl", sideOutputUrl);
            this.sideOutputUrl = sideOutputUrl;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public AddCasterEpisodeGroupRequest build() {
            return new AddCasterEpisodeGroupRequest(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("VodUrl")
        private String vodUrl;

        private Item(Builder builder) {
            this.itemName = builder.itemName;
            this.vodUrl = builder.vodUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return vodUrl
         */
        public String getVodUrl() {
            return this.vodUrl;
        }

        public static final class Builder {
            private String itemName; 
            private String vodUrl; 

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * VodUrl.
             */
            public Builder vodUrl(String vodUrl) {
                this.vodUrl = vodUrl;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
}
