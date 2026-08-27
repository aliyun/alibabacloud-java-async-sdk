// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401.models;

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
 * {@link AuthorizeFileUploadRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeFileUploadRequest</p>
 */
public class AuthorizeFileUploadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchSize")
    private String batchSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileFormat")
    private String fileFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AuthorizeFileUploadRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.batchSize = builder.batchSize;
        this.fileFormat = builder.fileFormat;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeFileUploadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return batchSize
     */
    public String getBatchSize() {
        return this.batchSize;
    }

    /**
     * @return fileFormat
     */
    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AuthorizeFileUploadRequest, Builder> {
        private String agentName; 
        private String batchSize; 
        private String fileFormat; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeFileUploadRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.batchSize = request.batchSize;
            this.fileFormat = request.fileFormat;
            this.regionId = request.regionId;
        } 

        /**
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * BatchSize.
         */
        public Builder batchSize(String batchSize) {
            this.putQueryParameter("BatchSize", batchSize);
            this.batchSize = batchSize;
            return this;
        }

        /**
         * FileFormat.
         */
        public Builder fileFormat(String fileFormat) {
            this.putQueryParameter("FileFormat", fileFormat);
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AuthorizeFileUploadRequest build() {
            return new AuthorizeFileUploadRequest(this);
        } 

    } 

}
