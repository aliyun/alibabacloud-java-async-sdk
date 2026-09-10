// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetDataCheckTemplateListRequest} extends {@link RequestModel}
 *
 * <p>GetDataCheckTemplateListRequest</p>
 */
public class GetDataCheckTemplateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("checkType")
    private Integer checkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("idList")
    private java.util.List<String> idList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isAdmin")
    private Boolean isAdmin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isBuiltin")
    private Integer isBuiltin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("needTotalCount")
    private Boolean needTotalCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetDataCheckTemplateListRequest(Builder builder) {
        super(builder);
        this.checkType = builder.checkType;
        this.groupBy = builder.groupBy;
        this.idList = builder.idList;
        this.isAdmin = builder.isAdmin;
        this.isBuiltin = builder.isBuiltin;
        this.needTotalCount = builder.needTotalCount;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.templateName = builder.templateName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCheckTemplateListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkType
     */
    public Integer getCheckType() {
        return this.checkType;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return idList
     */
    public java.util.List<String> getIdList() {
        return this.idList;
    }

    /**
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    /**
     * @return isBuiltin
     */
    public Integer getIsBuiltin() {
        return this.isBuiltin;
    }

    /**
     * @return needTotalCount
     */
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetDataCheckTemplateListRequest, Builder> {
        private Integer checkType; 
        private String groupBy; 
        private java.util.List<String> idList; 
        private Boolean isAdmin; 
        private Integer isBuiltin; 
        private Boolean needTotalCount; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private String templateName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataCheckTemplateListRequest request) {
            super(request);
            this.checkType = request.checkType;
            this.groupBy = request.groupBy;
            this.idList = request.idList;
            this.isAdmin = request.isAdmin;
            this.isBuiltin = request.isBuiltin;
            this.needTotalCount = request.needTotalCount;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
            this.templateName = request.templateName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The validation rule type. Valid values:</p>
         * <ul>
         * <li>0: data volume comparison.</li>
         * <li>1: metric comparison.</li>
         * <li>2: weak content comparison.</li>
         * <li>3: custom comparison.</li>
         * <li>4: full-text comparison.</li>
         * <li>5: null rate comparison.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder checkType(Integer checkType) {
            this.putQueryParameter("checkType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>The field used for grouping (GROUP BY condition). Configure this parameter as needed.</p>
         * 
         * <strong>example:</strong>
         * <p>order_date</p>
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("groupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The list of validation template UUIDs. The source code of CheckTemplatePagedQry indicates that this parameter has no actual effect and does not need to be exposed externally. It is retained only for backward compatibility with legacy calls. Passing this parameter does not affect query results.</p>
         */
        public Builder idList(java.util.List<String> idList) {
            String idListShrink = shrink(idList, "idList", "json");
            this.putQueryParameter("idList", idListShrink);
            this.idList = idList;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be passed. The source code of CheckTemplatePagedQry marks this parameter with @Deprecated.</p>
         */
        public Builder isAdmin(Boolean isAdmin) {
            this.putQueryParameter("isAdmin", isAdmin);
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * <p>Specifies whether the template is built-in. Valid values:</p>
         * <ul>
         * <li>0: No. The template is a custom template.</li>
         * <li>1: Yes. The template is a built-in template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isBuiltin(Integer isBuiltin) {
            this.putQueryParameter("isBuiltin", isBuiltin);
            this.isBuiltin = isBuiltin;
            return this;
        }

        /**
         * <p>Specifies whether to return the total record count in the paginated results.</p>
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putQueryParameter("needTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * <p>The field used for sorting. Configure this parameter as needed.</p>
         * 
         * <strong>example:</strong>
         * <p>gmtCreate</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The sort direction. Valid values:</p>
         * <ul>
         * <li>ASC: ascending order.</li>
         * <li>DESC: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The page size, which specifies the number of records returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1EBD0C05-6C1F-4B7A-9C3D-2A8F7E6B5C4D</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the validation template.</p>
         * 
         * <strong>example:</strong>
         * <p>DataVolumeValidationTemplate</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetDataCheckTemplateListRequest build() {
            return new GetDataCheckTemplateListRequest(this);
        } 

    } 

}
