// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link ListSkillsRequest} extends {@link RequestModel}
 *
 * <p>ListSkillsRequest</p>
 */
public class ListSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillChannel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillIds")
    private java.util.List<String> skillIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierType")
    private String supplierType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagCodes")
    private java.util.List<String> tagCodes;

    private ListSkillsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillChannel = builder.skillChannel;
        this.skillIds = builder.skillIds;
        this.supplierType = builder.supplierType;
        this.tagCodes = builder.tagCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return skillChannel
     */
    public String getSkillChannel() {
        return this.skillChannel;
    }

    /**
     * @return skillIds
     */
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    /**
     * @return supplierType
     */
    public String getSupplierType() {
        return this.supplierType;
    }

    /**
     * @return tagCodes
     */
    public java.util.List<String> getTagCodes() {
        return this.tagCodes;
    }

    public static final class Builder extends Request.Builder<ListSkillsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillChannel; 
        private java.util.List<String> skillIds; 
        private String supplierType; 
        private java.util.List<String> tagCodes; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.skillChannel = request.skillChannel;
            this.skillIds = request.skillIds;
            this.supplierType = request.supplierType;
            this.tagCodes = request.tagCodes;
        } 

        /**
         * <p>The page number of the current page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of rows per page in a paged query. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The skill channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BUSINESS</p>
         */
        public Builder skillChannel(String skillChannel) {
            this.putQueryParameter("SkillChannel", skillChannel);
            this.skillChannel = skillChannel;
            return this;
        }

        /**
         * <p>The list of skill IDs.</p>
         */
        public Builder skillIds(java.util.List<String> skillIds) {
            this.putQueryParameter("SkillIds", skillIds);
            this.skillIds = skillIds;
            return this;
        }

        /**
         * <p>The supply type.</p>
         * 
         * <strong>example:</strong>
         * <p>WUYING</p>
         */
        public Builder supplierType(String supplierType) {
            this.putQueryParameter("SupplierType", supplierType);
            this.supplierType = supplierType;
            return this;
        }

        /**
         * <p>TagCodes</p>
         */
        public Builder tagCodes(java.util.List<String> tagCodes) {
            this.putQueryParameter("TagCodes", tagCodes);
            this.tagCodes = tagCodes;
            return this;
        }

        @Override
        public ListSkillsRequest build() {
            return new ListSkillsRequest(this);
        } 

    } 

}
