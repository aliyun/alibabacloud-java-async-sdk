// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401.models;

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
 * {@link WebFetchRequest} extends {@link RequestModel}
 *
 * <p>WebFetchRequest</p>
 */
public class WebFetchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputFormat")
    private String outputFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private WebFetchRequest(Builder builder) {
        super(builder);
        this.outputFormat = builder.outputFormat;
        this.regionId = builder.regionId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebFetchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outputFormat
     */
    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<WebFetchRequest, Builder> {
        private String outputFormat; 
        private String regionId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(WebFetchRequest request) {
            super(request);
            this.outputFormat = request.outputFormat;
            this.regionId = request.regionId;
            this.url = request.url;
        } 

        /**
         * OutputFormat.
         */
        public Builder outputFormat(String outputFormat) {
            this.putQueryParameter("OutputFormat", outputFormat);
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx/projects/spring-boot">https://xxx/projects/spring-boot</a></p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public WebFetchRequest build() {
            return new WebFetchRequest(this);
        } 

    } 

}
