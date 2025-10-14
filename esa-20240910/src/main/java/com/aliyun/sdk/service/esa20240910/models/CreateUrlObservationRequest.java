// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateUrlObservationRequest} extends {@link RequestModel}
 *
 * <p>CreateUrlObservationRequest</p>
 */
public class CreateUrlObservationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sdkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private CreateUrlObservationRequest(Builder builder) {
        super(builder);
        this.sdkType = builder.sdkType;
        this.siteId = builder.siteId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUrlObservationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sdkType
     */
    public String getSdkType() {
        return this.sdkType;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CreateUrlObservationRequest, Builder> {
        private String sdkType; 
        private Long siteId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CreateUrlObservationRequest request) {
            super(request);
            this.sdkType = request.sdkType;
            this.siteId = request.siteId;
            this.url = request.url;
        } 

        /**
         * <p>SDK integration. Supported</p>
         * <ul>
         * <li><strong>automatic</strong></li>
         * <li><strong>manual</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>automatic</p>
         */
        public Builder sdkType(String sdkType) {
            this.putQueryParameter("SdkType", sdkType);
            this.sdkType = sdkType;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456******</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The URL of the web page to monitor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com/test</p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CreateUrlObservationRequest build() {
            return new CreateUrlObservationRequest(this);
        } 

    } 

}
