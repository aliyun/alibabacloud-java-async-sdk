// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link GenerateCdnDiagnoseRequest} extends {@link RequestModel}
 *
 * <p>GenerateCdnDiagnoseRequest</p>
 */
public class GenerateCdnDiagnoseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private GenerateCdnDiagnoseRequest(Builder builder) {
        super(builder);
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCdnDiagnoseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<GenerateCdnDiagnoseRequest, Builder> {
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(GenerateCdnDiagnoseRequest request) {
            super(request);
            this.url = request.url;
        } 

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public GenerateCdnDiagnoseRequest build() {
            return new GenerateCdnDiagnoseRequest(this);
        } 

    } 

}
