// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTablesRequest} extends {@link RequestModel}
 *
 * <p>ListTablesRequest</p>
 */
public class ListTablesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxItem")
    private Integer maxItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("schemaName")
    private String schemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListTablesRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.marker = builder.marker;
        this.maxItem = builder.maxItem;
        this.prefix = builder.prefix;
        this.schemaName = builder.schemaName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxItem
     */
    public Integer getMaxItem() {
        return this.maxItem;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListTablesRequest, Builder> {
        private String projectName; 
        private String marker; 
        private Integer maxItem; 
        private String prefix; 
        private String schemaName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListTablesRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.marker = request.marker;
            this.maxItem = request.maxItem;
            this.prefix = request.prefix;
            this.schemaName = request.schemaName;
            this.type = request.type;
        } 

        /**
         * The name of the MaxCompute project.
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Specifies the marker after which the returned list begins.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
         */
        public Builder maxItem(Integer maxItem) {
            this.putQueryParameter("maxItem", maxItem);
            this.maxItem = maxItem;
            return this;
        }

        /**
         * The names of the returned resources. The names must start with the value specified by the prefix parameter. If the prefix parameter is set to a, the names of the returned resources must start with a.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * The name of the schema.
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("schemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * The type of the table.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListTablesRequest build() {
            return new ListTablesRequest(this);
        } 

    } 

}
