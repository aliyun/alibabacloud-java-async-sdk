// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListTrustedOriginsRequest} extends {@link RequestModel}
 *
 * <p>ListTrustedOriginsRequest</p>
 */
public class ListTrustedOriginsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origin")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrustOriginName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String trustOriginName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrustedOriginScene")
    private java.util.List<String> trustedOriginScene;

    private ListTrustedOriginsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.origin = builder.origin;
        this.status = builder.status;
        this.trustOriginName = builder.trustOriginName;
        this.trustedOriginScene = builder.trustedOriginScene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrustedOriginsRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return trustOriginName
     */
    public String getTrustOriginName() {
        return this.trustOriginName;
    }

    /**
     * @return trustedOriginScene
     */
    public java.util.List<String> getTrustedOriginScene() {
        return this.trustedOriginScene;
    }

    public static final class Builder extends Request.Builder<ListTrustedOriginsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String origin; 
        private String status; 
        private String trustOriginName; 
        private java.util.List<String> trustedOriginScene; 

        private Builder() {
            super();
        } 

        private Builder(ListTrustedOriginsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.origin = request.origin;
            this.status = request.status;
            this.trustOriginName = request.trustOriginName;
            this.trustedOriginScene = request.trustedOriginScene;
        } 

        /**
         * <p>资源所属地域ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_example</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum number of results per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>NT_example</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The origin filter.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://console.qoder.com">https://console.qoder.com</a></p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The status filter. Valid values:</p>
         * <ul>
         * <li>Enabled: Enabled.</li>
         * <li>Disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The name filter.</p>
         * 
         * <strong>example:</strong>
         * <p>Qoder Production Console</p>
         */
        public Builder trustOriginName(String trustOriginName) {
            this.putQueryParameter("TrustOriginName", trustOriginName);
            this.trustOriginName = trustOriginName;
            return this;
        }

        /**
         * <p>The trusted origin scene filter.</p>
         * 
         * <strong>example:</strong>
         * <p>iframe_embed</p>
         */
        public Builder trustedOriginScene(java.util.List<String> trustedOriginScene) {
            this.putQueryParameter("TrustedOriginScene", trustedOriginScene);
            this.trustedOriginScene = trustedOriginScene;
            return this;
        }

        @Override
        public ListTrustedOriginsRequest build() {
            return new ListTrustedOriginsRequest(this);
        } 

    } 

}
