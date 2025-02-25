// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebHostingConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebHostingConfigRequest</p>
 */
public class ModifyWebHostingConfigRequest extends Request {
    @Body
    @NameInMap("AllowedIps")
    private String allowedIps;

    @Body
    @NameInMap("ErrorHttpStatus")
    private String errorHttpStatus;

    @Body
    @NameInMap("ErrorPath")
    private String errorPath;

    @Body
    @NameInMap("IndexPath")
    @Validation(required = true)
    private String indexPath;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private ModifyWebHostingConfigRequest(Builder builder) {
        super(builder);
        this.allowedIps = builder.allowedIps;
        this.errorHttpStatus = builder.errorHttpStatus;
        this.errorPath = builder.errorPath;
        this.indexPath = builder.indexPath;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebHostingConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedIps
     */
    public String getAllowedIps() {
        return this.allowedIps;
    }

    /**
     * @return errorHttpStatus
     */
    public String getErrorHttpStatus() {
        return this.errorHttpStatus;
    }

    /**
     * @return errorPath
     */
    public String getErrorPath() {
        return this.errorPath;
    }

    /**
     * @return indexPath
     */
    public String getIndexPath() {
        return this.indexPath;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<ModifyWebHostingConfigRequest, Builder> {
        private String allowedIps; 
        private String errorHttpStatus; 
        private String errorPath; 
        private String indexPath; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebHostingConfigRequest request) {
            super(request);
            this.allowedIps = request.allowedIps;
            this.errorHttpStatus = request.errorHttpStatus;
            this.errorPath = request.errorPath;
            this.indexPath = request.indexPath;
            this.spaceId = request.spaceId;
        } 

        /**
         * AllowedIps.
         */
        public Builder allowedIps(String allowedIps) {
            this.putBodyParameter("AllowedIps", allowedIps);
            this.allowedIps = allowedIps;
            return this;
        }

        /**
         * ErrorHttpStatus.
         */
        public Builder errorHttpStatus(String errorHttpStatus) {
            this.putBodyParameter("ErrorHttpStatus", errorHttpStatus);
            this.errorHttpStatus = errorHttpStatus;
            return this;
        }

        /**
         * ErrorPath.
         */
        public Builder errorPath(String errorPath) {
            this.putBodyParameter("ErrorPath", errorPath);
            this.errorPath = errorPath;
            return this;
        }

        /**
         * IndexPath.
         */
        public Builder indexPath(String indexPath) {
            this.putBodyParameter("IndexPath", indexPath);
            this.indexPath = indexPath;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public ModifyWebHostingConfigRequest build() {
            return new ModifyWebHostingConfigRequest(this);
        } 

    } 

}
