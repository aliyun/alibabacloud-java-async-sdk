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
 * {@link ListUnknownThreatDetectEventRequest} extends {@link RequestModel}
 *
 * <p>ListUnknownThreatDetectEventRequest</p>
 */
public class ListUnknownThreatDetectEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HashKey")
    private String hashKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentProcessPath")
    private String parentProcessPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessPath")
    private String processPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListUnknownThreatDetectEventRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.hashKey = builder.hashKey;
        this.pageSize = builder.pageSize;
        this.parentProcessPath = builder.parentProcessPath;
        this.processPath = builder.processPath;
        this.remark = builder.remark;
        this.status = builder.status;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnknownThreatDetectEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return hashKey
     */
    public String getHashKey() {
        return this.hashKey;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentProcessPath
     */
    public String getParentProcessPath() {
        return this.parentProcessPath;
    }

    /**
     * @return processPath
     */
    public String getProcessPath() {
        return this.processPath;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListUnknownThreatDetectEventRequest, Builder> {
        private Integer currentPage; 
        private String hashKey; 
        private Integer pageSize; 
        private String parentProcessPath; 
        private String processPath; 
        private String remark; 
        private Integer status; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListUnknownThreatDetectEventRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.hashKey = request.hashKey;
            this.pageSize = request.pageSize;
            this.parentProcessPath = request.parentProcessPath;
            this.processPath = request.processPath;
            this.remark = request.remark;
            this.status = request.status;
            this.uuid = request.uuid;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * HashKey.
         */
        public Builder hashKey(String hashKey) {
            this.putQueryParameter("HashKey", hashKey);
            this.hashKey = hashKey;
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
         * ParentProcessPath.
         */
        public Builder parentProcessPath(String parentProcessPath) {
            this.putQueryParameter("ParentProcessPath", parentProcessPath);
            this.parentProcessPath = parentProcessPath;
            return this;
        }

        /**
         * ProcessPath.
         */
        public Builder processPath(String processPath) {
            this.putQueryParameter("ProcessPath", processPath);
            this.processPath = processPath;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListUnknownThreatDetectEventRequest build() {
            return new ListUnknownThreatDetectEventRequest(this);
        } 

    } 

}
