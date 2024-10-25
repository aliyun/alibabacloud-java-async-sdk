// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DistApplicationDataRequest} extends {@link RequestModel}
 *
 * <p>DistApplicationDataRequest</p>
 */
public class DistApplicationDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DistStrategy")
    private String distStrategy;

    private DistApplicationDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.data = builder.data;
        this.distStrategy = builder.distStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DistApplicationDataRequest create() {
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
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return distStrategy
     */
    public String getDistStrategy() {
        return this.distStrategy;
    }

    public static final class Builder extends Request.Builder<DistApplicationDataRequest, Builder> {
        private String appId; 
        private String data; 
        private String distStrategy; 

        private Builder() {
            super();
        } 

        private Builder(DistApplicationDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.data = request.data;
            this.distStrategy = request.distStrategy;
        } 

        /**
         * <p>The ID of the application. To obtain the application ID, call the ListApplications operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e76f8985-7965-41fc-925b-9648bb6bf650</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The list of data files that you want to distribute. The value must be a JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;app01&quot;,        &quot;version&quot;:&quot;1.0&quot;,        &quot;destPath&quot;:&quot;/root/installed&quot;,        &quot;decompress&quot;:true,        &quot;targetDirName&quot;:&quot;target01&quot;,        &quot;fileMode&quot;:755,        &quot;timeout&quot;:1000    },    {        &quot;name&quot;:&quot;app02&quot;,        &quot;version&quot;:&quot;1.1&quot;,        &quot;destPath&quot;:&quot;/tmp/test.txt&quot;,        &quot;decompress&quot;:false    }]</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The canary release policy. The value must be a JSON string. You can specify multiple distribution policies. By default, all data files are distributed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;ScheduleToAllByMatchExpressions&quot;,&quot;parameters&quot;:{&quot;match_expressions&quot;:[{&quot;key&quot;:&quot;region_id&quot;,&quot;operator&quot;:&quot;In&quot;,&quot;values&quot;:[&quot;cn-wuhan-telecom_unicom_cmcc-2&quot;]}]}}</p>
         */
        public Builder distStrategy(String distStrategy) {
            this.putQueryParameter("DistStrategy", distStrategy);
            this.distStrategy = distStrategy;
            return this;
        }

        @Override
        public DistApplicationDataRequest build() {
            return new DistApplicationDataRequest(this);
        } 

    } 

}
