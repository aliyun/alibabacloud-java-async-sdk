// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link DeleteKeywordRequest} extends {@link RequestModel}
 *
 * <p>DeleteKeywordRequest</p>
 */
public class DeleteKeywordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeywordIdList")
    private String keywordIdList;

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
        this.keywordIdList = builder.keywordIdList;
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
     * @return keywordIdList
     */
    public String getKeywordIdList() {
        return this.keywordIdList;
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
        private String keywordIdList; 
        private String keywordIds; 
        private String libId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKeywordRequest request) {
            super(request);
            this.keywordIdList = request.keywordIdList;
            this.keywordIds = request.keywordIds;
            this.libId = request.libId;
            this.regionId = request.regionId;
        } 

        /**
         * KeywordIdList.
         */
        public Builder keywordIdList(String keywordIdList) {
            this.putBodyParameter("KeywordIdList", keywordIdList);
            this.keywordIdList = keywordIdList;
            return this;
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
