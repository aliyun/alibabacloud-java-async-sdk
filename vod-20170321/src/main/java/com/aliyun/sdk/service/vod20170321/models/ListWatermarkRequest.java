// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWatermarkRequest} extends {@link RequestModel}
 *
 * <p>ListWatermarkRequest</p>
 */
public class ListWatermarkRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    private ListWatermarkRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWatermarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<ListWatermarkRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(ListWatermarkRequest response) {
            super(response);
            this.appId = response.appId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public ListWatermarkRequest build() {
            return new ListWatermarkRequest(this);
        } 

    } 

}
