// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link UpdateCloudAppInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudAppInfoRequest</p>
 */
public class UpdateCloudAppInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Patch")
    private Patch patch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StablePatchId")
    private String stablePatchId;

    private UpdateCloudAppInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.description = builder.description;
        this.patch = builder.patch;
        this.stablePatchId = builder.stablePatchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudAppInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return patch
     */
    public Patch getPatch() {
        return this.patch;
    }

    /**
     * @return stablePatchId
     */
    public String getStablePatchId() {
        return this.stablePatchId;
    }

    public static final class Builder extends Request.Builder<UpdateCloudAppInfoRequest, Builder> {
        private String appId; 
        private String description; 
        private Patch patch; 
        private String stablePatchId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudAppInfoRequest request) {
            super(request);
            this.appId = request.appId;
            this.description = request.description;
            this.patch = request.patch;
            this.stablePatchId = request.stablePatchId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Patch.
         */
        public Builder patch(Patch patch) {
            String patchShrink = shrink(patch, "Patch", "json");
            this.putQueryParameter("Patch", patchShrink);
            this.patch = patch;
            return this;
        }

        /**
         * StablePatchId.
         */
        public Builder stablePatchId(String stablePatchId) {
            this.putQueryParameter("StablePatchId", stablePatchId);
            this.stablePatchId = stablePatchId;
            return this;
        }

        @Override
        public UpdateCloudAppInfoRequest build() {
            return new UpdateCloudAppInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCloudAppInfoRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudAppInfoRequest</p>
     */
    public static class Patch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadURL")
        private String downloadURL;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("PatchName")
        @com.aliyun.core.annotation.Validation(maxLength = 50, minLength = 1)
        private String patchName;

        private Patch(Builder builder) {
            this.downloadURL = builder.downloadURL;
            this.md5 = builder.md5;
            this.patchName = builder.patchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Patch create() {
            return builder().build();
        }

        /**
         * @return downloadURL
         */
        public String getDownloadURL() {
            return this.downloadURL;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return patchName
         */
        public String getPatchName() {
            return this.patchName;
        }

        public static final class Builder {
            private String downloadURL; 
            private String md5; 
            private String patchName; 

            private Builder() {
            } 

            private Builder(Patch model) {
                this.downloadURL = model.downloadURL;
                this.md5 = model.md5;
                this.patchName = model.patchName;
            } 

            /**
             * DownloadURL.
             */
            public Builder downloadURL(String downloadURL) {
                this.downloadURL = downloadURL;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * PatchName.
             */
            public Builder patchName(String patchName) {
                this.patchName = patchName;
                return this;
            }

            public Patch build() {
                return new Patch(this);
            } 

        } 

    }
}
