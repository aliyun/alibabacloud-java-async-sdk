// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationRequest</p>
 */
public class DescribeApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("AppVersions")
    private String appVersions;

    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("OutDetailStatParams")
    private String outDetailStatParams;

    private DescribeApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appVersions = builder.appVersions;
        this.level = builder.level;
        this.outDetailStatParams = builder.outDetailStatParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationRequest create() {
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
     * @return appVersions
     */
    public String getAppVersions() {
        return this.appVersions;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return outDetailStatParams
     */
    public String getOutDetailStatParams() {
        return this.outDetailStatParams;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationRequest, Builder> {
        private String appId; 
        private String appVersions; 
        private String level; 
        private String outDetailStatParams; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationRequest response) {
            super(response);
            this.appId = response.appId;
            this.appVersions = response.appVersions;
            this.level = response.level;
            this.outDetailStatParams = response.outDetailStatParams;
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
         * AppVersions.
         */
        public Builder appVersions(String appVersions) {
            this.putQueryParameter("AppVersions", appVersions);
            this.appVersions = appVersions;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * OutDetailStatParams.
         */
        public Builder outDetailStatParams(String outDetailStatParams) {
            this.putQueryParameter("OutDetailStatParams", outDetailStatParams);
            this.outDetailStatParams = outDetailStatParams;
            return this;
        }

        @Override
        public DescribeApplicationRequest build() {
            return new DescribeApplicationRequest(this);
        } 

    } 

}
