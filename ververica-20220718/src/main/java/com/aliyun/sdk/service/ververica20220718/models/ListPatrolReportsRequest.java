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
 * {@link ListPatrolReportsRequest} extends {@link RequestModel}
 *
 * <p>ListPatrolReportsRequest</p>
 */
public class ListPatrolReportsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scopeType")
    private String scopeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startDate")
    private Long startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("triggerType")
    private String triggerType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private ListPatrolReportsRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.endDate = builder.endDate;
        this.page = builder.page;
        this.scopeType = builder.scopeType;
        this.size = builder.size;
        this.startDate = builder.startDate;
        this.status = builder.status;
        this.triggerType = builder.triggerType;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPatrolReportsRequest create() {
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
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListPatrolReportsRequest, Builder> {
        private String namespace; 
        private Long endDate; 
        private Integer page; 
        private String scopeType; 
        private Integer size; 
        private Long startDate; 
        private String status; 
        private String triggerType; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListPatrolReportsRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.endDate = request.endDate;
            this.page = request.page;
            this.scopeType = request.scopeType;
            this.size = request.size;
            this.startDate = request.startDate;
            this.status = request.status;
            this.triggerType = request.triggerType;
            this.workspace = request.workspace;
        } 

        /**
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
         * endDate.
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * scopeType.
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("scopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * triggerType.
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("triggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        /**
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
        public ListPatrolReportsRequest build() {
            return new ListPatrolReportsRequest(this);
        } 

    } 

}
