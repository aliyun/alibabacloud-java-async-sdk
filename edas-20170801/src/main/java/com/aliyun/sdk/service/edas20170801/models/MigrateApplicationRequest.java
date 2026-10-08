// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link MigrateApplicationRequest} extends {@link RequestModel}
 *
 * <p>MigrateApplicationRequest</p>
 */
public class MigrateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appIds")
    private java.util.List<String> appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cmd")
    private String cmd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rawData")
    private String rawData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private MigrateApplicationRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.cmd = builder.cmd;
        this.config = builder.config;
        this.rawData = builder.rawData;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    /**
     * @return cmd
     */
    public String getCmd() {
        return this.cmd;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return rawData
     */
    public String getRawData() {
        return this.rawData;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<MigrateApplicationRequest, Builder> {
        private java.util.List<String> appIds; 
        private String cmd; 
        private String config; 
        private String rawData; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateApplicationRequest request) {
            super(request);
            this.appIds = request.appIds;
            this.cmd = request.cmd;
            this.config = request.config;
            this.rawData = request.rawData;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The list of application IDs.</p>
         */
        public Builder appIds(java.util.List<String> appIds) {
            this.putQueryParameter("appIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * <p>The operation command. Valid values:</p>
         * <ul>
         * <li>export: Export.</li>
         * <li>import: Import.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>export</p>
         */
        public Builder cmd(String cmd) {
            this.putQueryParameter("cmd", cmd);
            this.cmd = cmd;
            return this;
        }

        /**
         * <p>Specifies whether to export the application binary. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>{withBinary:true}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The raw data for the application to be imported, which is sourced from the JSON file of the exported application.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;job_id&quot;:&quot;b72c0ed4-a69f-4872-b4c6-def5555bfd3e&quot;,&quot;app_info&quot;:&quot;xxxx&quot;</p>
         */
        public Builder rawData(String rawData) {
            this.putQueryParameter("rawData", rawData);
            this.rawData = rawData;
            return this;
        }

        /**
         * <p>regionId</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public MigrateApplicationRequest build() {
            return new MigrateApplicationRequest(this);
        } 

    } 

}
