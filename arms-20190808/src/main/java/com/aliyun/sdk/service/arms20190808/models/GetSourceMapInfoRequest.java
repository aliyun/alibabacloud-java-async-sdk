// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The order in which the files are sorted. Valid values:</p>
         * <ul>
         * <li>true: ascending order</li>
         * <li>false: descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ascendingSequence(Boolean ascendingSequence) {
            this.putQueryParameter("AscendingSequence", ascendingSequence);
            this.ascendingSequence = ascendingSequence;
            return this;
        }

        /**
         * <p>The version of the SourceMap file.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        public Builder edition(String edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>The ID of the SourceMap file.</p>
         * <p>This parameter is required.</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("ID", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The keyword in the file name. The files are searched by keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The criterion by which the files are sorted. Valid values:</p>
         * <ul>
         * <li>version: The files are sorted by version.</li>
         * <li>uploadTime: The files are sorted by upload time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>version</p>
         */
        public Builder orderField(String orderField) {
            this.putQueryParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
