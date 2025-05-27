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
 * {@link PostEventWhiteruleListRequest} extends {@link RequestModel}
 *
 * <p>PostEventWhiteruleListRequest</p>
 */
public class PostEventWhiteruleListRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("WhiteruleList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String whiteruleList;

    private PostEventWhiteruleListRequest(Builder builder) {
        super(builder);
        this.incidentUuid = builder.incidentUuid;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.whiteruleList = builder.whiteruleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostEventWhiteruleListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return whiteruleList
     */
    public String getWhiteruleList() {
        return this.whiteruleList;
    }

    public static final class Builder extends Request.Builder<PostEventWhiteruleListRequest, Builder> {
        private String incidentUuid; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String whiteruleList; 

        private Builder() {
            super();
        } 

        private Builder(PostEventWhiteruleListRequest request) {
            super(request);
            this.incidentUuid = request.incidentUuid;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.whiteruleList = request.whiteruleList;
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
         * <p>The alert whitelist rule. The value is a JSON object.</p>
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
        public Builder whiteruleList(String whiteruleList) {
            this.putBodyParameter("WhiteruleList", whiteruleList);
            this.whiteruleList = whiteruleList;
            return this;
        }

        @Override
        public PostEventWhiteruleListRequest build() {
            return new PostEventWhiteruleListRequest(this);
        } 

    } 

}
