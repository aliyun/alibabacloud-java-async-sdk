// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetOneMetaOssieModelRequest} extends {@link RequestModel}
 *
 * <p>GetOneMetaOssieModelRequest</p>
 */
public class GetOneMetaOssieModelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeUuid;

    private GetOneMetaOssieModelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.docFormat = builder.docFormat;
        this.knowledgeUuid = builder.knowledgeUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOneMetaOssieModelRequest create() {
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
     * @return docFormat
     */
    public String getDocFormat() {
        return this.docFormat;
    }

    /**
     * @return knowledgeUuid
     */
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

    public static final class Builder extends Request.Builder<GetOneMetaOssieModelRequest, Builder> {
        private String regionId; 
        private String docFormat; 
        private String knowledgeUuid; 

        private Builder() {
            super();
        } 

        private Builder(GetOneMetaOssieModelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.docFormat = request.docFormat;
            this.knowledgeUuid = request.knowledgeUuid;
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
         * <p>JSON</p>
         */
        public Builder docFormat(String docFormat) {
            this.putBodyParameter("DocFormat", docFormat);
            this.docFormat = docFormat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86c5c290052147c***</p>
         */
        public Builder knowledgeUuid(String knowledgeUuid) {
            this.putBodyParameter("KnowledgeUuid", knowledgeUuid);
            this.knowledgeUuid = knowledgeUuid;
            return this;
        }

        @Override
        public GetOneMetaOssieModelRequest build() {
            return new GetOneMetaOssieModelRequest(this);
        } 

    } 

}
