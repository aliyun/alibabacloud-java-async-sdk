// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentretailvision20260506.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecognizeOrderRequest} extends {@link RequestModel}
 *
 * <p>RecognizeOrderRequest</p>
 */
public class RecognizeOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CandidateItems")
    private java.util.List<String> candidateItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderUniqueId")
    private String orderUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoUrls")
    private java.util.List<String> videoUrls;

    private RecognizeOrderRequest(Builder builder) {
        super(builder);
        this.callbackUrl = builder.callbackUrl;
        this.candidateItems = builder.candidateItems;
        this.deviceId = builder.deviceId;
        this.orderUniqueId = builder.orderUniqueId;
        this.videoUrls = builder.videoUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return candidateItems
     */
    public java.util.List<String> getCandidateItems() {
        return this.candidateItems;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return orderUniqueId
     */
    public String getOrderUniqueId() {
        return this.orderUniqueId;
    }

    /**
     * @return videoUrls
     */
    public java.util.List<String> getVideoUrls() {
        return this.videoUrls;
    }

    public static final class Builder extends Request.Builder<RecognizeOrderRequest, Builder> {
        private String callbackUrl; 
        private java.util.List<String> candidateItems; 
        private String deviceId; 
        private String orderUniqueId; 
        private java.util.List<String> videoUrls; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeOrderRequest request) {
            super(request);
            this.callbackUrl = request.callbackUrl;
            this.candidateItems = request.candidateItems;
            this.deviceId = request.deviceId;
            this.orderUniqueId = request.orderUniqueId;
            this.videoUrls = request.videoUrls;
        } 

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * CandidateItems.
         */
        public Builder candidateItems(java.util.List<String> candidateItems) {
            String candidateItemsShrink = shrink(candidateItems, "CandidateItems", "json");
            this.putQueryParameter("CandidateItems", candidateItemsShrink);
            this.candidateItems = candidateItems;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * OrderUniqueId.
         */
        public Builder orderUniqueId(String orderUniqueId) {
            this.putQueryParameter("OrderUniqueId", orderUniqueId);
            this.orderUniqueId = orderUniqueId;
            return this;
        }

        /**
         * VideoUrls.
         */
        public Builder videoUrls(java.util.List<String> videoUrls) {
            String videoUrlsShrink = shrink(videoUrls, "VideoUrls", "json");
            this.putQueryParameter("VideoUrls", videoUrlsShrink);
            this.videoUrls = videoUrls;
            return this;
        }

        @Override
        public RecognizeOrderRequest build() {
            return new RecognizeOrderRequest(this);
        } 

    } 

}
