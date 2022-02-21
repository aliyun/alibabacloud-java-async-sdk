// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PeekNvrRequest} extends {@link RequestModel}
 *
 * <p>PeekNvrRequest</p>
 */
public class PeekNvrRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    private PeekNvrRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.deviceId = builder.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PeekNvrRequest create() {
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

    public static final class Builder extends Request.Builder<PeekNvrRequest, Builder> {
        private String corpId; 
        private String deviceId; 

        private Builder() {
            super();
        } 

        private Builder(PeekNvrRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.deviceId = response.deviceId;
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

        @Override
        public PeekNvrRequest build() {
            return new PeekNvrRequest(this);
        } 

    } 

}
