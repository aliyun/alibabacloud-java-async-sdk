// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetDRMCertInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDRMCertInfoRequest</p>
 */
public class GetDRMCertInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private GetDRMCertInfoRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDRMCertInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<GetDRMCertInfoRequest, Builder> {
        private String certId; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetDRMCertInfoRequest request) {
            super(request);
            this.certId = request.certId;
            this.videoId = request.videoId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public GetDRMCertInfoRequest build() {
            return new GetDRMCertInfoRequest(this);
        } 

    } 

}
