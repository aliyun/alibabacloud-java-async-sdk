// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The name of the resource.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
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

        @Override
        public ListResourcesRequest build() {
            return new ListResourcesRequest(this);
        } 

    } 

}
