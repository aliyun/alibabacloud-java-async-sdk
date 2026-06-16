// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link ListVirusScanMachineEventRequest} extends {@link RequestModel}
 *
 * <p>ListVirusScanMachineEventRequest</p>
 */
public class ListVirusScanMachineEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateTaskId")
    private String operateTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListVirusScanMachineEventRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.operateTaskId = builder.operateTaskId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanMachineEventRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operateTaskId
     */
    public String getOperateTaskId() {
        return this.operateTaskId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListVirusScanMachineEventRequest, Builder> {
        private Integer currentPage; 
        private String lang; 
        private String operateTaskId; 
        private Integer pageSize; 
        private String regionId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListVirusScanMachineEventRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.operateTaskId = request.operateTaskId;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * OperateTaskId.
         */
        public Builder operateTaskId(String operateTaskId) {
            this.putQueryParameter("OperateTaskId", operateTaskId);
            this.operateTaskId = operateTaskId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public ListVirusScanMachineEventRequest build() {
            return new ListVirusScanMachineEventRequest(this);
        } 

    } 

}
