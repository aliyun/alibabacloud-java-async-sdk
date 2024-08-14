// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySensNodeInfoRequest} extends {@link RequestModel}
 *
 * <p>QuerySensNodeInfoRequest</p>
 */
public class QuerySensNodeInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SensitiveName")
    private String sensitiveName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    private QuerySensNodeInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeId = builder.nodeId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sensitiveName = builder.sensitiveName;
        this.templateId = builder.templateId;
        this.tenantId = builder.tenantId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySensNodeInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sensitiveName
     */
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QuerySensNodeInfoRequest, Builder> {
        private String regionId; 
        private String nodeId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sensitiveName; 
        private String templateId; 
        private String tenantId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(QuerySensNodeInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeId = request.nodeId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sensitiveName = request.sensitiveName;
            this.templateId = request.templateId;
            this.tenantId = request.tenantId;
            this.status = request.status;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the data category. You can call the [QuerySensClassification](~~2746850~~) operation or log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Data Security Guard page to obtain the ID.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The page number. Pages start from page 1.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 10 to 1000. The recommended number of entries per page ranges from 10 to 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the sensitive field. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Data Security Guard page to obtain the name.
         */
        public Builder sensitiveName(String sensitiveName) {
            this.putBodyParameter("SensitiveName", sensitiveName);
            this.sensitiveName = sensitiveName;
            return this;
        }

        /**
         * The ID of the data category and data sensitivity level template. You can call the [QueryDefaultTemplate](~~2743948~~) operation to obtain the template ID.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the [DataWorks console](https://workbench.data.aliyun.com/console). Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The status of the sensitive field. Valid values:
         * <p>
         * 
         * *   0: draft
         * *   1: published
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public QuerySensNodeInfoRequest build() {
            return new QuerySensNodeInfoRequest(this);
        } 

    } 

}
