// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link GetPreSignedUrlForObjectResult} extends {@link TeaModel}
 *
 * <p>GetPreSignedUrlForObjectResult</p>
 */
public class GetPreSignedUrlForObjectResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jarUrl")
    private String jarUrl;

    @com.aliyun.core.annotation.NameInMap("preSignedUrl")
    private String preSignedUrl;

    private GetPreSignedUrlForObjectResult(Builder builder) {
        this.jarUrl = builder.jarUrl;
        this.preSignedUrl = builder.preSignedUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPreSignedUrlForObjectResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jarUrl
     */
    public String getJarUrl() {
        return this.jarUrl;
    }

    /**
     * @return preSignedUrl
     */
    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    public static final class Builder {
        private String jarUrl; 
        private String preSignedUrl; 

        private Builder() {
        } 

        private Builder(GetPreSignedUrlForObjectResult model) {
            this.jarUrl = model.jarUrl;
            this.preSignedUrl = model.preSignedUrl;
        } 

        /**
         * jarUrl.
         */
        public Builder jarUrl(String jarUrl) {
            this.jarUrl = jarUrl;
            return this;
        }

        /**
         * preSignedUrl.
         */
        public Builder preSignedUrl(String preSignedUrl) {
            this.preSignedUrl = preSignedUrl;
            return this;
        }

        public GetPreSignedUrlForObjectResult build() {
            return new GetPreSignedUrlForObjectResult(this);
        } 

    } 

}
