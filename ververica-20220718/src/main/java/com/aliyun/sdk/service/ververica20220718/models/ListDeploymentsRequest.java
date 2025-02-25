// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link ListDeploymentsRequest} extends {@link RequestModel}
 *
 * <p>ListDeploymentsRequest</p>
 */
public class ListDeploymentsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("executionMode")
    private String executionMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labelKey")
    private String labelKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labelValueArray")
    private String labelValueArray;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sortName")
    private String sortName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private ListDeploymentsRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.creator = builder.creator;
        this.executionMode = builder.executionMode;
        this.labelKey = builder.labelKey;
        this.labelValueArray = builder.labelValueArray;
        this.modifier = builder.modifier;
        this.name = builder.name;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.sortName = builder.sortName;
        this.status = builder.status;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * @return labelKey
     */
    public String getLabelKey() {
        return this.labelKey;
    }

    /**
     * @return labelValueArray
     */
    public String getLabelValueArray() {
        return this.labelValueArray;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return sortName
     */
    public String getSortName() {
        return this.sortName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListDeploymentsRequest, Builder> {
        private String namespace; 
        private String creator; 
        private String executionMode; 
        private String labelKey; 
        private String labelValueArray; 
        private String modifier; 
        private String name; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String sortName; 
        private String status; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListDeploymentsRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.creator = request.creator;
            this.executionMode = request.executionMode;
            this.labelKey = request.labelKey;
            this.labelValueArray = request.labelValueArray;
            this.modifier = request.modifier;
            this.name = request.name;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.sortName = request.sortName;
            this.status = request.status;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The ID of the user who creates the deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>183899668*******</p>
         */
        public Builder creator(String creator) {
            this.putQueryParameter("creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>The execution mode of the deployment.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>BATCH</li>
         * <li>STREAMING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STREAMING</p>
         */
        public Builder executionMode(String executionMode) {
            this.putQueryParameter("executionMode", executionMode);
            this.executionMode = executionMode;
            return this;
        }

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        public Builder labelKey(String labelKey) {
            this.putQueryParameter("labelKey", labelKey);
            this.labelKey = labelKey;
            return this;
        }

        /**
         * <p>The tag value. Separate multiple values with semicolon (;).</p>
         * 
         * <strong>example:</strong>
         * <p>value1,value2</p>
         */
        public Builder labelValueArray(String labelValueArray) {
            this.putQueryParameter("labelValueArray", labelValueArray);
            this.labelValueArray = labelValueArray;
            return this;
        }

        /**
         * <p>The ID of the user who modifies the deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>183899668*******</p>
         */
        public Builder modifier(String modifier) {
            this.putQueryParameter("modifier", modifier);
            this.modifier = modifier;
            return this;
        }

        /**
         * <p>The name of the deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>vvp_ds_0522</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number. Minimum value: 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * sortName.
         */
        public Builder sortName(String sortName) {
            this.putQueryParameter("sortName", sortName);
            this.sortName = sortName;
            return this;
        }

        /**
         * <p>The latest status of the deployment.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CANCELLED</li>
         * <li>FAILED</li>
         * <li>RUNNING</li>
         * <li>TRANSITIONING</li>
         * <li>FINISHED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListDeploymentsRequest build() {
            return new ListDeploymentsRequest(this);
        } 

    } 

}
