// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCdnConditionIPBInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnConditionIPBInfoRequest</p>
 */
public class DescribeCdnConditionIPBInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    private DescribeCdnConditionIPBInfoRequest(Builder builder) {
        super(builder);
        this.dataId = builder.dataId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnConditionIPBInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    public static final class Builder extends Request.Builder<DescribeCdnConditionIPBInfoRequest, Builder> {
        private String dataId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnConditionIPBInfoRequest request) {
            super(request);
            this.dataId = request.dataId;
        } 

        /**
         * <p>The configuration ID. Valid values:</p>
         * <ul>
         * <li>condition_region_config_cn</li>
         * <li>condition_region_config_en</li>
         * <li>condition_isp_config_cn</li>
         * <li>condition_isp_config_en</li>
         * <li>condition_country_config_cn</li>
         * <li>condition_country_config_en</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>condition_region_config_cn</p>
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        @Override
        public DescribeCdnConditionIPBInfoRequest build() {
            return new DescribeCdnConditionIPBInfoRequest(this);
        } 

    } 

}
