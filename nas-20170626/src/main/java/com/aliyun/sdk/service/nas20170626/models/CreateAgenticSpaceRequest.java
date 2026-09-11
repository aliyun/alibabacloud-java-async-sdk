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
 * {@link CreateAgenticSpaceRequest} extends {@link RequestModel}
 *
 * <p>CreateAgenticSpaceRequest</p>
 */
public class CreateAgenticSpaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Azone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String azone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private Quota quota;

    private CreateAgenticSpaceRequest(Builder builder) {
        super(builder);
        this.azone = builder.azone;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
        this.fileSystemPath = builder.fileSystemPath;
        this.quota = builder.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticSpaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return azone
     */
    public String getAzone() {
        return this.azone;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<CreateAgenticSpaceRequest, Builder> {
        private String azone; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String fileSystemId; 
        private String fileSystemPath; 
        private Quota quota; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgenticSpaceRequest request) {
            super(request);
            this.azone = request.azone;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
            this.fileSystemPath = request.fileSystemPath;
            this.quota = request.quota;
        } 

        /**
         * <p>The zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder azone(String azone) {
            this.putQueryParameter("Azone", azone);
            this.azone = azone;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
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
         * <p>The description of the Agentic space.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AgenticSpace Description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run for this request. A dry run checks parameter validity and dependencies without actually modifying the instance or incurring fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Sends a dry run request without modifying the protocol service. The system checks whether required parameters are specified, whether the request format is valid, and whether business limits and dependencies are met. If the check fails, the corresponding error is returned. If the check succeeds, HTTP status code 200 is returned.</li>
         * <li>false (default): Sends a normal request. After the check is passed, the protocol service is directly modified.</li>
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
         * <p>The file system ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The absolute path of the file. Only first-level directories are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/path/</p>
         */
        public Builder fileSystemPath(String fileSystemPath) {
            this.putQueryParameter("FileSystemPath", fileSystemPath);
            this.fileSystemPath = fileSystemPath;
            return this;
        }

        /**
         * <p>The quota information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder quota(Quota quota) {
            this.putQueryParameter("Quota", quota);
            this.quota = quota;
            return this;
        }

        @Override
        public CreateAgenticSpaceRequest build() {
            return new CreateAgenticSpaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgenticSpaceRequest} extends {@link TeaModel}
     *
     * <p>CreateAgenticSpaceRequest</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileCountLimit")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long fileCountLimit;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Quota model) {
                this.fileCountLimit = model.fileCountLimit;
                this.sizeLimit = model.sizeLimit;
            } 

            /**
             * <p>The maximum number of files allowed by the quota. Valid values:</p>
             * <ul>
             * <li><p>Minimum value: 10000.</p>
             * </li>
             * <li><p>Maximum value: 100000000.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * <p>The total capacity limit of the quota. Unit: bytes.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Minimum value: 10737418240 (10 GiB).</li>
             * <li>Maximum value: 1099511627776000 (1024000 GiB).</li>
             * <li>Increment: 1073741824 (1 GiB).</li>
             * </ul>
             * <p>This parameter is required.</p>
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
