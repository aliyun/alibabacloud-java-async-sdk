// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyFileSystemRequest} extends {@link RequestModel}
 *
 * <p>ModifyFileSystemRequest</p>
 */
public class ModifyFileSystemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Options")
    private Options options;

    private ModifyFileSystemRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFileSystemRequest create() {
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
     * @return options
     */
    public Options getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<ModifyFileSystemRequest, Builder> {
        private String description; 
        private String fileSystemId; 
        private Options options; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFileSystemRequest request) {
            super(request);
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.options = request.options;
        } 

        /**
         * <p>The description of the file system.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAS-test-1</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <ul>
         * <li>Sample ID of a General-purpose NAS file system: <code>31a8e4****</code>.</li>
         * <li>The IDs of Extreme NAS file systems must start with <code>extreme-</code>. Example: <code>extreme-0015****</code>.</li>
         * <li>The IDs of Cloud Paralleled File System (CPFS) file systems must start with <code>cpfs-</code>. Example: <code>cpfs-125487****</code>.<blockquote>
         * <p>CPFS file systems are available only on the China site (aliyun.com).</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The options.</p>
         */
        public Builder options(Options options) {
            String optionsShrink = shrink(options, "Options", "json");
            this.putQueryParameter("Options", optionsShrink);
            this.options = options;
            return this;
        }

        @Override
        public ModifyFileSystemRequest build() {
            return new ModifyFileSystemRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyFileSystemRequest} extends {@link TeaModel}
     *
     * <p>ModifyFileSystemRequest</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableOplock")
        private Boolean enableOplock;

        private Options(Builder builder) {
            this.enableOplock = builder.enableOplock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return enableOplock
         */
        public Boolean getEnableOplock() {
            return this.enableOplock;
        }

        public static final class Builder {
            private Boolean enableOplock; 

            /**
             * <p>Specifies whether to enable the oplock feature. Valid values:</p>
             * <ul>
             * <li>true: enables the feature.</li>
             * <li>false: disables the feature.</li>
             * </ul>
             * <blockquote>
             * <p> Only Server Message Block (SMB) file systems support this feature.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOplock(Boolean enableOplock) {
                this.enableOplock = enableOplock;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
}
