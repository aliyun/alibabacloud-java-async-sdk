// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveRequest</p>
 */
public class UpdateLiveRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Introduction")
    private String introduction;

    @Body
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    @Body
    @NameInMap("Title")
    private String title;

    private UpdateLiveRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.introduction = builder.introduction;
        this.liveId = builder.liveId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveRequest create() {
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
     * @return introduction
     */
    public String getIntroduction() {
        return this.introduction;
    }

    /**
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateLiveRequest, Builder> {
        private String regionId; 
        private String introduction; 
        private String liveId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.introduction = request.introduction;
            this.liveId = request.liveId;
            this.title = request.title;
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
         * 直播简介，支持中英文，最大长度2048位
         */
        public Builder introduction(String introduction) {
            this.putBodyParameter("Introduction", introduction);
            this.introduction = introduction;
            return this;
        }

        /**
         * 直播资源的唯一标识ID
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
            return this;
        }

        /**
         * 直播标题，支持中英文，最大长度256位
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateLiveRequest build() {
            return new UpdateLiveRequest(this);
        } 

    } 

}
