// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link CreateCpfsAccessPointRequest} extends {@link RequestModel}
 *
 * <p>CreateCpfsAccessPointRequest</p>
 */
public class CreateCpfsAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDirectory")
    private RootDirectory rootDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateCpfsAccessPointRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.regionId = builder.regionId;
        this.rootDirectory = builder.rootDirectory;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCpfsAccessPointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rootDirectory
     */
    public RootDirectory getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateCpfsAccessPointRequest, Builder> {
        private String description; 
        private String fileSystemId; 
        private String regionId; 
        private RootDirectory rootDirectory; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateCpfsAccessPointRequest request) {
            super(request);
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.regionId = request.regionId;
            this.rootDirectory = request.rootDirectory;
            this.tag = request.tag;
        } 

        /**
         * <p>The description of the access point.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter.</li>
         * <li>The description cannot start with http:// or https://.</li>
         * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>Cloud Parallel File Storage (CPFS): must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>CPFS for Lingjun: must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-099394bd928c****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The root directory of the access point. Default value: &quot;/&quot;.</p>
         */
        public Builder rootDirectory(RootDirectory rootDirectory) {
            this.putQueryParameter("RootDirectory", rootDirectory);
            this.rootDirectory = rootDirectory;
            return this;
        }

        /**
         * <p>The list of tags for the CPFS access point.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateCpfsAccessPointRequest build() {
            return new CreateCpfsAccessPointRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCpfsAccessPointRequest} extends {@link TeaModel}
     *
     * <p>CreateCpfsAccessPointRequest</p>
     */
    public static class RootDirectory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RootPath")
        private String rootPath;

        private RootDirectory(Builder builder) {
            this.rootPath = builder.rootPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RootDirectory create() {
            return builder().build();
        }

        /**
         * @return rootPath
         */
        public String getRootPath() {
            return this.rootPath;
        }

        public static final class Builder {
            private String rootPath; 

            private Builder() {
            } 

            private Builder(RootDirectory model) {
                this.rootPath = model.rootPath;
            } 

            /**
             * <p>The root directory of the access point. The value must start and end with a forward slash (/).</p>
             * 
             * <strong>example:</strong>
             * <p>/test/</p>
             */
            public Builder rootPath(String rootPath) {
                this.rootPath = rootPath;
                return this;
            }

            public RootDirectory build() {
                return new RootDirectory(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCpfsAccessPointRequest} extends {@link TeaModel}
     *
     * <p>CreateCpfsAccessPointRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
