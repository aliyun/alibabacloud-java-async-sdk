// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteKeywordRequest} extends {@link RequestModel}
 *
 * <p>DeleteKeywordRequest</p>
 */
public class DeleteKeywordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeywordIds")
    private String keywordIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteKeywordRequest(Builder builder) {
        super(builder);
        this.keywordIds = builder.keywordIds;
        this.libId = builder.libId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKeywordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keywordIds
     */
    public String getKeywordIds() {
        return this.keywordIds;
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteKeywordRequest, Builder> {
        private String keywordIds; 
        private String libId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKeywordRequest request) {
            super(request);
            this.keywordIds = request.keywordIds;
            this.libId = request.libId;
            this.regionId = request.regionId;
        } 

        /**
         * KeywordIds.
         */
        public Builder keywordIds(String keywordIds) {
            this.putBodyParameter("KeywordIds", keywordIds);
            this.keywordIds = keywordIds;
            return this;
        }

        /**
         * LibId.
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteKeywordRequest build() {
            return new DeleteKeywordRequest(this);
        } 

    } 

}
