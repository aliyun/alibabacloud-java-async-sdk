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
 * {@link DeleteAgenticSpaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgenticSpaceRequest</p>
 */
public class DeleteAgenticSpaceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private DeleteAgenticSpaceRequest(Builder builder) {
        super(builder);
        this.agenticSpaceId = builder.agenticSpaceId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgenticSpaceRequest create() {
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
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static final class Builder extends Request.Builder<DeleteAgenticSpaceRequest, Builder> {
        private String agenticSpaceId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgenticSpaceRequest request) {
            super(request);
            this.agenticSpaceId = request.agenticSpaceId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
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
         * <p>Ensures the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique across different requests.</p>
         * <p>ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>Specifies whether to perform a dry run for this request.</p>
         * <p>A dry run checks parameter validity and resource availability without actually creating or deleting instances, and no fees are incurred.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Sends a dry run request without deleting the instance. The check items include whether required parameters are specified, the request format, business limits, and NAS inventory. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned, but FileSystemId is empty.</li>
         * <li>false (default): Sends a normal request and directly deletes the instance after the check is passed.</li>
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
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public DeleteAgenticSpaceRequest build() {
            return new DeleteAgenticSpaceRequest(this);
        } 

    } 

}
