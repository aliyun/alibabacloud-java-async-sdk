// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ExportCipStatsRequest} extends {@link RequestModel}
 *
 * <p>ExportCipStatsRequest</p>
 */
public class ExportCipStatsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ByMonth")
    private Boolean byMonth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportType")
    private String exportType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubUid")
    private String subUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ExportCipStatsRequest(Builder builder) {
        super(builder);
        this.byMonth = builder.byMonth;
        this.endDate = builder.endDate;
        this.exportType = builder.exportType;
        this.label = builder.label;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.serviceCode = builder.serviceCode;
        this.startDate = builder.startDate;
        this.subUid = builder.subUid;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportCipStatsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return byMonth
     */
    public Boolean getByMonth() {
        return this.byMonth;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return subUid
     */
    public String getSubUid() {
        return this.subUid;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ExportCipStatsRequest, Builder> {
        private Boolean byMonth; 
        private String endDate; 
        private String exportType; 
        private String label; 
        private String regionId; 
        private String resourceType; 
        private String serviceCode; 
        private String startDate; 
        private String subUid; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ExportCipStatsRequest request) {
            super(request);
            this.byMonth = request.byMonth;
            this.endDate = request.endDate;
            this.exportType = request.exportType;
            this.label = request.label;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.serviceCode = request.serviceCode;
            this.startDate = request.startDate;
            this.subUid = request.subUid;
            this.type = request.type;
        } 

        /**
         * <p>Specifies whether monthly indexing is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder byMonth(Boolean byMonth) {
            this.putBodyParameter("ByMonth", byMonth);
            this.byMonth = byMonth;
            return this;
        }

        /**
         * <p>The end time of the query. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-16 09:00:00</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The export type. Valid values:</p>
         * <ul>
         * <li><strong>level</strong>: export by risk level.</li>
         * <li><strong>label</strong>: export by label.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>label</p>
         */
        public Builder exportType(String exportType) {
            this.putBodyParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * <p>The task label to export.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>The start time of the query. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-15 09:00:00</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The UID of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>268220485413130979</p>
         */
        public Builder subUid(String subUid) {
            this.putBodyParameter("SubUid", subUid);
            this.subUid = subUid;
            return this;
        }

        /**
         * <p>The type. Valid values:</p>
         * <ul>
         * <li><strong>cip</strong>: Content Moderation invocation volume statistics.</li>
         * <li><strong>risk_level</strong>: Content Moderation risk level statistics.</li>
         * <li><strong>content_moderation</strong>: AI safety guardrail content compliance risk level and tag statistics.</li>
         * <li><strong>sensitive_data</strong>: AI safety guardrail sensitive data risk level and tag statistics.</li>
         * <li><strong>prompt_attack</strong>: AI safety guardrail prompt risk level and tag statistics.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>risk_level</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ExportCipStatsRequest build() {
            return new ExportCipStatsRequest(this);
        } 

    } 

}
