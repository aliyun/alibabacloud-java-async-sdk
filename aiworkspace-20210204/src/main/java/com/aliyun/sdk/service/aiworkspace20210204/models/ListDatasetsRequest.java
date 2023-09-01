// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatasetsRequest} extends {@link RequestModel}
 *
 * <p>ListDatasetsRequest</p>
 */
public class ListDatasetsRequest extends Request {
    @Query
    @NameInMap("DataSourceTypes")
    private String dataSourceTypes;

    @Query
    @NameInMap("DataTypes")
    private String dataTypes;

    @Query
    @NameInMap("Label")
    private String label;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Properties")
    private String properties;

    @Query
    @NameInMap("SourceId")
    private String sourceId;

    @Query
    @NameInMap("SourceTypes")
    private String sourceTypes;

    @Query
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private ListDatasetsRequest(Builder builder) {
        super(builder);
        this.dataSourceTypes = builder.dataSourceTypes;
        this.dataTypes = builder.dataTypes;
        this.label = builder.label;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.properties = builder.properties;
        this.sourceId = builder.sourceId;
        this.sourceTypes = builder.sourceTypes;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceTypes
     */
    public String getDataSourceTypes() {
        return this.dataSourceTypes;
    }

    /**
     * @return dataTypes
     */
    public String getDataTypes() {
        return this.dataTypes;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
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
     * @return properties
     */
    public String getProperties() {
        return this.properties;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceTypes
     */
    public String getSourceTypes() {
        return this.sourceTypes;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDatasetsRequest, Builder> {
        private String dataSourceTypes; 
        private String dataTypes; 
        private String label; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String properties; 
        private String sourceId; 
        private String sourceTypes; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetsRequest request) {
            super(request);
            this.dataSourceTypes = request.dataSourceTypes;
            this.dataTypes = request.dataTypes;
            this.label = request.label;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.properties = request.properties;
            this.sourceId = request.sourceId;
            this.sourceTypes = request.sourceTypes;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * DataSourceTypes.
         */
        public Builder dataSourceTypes(String dataSourceTypes) {
            this.putQueryParameter("DataSourceTypes", dataSourceTypes);
            this.dataSourceTypes = dataSourceTypes;
            return this;
        }

        /**
         * DataTypes.
         */
        public Builder dataTypes(String dataTypes) {
            this.putQueryParameter("DataTypes", dataTypes);
            this.dataTypes = dataTypes;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(String properties) {
            this.putQueryParameter("Properties", properties);
            this.properties = properties;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceTypes.
         */
        public Builder sourceTypes(String sourceTypes) {
            this.putQueryParameter("SourceTypes", sourceTypes);
            this.sourceTypes = sourceTypes;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDatasetsRequest build() {
            return new ListDatasetsRequest(this);
        } 

    } 

}
