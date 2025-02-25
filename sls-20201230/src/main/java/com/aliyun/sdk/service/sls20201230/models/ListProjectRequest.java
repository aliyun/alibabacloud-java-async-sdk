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
 * {@link ListProjectRequest} extends {@link RequestModel}
 *
 * <p>ListProjectRequest</p>
 */
public class ListProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fetchQuota")
    private Boolean fetchQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("projectName")
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    private ListProjectRequest(Builder builder) {
        super(builder);
        this.fetchQuota = builder.fetchQuota;
        this.offset = builder.offset;
        this.projectName = builder.projectName;
        this.resourceGroupId = builder.resourceGroupId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fetchQuota
     */
    public Boolean getFetchQuota() {
        return this.fetchQuota;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListProjectRequest, Builder> {
        private Boolean fetchQuota; 
        private Integer offset; 
        private String projectName; 
        private String resourceGroupId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectRequest request) {
            super(request);
            this.fetchQuota = request.fetchQuota;
            this.offset = request.offset;
            this.projectName = request.projectName;
            this.resourceGroupId = request.resourceGroupId;
            this.size = request.size;
        } 

        /**
         * fetchQuota.
         */
        public Builder fetchQuota(Boolean fetchQuota) {
            this.putQueryParameter("fetchQuota", fetchQuota);
            this.fetchQuota = fetchQuota;
            return this;
        }

        /**
         * <p>The line from which the query starts. Default value: 0.</p>
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
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 100. This operation can return up to 500 projects.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListProjectRequest build() {
            return new ListProjectRequest(this);
        } 

    } 

}
