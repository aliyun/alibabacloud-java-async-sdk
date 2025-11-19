// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link DescribeCorePackageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCorePackageListRequest</p>
 */
public class DescribeCorePackageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDeductionInstances")
    private Boolean queryDeductionInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryScenario")
    private String queryScenario;

    private DescribeCorePackageListRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.queryDeductionInstances = builder.queryDeductionInstances;
        this.queryScenario = builder.queryScenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCorePackageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return queryDeductionInstances
     */
    public Boolean getQueryDeductionInstances() {
        return this.queryDeductionInstances;
    }

    /**
     * @return queryScenario
     */
    public String getQueryScenario() {
        return this.queryScenario;
    }

    public static final class Builder extends Request.Builder<DescribeCorePackageListRequest, Builder> {
        private String apiKey; 
        private Boolean queryDeductionInstances; 
        private String queryScenario; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCorePackageListRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.queryDeductionInstances = request.queryDeductionInstances;
            this.queryScenario = request.queryScenario;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * QueryDeductionInstances.
         */
        public Builder queryDeductionInstances(Boolean queryDeductionInstances) {
            this.putQueryParameter("QueryDeductionInstances", queryDeductionInstances);
            this.queryDeductionInstances = queryDeductionInstances;
            return this;
        }

        /**
         * QueryScenario.
         */
        public Builder queryScenario(String queryScenario) {
            this.putQueryParameter("QueryScenario", queryScenario);
            this.queryScenario = queryScenario;
            return this;
        }

        @Override
        public DescribeCorePackageListRequest build() {
            return new DescribeCorePackageListRequest(this);
        } 

    } 

}
