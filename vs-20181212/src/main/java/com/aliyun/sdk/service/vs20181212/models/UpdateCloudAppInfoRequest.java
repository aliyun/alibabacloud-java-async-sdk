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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Patch")
    private Patch patch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PkgLabels")
    private java.util.List<String> pkgLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StablePatchId")
    private String stablePatchId;

    private UpdateCloudAppInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.description = builder.description;
        this.patch = builder.patch;
        this.pkgLabels = builder.pkgLabels;
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
     * @return pkgLabels
     */
    public java.util.List<String> getPkgLabels() {
        return this.pkgLabels;
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
        private java.util.List<String> pkgLabels; 
        private String stablePatchId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudAppInfoRequest request) {
            super(request);
            this.appId = request.appId;
            this.description = request.description;
            this.patch = request.patch;
            this.pkgLabels = request.pkgLabels;
            this.stablePatchId = request.stablePatchId;
        } 

        /**
         * <p>The ID of the cloud application, which corresponds to a unique application package.</p>
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
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>用于测试使用</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Information about the patch package to upload.</p>
         * <ol>
         * <li><p>This parameter is not supported when PkgType is android.</p>
         * </li>
         * <li><p>For the same AppId, only one patch can be in the process of uploading at a time. This means only one patch can be in a state other than its desired state.</p>
         * </li>
         * </ol>
         */
        public Builder patch(Patch patch) {
            String patchShrink = shrink(patch, "Patch", "json");
            this.putBodyParameter("Patch", patchShrink);
            this.patch = patch;
            return this;
        }

        /**
         * <p>The tags for the cloud application. You can select multiple tags. This action resets all existing tags for the cloud application.</p>
         * <ol>
         * <li><p>Valid values:
         * hot, game, and app.</p>
         * </li>
         * <li><p>Special case:
         * To delete all tags, enter [&quot;NULL&quot;].</p>
         * </li>
         * </ol>
         */
        public Builder pkgLabels(java.util.List<String> pkgLabels) {
            String pkgLabelsShrink = shrink(pkgLabels, "PkgLabels", "json");
            this.putQueryParameter("PkgLabels", pkgLabelsShrink);
            this.pkgLabels = pkgLabels;
            return this;
        }

        /**
         * <p>The ID of the stable patch. This patch is used by default if you do not specify a PatchId when the application is in use, such as during a session startup. This parameter is not supported when PkgType is android.
         * Special value:</p>
         * <ol>
         * <li>If you set this parameter to origin, the patch version is removed and the initial version is used.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>patch-03fa76e8e13a49b6a966b063d9d309b4</p>
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
        @com.aliyun.core.annotation.NameInMap("AsStablePatch")
        private Boolean asStablePatch;

        @com.aliyun.core.annotation.NameInMap("DownloadURL")
        private String downloadURL;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("PatchName")
        @com.aliyun.core.annotation.Validation(maxLength = 50, minLength = 1)
        private String patchName;

        @com.aliyun.core.annotation.NameInMap("PkgFormat")
        private String pkgFormat;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        private Patch(Builder builder) {
            this.asStablePatch = builder.asStablePatch;
            this.downloadURL = builder.downloadURL;
            this.md5 = builder.md5;
            this.patchName = builder.patchName;
            this.pkgFormat = builder.pkgFormat;
            this.renderingInstanceId = builder.renderingInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Patch create() {
            return builder().build();
        }

        /**
         * @return asStablePatch
         */
        public Boolean getAsStablePatch() {
            return this.asStablePatch;
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

        /**
         * @return pkgFormat
         */
        public String getPkgFormat() {
            return this.pkgFormat;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public static final class Builder {
            private Boolean asStablePatch; 
            private String downloadURL; 
            private String md5; 
            private String patchName; 
            private String pkgFormat; 
            private String renderingInstanceId; 

            private Builder() {
            } 

            private Builder(Patch model) {
                this.asStablePatch = model.asStablePatch;
                this.downloadURL = model.downloadURL;
                this.md5 = model.md5;
                this.patchName = model.patchName;
                this.pkgFormat = model.pkgFormat;
                this.renderingInstanceId = model.renderingInstanceId;
            } 

            /**
             * <p>Specifies whether to automatically set the patch as the stable version after it is successfully uploaded. The default value is false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder asStablePatch(Boolean asStablePatch) {
                this.asStablePatch = asStablePatch;
                return this;
            }

            /**
             * <p>The download URL for the patch package.
             * You must specify either RenderingInstanceId or DownloadURL.
             * DownloadURL takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test_host/app/test-tar-pkg.tar">https://test_host/app/test-tar-pkg.tar</a></p>
             */
            public Builder downloadURL(String downloadURL) {
                this.downloadURL = downloadURL;
                return this;
            }

            /**
             * <p>The MD5 hash of the patch package, used to verify integrity. This parameter is valid only if DownloadURL is not empty. It is required if DownloadURL is not empty.</p>
             * 
             * <strong>example:</strong>
             * <p>346f6404395adfg5bae1e45g4e943bf7</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The name or description of the patch package. This is a unique identifier under the AppId.
             * Default naming conventions:</p>
             * <ol>
             * <li><p>Cannot be origin or all.</p>
             * </li>
             * <li><p>Must be 1 to 50 characters in length.</p>
             * </li>
             * <li><p>Can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</p>
             * </li>
             * <li><p>The first and last characters must be a letter or a digit.</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>p1</p>
             */
            public Builder patchName(String patchName) {
                this.patchName = patchName;
                return this;
            }

            /**
             * <p>The format of the installation package. By default, the system uses the file extension from the download URL. This parameter is valid only if DownloadURL is not empty. Valid values:</p>
             * <ol>
             * <li><p>tar.gz</p>
             * </li>
             * <li><p>tar</p>
             * </li>
             * <li><p>zip</p>
             * </li>
             * <li><p>rar</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>tar</p>
             */
            public Builder pkgFormat(String pkgFormat) {
                this.pkgFormat = pkgFormat;
                return this;
            }

            /**
             * <p>The instance ID required to create the patch package. This parameter is valid only in the Android application marketplace scenario (PkgType=andrpid_appmarket). Specify either RenderingInstanceId or DownloadURL. DownloadURL takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>render-d7ec79fe47ce47aca2d8d7500d25a28a</p>
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            public Patch build() {
                return new Patch(this);
            } 

        } 

    }
}
