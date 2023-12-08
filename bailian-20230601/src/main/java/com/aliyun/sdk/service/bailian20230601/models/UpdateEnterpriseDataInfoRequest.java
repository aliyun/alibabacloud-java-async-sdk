// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnterpriseDataInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnterpriseDataInfoRequest</p>
 */
public class UpdateEnterpriseDataInfoRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("DataId")
    @Validation(required = true)
    private String dataId;

    @Query
    @NameInMap("DataName")
    private String dataName;

    @Query
    @NameInMap("FilePreviewLink")
    private String filePreviewLink;

    private UpdateEnterpriseDataInfoRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.bizId = builder.bizId;
        this.dataId = builder.dataId;
        this.dataName = builder.dataName;
        this.filePreviewLink = builder.filePreviewLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnterpriseDataInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return dataName
     */
    public String getDataName() {
        return this.dataName;
    }

    /**
     * @return filePreviewLink
     */
    public String getFilePreviewLink() {
        return this.filePreviewLink;
    }

    public static final class Builder extends Request.Builder<UpdateEnterpriseDataInfoRequest, Builder> {
        private String agentKey; 
        private String bizId; 
        private String dataId; 
        private String dataName; 
        private String filePreviewLink; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnterpriseDataInfoRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.bizId = request.bizId;
            this.dataId = request.dataId;
            this.dataName = request.dataName;
            this.filePreviewLink = request.filePreviewLink;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * DataId.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * DataName.
         */
        public Builder dataName(String dataName) {
            this.putQueryParameter("DataName", dataName);
            this.dataName = dataName;
            return this;
        }

        /**
         * FilePreviewLink.
         */
        public Builder filePreviewLink(String filePreviewLink) {
            this.putQueryParameter("FilePreviewLink", filePreviewLink);
            this.filePreviewLink = filePreviewLink;
            return this;
        }

        @Override
        public UpdateEnterpriseDataInfoRequest build() {
            return new UpdateEnterpriseDataInfoRequest(this);
        } 

    } 

}
