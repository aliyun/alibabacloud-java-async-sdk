// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopStreamsRequest} extends {@link RequestModel}
 *
 * <p>StopStreamsRequest</p>
 */
public class StopStreamsRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DeviceIdList")
    @Validation(required = true)
    private String deviceIdList;

    private StopStreamsRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.deviceIdList = builder.deviceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopStreamsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return deviceIdList
     */
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

    public static final class Builder extends Request.Builder<StopStreamsRequest, Builder> {
        private String description; 
        private String deviceIdList; 

        private Builder() {
            super();
        } 

        private Builder(StopStreamsRequest response) {
            super(response);
            this.description = response.description;
            this.deviceIdList = response.deviceIdList;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 全局编号,支持多个,英文逗号分隔
         */
        public Builder deviceIdList(String deviceIdList) {
            this.putBodyParameter("DeviceIdList", deviceIdList);
            this.deviceIdList = deviceIdList;
            return this;
        }

        @Override
        public StopStreamsRequest build() {
            return new StopStreamsRequest(this);
        } 

    } 

}
