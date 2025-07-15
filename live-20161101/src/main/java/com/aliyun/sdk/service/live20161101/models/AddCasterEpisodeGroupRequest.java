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
 * {@link AddCasterEpisodeGroupRequest} extends {@link RequestModel}
 *
 * <p>AddCasterEpisodeGroupRequest</p>
 */
public class AddCasterEpisodeGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Item")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Item> item;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer repeatNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SideOutputUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sideOutputUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<Item> getItem() {
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
        private java.util.List<Item> item; 
        private Long ownerId; 
        private String regionId; 
        private Integer repeatNum; 
        private String sideOutputUrl; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(AddCasterEpisodeGroupRequest request) {
            super(request);
            this.callbackUrl = request.callbackUrl;
            this.clientToken = request.clientToken;
            this.domainName = request.domainName;
            this.item = request.item;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.repeatNum = request.repeatNum;
            this.sideOutputUrl = request.sideOutputUrl;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The callback URL.</p>
         * <p>If you query the configurations of the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848011.html">DescribeCasterConfig</a> operation, check the value of the response parameter CallbackUrl to obtain the URL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://developer.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-53f0758162964516ac850f2ddc3f">http://developer.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-53f0758162964516ac850f2ddc3f</a>****</p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8751ad99-2ddb-4aac-ad44-84b21102****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The list of episodes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder item(java.util.List<Item> item) {
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
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of times the episode list repeats after the first playback is complete. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: indicates that the episode list is played only once.</li>
         * <li><strong>-1</strong>: indicates that the episode list is played in loop mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder repeatNum(Integer repeatNum) {
            this.putQueryParameter("RepeatNum", repeatNum);
            this.repeatNum = repeatNum;
            return this;
        }

        /**
         * <p>The custom standby URL.</p>
         * <p>If this parameter is empty, the ingest address corresponding to the output address automatically generated by Alibaba Cloud will be used by default.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://guide.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-53f0758162964516ac850f2ddc3f****</p>
         */
        public Builder sideOutputUrl(String sideOutputUrl) {
            this.putQueryParameter("SideOutputUrl", sideOutputUrl);
            this.sideOutputUrl = sideOutputUrl;
            return this;
        }

        /**
         * <p>The time when the episode list starts to play. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-06T19:00:00Z</p>
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

    /**
     * 
     * {@link AddCasterEpisodeGroupRequest} extends {@link TeaModel}
     *
     * <p>AddCasterEpisodeGroupRequest</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("VodUrl")
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

            private Builder() {
            } 

            private Builder(Item model) {
                this.itemName = model.itemName;
                this.vodUrl = model.vodUrl;
            } 

            /**
             * <p>The name of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>episode1</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The URL of the VOD file.</p>
             * <p>If you query the input sources of the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848023.html">DescribeCasterVideoResources</a> operation, check the value of the response parameter VodUrl to obtain the URL.</p>
             * <blockquote>
             * <p> This parameter takes effect only when the input source is a video file that is not from the media library.<br>The video file can be in the MP4, FLV, or TS format.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://learn.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****.flv?auth_key=1608953344-0-0-53f0758162964516ac850f2ddc3f">http://learn.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****.flv?auth_key=1608953344-0-0-53f0758162964516ac850f2ddc3f</a>****</p>
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
