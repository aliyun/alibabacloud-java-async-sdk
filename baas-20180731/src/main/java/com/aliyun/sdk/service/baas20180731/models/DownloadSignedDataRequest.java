// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadSignedDataRequest} extends {@link RequestModel}
 *
 * <p>DownloadSignedDataRequest</p>
 */
public class DownloadSignedDataRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("Path")
    private String path;

    private DownloadSignedDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadSignedDataRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<DownloadSignedDataRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(DownloadSignedDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
            this.path = request.path;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public DownloadSignedDataRequest build() {
            return new DownloadSignedDataRequest(this);
        } 

    } 

}
