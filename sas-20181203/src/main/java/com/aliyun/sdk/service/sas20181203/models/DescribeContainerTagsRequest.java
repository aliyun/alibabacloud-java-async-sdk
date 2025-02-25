// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeContainerTagsRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerTagsRequest</p>
 */
public class DescribeContainerTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    private DescribeContainerTagsRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.currentPage = builder.currentPage;
        this.fieldName = builder.fieldName;
        this.fieldValue = builder.fieldValue;
        this.namespace = builder.namespace;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeContainerTagsRequest, Builder> {
        private String appName; 
        private String clusterId; 
        private Integer currentPage; 
        private String fieldName; 
        private String fieldValue; 
        private String namespace; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerTagsRequest request) {
            super(request);
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.currentPage = request.currentPage;
            this.fieldName = request.fieldName;
            this.fieldValue = request.fieldValue;
            this.namespace = request.namespace;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>node-exporter</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The ID of the cluster to which the container belongs.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c22143730ab6e40b09ec7c1c51d4d****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The name of the attribute that is used for the query. Valid values:</p>
         * <ul>
         * <li><strong>namespace</strong>: the namespace</li>
         * <li><strong>appName</strong>: the application name</li>
         * <li><strong>image</strong>: the image</li>
         * <li><strong>tag</strong>: the tag</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * <p>The value of the attribute that is used for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>demo4</p>
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name-01</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeContainerTagsRequest build() {
            return new DescribeContainerTagsRequest(this);
        } 

    } 

}
