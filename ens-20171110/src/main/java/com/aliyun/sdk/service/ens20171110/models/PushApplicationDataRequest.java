// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PushApplicationDataRequest} extends {@link RequestModel}
 *
 * <p>PushApplicationDataRequest</p>
 */
public class PushApplicationDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushStrategy")
    private String pushStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    private PushApplicationDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.data = builder.data;
        this.pushStrategy = builder.pushStrategy;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushApplicationDataRequest create() {
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
     * @return pushStrategy
     */
    public String getPushStrategy() {
        return this.pushStrategy;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<PushApplicationDataRequest, Builder> {
        private String appId; 
        private String data; 
        private String pushStrategy; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(PushApplicationDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.data = request.data;
            this.pushStrategy = request.pushStrategy;
            this.timeout = request.timeout;
        } 

        /**
         * <p>The ID of the application.</p>
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
         * <p>The data files that you want to push. The value must be a JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;app01&quot;,       &quot;version&quot;:&quot;1.0&quot;,       &quot;size&quot;:100,&quot;archiveType&quot;:&quot;tar.gz&quot;,       &quot;md5&quot;:&quot;&quot;,       &quot;url&quot;:&quot;<a href="http://xxxx%5C%22,%5C%22timeout%5C">http://xxxx\&quot;,\&quot;timeout\</a>&quot;: 1000   },    {       &quot;name&quot;:&quot;app02&quot;,       &quot;version&quot;:&quot;1.1&quot;,       &quot;size&quot;:10,&quot;archiveType&quot;:&quot;zip&quot;,       &quot;md5&quot;:&quot;xxxx&quot;,       &quot;url&quot;:&quot;<a href="http://xxxxxx%5C%22,%5C%22timeout%5C">http://xxxxxx\&quot;,\&quot;timeout\</a>&quot;: 1000   }]</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The push policy in the canary release environment. The value must be a JSON string. You can specify multiple push policies. By default, all data files are pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;: &quot;ScheduleToRegionId&quot;,  &quot;parameters&quot;:{      &quot;operator&quot;: &quot;In&quot;,       &quot;values&quot;: [&quot;cn-chegndu-telecom-4&quot;, &quot;cn-shanghai-cmcc-4&quot;]  }}</p>
         */
        public Builder pushStrategy(String pushStrategy) {
            this.putQueryParameter("PushStrategy", pushStrategy);
            this.pushStrategy = pushStrategy;
            return this;
        }

        /**
         * <p>This parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public PushApplicationDataRequest build() {
            return new PushApplicationDataRequest(this);
        } 

    } 

}
