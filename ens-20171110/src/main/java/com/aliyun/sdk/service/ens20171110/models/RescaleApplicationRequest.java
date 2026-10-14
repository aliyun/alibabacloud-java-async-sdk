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
 * {@link RescaleApplicationRequest} extends {@link RequestModel}
 *
 * <p>RescaleApplicationRequest</p>
 */
public class RescaleApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RescaleLevel")
    private String rescaleLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RescaleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rescaleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceSelector")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceSelector;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToAppVersion")
    private String toAppVersion;

    private RescaleApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.rescaleLevel = builder.rescaleLevel;
        this.rescaleType = builder.rescaleType;
        this.resourceSelector = builder.resourceSelector;
        this.timeout = builder.timeout;
        this.toAppVersion = builder.toAppVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleApplicationRequest create() {
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
     * @return resourceSelector
     */
    public String getResourceSelector() {
        return this.resourceSelector;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return toAppVersion
     */
    public String getToAppVersion() {
        return this.toAppVersion;
    }

    public static final class Builder extends Request.Builder<RescaleApplicationRequest, Builder> {
        private String appId; 
        private String rescaleLevel; 
        private String rescaleType; 
        private String resourceSelector; 
        private Integer timeout; 
        private String toAppVersion; 

        private Builder() {
            super();
        } 

        private Builder(RescaleApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.rescaleLevel = request.rescaleLevel;
            this.rescaleType = request.rescaleType;
            this.resourceSelector = request.resourceSelector;
            this.timeout = request.timeout;
            this.toAppVersion = request.toAppVersion;
        } 

        /**
         * <p>The application ID. You can obtain this value by calling the ListApplications operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>474bdef0-d149-4695-abfb-52912d9143f0</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The level of the scaling region. Valid values:</p>
         * <ul>
         * <li>AreaIspCode: region ISP.</li>
         * <li>RegionId: edge zone.</li>
         * <li>InstanceId: instance. Scale-out indicates resource hosting. Scale-in indicates resource release.</li>
         * </ul>
         * <p>Default value: AreaIspCode.</p>
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
         * <p>The scaling action for resources. Valid values:</p>
         * <ul>
         * <li>Add: Provisions new resources.</li>
         * <li>Del: Releases resources.</li>
         * </ul>
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
         * <p>The scaling resource requirements. The value is a string in JSON array format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;regionCode\&quot;: \&quot;cn-wuxi-telecom_unicom_cmcc-3\&quot;,    \&quot;ispCode\&quot;: \&quot;telecom\&quot;,    \&quot;count\&quot;: 2	},{    \&quot;regionCode\&quot;: \&quot;cn-shanghai-cmcc\&quot;,    \&quot;count\&quot;: 4	}]</p>
         */
        public Builder resourceSelector(String resourceSelector) {
            this.putQueryParameter("ResourceSelector", resourceSelector);
            this.resourceSelector = resourceSelector;
            return this;
        }

        /**
         * <p>The timeout period for asynchronous scaling, in seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The application deployment version for new resources. This parameter takes effect only when resources are added. Default value: the stable version number of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder toAppVersion(String toAppVersion) {
            this.putQueryParameter("ToAppVersion", toAppVersion);
            this.toAppVersion = toAppVersion;
            return this;
        }

        @Override
        public RescaleApplicationRequest build() {
            return new RescaleApplicationRequest(this);
        } 

    } 

}
