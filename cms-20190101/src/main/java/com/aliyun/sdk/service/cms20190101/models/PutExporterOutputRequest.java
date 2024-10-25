// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutExporterOutputRequest} extends {@link RequestModel}
 *
 * <p>PutExporterOutputRequest</p>
 */
public class PutExporterOutputRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestType")
    private String destType;

    private PutExporterOutputRequest(Builder builder) {
        super(builder);
        this.configJson = builder.configJson;
        this.desc = builder.desc;
        this.destName = builder.destName;
        this.destType = builder.destType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutExporterOutputRequest create() {
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
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return destName
     */
    public String getDestName() {
        return this.destName;
    }

    /**
     * @return destType
     */
    public String getDestType() {
        return this.destType;
    }

    public static final class Builder extends Request.Builder<PutExporterOutputRequest, Builder> {
        private String configJson; 
        private String desc; 
        private String destName; 
        private String destType; 

        private Builder() {
            super();
        } 

        private Builder(PutExporterOutputRequest request) {
            super(request);
            this.configJson = request.configJson;
            this.desc = request.desc;
            this.destName = request.destName;
            this.destType = request.destType;
        } 

        /**
         * <p>The configuration set for exporting monitoring data. It is a JSON object string. The string must include the following fields:</p>
         * <ul>
         * <li>endpoint: the endpoint of Log Service.</li>
         * <li>project: the Log Service project to which monitoring data is exported.</li>
         * <li>logstore: the Log Service Logstore to which the monitoring data is exported.</li>
         * <li>ak: the AccessKey ID.</li>
         * <li>as: the AccessKey secret.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;endpoint&quot;: &quot;<a href="http://cn-qingdao-share.log.aliyuncs.com">http://cn-qingdao-share.log.aliyuncs.com</a>&quot;, &quot;project&quot;: &quot;exporter&quot;, &quot;logstore&quot;: &quot;exporter&quot;,&quot;ak&quot;: &quot;LTAIp*******&quot;, &quot;userId&quot;: &quot;17754********&quot;, &quot;as&quot;: &quot;TxHwuJ8yAb3AU******&quot;}</p>
         */
        public Builder configJson(String configJson) {
            this.putQueryParameter("ConfigJson", configJson);
            this.configJson = configJson;
            return this;
        }

        /**
         * <p>The description of the configuration set.</p>
         * 
         * <strong>example:</strong>
         * <p>Export CPU metrics</p>
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * <p>The name of the configuration set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exporterConfig</p>
         */
        public Builder destName(String destName) {
            this.putQueryParameter("DestName", destName);
            this.destName = destName;
            return this;
        }

        /**
         * <p>The service to which the monitoring data is exported.</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        public Builder destType(String destType) {
            this.putQueryParameter("DestType", destType);
            this.destType = destType;
            return this;
        }

        @Override
        public PutExporterOutputRequest build() {
            return new PutExporterOutputRequest(this);
        } 

    } 

}
