// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

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
 * {@link GetVocabRequest} extends {@link RequestModel}
 *
 * <p>GetVocabRequest</p>
 */
public class GetVocabRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vocabularyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vocabularyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetVocabRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vocabularyId = builder.vocabularyId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVocabRequest create() {
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
     * @return vocabularyId
     */
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetVocabRequest, Builder> {
        private String regionId; 
        private String vocabularyId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetVocabRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.vocabularyId = request.vocabularyId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dhbf***rbrdb</p>
         */
        public Builder vocabularyId(String vocabularyId) {
            this.putBodyParameter("vocabularyId", vocabularyId);
            this.vocabularyId = vocabularyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-9864***1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetVocabRequest build() {
            return new GetVocabRequest(this);
        } 

    } 

}
