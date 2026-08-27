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
         * attachResourceType.
         */
        public Builder attachResourceType(String attachResourceType) {
            this.putQueryParameter("attachResourceType", attachResourceType);
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * className.
         */
        public Builder className(String className) {
            this.putQueryParameter("className", className);
            this.className = className;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * globalPolicyType.
         */
        public Builder globalPolicyType(String globalPolicyType) {
            this.putQueryParameter("globalPolicyType", globalPolicyType);
            this.globalPolicyType = globalPolicyType;
            return this;
        }

        /**
         * ipAccessControlContent.
         */
        public Builder ipAccessControlContent(String ipAccessControlContent) {
            this.putQueryParameter("ipAccessControlContent", ipAccessControlContent);
            this.ipAccessControlContent = ipAccessControlContent;
            return this;
        }

        /**
         * ipAccessControlProtocolLayer.
         */
        public Builder ipAccessControlProtocolLayer(String ipAccessControlProtocolLayer) {
            this.putQueryParameter("ipAccessControlProtocolLayer", ipAccessControlProtocolLayer);
            this.ipAccessControlProtocolLayer = ipAccessControlProtocolLayer;
            return this;
        }

        /**
         * ipAccessControlResourceName.
         */
        public Builder ipAccessControlResourceName(String ipAccessControlResourceName) {
            this.putQueryParameter("ipAccessControlResourceName", ipAccessControlResourceName);
            this.ipAccessControlResourceName = ipAccessControlResourceName;
            return this;
        }

        /**
         * ipAccessControlType.
         */
        public Builder ipAccessControlType(String ipAccessControlType) {
            this.putQueryParameter("ipAccessControlType", ipAccessControlType);
            this.ipAccessControlType = ipAccessControlType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
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
