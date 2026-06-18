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
 * {@link GenerateTraceDiagnoseRequest} extends {@link RequestModel}
 *
 * <p>GenerateTraceDiagnoseRequest</p>
 */
public class GenerateTraceDiagnoseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private GenerateTraceDiagnoseRequest(Builder builder) {
        super(builder);
        this.source = builder.source;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTraceDiagnoseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<GenerateTraceDiagnoseRequest, Builder> {
        private String source; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(GenerateTraceDiagnoseRequest request) {
            super(request);
            this.source = request.source;
            this.url = request.url;
        } 

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxx.jpg">http://www.example.com/xxx.jpg</a></p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public GenerateTraceDiagnoseRequest build() {
            return new GenerateTraceDiagnoseRequest(this);
        } 

    } 

}
