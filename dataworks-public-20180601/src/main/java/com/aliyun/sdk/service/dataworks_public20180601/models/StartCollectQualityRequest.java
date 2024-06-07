// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCollectQualityRequest} extends {@link RequestModel}
 *
 * <p>StartCollectQualityRequest</p>
 */
public class StartCollectQualityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallbackResultString")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callbackResultString;

    private StartCollectQualityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.callbackResultString = builder.callbackResultString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCollectQualityRequest create() {
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
     * @return callbackResultString
     */
    public String getCallbackResultString() {
        return this.callbackResultString;
    }

    public static final class Builder extends Request.Builder<StartCollectQualityRequest, Builder> {
        private String regionId; 
        private String callbackResultString; 

        private Builder() {
            super();
        } 

        private Builder(StartCollectQualityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.callbackResultString = request.callbackResultString;
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
         * CallbackResultString.
         */
        public Builder callbackResultString(String callbackResultString) {
            this.putBodyParameter("CallbackResultString", callbackResultString);
            this.callbackResultString = callbackResultString;
            return this;
        }

        @Override
        public StartCollectQualityRequest build() {
            return new StartCollectQualityRequest(this);
        } 

    } 

}
