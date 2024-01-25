// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTempFileDownloadLinkRequest} extends {@link RequestModel}
 *
 * <p>GetTempFileDownloadLinkRequest</p>
 */
public class GetTempFileDownloadLinkRequest extends Request {
    @Query
    @NameInMap("TempFileKey")
    @Validation(required = true)
    private String tempFileKey;

    private GetTempFileDownloadLinkRequest(Builder builder) {
        super(builder);
        this.tempFileKey = builder.tempFileKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTempFileDownloadLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tempFileKey
     */
    public String getTempFileKey() {
        return this.tempFileKey;
    }

    public static final class Builder extends Request.Builder<GetTempFileDownloadLinkRequest, Builder> {
        private String tempFileKey; 

        private Builder() {
            super();
        } 

        private Builder(GetTempFileDownloadLinkRequest request) {
            super(request);
            this.tempFileKey = request.tempFileKey;
        } 

        /**
         * The key that is used to download a file.
         */
        public Builder tempFileKey(String tempFileKey) {
            this.putQueryParameter("TempFileKey", tempFileKey);
            this.tempFileKey = tempFileKey;
            return this;
        }

        @Override
        public GetTempFileDownloadLinkRequest build() {
            return new GetTempFileDownloadLinkRequest(this);
        } 

    } 

}
