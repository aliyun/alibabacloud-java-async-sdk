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
 * {@link GetDRMLicenseRequest} extends {@link RequestModel}
 *
 * <p>GetDRMLicenseRequest</p>
 */
public class GetDRMLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CDMData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String CDMData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    private String certId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DRMType")
    private String DRMType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private GetDRMLicenseRequest(Builder builder) {
        super(builder);
        this.CDMData = builder.CDMData;
        this.certId = builder.certId;
        this.DRMType = builder.DRMType;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDRMLicenseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CDMData
     */
    public String getCDMData() {
        return this.CDMData;
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return DRMType
     */
    public String getDRMType() {
        return this.DRMType;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<GetDRMLicenseRequest, Builder> {
        private String CDMData; 
        private String certId; 
        private String DRMType; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetDRMLicenseRequest request) {
            super(request);
            this.CDMData = request.CDMData;
            this.certId = request.certId;
            this.DRMType = request.DRMType;
            this.videoId = request.videoId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder CDMData(String CDMData) {
            this.putQueryParameter("CDMData", CDMData);
            this.CDMData = CDMData;
            return this;
        }

        /**
         * CertId.
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * DRMType.
         */
        public Builder DRMType(String DRMType) {
            this.putQueryParameter("DRMType", DRMType);
            this.DRMType = DRMType;
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
        public GetDRMLicenseRequest build() {
            return new GetDRMLicenseRequest(this);
        } 

    } 

}
