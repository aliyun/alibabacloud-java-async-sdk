// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TextAsyncManualScanResultsRequest} extends {@link RequestModel}
 *
 * <p>TextAsyncManualScanResultsRequest</p>
 */
public class TextAsyncManualScanResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientInfo")
    private String clientInfo;

    private TextAsyncManualScanResultsRequest(Builder builder) {
        super(builder);
        this.clientInfo = builder.clientInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextAsyncManualScanResultsRequest create() {
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

    public static final class Builder extends Request.Builder<TextAsyncManualScanResultsRequest, Builder> {
        private String clientInfo; 

        private Builder() {
            super();
        } 

        private Builder(TextAsyncManualScanResultsRequest request) {
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
        public TextAsyncManualScanResultsRequest build() {
            return new TextAsyncManualScanResultsRequest(this);
        } 

    } 

}
