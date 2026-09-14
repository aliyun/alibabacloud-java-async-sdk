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
 * {@link UpdateWhiteRuleListRequest} extends {@link RequestModel}
 *
 * <p>UpdateWhiteRuleListRequest</p>
 */
public class UpdateWhiteRuleListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Expression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    private String incidentUuid;

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
    @com.aliyun.core.annotation.NameInMap("WhiteRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long whiteRuleId;

    private UpdateWhiteRuleListRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
        this.incidentUuid = builder.incidentUuid;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.whiteRuleId = builder.whiteRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWhiteRuleListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
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
     * @return whiteRuleId
     */
    public Long getWhiteRuleId() {
        return this.whiteRuleId;
    }

    public static final class Builder extends Request.Builder<UpdateWhiteRuleListRequest, Builder> {
        private String expression; 
        private String incidentUuid; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private Long whiteRuleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWhiteRuleListRequest request) {
            super(request);
            this.expression = request.expression;
            this.incidentUuid = request.incidentUuid;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.whiteRuleId = request.whiteRuleId;
        } 

        /**
         * <p>The alert whitelist rule. This is a JSON object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;alertName&quot;: &quot;webshell&quot;,
         *             &quot;alertNameId&quot;: &quot;webshell&quot;,
         *             &quot;alertType&quot;: &quot;command&quot;,
         *             &quot;alertTypeId&quot;: &quot;command&quot;,
         *             &quot;expression&quot;: {
         *                   &quot;status&quot;: 1,
         *                   &quot;conditions&quot;: [
         *                         {
         *                               &quot;isNot&quot;: false,
         *                               &quot;left&quot;: {
         *                                     &quot;value&quot;: &quot;file_path&quot;
         *                               },
         *                               &quot;operator&quot;: &quot;gt&quot;,
         *                               &quot;right&quot;: {
         *                                     &quot;value&quot;: &quot;cp&quot;
         *                               }
         *                         }
         *                   ]
         *             }
         *       }
         * ]</p>
         */
        public Builder expression(String expression) {
            this.putBodyParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * <p>The global unique ID of the event.</p>
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
         * <p>The region of the Data Management center for threat analysis. Select a region for the Data Management center based on the region of your assets. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or China (Hong Kong).</p>
         * </li>
         * <li><p>ap-southeast-1: Your assets are outside China.</p>
         * </li>
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
         * <p>The user ID of the member. This parameter is used when an administrator switches to the perspective of a member.</p>
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
         * <p>The view type.</p>
         * <ul>
         * <li><p>0: The view of the current Alibaba Cloud account.</p>
         * </li>
         * <li><p>1: The view of all accounts that belong to the enterprise.</p>
         * </li>
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
         * <p>The unique ID of the whitelist rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder whiteRuleId(Long whiteRuleId) {
            this.putBodyParameter("WhiteRuleId", whiteRuleId);
            this.whiteRuleId = whiteRuleId;
            return this;
        }

        @Override
        public UpdateWhiteRuleListRequest build() {
            return new UpdateWhiteRuleListRequest(this);
        } 

    } 

}
