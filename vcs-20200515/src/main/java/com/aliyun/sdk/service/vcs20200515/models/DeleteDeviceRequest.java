// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeviceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeviceRequest</p>
 */
public class DeleteDeviceRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("GbId")
    private String gbId;

    private DeleteDeviceRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.gbId = builder.gbId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeviceRequest create() {
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
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
    }

    public static final class Builder extends Request.Builder<DeleteDeviceRequest, Builder> {
        private String corpId; 
        private String gbId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeviceRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.gbId = response.gbId;
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
         * GbId.
         */
        public Builder gbId(String gbId) {
            this.putBodyParameter("GbId", gbId);
            this.gbId = gbId;
            return this;
        }

        @Override
        public DeleteDeviceRequest build() {
            return new DeleteDeviceRequest(this);
        } 

    } 

}
