// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GrafanaWorkspaceHttpApiProxyRequest} extends {@link RequestModel}
 *
 * <p>GrafanaWorkspaceHttpApiProxyRequest</p>
 */
public class GrafanaWorkspaceHttpApiProxyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BodyStr")
    private String bodyStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaWorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grafanaWorkspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    private Long orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GrafanaWorkspaceHttpApiProxyRequest(Builder builder) {
        super(builder);
        this.bodyStr = builder.bodyStr;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.orgId = builder.orgId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceHttpApiProxyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bodyStr
     */
    public String getBodyStr() {
        return this.bodyStr;
    }

    /**
     * @return grafanaWorkspaceId
     */
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    /**
     * @return orgId
     */
    public Long getOrgId() {
        return this.orgId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GrafanaWorkspaceHttpApiProxyRequest, Builder> {
        private String bodyStr; 
        private String grafanaWorkspaceId; 
        private Long orgId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GrafanaWorkspaceHttpApiProxyRequest request) {
            super(request);
            this.bodyStr = request.bodyStr;
            this.grafanaWorkspaceId = request.grafanaWorkspaceId;
            this.orgId = request.orgId;
            this.regionId = request.regionId;
        } 

        /**
         * BodyStr.
         */
        public Builder bodyStr(String bodyStr) {
            this.putBodyParameter("BodyStr", bodyStr);
            this.bodyStr = bodyStr;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grafana-cn-06f4xyxjo01</p>
         */
        public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
            this.putQueryParameter("GrafanaWorkspaceId", grafanaWorkspaceId);
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(Long orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GrafanaWorkspaceHttpApiProxyRequest build() {
            return new GrafanaWorkspaceHttpApiProxyRequest(this);
        } 

    } 

}
