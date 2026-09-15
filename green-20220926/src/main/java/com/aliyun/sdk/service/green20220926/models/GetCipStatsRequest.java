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
 * {@link GetCipStatsRequest} extends {@link RequestModel}
 *
 * <p>GetCipStatsRequest</p>
 */
public class GetCipStatsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ByMonth")
    private Boolean byMonth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubUid")
    private String subUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetCipStatsRequest(Builder builder) {
        super(builder);
        this.byMonth = builder.byMonth;
        this.endDate = builder.endDate;
        this.label = builder.label;
        this.query = builder.query;
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

    public static GetCipStatsRequest create() {
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
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
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

    public static final class Builder extends Request.Builder<GetCipStatsRequest, Builder> {
        private Boolean byMonth; 
        private String endDate; 
        private String label; 
        private String query; 
        private String regionId; 
        private String resourceType; 
        private String serviceCode; 
        private String startDate; 
        private String subUid; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetCipStatsRequest request) {
            super(request);
            this.byMonth = request.byMonth;
            this.endDate = request.endDate;
            this.label = request.label;
            this.query = request.query;
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
         * <li>true: Supported.</li>
         * <li>false: Not supported.</li>
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
         * <p>2024-03-11 10:00:00</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The label.</p>
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
         * <p>The query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
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
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>The start time of the query. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-10 10:00:00</p>
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
         * <p>253552244990701265</p>
         */
        public Builder subUid(String subUid) {
            this.putBodyParameter("SubUid", subUid);
            this.subUid = subUid;
            return this;
        }

        /**
         * <p>The type. Valid values: <strong>cip</strong>: Content Moderation invoke volume statistics. <strong>risk_level</strong>: Content Moderation risk level statistics. <strong>content_moderation</strong>: AI security guardrail content compliance risk level and tag statistics. <strong>sensitive_data</strong>: AI security guardrail sensitive data risk level and tag statistics. <strong>prompt_attack</strong>: AI security guardrail prompt risk level and tag statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>risk_level</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetCipStatsRequest build() {
            return new GetCipStatsRequest(this);
        } 

    } 

}
