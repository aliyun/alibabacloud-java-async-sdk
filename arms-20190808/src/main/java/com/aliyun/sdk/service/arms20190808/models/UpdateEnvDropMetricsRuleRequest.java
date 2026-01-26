// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdateEnvDropMetricsRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvDropMetricsRuleRequest</p>
 */
public class UpdateEnvDropMetricsRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DropMetrics")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dropMetrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateEnvDropMetricsRuleRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.dropMetrics = builder.dropMetrics;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvDropMetricsRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return dropMetrics
     */
    public String getDropMetrics() {
        return this.dropMetrics;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateEnvDropMetricsRuleRequest, Builder> {
        private String aliyunLang; 
        private String dropMetrics; 
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvDropMetricsRuleRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.dropMetrics = request.dropMetrics;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li>zh (default)</li>
         * <li>en</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>The metric to be discarded. Separate multiple metrics with line feeds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>metric_1
         * metric_2
         * metric_3</p>
         */
        public Builder dropMetrics(String dropMetrics) {
            this.putBodyParameter("DropMetrics", dropMetrics);
            this.dropMetrics = dropMetrics;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateEnvDropMetricsRuleRequest build() {
            return new UpdateEnvDropMetricsRuleRequest(this);
        } 

    } 

}
