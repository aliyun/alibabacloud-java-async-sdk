// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateMediaToSearchLibRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaToSearchLibRequest</p>
 */
public class UpdateMediaToSearchLibRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgBody")
    @com.aliyun.core.annotation.Validation(required = true)
    private String msgBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    private UpdateMediaToSearchLibRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaId = builder.mediaId;
        this.msgBody = builder.msgBody;
        this.searchLibName = builder.searchLibName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaToSearchLibRequest create() {
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
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return msgBody
     */
    public String getMsgBody() {
        return this.msgBody;
    }

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder extends Request.Builder<UpdateMediaToSearchLibRequest, Builder> {
        private String regionId; 
        private String mediaId; 
        private String msgBody; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaToSearchLibRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mediaId = request.mediaId;
            this.msgBody = request.msgBody;
            this.searchLibName = request.searchLibName;
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
         * <p>The ID of the media asset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>019b82e24b37a1c2958dec38</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The message body.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder msgBody(String msgBody) {
            this.putQueryParameter("MsgBody", msgBody);
            this.msgBody = msgBody;
            return this;
        }

        /**
         * <p>The name of the search library. Default value: ims-default-search-lib.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
            return this;
        }

        @Override
        public UpdateMediaToSearchLibRequest build() {
            return new UpdateMediaToSearchLibRequest(this);
        } 

    } 

}
