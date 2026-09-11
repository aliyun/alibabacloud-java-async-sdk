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
 * {@link SetAgenticSpaceQuotaRequest} extends {@link RequestModel}
 *
 * <p>SetAgenticSpaceQuotaRequest</p>
 */
public class SetAgenticSpaceQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgenticSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agenticSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileCountLimit")
    private Long fileCountLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SizeLimit")
    private Long sizeLimit;

    private SetAgenticSpaceQuotaRequest(Builder builder) {
        super(builder);
        this.agenticSpaceId = builder.agenticSpaceId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.fileCountLimit = builder.fileCountLimit;
        this.fileSystemId = builder.fileSystemId;
        this.sizeLimit = builder.sizeLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAgenticSpaceQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agenticSpaceId
     */
    public String getAgenticSpaceId() {
        return this.agenticSpaceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return fileCountLimit
     */
    public Long getFileCountLimit() {
        return this.fileCountLimit;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return sizeLimit
     */
    public Long getSizeLimit() {
        return this.sizeLimit;
    }

    public static final class Builder extends Request.Builder<SetAgenticSpaceQuotaRequest, Builder> {
        private String agenticSpaceId; 
        private String clientToken; 
        private Boolean dryRun; 
        private Long fileCountLimit; 
        private String fileSystemId; 
        private Long sizeLimit; 

        private Builder() {
            super();
        } 

        private Builder(SetAgenticSpaceQuotaRequest request) {
            super(request);
            this.agenticSpaceId = request.agenticSpaceId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.fileCountLimit = request.fileCountLimit;
            this.fileSystemId = request.fileSystemId;
            this.sizeLimit = request.sizeLimit;
        } 

        /**
         * <p>AgenticSpace Id。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agentic-229oypxjgpau2****</p>
         */
        public Builder agenticSpaceId(String agenticSpaceId) {
            this.putQueryParameter("AgenticSpaceId", agenticSpaceId);
            this.agenticSpaceId = agenticSpaceId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may differ for each API request.</p>
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
         * <p>Specifies whether to perform a dry run for this request. A dry run checks parameter validity and dependencies without actually modifying the instance or incurring fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Sends a dry run request without modifying the protocol service. The check items include required parameters, request format, and business dependency conditions. If the check fails, the corresponding error is returned. If the check succeeds, HTTP status code 200 is returned.</li>
         * <li>false (default): Sends a normal request. After the check succeeds, the protocol service is directly modified.</li>
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
         * <p>The maximum number of files allowed by the quota. Valid values:</p>
         * <ul>
         * <li><p>Minimum value: 10000.</p>
         * </li>
         * <li><p>Maximum value: 100000000.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder fileCountLimit(Long fileCountLimit) {
            this.putQueryParameter("FileCountLimit", fileCountLimit);
            this.fileCountLimit = fileCountLimit;
            return this;
        }

        /**
         * <p>The file system ID.</p>
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
         * <p>The total capacity limit of the quota. Unit: bytes.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Minimum value: 10737418240 (10 GiB).</li>
         * <li>Maximum value: 1099511627776000 (1024000 GiB).</li>
         * <li>Increment: 1073741824 (1 GiB).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10737418240</p>
         */
        public Builder sizeLimit(Long sizeLimit) {
            this.putQueryParameter("SizeLimit", sizeLimit);
            this.sizeLimit = sizeLimit;
            return this;
        }

        @Override
        public SetAgenticSpaceQuotaRequest build() {
            return new SetAgenticSpaceQuotaRequest(this);
        } 

    } 

}
