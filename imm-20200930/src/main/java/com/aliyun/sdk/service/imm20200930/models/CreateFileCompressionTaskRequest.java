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
         * <p>The format of the package. Default value: zip.</p>
         * <blockquote>
         * <p> Only the ZIP format is supported.</p>
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
         * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
         * <p>The configurations of authorization chains. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The name of the project.<a href="~~478153~~"></a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The OSS URI of the inventory object that contains the objects to compress. The inventory object stores the objects to compress by using the same data structure of the Sources parameter in the JSON format. This parameter is suitable for specifying a large number of objects to compress.</p>
         * <blockquote>
         * <p> You must specify this parameter or the <code>Sources</code> parameter. The <code>URI</code> parameter is required and the <code>Alias</code> parameter is optional. You can specify up to 80,000 compression rule by using SourceManifestURI in one single call to the operation. The following line provides an example of the content within an inventory object.</p>
         * </blockquote>
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
         * <p>The objects to be packed and packing rules.</p>
         * <blockquote>
         * <p> You must specify this parameter or the SourceManifestURI parameter. The Sources parameter can hold up to 100 packing rules. If you want to include more than 100 packing rules, use the SourceManifestURI parameter.</p>
         * </blockquote>
         */
        public Builder sources(java.util.List<Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The OSS URI of the package. The object name part in the URI is used as the name of the package. Example: <code>name.zip</code>.</p>
         * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
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
         * <p>The custom information, which is returned in an asynchronous notification and facilitates notification management. The maximum length of the value is 2,048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
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
             * <p>Specifies the path of the object in the package, or renames the object in the package.</p>
             * <ul>
             * <li>Leave this parameter empty to retain the original directory structure of the object in the package. For example, if the object is stored at <code>oss://test-bucket/test-dir/test-object.doc</code> and you do not specify this parameter, the path of the object in the package is <code>/test-dir/test-object.doc</code>.</li>
             * <li>Rename the object. For example, if the object is stored at <code>oss://test-bucket/test-object.jpg</code> and you set the <strong>Alias</strong> parameter to <code>test-rename-object.jpg</code>, the name of the object in the package is <code>test-rename-object.jpg</code>.</li>
             * <li>Specify a different path for the object in the package. For example, if the directory to be packed is <code>oss://test-bucket/test-dir/</code> and you set the <strong>Alias</strong> parameter to <code>/new-dir/</code>, all objects in the directory are placed in the <code>/new-dir/</code> path in the package.</li>
             * <li>Set the parameter to <code>/</code> to remove the original directory structure.</li>
             * </ul>
             * <blockquote>
             * <p> Duplicate object names may cause a failure in extracting the objects from the package, depending on the packing tool that you use. We recommend that you avoid using duplicate object names when you rename objects in the packing task.</p>
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
             * <p>The object matching rule. Valid values: <code>fullname</code> and <code>prefix</code>. Default value: <code>prefix</code></p>
             * <ul>
             * <li><code>prefix</code>: matches objects by object name prefix.</li>
             * <li><code>fullname</code>: exactly matches one single object by its full object name.</li>
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
             * <p>The OSS URI of the object or directory.</p>
             * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is a directory or object:</p>
             * <p>When you pack a directory, <code>${Object}</code> is the path of the directory.</p>
             * <ul>
             * <li>When you pack an object, <code>${Object}</code> is the path of the object with the extension included.</li>
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
