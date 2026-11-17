// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetUploadInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUploadInfoRequest</p>
 */
public class GetUploadInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    private GetUploadInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizRegionId = builder.bizRegionId;
        this.fileType = builder.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    public static final class Builder extends Request.Builder<GetUploadInfoRequest, Builder> {
        private String regionId; 
        private String bizRegionId; 
        private String fileType; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizRegionId = request.bizRegionId;
            this.fileType = request.fileType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the business region where the file is uploaded. If this parameter is not specified, the default OSS region configured for the service is used.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The type of the file to upload. Currently, only TASK is supported, which indicates an image task file.</p>
         * 
         * <strong>example:</strong>
         * <p>TASK</p>
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        @Override
        public GetUploadInfoRequest build() {
            return new GetUploadInfoRequest(this);
        } 

    } 

}
