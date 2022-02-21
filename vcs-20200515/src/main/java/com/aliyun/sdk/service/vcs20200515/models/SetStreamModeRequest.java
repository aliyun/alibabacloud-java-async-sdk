// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetStreamModeRequest} extends {@link RequestModel}
 *
 * <p>SetStreamModeRequest</p>
 */
public class SetStreamModeRequest extends Request {
    @Body
    @NameInMap("DeviceIdList")
    @Validation(required = true)
    private String deviceIdList;

    @Body
    @NameInMap("StreamMode")
    @Validation(required = true)
    private String streamMode;

    private SetStreamModeRequest(Builder builder) {
        super(builder);
        this.deviceIdList = builder.deviceIdList;
        this.streamMode = builder.streamMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetStreamModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceIdList
     */
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

    /**
     * @return streamMode
     */
    public String getStreamMode() {
        return this.streamMode;
    }

    public static final class Builder extends Request.Builder<SetStreamModeRequest, Builder> {
        private String deviceIdList; 
        private String streamMode; 

        private Builder() {
            super();
        } 

        private Builder(SetStreamModeRequest response) {
            super(response);
            this.deviceIdList = response.deviceIdList;
            this.streamMode = response.streamMode;
        } 

        /**
         * DeviceIdList.
         */
        public Builder deviceIdList(String deviceIdList) {
            this.putBodyParameter("DeviceIdList", deviceIdList);
            this.deviceIdList = deviceIdList;
            return this;
        }

        /**
         * StreamMode.
         */
        public Builder streamMode(String streamMode) {
            this.putBodyParameter("StreamMode", streamMode);
            this.streamMode = streamMode;
            return this;
        }

        @Override
        public SetStreamModeRequest build() {
            return new SetStreamModeRequest(this);
        } 

    } 

}
