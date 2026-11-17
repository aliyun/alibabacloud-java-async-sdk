// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListGlobalPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListGlobalPoliciesRequest</p>
 */
public class ListGlobalPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceType")
    private String attachResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("className")
    private String className;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("globalPolicyType")
    private String globalPolicyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ipAccessControlContent")
    private String ipAccessControlContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ipAccessControlProtocolLayer")
    private String ipAccessControlProtocolLayer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ipAccessControlResourceName")
    private String ipAccessControlResourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ipAccessControlType")
    private String ipAccessControlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ListGlobalPoliciesRequest(Builder builder) {
        super(builder);
        this.attachResourceType = builder.attachResourceType;
        this.className = builder.className;
        this.enable = builder.enable;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.globalPolicyType = builder.globalPolicyType;
        this.ipAccessControlContent = builder.ipAccessControlContent;
        this.ipAccessControlProtocolLayer = builder.ipAccessControlProtocolLayer;
        this.ipAccessControlResourceName = builder.ipAccessControlResourceName;
        this.ipAccessControlType = builder.ipAccessControlType;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGlobalPoliciesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachResourceType
     */
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return globalPolicyType
     */
    public String getGlobalPolicyType() {
        return this.globalPolicyType;
    }

    /**
     * @return ipAccessControlContent
     */
    public String getIpAccessControlContent() {
        return this.ipAccessControlContent;
    }

    /**
     * @return ipAccessControlProtocolLayer
     */
    public String getIpAccessControlProtocolLayer() {
        return this.ipAccessControlProtocolLayer;
    }

    /**
     * @return ipAccessControlResourceName
     */
    public String getIpAccessControlResourceName() {
        return this.ipAccessControlResourceName;
    }

    /**
     * @return ipAccessControlType
     */
    public String getIpAccessControlType() {
        return this.ipAccessControlType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListGlobalPoliciesRequest, Builder> {
        private String attachResourceType; 
        private String className; 
        private Boolean enable; 
        private String environmentId; 
        private String gatewayId; 
        private String globalPolicyType; 
        private String ipAccessControlContent; 
        private String ipAccessControlProtocolLayer; 
        private String ipAccessControlResourceName; 
        private String ipAccessControlType; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListGlobalPoliciesRequest request) {
            super(request);
            this.attachResourceType = request.attachResourceType;
            this.className = request.className;
            this.enable = request.enable;
            this.environmentId = request.environmentId;
            this.gatewayId = request.gatewayId;
            this.globalPolicyType = request.globalPolicyType;
            this.ipAccessControlContent = request.ipAccessControlContent;
            this.ipAccessControlProtocolLayer = request.ipAccessControlProtocolLayer;
            this.ipAccessControlResourceName = request.ipAccessControlResourceName;
            this.ipAccessControlType = request.ipAccessControlType;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>Filters by mounted resource type. This parameter takes effect only for the BlackOrWhite policy type. By default, the Gateway, Domain, and Route types are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>Gateway</p>
         */
        public Builder attachResourceType(String attachResourceType) {
            this.putQueryParameter("attachResourceType", attachResourceType);
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * <p>The policy class name. You can specify multiple values separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>JWTAuth,OIDCAuth,ExternalZAuth</p>
         */
        public Builder className(String className) {
            this.putQueryParameter("className", className);
            this.className = className;
            return this;
        }

        /**
         * <p>Filters by enabling status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>Filters by environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxx</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>Filters by gateway ID at the attachment level.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The global policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>GlobalAuth</p>
         */
        public Builder globalPolicyType(String globalPolicyType) {
            this.putQueryParameter("globalPolicyType", globalPolicyType);
            this.globalPolicyType = globalPolicyType;
            return this;
        }

        /**
         * <p>Filters by IP content by performing a LIKE query on the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3.4</p>
         */
        public Builder ipAccessControlContent(String ipAccessControlContent) {
            this.putQueryParameter("ipAccessControlContent", ipAccessControlContent);
            this.ipAccessControlContent = ipAccessControlContent;
            return this;
        }

        /**
         * <p>Filters by protocol layer. If you specify L4, configurations containing L4 are queried. If you specify L7, configurations that do not contain L4 are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>L7</p>
         */
        public Builder ipAccessControlProtocolLayer(String ipAccessControlProtocolLayer) {
            this.putQueryParameter("ipAccessControlProtocolLayer", ipAccessControlProtocolLayer);
            this.ipAccessControlProtocolLayer = ipAccessControlProtocolLayer;
            return this;
        }

        /**
         * <p>Filters by resource name by performing a LIKE query on the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>my-route</p>
         */
        public Builder ipAccessControlResourceName(String ipAccessControlResourceName) {
            this.putQueryParameter("ipAccessControlResourceName", ipAccessControlResourceName);
            this.ipAccessControlResourceName = ipAccessControlResourceName;
            return this;
        }

        /**
         * <p>Filters by IP access control type by performing a LIKE query on the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>White / Black</p>
         */
        public Builder ipAccessControlType(String ipAccessControlType) {
            this.putQueryParameter("ipAccessControlType", ipAccessControlType);
            this.ipAccessControlType = ipAccessControlType;
            return this;
        }

        /**
         * <p>Filters by exact policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-jwt-auth</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListGlobalPoliciesRequest build() {
            return new ListGlobalPoliciesRequest(this);
        } 

    } 

}
