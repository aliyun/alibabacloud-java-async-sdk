// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConferenceRequest} extends {@link RequestModel}
 *
 * <p>GetConferenceRequest</p>
 */
public class GetConferenceRequest extends Request {
    @Body
    @NameInMap("ConferenceId")
    @Validation(required = true)
    private String conferenceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetConferenceRequest(Builder builder) {
        super(builder);
        this.conferenceId = builder.conferenceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConferenceRequest create() {
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

    public static final class Builder extends Request.Builder<GetConferenceRequest, Builder> {
        private String conferenceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetConferenceRequest request) {
            super(request);
            this.conferenceId = request.conferenceId;
            this.regionId = request.regionId;
        } 

        /**
         * 会议资源唯一标识。
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

        @Override
        public GetConferenceRequest build() {
            return new GetConferenceRequest(this);
        } 

    } 

}
