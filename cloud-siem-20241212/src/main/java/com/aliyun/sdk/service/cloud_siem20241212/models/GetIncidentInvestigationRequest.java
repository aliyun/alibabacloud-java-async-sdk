// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetIncidentInvestigationRequest} extends {@link RequestModel}
 *
 * <p>GetIncidentInvestigationRequest</p>
 */
public class GetIncidentInvestigationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentInvestigationDisplayId")
    private String incidentInvestigationDisplayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentInvestigationId")
    private String incidentInvestigationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String incidentUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private GetIncidentInvestigationRequest(Builder builder) {
        super(builder);
        this.incidentInvestigationDisplayId = builder.incidentInvestigationDisplayId;
        this.incidentInvestigationId = builder.incidentInvestigationId;
        this.incidentUuid = builder.incidentUuid;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncidentInvestigationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return incidentInvestigationDisplayId
     */
    public String getIncidentInvestigationDisplayId() {
        return this.incidentInvestigationDisplayId;
    }

    /**
     * @return incidentInvestigationId
     */
    public String getIncidentInvestigationId() {
        return this.incidentInvestigationId;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<GetIncidentInvestigationRequest, Builder> {
        private String incidentInvestigationDisplayId; 
        private String incidentInvestigationId; 
        private String incidentUuid; 
        private String lang; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(GetIncidentInvestigationRequest request) {
            super(request);
            this.incidentInvestigationDisplayId = request.incidentInvestigationDisplayId;
            this.incidentInvestigationId = request.incidentInvestigationId;
            this.incidentUuid = request.incidentUuid;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The display ID of the AI investigation report. You can obtain this value from the IncidentInvestigationDisplayId field returned by ListIncidentInvestigations. This parameter takes effect only when IncidentInvestigationId is not specified. If neither identifier is specified, the most recent successfully completed investigation result for the specified incident is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>755616bb5d63046c1e4f62ea872a****</p>
         */
        public Builder incidentInvestigationDisplayId(String incidentInvestigationDisplayId) {
            this.putBodyParameter("IncidentInvestigationDisplayId", incidentInvestigationDisplayId);
            this.incidentInvestigationDisplayId = incidentInvestigationDisplayId;
            return this;
        }

        /**
         * <p>The AI investigation report ID. You can obtain this value from the IncidentInvestigationId field returned by ListIncidentInvestigations. If both this parameter and IncidentInvestigationDisplayId are specified, this parameter takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>951a6a0b-14c7-4332-ace6-bff21c******</p>
         */
        public Builder incidentInvestigationId(String incidentInvestigationId) {
            this.putBodyParameter("IncidentInvestigationId", incidentInvestigationId);
            this.incidentInvestigationId = incidentInvestigationId;
            return this;
        }

        /**
         * <p>The globally unique identity of the event. If neither the report ID nor the display ID is specified, the most recent successfully completed investigation result for this event is returned via event query.</p>
         * <p>This parameter is required.</p>
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The region where the threat analysis data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Chinese mainland.</li>
         * <li>ap-southeast-1: Outside the Chinese mainland.</li>
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
         * <p>The user ID that the administrator uses to switch to the view of another member.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public GetIncidentInvestigationRequest build() {
            return new GetIncidentInvestigationRequest(this);
        } 

    } 

}
