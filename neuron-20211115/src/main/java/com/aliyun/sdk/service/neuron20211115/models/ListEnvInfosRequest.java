// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListEnvInfosRequest} extends {@link RequestModel}
 *
 * <p>ListEnvInfosRequest</p>
 */
public class ListEnvInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    private ListEnvInfosRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
        this.env = builder.env;
        this.pbcId = builder.pbcId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvInfosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<ListEnvInfosRequest, Builder> {
        private Long enterpriseId; 
        private String env; 
        private Long pbcId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvInfosRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
            this.env = request.env;
            this.pbcId = request.pbcId;
            this.region = request.region;
        } 

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * env.
         */
        public Builder env(String env) {
            this.putQueryParameter("env", env);
            this.env = env;
            return this;
        }

        /**
         * pbcId.
         */
        public Builder pbcId(Long pbcId) {
            this.putQueryParameter("pbcId", pbcId);
            this.pbcId = pbcId;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        @Override
        public ListEnvInfosRequest build() {
            return new ListEnvInfosRequest(this);
        } 

    } 

}
