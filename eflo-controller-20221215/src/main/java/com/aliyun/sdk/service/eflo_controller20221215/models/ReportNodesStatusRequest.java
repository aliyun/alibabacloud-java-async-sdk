// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ReportNodesStatusRequest} extends {@link RequestModel}
 *
 * <p>ReportNodesStatusRequest</p>
 */
public class ReportNodesStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IssueCategory")
    private String issueCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<String> nodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ReportNodesStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.issueCategory = builder.issueCategory;
        this.nodes = builder.nodes;
        this.reason = builder.reason;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportNodesStatusRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return issueCategory
     */
    public String getIssueCategory() {
        return this.issueCategory;
    }

    /**
     * @return nodes
     */
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ReportNodesStatusRequest, Builder> {
        private String regionId; 
        private String description; 
        private String endTime; 
        private String issueCategory; 
        private java.util.List<String> nodes; 
        private String reason; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ReportNodesStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.endTime = request.endTime;
            this.issueCategory = request.issueCategory;
            this.nodes = request.nodes;
            this.reason = request.reason;
            this.startTime = request.startTime;
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
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_mysql_lingwan_faxing_login_di</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The end time of the node issue. The time is in the ISO 8601 format \<code>yyyy-MM-ddTHH:mm:ss+0800\\</code> and includes the time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T10:17:06</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The category of the issue. This parameter is required when \<code>Reason\\</code> is set to \<code>HardwareError\\</code>. Valid values:<br>
         * ● hardware-cpu-error: CPU failure<br>
         * ● hardware-gpu-error: GPU failure<br>
         * ● hardware-motherboard-error: Motherboard failure<br>
         * ● hardware-mem-error: Memory failure<br>
         * ● hardware-power-error: Power supply failure<br>
         * ● hardware-disk-error: Disk failure
         * ● hardware-networkcard-error: Network interface card failure<br>
         * ● hardware-fan-error: Fan failure<br>
         * ● hardware-cable-error: Network cable failure<br>
         * ● others: Other<br><br><br><br><br><br><br><br><br></p>
         * 
         * <strong>example:</strong>
         * <p>hardware-disk-error</p>
         */
        public Builder issueCategory(String issueCategory) {
            this.putBodyParameter("IssueCategory", issueCategory);
            this.issueCategory = issueCategory;
            return this;
        }

        /**
         * <p>The list of nodes.</p>
         */
        public Builder nodes(java.util.List<String> nodes) {
            String nodesShrink = shrink(nodes, "Nodes", "json");
            this.putBodyParameter("Nodes", nodesShrink);
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The impact of the issue on the Lingjun node.
         * Valid values:
         * ● HardwareError: A hardware error occurred.
         * ● SoftwareError: A software error occurred.
         * ● NetworkError: A network error occurred.
         * ● Others: Other issues. If none of the preceding values apply, set this parameter to \<code>Others\\</code> and provide details in the \<code>Description\\</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>SoftwareError</p>
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The start time of the node issue. The time is in the ISO 8601 format \<code>yyyy-MM-ddTHH:mm:ss+0800\\</code> and includes the time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-22T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ReportNodesStatusRequest build() {
            return new ReportNodesStatusRequest(this);
        } 

    } 

}
