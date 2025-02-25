// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImageAsyncManualScanResultsRequest} extends {@link RequestModel}
 *
 * <p>ImageAsyncManualScanResultsRequest</p>
 */
public class ImageAsyncManualScanResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientInfo")
    private String clientInfo;

    private ImageAsyncManualScanResultsRequest(Builder builder) {
        super(builder);
        this.clientInfo = builder.clientInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageAsyncManualScanResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientInfo
     */
    public String getClientInfo() {
        return this.clientInfo;
    }

    public static final class Builder extends Request.Builder<ImageAsyncManualScanResultsRequest, Builder> {
        private String clientInfo; 

        private Builder() {
            super();
        } 

        private Builder(ImageAsyncManualScanResultsRequest request) {
            super(request);
            this.clientInfo = request.clientInfo;
        } 

        /**
         * ClientInfo.
         */
        public Builder clientInfo(String clientInfo) {
            this.putQueryParameter("ClientInfo", clientInfo);
            this.clientInfo = clientInfo;
            return this;
        }

        @Override
        public ImageAsyncManualScanResultsRequest build() {
            return new ImageAsyncManualScanResultsRequest(this);
        } 

    } 

}
