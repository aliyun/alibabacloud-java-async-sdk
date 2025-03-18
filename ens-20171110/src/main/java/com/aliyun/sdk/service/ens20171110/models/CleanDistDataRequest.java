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
 * {@link CleanDistDataRequest} extends {@link RequestModel}
 *
 * <p>CleanDistDataRequest</p>
 */
public class CleanDistDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataName")
    private String dataName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataVersion")
    private String dataVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    private CleanDistDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataName = builder.dataName;
        this.dataVersion = builder.dataVersion;
        this.ensRegionId = builder.ensRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CleanDistDataRequest create() {
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
     * @return dataName
     */
    public String getDataName() {
        return this.dataName;
    }

    /**
     * @return dataVersion
     */
    public String getDataVersion() {
        return this.dataVersion;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public static final class Builder extends Request.Builder<CleanDistDataRequest, Builder> {
        private String appId; 
        private String dataName; 
        private String dataVersion; 
        private String ensRegionId; 

        private Builder() {
            super();
        } 

        private Builder(CleanDistDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataName = request.dataName;
            this.dataVersion = request.dataVersion;
            this.ensRegionId = request.ensRegionId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DataName.
         */
        public Builder dataName(String dataName) {
            this.putQueryParameter("DataName", dataName);
            this.dataName = dataName;
            return this;
        }

        /**
         * DataVersion.
         */
        public Builder dataVersion(String dataVersion) {
            this.putQueryParameter("DataVersion", dataVersion);
            this.dataVersion = dataVersion;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        @Override
        public CleanDistDataRequest build() {
            return new CleanDistDataRequest(this);
        } 

    } 

}
