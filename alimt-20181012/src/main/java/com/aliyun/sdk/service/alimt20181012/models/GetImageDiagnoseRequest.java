// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageDiagnoseRequest} extends {@link RequestModel}
 *
 * <p>GetImageDiagnoseRequest</p>
 */
public class GetImageDiagnoseRequest extends Request {
    @Body
    @NameInMap("Extra")
    private String extra;

    @Body
    @NameInMap("Url")
    @Validation(required = true)
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
         * Url.
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
