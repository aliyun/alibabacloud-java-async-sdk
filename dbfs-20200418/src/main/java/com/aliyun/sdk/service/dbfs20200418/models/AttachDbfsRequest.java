// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDbfsRequest} extends {@link RequestModel}
 *
 * <p>AttachDbfsRequest</p>
 */
public class AttachDbfsRequest extends Request {
    @Query
    @NameInMap("AttachMode")
    private String attachMode;

    @Query
    @NameInMap("AttachPoint")
    private String attachPoint;

    @Query
    @NameInMap("ECSInstanceId")
    @Validation(required = true)
    private String ECSInstanceId;

    @Query
    @NameInMap("FsId")
    @Validation(required = true)
    private String fsId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServerUrl")
    private String serverUrl;

    private AttachDbfsRequest(Builder builder) {
        super(builder);
        this.attachMode = builder.attachMode;
        this.attachPoint = builder.attachPoint;
        this.ECSInstanceId = builder.ECSInstanceId;
        this.fsId = builder.fsId;
        this.regionId = builder.regionId;
        this.serverUrl = builder.serverUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDbfsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachMode
     */
    public String getAttachMode() {
        return this.attachMode;
    }

    /**
     * @return attachPoint
     */
    public String getAttachPoint() {
        return this.attachPoint;
    }

    /**
     * @return ECSInstanceId
     */
    public String getECSInstanceId() {
        return this.ECSInstanceId;
    }

    /**
     * @return fsId
     */
    public String getFsId() {
        return this.fsId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serverUrl
     */
    public String getServerUrl() {
        return this.serverUrl;
    }

    public static final class Builder extends Request.Builder<AttachDbfsRequest, Builder> {
        private String attachMode; 
        private String attachPoint; 
        private String ECSInstanceId; 
        private String fsId; 
        private String regionId; 
        private String serverUrl; 

        private Builder() {
            super();
        } 

        private Builder(AttachDbfsRequest request) {
            super(request);
            this.attachMode = request.attachMode;
            this.attachPoint = request.attachPoint;
            this.ECSInstanceId = request.ECSInstanceId;
            this.fsId = request.fsId;
            this.regionId = request.regionId;
            this.serverUrl = request.serverUrl;
        } 

        /**
         * AttachMode.
         */
        public Builder attachMode(String attachMode) {
            this.putQueryParameter("AttachMode", attachMode);
            this.attachMode = attachMode;
            return this;
        }

        /**
         * AttachPoint.
         */
        public Builder attachPoint(String attachPoint) {
            this.putQueryParameter("AttachPoint", attachPoint);
            this.attachPoint = attachPoint;
            return this;
        }

        /**
         * ECSInstanceId.
         */
        public Builder ECSInstanceId(String ECSInstanceId) {
            this.putQueryParameter("ECSInstanceId", ECSInstanceId);
            this.ECSInstanceId = ECSInstanceId;
            return this;
        }

        /**
         * FsId.
         */
        public Builder fsId(String fsId) {
            this.putQueryParameter("FsId", fsId);
            this.fsId = fsId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServerUrl.
         */
        public Builder serverUrl(String serverUrl) {
            this.putQueryParameter("ServerUrl", serverUrl);
            this.serverUrl = serverUrl;
            return this;
        }

        @Override
        public AttachDbfsRequest build() {
            return new AttachDbfsRequest(this);
        } 

    } 

}
