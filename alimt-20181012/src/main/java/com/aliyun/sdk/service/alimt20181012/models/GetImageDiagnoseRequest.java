// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

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
 * {@link GetImageDiagnoseRequest} extends {@link RequestModel}
 *
 * <p>GetImageDiagnoseRequest</p>
 */
public class GetImageDiagnoseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extra")
    private String extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private GetImageDiagnoseRequest(Builder builder) {
        super(builder);
        this.extra = builder.extra;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageDiagnoseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<GetImageDiagnoseRequest, Builder> {
        private String extra; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(GetImageDiagnoseRequest request) {
            super(request);
            this.extra = request.extra;
            this.url = request.url;
        } 

        /**
         * Extra.
         */
        public Builder extra(String extra) {
            this.putBodyParameter("Extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxxx.oss-cn-shenzhen.aliyuncs.com/jd/41209/xxxxx.jpg">http://xxxxx.oss-cn-shenzhen.aliyuncs.com/jd/41209/xxxxx.jpg</a></p>
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public GetImageDiagnoseRequest build() {
            return new GetImageDiagnoseRequest(this);
        } 

    } 

}
