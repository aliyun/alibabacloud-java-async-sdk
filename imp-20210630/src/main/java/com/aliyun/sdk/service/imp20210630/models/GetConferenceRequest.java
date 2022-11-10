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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ConferenceId")
    @Validation(required = true)
    private String conferenceId;

    private GetConferenceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.conferenceId = builder.conferenceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static final class Builder extends Request.Builder<GetConferenceRequest, Builder> {
        private String regionId; 
        private String conferenceId; 

        private Builder() {
            super();
        } 

        private Builder(GetConferenceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.conferenceId = request.conferenceId;
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
         * 会议资源唯一标识。
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("ConferenceId", conferenceId);
            this.conferenceId = conferenceId;
            return this;
        }

        @Override
        public GetConferenceRequest build() {
            return new GetConferenceRequest(this);
        } 

    } 

}
