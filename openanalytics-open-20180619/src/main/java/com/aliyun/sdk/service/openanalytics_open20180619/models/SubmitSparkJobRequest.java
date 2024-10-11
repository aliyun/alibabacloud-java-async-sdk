// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitSparkJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSparkJobRequest</p>
 */
public class SubmitSparkJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vcName;

    private SubmitSparkJobRequest(Builder builder) {
        super(builder);
        this.configJson = builder.configJson;
        this.vcName = builder.vcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSparkJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configJson
     */
    public String getConfigJson() {
        return this.configJson;
    }

    /**
     * @return vcName
     */
    public String getVcName() {
        return this.vcName;
    }

    public static final class Builder extends Request.Builder<SubmitSparkJobRequest, Builder> {
        private String configJson; 
        private String vcName; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSparkJobRequest request) {
            super(request);
            this.configJson = request.configJson;
            this.vcName = request.vcName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;name&quot;: &quot;SparkPi&quot;,     &quot;file&quot;: &quot;local:///tmp/spark-examples.jar&quot;,     &quot;className&quot;: &quot;org.apache.spark.examples.SparkPi&quot;,     &quot;args&quot;: [         &quot;100&quot;     ],     &quot;conf&quot;: {         &quot;spark.driver.resourceSpec&quot;: &quot;medium&quot;,         &quot;spark.executor.instances&quot;: 5,         &quot;spark.executor.resourceSpec&quot;: &quot;medium&quot;     } }</p>
         */
        public Builder configJson(String configJson) {
            this.putBodyParameter("ConfigJson", configJson);
            this.configJson = configJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyCluster</p>
         */
        public Builder vcName(String vcName) {
            this.putBodyParameter("VcName", vcName);
            this.vcName = vcName;
            return this;
        }

        @Override
        public SubmitSparkJobRequest build() {
            return new SubmitSparkJobRequest(this);
        } 

    } 

}
