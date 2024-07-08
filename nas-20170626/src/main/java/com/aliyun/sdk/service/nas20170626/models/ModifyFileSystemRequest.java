// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The description of the file system.
         * <p>
         * 
         * Limits:
         * 
         * *   The description must be 2 to 128 characters in length.
         * *   It must start with a letter but cannot start with `http://` or `https://`.
         * *   The description can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the file system.
         * <p>
         * 
         * *   Sample ID of a General-purpose NAS file system: `31a8e4****`.
         * *   The IDs of Extreme NAS file systems must start with `extreme-`. Example: `extreme-0015****`.
         * *   The IDs of Cloud Paralleled File System (CPFS) file systems must start with `cpfs-`. Example: `cpfs-125487****`.
         * >CPFS file systems are available only on the China site (aliyun.com).
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * Options.
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
             * EnableOplock.
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
