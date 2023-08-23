// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnConditionIPBInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnConditionIPBInfoRequest</p>
 */
public class DescribeCdnConditionIPBInfoRequest extends Request {
    @Query
    @NameInMap("DataId")
    @Validation(required = true)
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
         * DataId.
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
