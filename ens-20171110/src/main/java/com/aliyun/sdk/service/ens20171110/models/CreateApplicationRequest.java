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
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
    private String template;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.template = builder.template;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String template; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.template = request.template;
            this.timeout = request.timeout;
        } 

        /**
         * <p>The edge application template. The value must be a JSON string that contains the following information:</p>
         * <ul>
         * <li>Basic information such as the name of the application</li>
         * <li>Information such as resource specifications and network security configurations</li>
         * <li>Service specifications</li>
         * <li>Required resources</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appMetaData&quot;:{        &quot;appName&quot;:&quot;nginx&quot;,        &quot;clusterName&quot;:&quot;poc&quot;,        &quot;appType&quot;:&quot;Common&quot;,        &quot;description&quot;:&quot;test&quot;    },    &quot;resourceAttribute&quot;:{        &quot;resourceType&quot;:&quot;&quot;,        &quot;instanceSpec&quot;:&quot;ens.sn1.tiny&quot;,        &quot;systemDiskSize&quot;:20,        &quot;dataDiskSize&quot;:0,        &quot;bandwithOut&quot;:10,        &quot;areaLevel&quot;:&quot;National&quot;,        &quot;netSecurityStrategy&quot;:null,        &quot;initConfig&quot;:null    },    &quot;resourceSelector&quot;:[        {            &quot;count&quot;:1        }    ],    &quot;workload&quot;:[        {            &quot;podCount&quot;:1,            &quot;serviceConfig&quot;:null,            &quot;name&quot;:&quot;nginx&quot;,            &quot;podSpec&quot;:{                &quot;containers&quot;:[                    {                        &quot;name&quot;:&quot;android&quot;,                        &quot;image&quot;:&quot;edge-registry.alicdn.com/test/nginx&quot;                    }                ]            },            &quot;count&quot;:1        }    ]}</p>
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        /**
         * <p>The timeout period for asynchronous processing. Unit: seconds. Default value: 1800.</p>
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
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

}
