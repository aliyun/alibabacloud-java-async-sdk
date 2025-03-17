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
 * {@link CreateSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateSourceRequest</p>
 */
public class CreateSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpPackageConfigurations")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpPackageConfigurations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLocationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    private CreateSourceRequest(Builder builder) {
        super(builder);
        this.httpPackageConfigurations = builder.httpPackageConfigurations;
        this.sourceLocationName = builder.sourceLocationName;
        this.sourceName = builder.sourceName;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpPackageConfigurations
     */
    public String getHttpPackageConfigurations() {
        return this.httpPackageConfigurations;
    }

    /**
     * @return sourceLocationName
     */
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * @return sourceName
     */
    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<CreateSourceRequest, Builder> {
        private String httpPackageConfigurations; 
        private String sourceLocationName; 
        private String sourceName; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSourceRequest request) {
            super(request);
            this.httpPackageConfigurations = request.httpPackageConfigurations;
            this.sourceLocationName = request.sourceLocationName;
            this.sourceName = request.sourceName;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The source configurations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>“[{
         *     &quot;sourceGroupName&quot;: &quot;mySourceGroup-1&quot;,
         *     &quot;relativePath&quot;: &quot;group1/hls.m3u8&quot;,
         *     &quot;type&quot;: &quot;hls&quot;
         * }]”</p>
         */
        public Builder httpPackageConfigurations(String httpPackageConfigurations) {
            this.putQueryParameter("HttpPackageConfigurations", httpPackageConfigurations);
            this.httpPackageConfigurations = httpPackageConfigurations;
            return this;
        }

        /**
         * <p>The name of the source location.</p>
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

        /**
         * <p>The name of the source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyVodSource</p>
         */
        public Builder sourceName(String sourceName) {
            this.putQueryParameter("SourceName", sourceName);
            this.sourceName = sourceName;
            return this;
        }

        /**
         * <p>The source type. Valid values: vodSource and liveSource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vodSource</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public CreateSourceRequest build() {
            return new CreateSourceRequest(this);
        } 

    } 

}
