// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVersionDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetVersionDownloadUrlRequest</p>
 */
public class GetVersionDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private GetVersionDownloadUrlRequest(Builder builder) {
        super(builder);
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVersionDownloadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<GetVersionDownloadUrlRequest, Builder> {
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(GetVersionDownloadUrlRequest request) {
            super(request);
            this.versionName = request.versionName;
        } 

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.putQueryParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public GetVersionDownloadUrlRequest build() {
            return new GetVersionDownloadUrlRequest(this);
        } 

    } 

}
