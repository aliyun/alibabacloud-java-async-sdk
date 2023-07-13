// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutExporterOutputRequest} extends {@link RequestModel}
 *
 * <p>PutExporterOutputRequest</p>
 */
public class PutExporterOutputRequest extends Request {
    @Query
    @NameInMap("ConfigJson")
    @Validation(required = true)
    private String configJson;

    @Query
    @NameInMap("Desc")
    private String desc;

    @Query
    @NameInMap("DestName")
    @Validation(required = true)
    private String destName;

    @Query
    @NameInMap("DestType")
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
         * The configuration set for exporting monitoring data. It is a JSON object string. The string must include the following fields:
         * <p>
         * 
         * *   endpoint: the endpoint of Log Service.
         * *   project: the Log Service project to which monitoring data is exported.
         * *   logstore: the Log Service Logstore to which the monitoring data is exported.
         * *   ak: the AccessKey ID.
         * *   as: the AccessKey secret.
         */
        public Builder configJson(String configJson) {
            this.putQueryParameter("ConfigJson", configJson);
            this.configJson = configJson;
            return this;
        }

        /**
         * The description of the configuration set.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * The name of the configuration set.
         */
        public Builder destName(String destName) {
            this.putQueryParameter("DestName", destName);
            this.destName = destName;
            return this;
        }

        /**
         * The service to which the monitoring data is exported.
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
