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
 * {@link CreateCompressPointCloudTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCompressPointCloudTaskRequest</p>
 */
public class CreateCompressPointCloudTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompressMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String compressMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KdtreeOption")
    private KdtreeOption kdtreeOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OctreeOption")
    private OctreeOption octreeOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PointCloudFields")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> pointCloudFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PointCloudFileFormat")
    private String pointCloudFileFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateCompressPointCloudTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.compressMethod = builder.compressMethod;
        this.credentialConfig = builder.credentialConfig;
        this.kdtreeOption = builder.kdtreeOption;
        this.notification = builder.notification;
        this.octreeOption = builder.octreeOption;
        this.pointCloudFields = builder.pointCloudFields;
        this.pointCloudFileFormat = builder.pointCloudFileFormat;
        this.projectName = builder.projectName;
        this.sourceURI = builder.sourceURI;
        this.tags = builder.tags;
        this.targetURI = builder.targetURI;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCompressPointCloudTaskRequest create() {
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
     * @return compressMethod
     */
    public String getCompressMethod() {
        return this.compressMethod;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return kdtreeOption
     */
    public KdtreeOption getKdtreeOption() {
        return this.kdtreeOption;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return octreeOption
     */
    public OctreeOption getOctreeOption() {
        return this.octreeOption;
    }

    /**
     * @return pointCloudFields
     */
    public java.util.List<String> getPointCloudFields() {
        return this.pointCloudFields;
    }

    /**
     * @return pointCloudFileFormat
     */
    public String getPointCloudFileFormat() {
        return this.pointCloudFileFormat;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
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

    public static final class Builder extends Request.Builder<CreateCompressPointCloudTaskRequest, Builder> {
        private String regionId; 
        private String compressMethod; 
        private CredentialConfig credentialConfig; 
        private KdtreeOption kdtreeOption; 
        private Notification notification; 
        private OctreeOption octreeOption; 
        private java.util.List<String> pointCloudFields; 
        private String pointCloudFileFormat; 
        private String projectName; 
        private String sourceURI; 
        private java.util.Map<String, ?> tags; 
        private String targetURI; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateCompressPointCloudTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.compressMethod = request.compressMethod;
            this.credentialConfig = request.credentialConfig;
            this.kdtreeOption = request.kdtreeOption;
            this.notification = request.notification;
            this.octreeOption = request.octreeOption;
            this.pointCloudFields = request.pointCloudFields;
            this.pointCloudFileFormat = request.pointCloudFileFormat;
            this.projectName = request.projectName;
            this.sourceURI = request.sourceURI;
            this.tags = request.tags;
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
         * <p>The compression algorithm. Valid values:</p>
         * <ul>
         * <li>octree</li>
         * <li>kdtree</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>octree</p>
         */
        public Builder compressMethod(String compressMethod) {
            this.putQueryParameter("CompressMethod", compressMethod);
            this.compressMethod = compressMethod;
            return this;
        }

        /**
         * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
         * <p>The configurations of authorization chains. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The k-d tree compression options.</p>
         */
        public Builder kdtreeOption(KdtreeOption kdtreeOption) {
            String kdtreeOptionShrink = shrink(kdtreeOption, "KdtreeOption", "json");
            this.putQueryParameter("KdtreeOption", kdtreeOptionShrink);
            this.kdtreeOption = kdtreeOption;
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
         * <p>The octree compression options.</p>
         */
        public Builder octreeOption(OctreeOption octreeOption) {
            String octreeOptionShrink = shrink(octreeOption, "OctreeOption", "json");
            this.putQueryParameter("OctreeOption", octreeOptionShrink);
            this.octreeOption = octreeOption;
            return this;
        }

        /**
         * <p>The PCD property fields and the compression order in which the data is decompressed after the compression is complete.</p>
         * <ul>
         * <li>If octree of Point Cloud Library (PCL) is used for compression, [&quot;xyz&quot;] is supported.</li>
         * <li>If Draco k-dimensional (k-d) tree is used for compression, [&quot;xyz&quot;] and [&quot;xyz&quot;, &quot;intensity&quot;] are supported.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder pointCloudFields(java.util.List<String> pointCloudFields) {
            String pointCloudFieldsShrink = shrink(pointCloudFields, "PointCloudFields", "json");
            this.putQueryParameter("PointCloudFields", pointCloudFieldsShrink);
            this.pointCloudFields = pointCloudFields;
            return this;
        }

        /**
         * <p>The file format. Set the value to the default value: pcd.</p>
         * 
         * <strong>example:</strong>
         * <p>pcd</p>
         */
        public Builder pointCloudFileFormat(String pointCloudFileFormat) {
            this.putQueryParameter("PointCloudFileFormat", pointCloudFileFormat);
            this.pointCloudFileFormat = pointCloudFileFormat;
            return this;
        }

        /**
         * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
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
         * <p>The OSS URL of the PCD file.</p>
         * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the path of the object with the extension included.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test/src/test.pcd</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>The custom tags, which can be used to search for and filter asynchronous tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;LabelKey&quot;: &quot;Value&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The OSS URL of the output file after compression.</p>
         * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the path of the object with the extension included.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test/tgt</p>
         */
        public Builder targetURI(String targetURI) {
            this.putQueryParameter("TargetURI", targetURI);
            this.targetURI = targetURI;
            return this;
        }

        /**
         * <p>The custom data, which is returned in an asynchronous notification and facilitates notification management. The maximum length is 2,048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateCompressPointCloudTaskRequest build() {
            return new CreateCompressPointCloudTaskRequest(this);
        } 

    } 

}
