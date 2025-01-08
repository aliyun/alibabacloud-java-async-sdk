// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListStoreViewsRequest} extends {@link RequestModel}
 *
 * <p>ListStoreViewsRequest</p>
 */
public class ListStoreViewsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("storeType")
    private String storeType;

    private ListStoreViewsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.name = builder.name;
        this.offset = builder.offset;
        this.size = builder.size;
        this.storeType = builder.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStoreViewsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return storeType
     */
    public String getStoreType() {
        return this.storeType;
    }

    public static final class Builder extends Request.Builder<ListStoreViewsRequest, Builder> {
        private String project; 
        private String name; 
        private Integer offset; 
        private Integer size; 
        private String storeType; 

        private Builder() {
            super();
        } 

        private Builder(ListStoreViewsRequest request) {
            super(request);
            this.project = request.project;
            this.name = request.name;
            this.offset = request.offset;
            this.size = request.size;
            this.storeType = request.storeType;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The dataset name that is used for fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>my_storeview</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The offset of the datasets to return. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The number of datasets to return. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The type of the datasets to return. By default, datasets are not filtered by type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>metricstore</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>logstore</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>logstore</p>
         */
        public Builder storeType(String storeType) {
            this.putQueryParameter("storeType", storeType);
            this.storeType = storeType;
            return this;
        }

        @Override
        public ListStoreViewsRequest build() {
            return new ListStoreViewsRequest(this);
        } 

    } 

}
