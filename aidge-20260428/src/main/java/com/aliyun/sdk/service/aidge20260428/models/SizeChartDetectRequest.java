// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link SizeChartDetectRequest} extends {@link RequestModel}
 *
 * <p>SizeChartDetectRequest</p>
 */
public class SizeChartDetectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Double threshold;

    private SizeChartDetectRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SizeChartDetectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<SizeChartDetectRequest, Builder> {
        private String imageUrl; 
        private Double threshold; 

        private Builder() {
            super();
        } 

        private Builder(SizeChartDetectRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.threshold = request.threshold;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i4/1822632490/O1CN01pbENR21UGT9w3a6gU_!!1822632490.jpg">https://img.alicdn.com/imgextra/i4/1822632490/O1CN01pbENR21UGT9w3a6gU_!!1822632490.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Double threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public SizeChartDetectRequest build() {
            return new SizeChartDetectRequest(this);
        } 

    } 

}
