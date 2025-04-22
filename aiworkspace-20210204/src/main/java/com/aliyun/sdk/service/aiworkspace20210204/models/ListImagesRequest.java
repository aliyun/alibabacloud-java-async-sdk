// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListImagesRequest} extends {@link RequestModel}
 *
 * <p>ListImagesRequest</p>
 */
public class ListImagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUri")
    private String imageUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListImagesRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.imageUri = builder.imageUri;
        this.labels = builder.labels;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.sortBy = builder.sortBy;
        this.verbose = builder.verbose;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return imageUri
     */
    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListImagesRequest, Builder> {
        private String accessibility; 
        private String imageUri; 
        private String labels; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String query; 
        private String sortBy; 
        private Boolean verbose; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListImagesRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.imageUri = request.imageUri;
            this.labels = request.labels;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.sortBy = request.sortBy;
            this.verbose = request.verbose;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The visibility of the image. This parameter is valid only for custom images.</p>
         * <ul>
         * <li>PUBLIC: The image is visible to all users.</li>
         * <li>PRIVATE: The image is visible only to you and the administrator of the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * ImageUri.
         */
        public Builder imageUri(String imageUri) {
            this.putQueryParameter("ImageUri", imageUri);
            this.imageUri = imageUri;
            return this;
        }

        /**
         * <p>The tag filter conditions. Multiple conditions are separated by commas (,). The format of a single condition filter is <code>key=value</code>. The following keys are supported:</p>
         * <ul>
         * <li>system.chipType</li>
         * <li>system.dsw.cudaVersion</li>
         * <li>system.dsw.fromImageId</li>
         * <li>system.dsw.fromInstanceId</li>
         * <li>system.dsw.id</li>
         * <li>system.dsw.os</li>
         * <li>system.dsw.osVersion</li>
         * <li>system.dsw.resourceType</li>
         * <li>system.dsw.rootImageId</li>
         * <li>system.dsw.stage</li>
         * <li>system.dsw.tag</li>
         * <li>system.dsw.type</li>
         * <li>system.framework</li>
         * <li>system.origin</li>
         * <li>system.pythonVersion</li>
         * <li>system.source</li>
         * <li>system.supported.dlc</li>
         * <li>system.supported.dsw</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system.framework=XGBoost 1.6.0,system.official=true</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The image name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>tensorflow_2.9</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The order in which the entries are sorted by the specific field on the returned page. This parameter must be used together with SortBy. Default value: ASC. Valid values:</p>
         * <ul>
         * <li>ASC: ascending order</li>
         * <li>DESC: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 20.</p>
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
         * <p>The image name and description that are used for fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The field used for sorting. The GmtCreateTime field is used.</p>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>Specifies whether to display non-essential information, which contains tags. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20******55</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListImagesRequest build() {
            return new ListImagesRequest(this);
        } 

    } 

}
