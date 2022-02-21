// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceLiveUrlRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceLiveUrlRequest</p>
 */
public class GetDeviceLiveUrlRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("DeviceId")
    private String deviceId;

    @Body
    @NameInMap("GbId")
    private String gbId;

    @Body
    @NameInMap("OutProtocol")
    private String outProtocol;

    @Body
    @NameInMap("StreamType")
    private String streamType;

    private GetDeviceLiveUrlRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.deviceId = builder.deviceId;
        this.gbId = builder.gbId;
        this.outProtocol = builder.outProtocol;
        this.streamType = builder.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceLiveUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
    }

    /**
     * @return outProtocol
     */
    public String getOutProtocol() {
        return this.outProtocol;
    }

    /**
     * @return streamType
     */
    public String getStreamType() {
        return this.streamType;
    }

    public static final class Builder extends Request.Builder<GetDeviceLiveUrlRequest, Builder> {
        private String corpId; 
        private String deviceId; 
        private String gbId; 
        private String outProtocol; 
        private String streamType; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceLiveUrlRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.deviceId = response.deviceId;
            this.gbId = response.gbId;
            this.outProtocol = response.outProtocol;
            this.streamType = response.streamType;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * GbId.
         */
        public Builder gbId(String gbId) {
            this.putBodyParameter("GbId", gbId);
            this.gbId = gbId;
            return this;
        }

        /**
         * OutProtocol.
         */
        public Builder outProtocol(String outProtocol) {
            this.putBodyParameter("OutProtocol", outProtocol);
            this.outProtocol = outProtocol;
            return this;
        }

        /**
         * StreamType.
         */
        public Builder streamType(String streamType) {
            this.putBodyParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        @Override
        public GetDeviceLiveUrlRequest build() {
            return new GetDeviceLiveUrlRequest(this);
        } 

    } 

}
