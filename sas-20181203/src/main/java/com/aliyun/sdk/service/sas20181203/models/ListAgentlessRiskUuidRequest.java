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
 * {@link ListAgentlessRiskUuidRequest} extends {@link RequestModel}
 *
 * <p>ListAgentlessRiskUuidRequest</p>
 */
public class ListAgentlessRiskUuidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetIp")
    private String internetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetIp")
    private String intranetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineName")
    private String machineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Risk")
    private Boolean risk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetName")
    private String targetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private Integer targetType;

    private ListAgentlessRiskUuidRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.machineName = builder.machineName;
        this.pageSize = builder.pageSize;
        this.risk = builder.risk;
        this.targetName = builder.targetName;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessRiskUuidRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return intranetIp
     */
    public String getIntranetIp() {
        return this.intranetIp;
    }

    /**
     * @return machineName
     */
    public String getMachineName() {
        return this.machineName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return risk
     */
    public Boolean getRisk() {
        return this.risk;
    }

    /**
     * @return targetName
     */
    public String getTargetName() {
        return this.targetName;
    }

    /**
     * @return targetType
     */
    public Integer getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ListAgentlessRiskUuidRequest, Builder> {
        private Integer currentPage; 
        private String instanceId; 
        private String instanceName; 
        private String internetIp; 
        private String intranetIp; 
        private String machineName; 
        private Integer pageSize; 
        private Boolean risk; 
        private String targetName; 
        private Integer targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentlessRiskUuidRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.internetIp = request.internetIp;
            this.intranetIp = request.intranetIp;
            this.machineName = request.machineName;
            this.pageSize = request.pageSize;
            this.risk = request.risk;
            this.targetName = request.targetName;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp1g6wxdwps7s9dz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_cpm_****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The public IP address of the asset that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>The private IP address of the asset that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>172.26.XX.XX</p>
         */
        public Builder intranetIp(String intranetIp) {
            this.putQueryParameter("IntranetIp", intranetIp);
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>oracle-win-001****</p>
         */
        public Builder machineName(String machineName) {
            this.putQueryParameter("MachineName", machineName);
            this.machineName = machineName;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether risks exist. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Risks exist.</li>
         * <li><strong>false</strong>: Risks do not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder risk(Boolean risk) {
            this.putQueryParameter("Risk", risk);
            this.risk = risk;
            return this;
        }

        /**
         * <p>The name of the detection object.</p>
         * 
         * <strong>example:</strong>
         * <p>source-test-obj-0****</p>
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * <p>Specifies the type of the object being inspected. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Host Snapshot.</li>
         * <li><strong>2</strong>: Host Image.</li>
         * <li><strong>3</strong>: User Snapshot.</li>
         * <li><strong>4</strong>: User Image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder targetType(Integer targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListAgentlessRiskUuidRequest build() {
            return new ListAgentlessRiskUuidRequest(this);
        } 

    } 

}
