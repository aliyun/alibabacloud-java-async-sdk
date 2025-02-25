// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateSourceLocationRequest} extends {@link RequestModel}
 *
 * <p>UpdateSourceLocationRequest</p>
 */
public class UpdateSourceLocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSegmentDelivery")
    private Boolean enableSegmentDelivery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegmentDeliveryUrl")
    private String segmentDeliveryUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLocationName;

    private UpdateSourceLocationRequest(Builder builder) {
        super(builder);
        this.baseUrl = builder.baseUrl;
        this.enableSegmentDelivery = builder.enableSegmentDelivery;
        this.segmentDeliveryUrl = builder.segmentDeliveryUrl;
        this.sourceLocationName = builder.sourceLocationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSourceLocationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseUrl
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * @return enableSegmentDelivery
     */
    public Boolean getEnableSegmentDelivery() {
        return this.enableSegmentDelivery;
    }

    /**
     * @return segmentDeliveryUrl
     */
    public String getSegmentDeliveryUrl() {
        return this.segmentDeliveryUrl;
    }

    /**
     * @return sourceLocationName
     */
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public static final class Builder extends Request.Builder<UpdateSourceLocationRequest, Builder> {
        private String baseUrl; 
        private Boolean enableSegmentDelivery; 
        private String segmentDeliveryUrl; 
        private String sourceLocationName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSourceLocationRequest request) {
            super(request);
            this.baseUrl = request.baseUrl;
            this.enableSegmentDelivery = request.enableSegmentDelivery;
            this.segmentDeliveryUrl = request.segmentDeliveryUrl;
            this.sourceLocationName = request.sourceLocationName;
        } 

        /**
         * BaseUrl.
         */
        public Builder baseUrl(String baseUrl) {
            this.putQueryParameter("BaseUrl", baseUrl);
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * EnableSegmentDelivery.
         */
        public Builder enableSegmentDelivery(Boolean enableSegmentDelivery) {
            this.putQueryParameter("EnableSegmentDelivery", enableSegmentDelivery);
            this.enableSegmentDelivery = enableSegmentDelivery;
            return this;
        }

        /**
         * SegmentDeliveryUrl.
         */
        public Builder segmentDeliveryUrl(String segmentDeliveryUrl) {
            this.putQueryParameter("SegmentDeliveryUrl", segmentDeliveryUrl);
            this.segmentDeliveryUrl = segmentDeliveryUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySourceLocation</p>
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.putQueryParameter("SourceLocationName", sourceLocationName);
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        @Override
        public UpdateSourceLocationRequest build() {
            return new UpdateSourceLocationRequest(this);
        } 

    } 

}
