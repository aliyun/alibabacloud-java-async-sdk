// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImageAsyncScanResultsRequest} extends {@link RequestModel}
 *
 * <p>ImageAsyncScanResultsRequest</p>
 */
public class ImageAsyncScanResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientInfo")
    private String clientInfo;

    private ImageAsyncScanResultsRequest(Builder builder) {
        super(builder);
        this.clientInfo = builder.clientInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageAsyncScanResultsRequest create() {
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

    public static final class Builder extends Request.Builder<ImageAsyncScanResultsRequest, Builder> {
        private String clientInfo; 

        private Builder() {
            super();
        } 

        private Builder(ImageAsyncScanResultsRequest request) {
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
        public ImageAsyncScanResultsRequest build() {
            return new ImageAsyncScanResultsRequest(this);
        } 

    } 

}
