// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeConditionIPBInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeConditionIPBInfoRequest</p>
 */
public class DescribeConditionIPBInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    private DescribeConditionIPBInfoRequest(Builder builder) {
        super(builder);
        this.dataId = builder.dataId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConditionIPBInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeConditionIPBInfoRequest, Builder> {
        private String dataId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConditionIPBInfoRequest request) {
            super(request);
            this.dataId = request.dataId;
        } 

        /**
         * <p>The configuration ID. Valid values:</p>
         * <ul>
         * <li>condition_region_config_cn: provides a mapping list of region Chinese names and their corresponding codes.</li>
         * <li>condition_region_config_en: provides a mapping list of region English names and their corresponding codes.</li>
         * <li>condition_isp_config_cn: provides a mapping list of ISP Chinese names and their corresponding codes.</li>
         * <li>condition_isp_config_en: provides a mapping list of ISP English names and their corresponding codes.</li>
         * <li>condition_country_config_cn: provides a mapping list of country Chinese names and their corresponding codes.</li>
         * <li>condition_country_config_en: provides a mapping list of country English names and their corresponding codes.</li>
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
        public DescribeConditionIPBInfoRequest build() {
            return new DescribeConditionIPBInfoRequest(this);
        } 

    } 

}
