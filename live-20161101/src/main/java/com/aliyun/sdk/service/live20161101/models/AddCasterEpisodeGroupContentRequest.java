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
 * {@link AddCasterEpisodeGroupContentRequest} extends {@link RequestModel}
 *
 * <p>AddCasterEpisodeGroupContentRequest</p>
 */
public class AddCasterEpisodeGroupContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AddCasterEpisodeGroupContentRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterEpisodeGroupContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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

    public static final class Builder extends Request.Builder<AddCasterEpisodeGroupContentRequest, Builder> {
        private String clientToken; 
        private String content; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddCasterEpisodeGroupContentRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.content = request.content;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
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
         * <p>The information about the episode list. The value is a JSON string. Use upper camel case for fields of the string. This parameter contains the following fields:</p>
         * <ul>
         * <li><p><strong>CallbackUrl</strong>: the callback URL.</p>
         * </li>
         * <li><p><strong>SideOutputUrl</strong>: the custom standby URL.</p>
         * </li>
         * <li><p><strong>RepeatNum</strong>: the number of times the episode list repeats after the first playback is complete. A value of 0 indicates that the episode list is played only once. A value of -1 indicates that the episode list is played in loop mode.</p>
         * </li>
         * <li><p><strong>DomainName</strong>: the domain name.</p>
         * </li>
         * <li><p><strong>StartTime</strong>: the time when the episode list starts to play. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * </li>
         * <li><p><strong>Items</strong>: the information about the episode list. It is an array of ItemName and VodUrl.</p>
         * <ul>
         * <li><strong>ItemName</strong>: the name of the episode.</li>
         * <li><strong>VodUrl</strong>: the URL of the VOD file. This field takes effect only when the video resource is a video file that is not from the media library. The video file must be in the MP4, FLV, or TS format.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CallbackUrl</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
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
        public AddCasterEpisodeGroupContentRequest build() {
            return new AddCasterEpisodeGroupContentRequest(this);
        } 

    } 

}
