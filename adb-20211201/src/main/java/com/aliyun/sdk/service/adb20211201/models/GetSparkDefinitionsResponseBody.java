// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSparkDefinitionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkDefinitionsResponseBody</p>
 */
public class GetSparkDefinitionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSparkDefinitionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkDefinitionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * <p>The common definitions of Spark applications.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SQLTemplateExample&quot;: &quot;-- Here is just an example of SparkSQL. Modify the content and run your spark program.
         * conf spark.driver.resourceSpec=medium;
         * conf spark.executor.instances=2;
         * conf spark.executor.resourceSpec=medium;
         * conf spark.app.name=Spark SQL Test;
         * conf spark.adb.connectors=oss;</p>
         * <p>-- Here are your sql statements
         * show databases;&quot;,
         *                  &quot;BatchTemplateExample&quot;: &quot;{
         *     &quot;comments&quot;: [
         *         &quot;-- Here is just an example of SparkPi. Modify the content and run your spark program.&quot;
         *     ],
         *     &quot;args&quot;: [&quot;1000&quot;],
         *   &quot;file&quot;:&quot;local:///tmp/spark-examples.jar&quot;,
         *     &quot;name&quot;: &quot;SparkPi&quot;,
         *     &quot;className&quot;: &quot;org.apache.spark.examples.SparkPi&quot;,
         *     &quot;conf&quot;: {      &quot;spark.driver.resourceSpec&quot;: &quot;medium&quot;,
         *         &quot;spark.executor.instances&quot;: 2,
         *         &quot;spark.executor.resourceSpec&quot;: &quot;medium&quot;
         *     }
         * }&quot;</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkDefinitionsResponseBody build() {
            return new GetSparkDefinitionsResponseBody(this);
        } 

    } 

}
