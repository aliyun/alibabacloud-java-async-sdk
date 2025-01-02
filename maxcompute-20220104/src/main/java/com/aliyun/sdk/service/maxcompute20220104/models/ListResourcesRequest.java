// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListResourcesRequest</p>
 */
public class ListResourcesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("schemaName")
    private String schemaName;

    private ListResourcesRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.marker = builder.marker;
        this.maxItem = builder.maxItem;
        this.name = builder.name;
        this.schemaName = builder.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    public static final class Builder extends Request.Builder<ListResourcesRequest, Builder> {
        private String projectName; 
        private String marker; 
        private Integer maxItem; 
        private String name; 
        private String schemaName; 

        private Builder() {
            super();
        } 

        private Builder(ListResourcesRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.marker = request.marker;
            this.maxItem = request.maxItem;
            this.name = request.name;
            this.schemaName = request.schemaName;
        } 

        /**
         * <p>The name of the MaxCompute project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>projectA</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Specifies the marker after which the returned list begins.</p>
         * 
         * <strong>example:</strong>
         * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxItem(Integer maxItem) {
            this.putQueryParameter("maxItem", maxItem);
            this.maxItem = maxItem;
            return this;
        }

        /**
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>res</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the schema.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("schemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        @Override
        public ListResourcesRequest build() {
            return new ListResourcesRequest(this);
        } 

    } 

}
