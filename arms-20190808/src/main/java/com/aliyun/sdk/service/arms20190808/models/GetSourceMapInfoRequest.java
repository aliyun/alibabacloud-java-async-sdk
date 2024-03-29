// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSourceMapInfoRequest} extends {@link RequestModel}
 *
 * <p>GetSourceMapInfoRequest</p>
 */
public class GetSourceMapInfoRequest extends Request {
    @Query
    @NameInMap("AscendingSequence")
    private Boolean ascendingSequence;

    @Query
    @NameInMap("Edition")
    private String edition;

    @Query
    @NameInMap("ID")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("OrderField")
    private String orderField;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetSourceMapInfoRequest(Builder builder) {
        super(builder);
        this.ascendingSequence = builder.ascendingSequence;
        this.edition = builder.edition;
        this.id = builder.id;
        this.keyword = builder.keyword;
        this.orderField = builder.orderField;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceMapInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ascendingSequence
     */
    public Boolean getAscendingSequence() {
        return this.ascendingSequence;
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetSourceMapInfoRequest, Builder> {
        private Boolean ascendingSequence; 
        private String edition; 
        private String id; 
        private String keyword; 
        private String orderField; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSourceMapInfoRequest request) {
            super(request);
            this.ascendingSequence = request.ascendingSequence;
            this.edition = request.edition;
            this.id = request.id;
            this.keyword = request.keyword;
            this.orderField = request.orderField;
            this.regionId = request.regionId;
        } 

        /**
         * AscendingSequence.
         */
        public Builder ascendingSequence(Boolean ascendingSequence) {
            this.putQueryParameter("AscendingSequence", ascendingSequence);
            this.ascendingSequence = ascendingSequence;
            return this;
        }

        /**
         * Edition.
         */
        public Builder edition(String edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * ID.
         */
        public Builder id(String id) {
            this.putQueryParameter("ID", id);
            this.id = id;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * OrderField.
         */
        public Builder orderField(String orderField) {
            this.putQueryParameter("OrderField", orderField);
            this.orderField = orderField;
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
        public GetSourceMapInfoRequest build() {
            return new GetSourceMapInfoRequest(this);
        } 

    } 

}
