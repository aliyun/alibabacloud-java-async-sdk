// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSourceMapInfoRequest} extends {@link RequestModel}
 *
 * <p>GetSourceMapInfoRequest</p>
 */
public class GetSourceMapInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AscendingSequence")
    private Boolean ascendingSequence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * The order in which the files are sorted. Valid values:
         * <p>
         * 
         * *   true: ascending order
         * *   false: descending order
         */
        public Builder ascendingSequence(Boolean ascendingSequence) {
            this.putQueryParameter("AscendingSequence", ascendingSequence);
            this.ascendingSequence = ascendingSequence;
            return this;
        }

        /**
         * The version of the SourceMap file.
         */
        public Builder edition(String edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * The ID of the SourceMap file.
         */
        public Builder id(String id) {
            this.putQueryParameter("ID", id);
            this.id = id;
            return this;
        }

        /**
         * The keyword in the file name. The files are searched by keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The criterion by which the files are sorted. Valid values:
         * <p>
         * 
         * *   version: The files are sorted by version.
         * *   uploadTime: The files are sorted by upload time.
         */
        public Builder orderField(String orderField) {
            this.putQueryParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * The ID of the region.
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
