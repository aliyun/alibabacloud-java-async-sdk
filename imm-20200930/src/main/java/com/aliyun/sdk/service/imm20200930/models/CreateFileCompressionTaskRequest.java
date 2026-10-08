// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link CreateFileCompressionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateFileCompressionTaskRequest</p>
 */
public class CreateFileCompressionTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompressedFormat")
    private String compressedFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceManifestURI")
    private String sourceManifestURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    private java.util.List<Sources> sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateFileCompressionTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.compressedFormat = builder.compressedFormat;
        this.credentialConfig = builder.credentialConfig;
        this.notification = builder.notification;
        this.projectName = builder.projectName;
        this.sourceManifestURI = builder.sourceManifestURI;
        this.sources = builder.sources;
        this.targetURI = builder.targetURI;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileCompressionTaskRequest create() {
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
     * @return compressedFormat
     */
    public String getCompressedFormat() {
        return this.compressedFormat;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sourceManifestURI
     */
    public String getSourceManifestURI() {
        return this.sourceManifestURI;
    }

    /**
     * @return sources
     */
    public java.util.List<Sources> getSources() {
        return this.sources;
    }

    /**
     * @return targetURI
     */
    public String getTargetURI() {
        return this.targetURI;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateFileCompressionTaskRequest, Builder> {
        private String regionId; 
        private String compressedFormat; 
        private CredentialConfig credentialConfig; 
        private Notification notification; 
        private String projectName; 
        private String sourceManifestURI; 
        private java.util.List<Sources> sources; 
        private String targetURI; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileCompressionTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.compressedFormat = request.compressedFormat;
            this.credentialConfig = request.credentialConfig;
            this.notification = request.notification;
            this.projectName = request.projectName;
            this.sourceManifestURI = request.sourceManifestURI;
            this.sources = request.sources;
            this.targetURI = request.targetURI;
            this.userData = request.userData;
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
         * <p>The compression format for file packaging.</p>
         * <blockquote>
         * <p>Currently, only the zip format is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zip</p>
         */
        public Builder compressedFormat(String compressedFormat) {
            this.putQueryParameter("CompressedFormat", compressedFormat);
            this.compressedFormat = compressedFormat;
            return this;
        }

        /**
         * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
         * <p>The chained authorization configuration. This parameter is not required. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The message notification configuration. For more information, see the Notification data type. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
         * <blockquote>
         * <p>IMM API callbacks do not currently support specifying a webhook address. Use MNS instead.</p>
         * </blockquote>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The address where the file manifest is stored. The file manifest stores the \<code>Sources\\</code> structure in JSON format on OSS. This is suitable for scenarios with many files to package.</p>
         * <blockquote>
         * <p>Specify either this parameter or <code>Sources</code>. In the manifest file, the <code>URI</code> parameter is required and the <code>Alias</code> parameter is optional. \<code>SourceManifestURI\\</code> supports up to 80,000 packaging rules.</p>
         * <blockquote>
         * <p>Warning: When you save the content to OSS, specify the OSS address of the file for this parameter.</p>
         * </blockquote>
         * </blockquote>
         * <p>The following is an example of the file structure:</p>
         * <pre><code>[{&quot;URI&quot;:&quot;oss://&lt;bucket&gt;/&lt;object&gt;&quot;, &quot;Alias&quot;:&quot;/new-dir/new-name&quot;}]
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object.json</p>
         */
        public Builder sourceManifestURI(String sourceManifestURI) {
            this.putQueryParameter("SourceManifestURI", sourceManifestURI);
            this.sourceManifestURI = sourceManifestURI;
            return this;
        }

        /**
         * <p>A list of files to package and their packaging rules.</p>
         * <blockquote>
         * <p>Specify either this parameter or \<code>SourceManifestURI\\</code>. \<code>Sources\\</code> supports a maximum of 100 packaging rules.</p>
         * <blockquote>
         * <p>Warning: If you have more than 100 packaging rules, use the \<code>SourceManifestURI\\</code> parameter.</p>
         * </blockquote>
         * </blockquote>
         */
        public Builder sources(java.util.List<Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The OSS address of the output file. The compressed file is named after the file name in this path, such as <code>name.zip</code>.</p>
         * <p>The OSS address must be in the \<code>oss\\://${Bucket}/${Object}\\</code> format. \<code>${Bucket}\\</code> is the name of the OSS bucket that is in the same region as the current project. \<code>${Object}\\</code> is the full path of the file, including the file name extension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-target-object.zip</p>
         */
        public Builder targetURI(String targetURI) {
            this.putQueryParameter("TargetURI", targetURI);
            this.targetURI = targetURI;
            return this;
        }

        /**
         * <p>Custom user data. This data is returned in the asynchronous notification message, which helps you associate the notification with your internal system. The maximum length is 2,048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>test-data</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateFileCompressionTaskRequest build() {
            return new CreateFileCompressionTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFileCompressionTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateFileCompressionTaskRequest</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private Sources(Builder builder) {
            this.alias = builder.alias;
            this.mode = builder.mode;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String alias; 
            private String mode; 
            private String URI; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.alias = model.alias;
                this.mode = model.mode;
                this.URI = model.URI;
            } 

            /**
             * <p>Specifies a new path or name for the source file within the output compressed file.</p>
             * <ul>
             * <li><p>If you do not specify this parameter, the source directory structure is preserved. For example, if the source file is at <code>oss://test-bucket/test-dir/test-object.doc</code>, the path of the file in the compressed file is <code>/test-dir/test-object.doc</code>.</p>
             * </li>
             * <li><p>Rename the file. For example, if the source file is at <code>oss://test-bucket/test-object.jpg</code> and you set this parameter to <code>/test-rename-object.jpg</code>, the file in the compressed file is named <code>test-rename-object.jpg</code>.</p>
             * </li>
             * <li><p>Specify a new path for the source file in the compressed file. For example, if the source directory is <code>oss://test-bucket/test-dir/</code> and you set this parameter to <code>/new-dir/</code>, all files in the source directory are compressed into the <code>/new-dir/</code> path.</p>
             * </li>
             * <li><p>Set the value to <code>/</code> to remove the source directory structure. All files are placed directly in the root directory of the compressed file, and the original directory structure is not preserved.</p>
             * </li>
             * <li><p>Specify both a path and a file name. The file is renamed and moved to the specified path. For example, if you set this parameter to <code>/new-dir/alias.doc</code>, the file is renamed to <code>alias.doc</code> and placed in the <code>/new-dir/</code> path of the compressed file.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li><p>Avoid creating files with duplicate names during the renaming process. If duplicate names exist, you may not be able to decompress the file in the compressed package. This depends on the decompression program you use.</p>
             * </li>
             * <li><p>Format requirement: The value must start with a forward slash (\<code>/\\</code>), such as <code>/new-dir/alias.doc</code>.</p>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/new-dir/</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The pattern matching mode for the packaging rule. Valid values include <code>prefix</code> (prefix matching) and <code>fullname</code> (exact matching). The default value is <code>prefix</code>.</p>
             * <ul>
             * <li><p><code>prefix</code>: In this mode, all files that match the prefix are packaged.</p>
             * </li>
             * <li><p><code>fullname</code>: In this mode, only the file that exactly matches the rule is packaged.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fullname</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The OSS address of the directory or file to package.</p>
             * <p>The OSS address must be in the \<code>oss\\://${Bucket}/${Object}\\</code> format. \<code>${Bucket}\\</code> is the name of the OSS bucket that is in the same region as the current project. \<code>${Object}\\</code> is described as follows:</p>
             * <ul>
             * <li><p>To package a directory, \<code>${Object}\\</code> is the directory name.</p>
             * </li>
             * <li><p>To package a file, \<code>${Object}\\</code> is the full path of the file, including the file name extension.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
}
