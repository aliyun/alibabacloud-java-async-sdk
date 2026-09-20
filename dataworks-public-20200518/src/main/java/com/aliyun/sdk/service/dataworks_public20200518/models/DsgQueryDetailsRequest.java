// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link DsgQueryDetailsRequest} extends {@link RequestModel}
 *
 * <p>DsgQueryDetailsRequest</p>
 */
public class DsgQueryDetailsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EngineName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpAare")
    private String ipAare;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rows")
    private Integer rows;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SensLevel")
    private String sensLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private DsgQueryDetailsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.engineName = builder.engineName;
        this.ip = builder.ip;
        this.ipAare = builder.ipAare;
        this.nodeId = builder.nodeId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.rows = builder.rows;
        this.ruleType = builder.ruleType;
        this.sensLevel = builder.sensLevel;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgQueryDetailsRequest create() {
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
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return engineName
     */
    public String getEngineName() {
        return this.engineName;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return ipAare
     */
    public String getIpAare() {
        return this.ipAare;
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
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return rows
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return sensLevel
     */
    public String getSensLevel() {
        return this.sensLevel;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<DsgQueryDetailsRequest, Builder> {
        private String regionId; 
        private String beginTime; 
        private String endTime; 
        private String engineName; 
        private String ip; 
        private String ipAare; 
        private String nodeId; 
        private Long pageNo; 
        private Long pageSize; 
        private String projectId; 
        private Integer rows; 
        private String ruleType; 
        private String sensLevel; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(DsgQueryDetailsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.engineName = request.engineName;
            this.ip = request.ip;
            this.ipAare = request.ipAare;
            this.nodeId = request.nodeId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.rows = request.rows;
            this.ruleType = request.ruleType;
            this.sensLevel = request.sensLevel;
            this.user = request.user;
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
         * <p>The start time of the query range. Example: &quot;2026-06-26 00:00:00&quot;.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-26 00:00:00</p>
         */
        public Builder beginTime(String beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The end time of the query range. Example: &quot;2026-06-30 23:59:59&quot;.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-30 23:59:59</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li>ODPS.ODPS</li>
         * <li>EMR</li>
         * <li>HOLO.POSTGRES</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS.ODPS</p>
         */
        public Builder engineName(String engineName) {
            this.putBodyParameter("EngineName", engineName);
            this.engineName = engineName;
            return this;
        }

        /**
         * <p>The internal IP address of the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>203.107.80.20</p>
         */
        public Builder ip(String ip) {
            this.putBodyParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The region to which the IP address belongs. Example: China-Beijing-Beijing, or internal IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>China-Beijing-Beijing.</p>
         */
        public Builder ipAare(String ipAare) {
            this.putQueryParameter("IpAare", ipAare);
            this.ipAare = ipAare;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123541234</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The page number. Minimum value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The project workspace name (essentially ProjectName). Example: dsg_demo_gw.</p>
         * 
         * <strong>example:</strong>
         * <p>dsg_demo_gw</p>
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The minimum value of the export volume.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder rows(Integer rows) {
            this.putQueryParameter("Rows", rows);
            this.rows = rows;
            return this;
        }

        /**
         * <p>The type of triggered sensitive rule. Example: Name.</p>
         * 
         * <strong>example:</strong>
         * <p>Name.</p>
         */
        public Builder ruleType(String ruleType) {
            this.putBodyParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The classification level. Example: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder sensLevel(String sensLevel) {
            this.putBodyParameter("SensLevel", sensLevel);
            this.sensLevel = sensLevel;
            return this;
        }

        /**
         * <p>The operator account. Example: dsg_test.</p>
         * 
         * <strong>example:</strong>
         * <p>dsg_test</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public DsgQueryDetailsRequest build() {
            return new DsgQueryDetailsRequest(this);
        } 

    } 

}
