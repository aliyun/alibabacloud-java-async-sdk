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
 * {@link DescribeApplicationRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationRequest</p>
 */
public class DescribeApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersions")
    private String appVersions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutDetailStatParams")
    private String outDetailStatParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceSelector")
    private String resourceSelector;

    private DescribeApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appVersions = builder.appVersions;
        this.level = builder.level;
        this.outDetailStatParams = builder.outDetailStatParams;
        this.resourceSelector = builder.resourceSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationRequest create() {
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
     * @return appVersions
     */
    public String getAppVersions() {
        return this.appVersions;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return outDetailStatParams
     */
    public String getOutDetailStatParams() {
        return this.outDetailStatParams;
    }

    /**
     * @return resourceSelector
     */
    public String getResourceSelector() {
        return this.resourceSelector;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationRequest, Builder> {
        private String appId; 
        private String appVersions; 
        private String level; 
        private String outDetailStatParams; 
        private String resourceSelector; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.appVersions = request.appVersions;
            this.level = request.level;
            this.outDetailStatParams = request.outDetailStatParams;
            this.resourceSelector = request.resourceSelector;
        } 

        /**
         * <p>The ID of the application. You can call the ListApplications operation to obtain the application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2bac6f4-75dc-455e-8389-2dc8e47526d3</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The version number of the application. Separate multiple version numbers with commas (,). If you want to query data of all versions of applications, specify All for this parameter. By default, only data of applications in the stable versions are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>v1,v2</p>
         */
        public Builder appVersions(String appVersions) {
            this.putQueryParameter("AppVersions", appVersions);
            this.appVersions = appVersions;
            return this;
        }

        /**
         * <p>The region level by which edge resources of the application are collected. The value is of the enumeration type. Valid values:</p>
         * <ul>
         * <li>National: Chinese mainland</li>
         * <li>Big: area</li>
         * <li>Middle: province</li>
         * <li>Small: city</li>
         * <li>RegionId: edge node</li>
         * </ul>
         * <p>Default value: National.</p>
         * 
         * <strong>example:</strong>
         * <p>National</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>Specifies whether to return other information about the application, such as statistics on resource instances and pods. The value must be a JSON string. By default, all information is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appInfo&quot;:true,&quot;detailStat&quot;: true, &quot;appVersionStat&quot;: true, &quot;districtStat&quot;:true ,&quot;instanceStat&quot;: true, &quot;podCountStat&quot;: true}</p>
         */
        public Builder outDetailStatParams(String outDetailStatParams) {
            this.putQueryParameter("OutDetailStatParams", outDetailStatParams);
            this.outDetailStatParams = outDetailStatParams;
            return this;
        }

        /**
         * <p>The resource filter.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;regionCode&quot;: &quot;cn-wuxi-telecom_unicom_cmcc-3&quot;,    &quot;ispCode&quot;: &quot;telecom&quot;,    &quot;count&quot;: 2	},{    &quot;regionCode&quot;: &quot;cn-shanghai-cmcc&quot;,    &quot;count&quot;: 4	}]</p>
         */
        public Builder resourceSelector(String resourceSelector) {
            this.putQueryParameter("ResourceSelector", resourceSelector);
            this.resourceSelector = resourceSelector;
            return this;
        }

        @Override
        public DescribeApplicationRequest build() {
            return new DescribeApplicationRequest(this);
        } 

    } 

}
