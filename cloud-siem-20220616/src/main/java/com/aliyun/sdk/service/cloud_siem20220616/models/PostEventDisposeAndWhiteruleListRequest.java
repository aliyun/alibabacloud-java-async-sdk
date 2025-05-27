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
 * {@link PostEventDisposeAndWhiteruleListRequest} extends {@link RequestModel}
 *
 * <p>PostEventDisposeAndWhiteruleListRequest</p>
 */
public class PostEventDisposeAndWhiteruleListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventDispose")
    private String eventDispose;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    private String incidentUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceiverInfo")
    private String receiverInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThreatLevel")
    private String threatLevel;

    private PostEventDisposeAndWhiteruleListRequest(Builder builder) {
        super(builder);
        this.eventDispose = builder.eventDispose;
        this.incidentUuid = builder.incidentUuid;
        this.receiverInfo = builder.receiverInfo;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.status = builder.status;
        this.threatLevel = builder.threatLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostEventDisposeAndWhiteruleListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventDispose
     */
    public String getEventDispose() {
        return this.eventDispose;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return receiverInfo
     */
    public String getReceiverInfo() {
        return this.receiverInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return threatLevel
     */
    public String getThreatLevel() {
        return this.threatLevel;
    }

    public static final class Builder extends Request.Builder<PostEventDisposeAndWhiteruleListRequest, Builder> {
        private String eventDispose; 
        private String incidentUuid; 
        private String receiverInfo; 
        private String regionId; 
        private String remark; 
        private Long roleFor; 
        private Integer roleType; 
        private Integer status; 
        private String threatLevel; 

        private Builder() {
            super();
        } 

        private Builder(PostEventDisposeAndWhiteruleListRequest request) {
            super(request);
            this.eventDispose = request.eventDispose;
            this.incidentUuid = request.incidentUuid;
            this.receiverInfo = request.receiverInfo;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.status = request.status;
            this.threatLevel = request.threatLevel;
        } 

        /**
         * <p>The configuration of event handling. The value is a JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;playbookName&quot;: &quot;WafBlockIP&quot;,
         *             &quot;entityId&quot;: &quot;104466118&quot;,
         *             &quot;scope&quot;: [
         *                   &quot;176618589410****&quot;
         *             ],
         *             &quot;startTime&quot;: 1604168946281,
         *             &quot;endTime&quot;: 1614168946281
         *       },
         *       {
         *             &quot;playbookName&quot;: &quot;WafBlockIP&quot;,
         *             &quot;entityId&quot;: &quot;104466118&quot;,
         *             &quot;scope&quot;: [
         *                   {
         *                         &quot;instanceId&quot;: &quot;waf-cn-n6w1oy1****&quot;,
         *                         &quot;domains&quot;: [
         *                               &quot;lmfip.wafqax.***&quot;
         *                         ]
         *                   }
         *             ],
         *             &quot;startTime&quot;: 1604168946281,
         *             &quot;endTime&quot;: 1614168946281
         *       }
         * ]</p>
         */
        public Builder eventDispose(String eventDispose) {
            this.putBodyParameter("EventDispose", eventDispose);
            this.eventDispose = eventDispose;
            return this;
        }

        /**
         * <p>The UUID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * <p>The configuration of the alert recipient. The value is a JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;messageTitle&quot;: &quot;test&quot;,
         *       &quot;receiver&quot;: &quot;xiaowang&quot;,
         *       &quot;channel&quot;: &quot;message&quot;
         * }</p>
         */
        public Builder receiverInfo(String receiverInfo) {
            this.putBodyParameter("ReceiverInfo", receiverInfo);
            this.receiverInfo = receiverInfo;
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
         * <p>The remarks of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>dealed</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
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
         * <p>The status of the event. Valid values:</p>
         * <ul>
         * <li>0: unhandled</li>
         * <li>1: handing</li>
         * <li>5: handling failed</li>
         * <li>10: handled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * ThreatLevel.
         */
        public Builder threatLevel(String threatLevel) {
            this.putBodyParameter("ThreatLevel", threatLevel);
            this.threatLevel = threatLevel;
            return this;
        }

        @Override
        public PostEventDisposeAndWhiteruleListRequest build() {
            return new PostEventDisposeAndWhiteruleListRequest(this);
        } 

    } 

}
