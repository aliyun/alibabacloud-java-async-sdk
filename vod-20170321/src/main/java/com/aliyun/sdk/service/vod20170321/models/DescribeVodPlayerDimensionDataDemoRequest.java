// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodPlayerDimensionDataDemoRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodPlayerDimensionDataDemoRequest</p>
 */
public class DescribeVodPlayerDimensionDataDemoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimension")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dimension;

    private DescribeVodPlayerDimensionDataDemoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dimension = builder.dimension;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodPlayerDimensionDataDemoRequest create() {
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

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    public static final class Builder extends Request.Builder<DescribeVodPlayerDimensionDataDemoRequest, Builder> {
        private String appId; 
        private String dimension; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodPlayerDimensionDataDemoRequest request) {
            super(request);
            this.appId = request.appId;
            this.dimension = request.dimension;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Os</p>
         */
        public Builder dimension(String dimension) {
            this.putQueryParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        @Override
        public DescribeVodPlayerDimensionDataDemoRequest build() {
            return new DescribeVodPlayerDimensionDataDemoRequest(this);
        } 

    } 

}
