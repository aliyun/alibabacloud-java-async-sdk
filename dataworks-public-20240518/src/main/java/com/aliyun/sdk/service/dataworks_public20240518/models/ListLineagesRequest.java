// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListLineagesRequest} extends {@link RequestModel}
 *
 * <p>ListLineagesRequest</p>
 */
public class ListLineagesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstEntityId")
    private String dstEntityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstEntityName")
    private String dstEntityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedAttachRelationship")
    private Boolean needAttachRelationship;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcEntityId")
    private String srcEntityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcEntityName")
    private String srcEntityName;

    private ListLineagesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dstEntityId = builder.dstEntityId;
        this.dstEntityName = builder.dstEntityName;
        this.needAttachRelationship = builder.needAttachRelationship;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.srcEntityId = builder.srcEntityId;
        this.srcEntityName = builder.srcEntityName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLineagesRequest create() {
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
     * @return dstEntityId
     */
    public String getDstEntityId() {
        return this.dstEntityId;
    }

    /**
     * @return dstEntityName
     */
    public String getDstEntityName() {
        return this.dstEntityName;
    }

    /**
     * @return needAttachRelationship
     */
    public Boolean getNeedAttachRelationship() {
        return this.needAttachRelationship;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return srcEntityId
     */
    public String getSrcEntityId() {
        return this.srcEntityId;
    }

    /**
     * @return srcEntityName
     */
    public String getSrcEntityName() {
        return this.srcEntityName;
    }

    public static final class Builder extends Request.Builder<ListLineagesRequest, Builder> {
        private String regionId; 
        private String dstEntityId; 
        private String dstEntityName; 
        private Boolean needAttachRelationship; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String srcEntityId; 
        private String srcEntityName; 

        private Builder() {
            super();
        } 

        private Builder(ListLineagesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dstEntityId = request.dstEntityId;
            this.dstEntityName = request.dstEntityName;
            this.needAttachRelationship = request.needAttachRelationship;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.srcEntityId = request.srcEntityId;
            this.srcEntityName = request.srcEntityName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The destination entity ID. You can refer to the table or column ID returned by the ListTables or ListColumns operation, or use a custom entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:123456XXX::test_project::test_tbl
         * dlf-table:123456XXX:test_catalog:test_db::test_tbl
         * hms-table:c-abc123xxx::test_db::test_tbl
         * holo-table:h-abc123xxx::test_db:test_schema:test_tbl
         * custom-api:api123
         * custom-table:table456</p>
         */
        public Builder dstEntityId(String dstEntityId) {
            this.putQueryParameter("DstEntityId", dstEntityId);
            this.dstEntityId = dstEntityId;
            return this;
        }

        /**
         * <p>The destination entity name. Supports fuzzy matching.</p>
         * 
         * <strong>example:</strong>
         * <p>dstName1</p>
         */
        public Builder dstEntityName(String dstEntityName) {
            this.putQueryParameter("DstEntityName", dstEntityName);
            this.dstEntityName = dstEntityName;
            return this;
        }

        /**
         * <p>Specifies whether to return lineage information.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needAttachRelationship(Boolean needAttachRelationship) {
            this.putQueryParameter("NeedAttachRelationship", needAttachRelationship);
            this.needAttachRelationship = needAttachRelationship;
            return this;
        }

        /**
         * <p>The sort order. Default value: Asc. Valid values:</p>
         * <ul>
         * <li>Asc</li>
         * <li>Desc</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Asc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
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
         * <p>The number of records per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sort field. Default value: Name.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The source entity ID. You can refer to the table or column ID returned by the ListTables or ListColumns operation, or use a custom entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:123456XXX::test_project::test_tbl
         * dlf-table:123456XXX:test_catalog:test_db::test_tbl
         * hms-table:c-abc123xxx::test_db::test_tbl
         * holo-table:h-abc123xxx::test_db:test_schema:test_tbl
         * custom-api:api123
         * custom-table:table456</p>
         */
        public Builder srcEntityId(String srcEntityId) {
            this.putQueryParameter("SrcEntityId", srcEntityId);
            this.srcEntityId = srcEntityId;
            return this;
        }

        /**
         * <p>The source entity name. Supports fuzzy matching.</p>
         * 
         * <strong>example:</strong>
         * <p>srcName1</p>
         */
        public Builder srcEntityName(String srcEntityName) {
            this.putQueryParameter("SrcEntityName", srcEntityName);
            this.srcEntityName = srcEntityName;
            return this;
        }

        @Override
        public ListLineagesRequest build() {
            return new ListLineagesRequest(this);
        } 

    } 

}
