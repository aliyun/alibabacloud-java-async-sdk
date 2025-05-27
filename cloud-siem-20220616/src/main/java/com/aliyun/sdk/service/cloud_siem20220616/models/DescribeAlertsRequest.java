// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeAlertsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertsRequest</p>
 */
public class DescribeAlertsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertName")
    private String alertName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertTitle")
    private String alertTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertType")
    private String alertType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertUuid")
    private String alertUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssetId")
    private String assetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssetName")
    private String assetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityName")
    private String entityName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsDefend")
    private String isDefend;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelType")
    private String labelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Level")
    private java.util.List<String> level;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubUserId")
    private String subUserId;

    private DescribeAlertsRequest(Builder builder) {
        super(builder);
        this.alertName = builder.alertName;
        this.alertTitle = builder.alertTitle;
        this.alertType = builder.alertType;
        this.alertUuid = builder.alertUuid;
        this.assetId = builder.assetId;
        this.assetName = builder.assetName;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.entityId = builder.entityId;
        this.entityName = builder.entityName;
        this.isDefend = builder.isDefend;
        this.labelType = builder.labelType;
        this.level = builder.level;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.source = builder.source;
        this.startTime = builder.startTime;
        this.subUserId = builder.subUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return alertTitle
     */
    public String getAlertTitle() {
        return this.alertTitle;
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return alertUuid
     */
    public String getAlertUuid() {
        return this.alertUuid;
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return assetName
     */
    public String getAssetName() {
        return this.assetName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityName
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * @return isDefend
     */
    public String getIsDefend() {
        return this.isDefend;
    }

    /**
     * @return labelType
     */
    public String getLabelType() {
        return this.labelType;
    }

    /**
     * @return level
     */
    public java.util.List<String> getLevel() {
        return this.level;
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
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return subUserId
     */
    public String getSubUserId() {
        return this.subUserId;
    }

    public static final class Builder extends Request.Builder<DescribeAlertsRequest, Builder> {
        private String alertName; 
        private String alertTitle; 
        private String alertType; 
        private String alertUuid; 
        private String assetId; 
        private String assetName; 
        private Integer currentPage; 
        private Long endTime; 
        private String entityId; 
        private String entityName; 
        private String isDefend; 
        private String labelType; 
        private java.util.List<String> level; 
        private Integer pageSize; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String source; 
        private Long startTime; 
        private String subUserId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertsRequest request) {
            super(request);
            this.alertName = request.alertName;
            this.alertTitle = request.alertTitle;
            this.alertType = request.alertType;
            this.alertUuid = request.alertUuid;
            this.assetId = request.assetId;
            this.assetName = request.assetName;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.entityId = request.entityId;
            this.entityName = request.entityName;
            this.isDefend = request.isDefend;
            this.labelType = request.labelType;
            this.level = request.level;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.source = request.source;
            this.startTime = request.startTime;
            this.subUserId = request.subUserId;
        } 

        /**
         * AlertName.
         */
        public Builder alertName(String alertName) {
            this.putBodyParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * <p>The title of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Unusual Logon-login_common_account</p>
         */
        public Builder alertTitle(String alertTitle) {
            this.putBodyParameter("AlertTitle", alertTitle);
            this.alertTitle = alertTitle;
            return this;
        }

        /**
         * AlertType.
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * <p>The UUID of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_71e24437d2797ce8fc59692905a4****</p>
         */
        public Builder alertUuid(String alertUuid) {
            this.putBodyParameter("AlertUuid", alertUuid);
            this.alertUuid = alertUuid;
            return this;
        }

        /**
         * AssetId.
         */
        public Builder assetId(String assetId) {
            this.putBodyParameter("AssetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * AssetName.
         */
        public Builder assetName(String assetName) {
            this.putBodyParameter("AssetName", assetName);
            this.assetName = assetName;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1577808000000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * EntityName.
         */
        public Builder entityName(String entityName) {
            this.putBodyParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        /**
         * <p>Specifies whether an attack is defended. Valid values:</p>
         * <ul>
         * <li>0: detected.</li>
         * <li>1: blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isDefend(String isDefend) {
            this.putBodyParameter("IsDefend", isDefend);
            this.isDefend = isDefend;
            return this;
        }

        /**
         * LabelType.
         */
        public Builder labelType(String labelType) {
            this.putBodyParameter("LabelType", labelType);
            this.labelType = labelType;
            return this;
        }

        /**
         * <p>The risk level. The value is a JSON array. Valid values:</p>
         * <ul>
         * <li>serious: high</li>
         * <li>suspicious: medium</li>
         * <li>remind: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;serious&quot;,&quot;suspicious&quot;,&quot;remind&quot;]</p>
         */
        public Builder level(java.util.List<String> level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions in China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the account that you switch from the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The type of the view. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account</li>
         * <li>1: the global account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The source of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1577808000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account within which the alert is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>176555323***</p>
         */
        public Builder subUserId(String subUserId) {
            this.putBodyParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        @Override
        public DescribeAlertsRequest build() {
            return new DescribeAlertsRequest(this);
        } 

    } 

}
