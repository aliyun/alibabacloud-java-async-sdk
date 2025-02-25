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
 * {@link CreateFilesetRequest} extends {@link RequestModel}
 *
 * <p>CreateFilesetRequest</p>
 */
public class CreateFilesetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Quota quota;

    private CreateFilesetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.deletionProtection = builder.deletionProtection;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
        this.fileSystemPath = builder.fileSystemPath;
        this.quota = builder.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFilesetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return fileSystemPath
     */
    public String getFileSystemPath() {
        return this.fileSystemPath;
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    public static final class Builder extends Request.Builder<CreateFilesetRequest, Builder> {
        private String clientToken; 
        private Boolean deletionProtection; 
        private String description; 
        private Boolean dryRun; 
        private String fileSystemId; 
        private String fileSystemPath; 
        private Quota quota; 

        private Builder() {
            super();
        } 

        private Builder(CreateFilesetRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.deletionProtection = request.deletionProtection;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
            this.fileSystemPath = request.fileSystemPath;
            this.quota = request.quota;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection to allow you to release the fileset by using the console or by calling the <a href="https://help.aliyun.com/document_detail/2838077.html">DeleteFileset</a> operation.</p>
         * <ul>
         * <li>true: enables release protection.</li>
         * <li>false (default): disables release protection.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter can protect filesets only against manual releases, but not against automatic releases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The description of the fileset.</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter but cannot start with http:// or https://.</li>
         * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run.</p>
         * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no fileset is created and no fee is incurred.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: performs a dry run. The system checks the required parameters, request syntax, service limits, and available Apsara File Storage NAS (NAS) resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FsetId parameter.</li>
         * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a fileset is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <ul>
         * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-099394bd928c****.</li>
         * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya****.</li>
         * </ul>
         * <blockquote>
         * <p> CPFS is not supported on the international site.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290w65p03ok64ya****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The absolute path of the fileset.</p>
         * <ul>
         * <li>The path must be 2 to 1024 characters in length.</li>
         * <li>The path must start and end with a forward slash (/).</li>
         * <li>The fileset path must be a new path and cannot be an existing path. Fileset paths cannot be renamed and cannot be symbolic links.</li>
         * <li>The maximum depth supported by a fileset path is eight levels. The depth of the root directory / is 0 levels. For example, the fileset path /test/aaa/ccc/ has three levels.</li>
         * <li>If the fileset path is a multi-level path, the parent directory must be an existing directory.</li>
         * <li>Nested filesets are not supported. If a fileset is specified as a parent directory, its subdirectory cannot be a fileset. A fileset path supports only one quota.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/</p>
         */
        public Builder fileSystemPath(String fileSystemPath) {
            this.putQueryParameter("FileSystemPath", fileSystemPath);
            this.fileSystemPath = fileSystemPath;
            return this;
        }

        /**
         * <p>The quota information.</p>
         * <blockquote>
         * <p> Only CPFS for LINGJUN V2.7.0 and later support this parameter.</p>
         * </blockquote>
         */
        public Builder quota(Quota quota) {
            this.putQueryParameter("Quota", quota);
            this.quota = quota;
            return this;
        }

        @Override
        public CreateFilesetRequest build() {
            return new CreateFilesetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFilesetRequest} extends {@link TeaModel}
     *
     * <p>CreateFilesetRequest</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileCountLimit")
        private Long fileCountLimit;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
        private Long sizeLimit;

        private Quota(Builder builder) {
            this.fileCountLimit = builder.fileCountLimit;
            this.sizeLimit = builder.sizeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return fileCountLimit
         */
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        /**
         * @return sizeLimit
         */
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        public static final class Builder {
            private Long fileCountLimit; 
            private Long sizeLimit; 

            /**
             * <p>The number of files of the quota. Valid values:</p>
             * <ul>
             * <li>Minimum value: 100000.</li>
             * <li>Maximum value: 10000000000.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * <p>The total capacity of the quota. Unit: bytes.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Minimum value: 10737418240 (10 GiB).</li>
             * <li>Maximum value: 1073741824000 (1024000 GiB).</li>
             * <li>Step size: 1073741824 (1 GiB).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10737418240</p>
             */
            public Builder sizeLimit(Long sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
}
