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
         * <p>The file system description.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
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
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>General-purpose NAS: <code>31a8e4****</code>.</p>
         * </li>
         * <li><p>Extreme NAS: must start with <code>extreme-</code>, for example, <code>extreme-0015****</code>.</p>
         * </li>
         * <li><p>CPFS: must start with <code>cpfs-</code>, for example, <code>cpfs-125487****</code>.</p>
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
        @com.aliyun.core.annotation.NameInMap("EnableABE")
        private Boolean enableABE;

        @com.aliyun.core.annotation.NameInMap("EnableOplock")
        private Boolean enableOplock;

        @com.aliyun.core.annotation.NameInMap("VscAccessPointAccessOnly")
        private Boolean vscAccessPointAccessOnly;

        private Options(Builder builder) {
            this.enableABE = builder.enableABE;
            this.enableOplock = builder.enableOplock;
            this.vscAccessPointAccessOnly = builder.vscAccessPointAccessOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return enableABE
         */
        public Boolean getEnableABE() {
            return this.enableABE;
        }

        /**
         * @return enableOplock
         */
        public Boolean getEnableOplock() {
            return this.enableOplock;
        }

        /**
         * @return vscAccessPointAccessOnly
         */
        public Boolean getVscAccessPointAccessOnly() {
            return this.vscAccessPointAccessOnly;
        }

        public static final class Builder {
            private Boolean enableABE; 
            private Boolean enableOplock; 
            private Boolean vscAccessPointAccessOnly; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.enableABE = model.enableABE;
                this.enableOplock = model.enableOplock;
                this.vscAccessPointAccessOnly = model.vscAccessPointAccessOnly;
            } 

            /**
             * <p>Specifies whether to enable the SMB Access-based Enumeration (ABE) access control feature.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableABE(Boolean enableABE) {
                this.enableABE = enableABE;
                return this;
            }

            /**
             * <p>Specifies whether to enable the OpLock feature.
             * Valid values:</p>
             * <ul>
             * <li>true: enables the feature.</li>
             * <li>false: does not enable the feature.<blockquote>
             * <p>Only file systems whose Protocol Type is SMB protocol are supported.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOplock(Boolean enableOplock) {
                this.enableOplock = enableOplock;
                return this;
            }

            /**
             * <p>Specifies whether the Lingjun VSC mount target supports access only through access points.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder vscAccessPointAccessOnly(Boolean vscAccessPointAccessOnly) {
                this.vscAccessPointAccessOnly = vscAccessPointAccessOnly;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
}
