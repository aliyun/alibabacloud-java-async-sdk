// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConferenceRequest} extends {@link RequestModel}
 *
 * <p>UpdateConferenceRequest</p>
 */
public class UpdateConferenceRequest extends Request {
    @Body
    @NameInMap("ConferenceId")
    @Validation(required = true)
    private String conferenceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private UpdateConferenceRequest(Builder builder) {
        super(builder);
        this.conferenceId = builder.conferenceId;
        this.regionId = builder.regionId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateConferenceRequest, Builder> {
        private String conferenceId; 
        private String regionId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConferenceRequest request) {
            super(request);
            this.conferenceId = request.conferenceId;
            this.regionId = request.regionId;
            this.title = request.title;
        } 

        /**
         * 会议唯一标识
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("ConferenceId", conferenceId);
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 会议标题
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateConferenceRequest build() {
            return new UpdateConferenceRequest(this);
        } 

    } 

}
