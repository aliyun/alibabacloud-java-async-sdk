// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link AlterSearchLibRequest} extends {@link RequestModel}
 *
 * <p>AlterSearchLibRequest</p>
 */
public class AlterSearchLibRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibConfig")
    private String searchLibConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String searchLibName;

    private AlterSearchLibRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.searchLibConfig = builder.searchLibConfig;
        this.searchLibName = builder.searchLibName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterSearchLibRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchLibConfig
     */
    public String getSearchLibConfig() {
        return this.searchLibConfig;
    }

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder extends Request.Builder<AlterSearchLibRequest, Builder> {
        private String regionId; 
        private String searchLibConfig; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(AlterSearchLibRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.searchLibConfig = request.searchLibConfig;
            this.searchLibName = request.searchLibName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SearchLibConfig.
         */
        public Builder searchLibConfig(String searchLibConfig) {
            this.putQueryParameter("SearchLibConfig", searchLibConfig);
            this.searchLibConfig = searchLibConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
            return this;
        }

        @Override
        public AlterSearchLibRequest build() {
            return new AlterSearchLibRequest(this);
        } 

    } 

}
