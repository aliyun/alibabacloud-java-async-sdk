// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link SearchFileRequest} extends {@link RequestModel}
 *
 * <p>SearchFileRequest</p>
 */
public class SearchFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fields")
    @Deprecated
    private String fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_by")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 4096)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recursive")
    private Boolean recursive;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("return_total_count")
    private Boolean returnTotalCount;

    private SearchFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fields = builder.fields;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.orderBy = builder.orderBy;
        this.query = builder.query;
        this.recursive = builder.recursive;
        this.returnTotalCount = builder.returnTotalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return recursive
     */
    public Boolean getRecursive() {
        return this.recursive;
    }

    /**
     * @return returnTotalCount
     */
    public Boolean getReturnTotalCount() {
        return this.returnTotalCount;
    }

    public static final class Builder extends Request.Builder<SearchFileRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fields; 
        private Integer limit; 
        private String marker; 
        private String orderBy; 
        private String query; 
        private Boolean recursive; 
        private Boolean returnTotalCount; 

        private Builder() {
            super();
        } 

        private Builder(SearchFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fields = request.fields;
            this.limit = request.limit;
            this.marker = request.marker;
            this.orderBy = request.orderBy;
            this.query = request.query;
            this.recursive = request.recursive;
            this.returnTotalCount = request.returnTotalCount;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(String fields) {
            this.putBodyParameter("fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Valid values: 1 to 100.</p>
         * <p>The number of returned results must be less than or equal to the specified number.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.<br>By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The field by which to sort the returned results. Default value: created_at. Valid values:</p>
         * <ul>
         * <li>created_at: sorts the results by the time when the file was created.</li>
         * <li>updated_at: sorts the results by the time when the file was modified.</li>
         * <li>size: sorts the results by the size of the file.</li>
         * <li>name: sorts the results by the name of the file.</li>
         * </ul>
         * <p>The order in which you want to sort the returned results. Valid values:</p>
         * <ul>
         * <li>ASC: sorts the results in ascending order.</li>
         * <li>DESC: sorts the results in descending order.</li>
         * </ul>
         * <p>You must specify this parameter in the &lt;field name&gt; &lt;ASC or DESC&gt; format. Separate multiple field names with commas (,). A preceding field has a higher priority than a following field. Examples:</p>
         * <ul>
         * <li>If you want to sort the results based on the file name in ascending order, set this parameter to &quot;name ASC&quot;.</li>
         * <li>If you want to sort the results based on the creation time in descending order, set this parameter to &quot;created_at DESC&quot;.</li>
         * <li>If you want to sort the results based on the creation time in descending order first, and then sort the results based on the file name in ascending order if the creation time is the same, set this parameter to &quot;created_at DESC,name ASC&quot;.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("order_by", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The search condition. Fuzzy searches based on the file name or directory name are supported. The search condition can be up to 4,096 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>not name=123</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * recursive.
         */
        public Builder recursive(Boolean recursive) {
            this.putBodyParameter("recursive", recursive);
            this.recursive = recursive;
            return this;
        }

        /**
         * <p>Specifies whether to return the total number of retrieved files.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder returnTotalCount(Boolean returnTotalCount) {
            this.putBodyParameter("return_total_count", returnTotalCount);
            this.returnTotalCount = returnTotalCount;
            return this;
        }

        @Override
        public SearchFileRequest build() {
            return new SearchFileRequest(this);
        } 

    } 

}
