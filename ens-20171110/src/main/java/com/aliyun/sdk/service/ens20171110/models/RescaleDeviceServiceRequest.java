// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link RescaleDeviceServiceRequest} extends {@link RequestModel}
 *
 * <p>RescaleDeviceServiceRequest</p>
 */
public class RescaleDeviceServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpType")
    private Integer ipType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RescaleLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rescaleLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RescaleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rescaleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceInfo")
    private String resourceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceSelector")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceSelector;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceSpec")
    private String resourceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    private RescaleDeviceServiceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.imageId = builder.imageId;
        this.ipType = builder.ipType;
        this.rescaleLevel = builder.rescaleLevel;
        this.rescaleType = builder.rescaleType;
        this.resourceInfo = builder.resourceInfo;
        this.resourceSelector = builder.resourceSelector;
        this.resourceSpec = builder.resourceSpec;
        this.serviceId = builder.serviceId;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleDeviceServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return ipType
     */
    public Integer getIpType() {
        return this.ipType;
    }

    /**
     * @return rescaleLevel
     */
    public String getRescaleLevel() {
        return this.rescaleLevel;
    }

    /**
     * @return rescaleType
     */
    public String getRescaleType() {
        return this.rescaleType;
    }

    /**
     * @return resourceInfo
     */
    public String getResourceInfo() {
        return this.resourceInfo;
    }

    /**
     * @return resourceSelector
     */
    public String getResourceSelector() {
        return this.resourceSelector;
    }

    /**
     * @return resourceSpec
     */
    public String getResourceSpec() {
        return this.resourceSpec;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<RescaleDeviceServiceRequest, Builder> {
        private String appId; 
        private String imageId; 
        private Integer ipType; 
        private String rescaleLevel; 
        private String rescaleType; 
        private String resourceInfo; 
        private String resourceSelector; 
        private String resourceSpec; 
        private String serviceId; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(RescaleDeviceServiceRequest request) {
            super(request);
            this.appId = request.appId;
            this.imageId = request.imageId;
            this.ipType = request.ipType;
            this.rescaleLevel = request.rescaleLevel;
            this.rescaleType = request.rescaleType;
            this.resourceInfo = request.resourceInfo;
            this.resourceSelector = request.resourceSelector;
            this.resourceSpec = request.resourceSpec;
            this.serviceId = request.serviceId;
            this.timeout = request.timeout;
        } 

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>7aedc50b-b1cb-4a7c-9e3d-4cf3c9ee55a4</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-5rynw9g1ow1e928lb83bqmbnf</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The type of the network. The value must be of the enumerated data type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong> (default): Internet</li>
         * <li><strong>2</strong>: internal network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ipType(Integer ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * <p>The region level of the scale-out. Set the value to RegionId. RegionId specifies that resource scale-out is performed based on the ID of the edge node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        public Builder rescaleLevel(String rescaleLevel) {
            this.putQueryParameter("RescaleLevel", rescaleLevel);
            this.rescaleLevel = rescaleLevel;
            return this;
        }

        /**
         * <p>The scaling operation. Set the value to Add to add new resources.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Add</p>
         */
        public Builder rescaleType(String rescaleType) {
            this.putQueryParameter("RescaleType", rescaleType);
            this.rescaleType = rescaleType;
            return this;
        }

        /**
         * <p>The information about the resource specification template. The value must be a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;imageId&quot;:&quot;m-5s4z4c10avgwvwtn33gl2vgob&quot;,&quot;ipType&quot;:2,&quot;specName&quot;:&quot;ens.pfb-c3m7.medium&quot;}</p>
         */
        public Builder resourceInfo(String resourceInfo) {
            this.putBodyParameter("ResourceInfo", resourceInfo);
            this.resourceInfo = resourceInfo;
            return this;
        }

        /**
         * <p>The required resources. The value must be a JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;regionCode&quot;: &quot;cn-wuxi-telecom_unicom_cmcc-3&quot;,    &quot;ispCode&quot;: &quot;telecom&quot;,    &quot;count&quot;: 2	},{    &quot;regionCode&quot;: &quot;cn-shanghai-cmcc&quot;,    &quot;count&quot;: 4	}]</p>
         */
        public Builder resourceSelector(String resourceSelector) {
            this.putBodyParameter("ResourceSelector", resourceSelector);
            this.resourceSelector = resourceSelector;
            return this;
        }

        /**
         * <p>The resource specification.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.a6e.large</p>
         */
        public Builder resourceSpec(String resourceSpec) {
            this.putQueryParameter("ResourceSpec", resourceSpec);
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>service-01c6dd6e93f040698566</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The timeout period for asynchronous scale-out. Unit: seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public RescaleDeviceServiceRequest build() {
            return new RescaleDeviceServiceRequest(this);
        } 

    } 

}
