// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ImportInterveneFileRequest} extends {@link RequestModel}
 *
 * <p>ImportInterveneFileRequest</p>
 */
public class ImportInterveneFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocName")
    private String docName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    private ImportInterveneFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.docName = builder.docName;
        this.fileKey = builder.fileKey;
        this.fileUrl = builder.fileUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportInterveneFileRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    public static final class Builder extends Request.Builder<ImportInterveneFileRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String docName; 
        private String fileKey; 
        private String fileUrl; 

        private Builder() {
            super();
        } 

        private Builder(ImportInterveneFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.docName = request.docName;
            this.fileKey = request.fileKey;
            this.fileUrl = request.fileUrl;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * DocName.
         */
        public Builder docName(String docName) {
            this.putBodyParameter("DocName", docName);
            this.docName = docName;
            return this;
        }

        /**
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        @Override
        public ImportInterveneFileRequest build() {
            return new ImportInterveneFileRequest(this);
        } 

    } 

}
