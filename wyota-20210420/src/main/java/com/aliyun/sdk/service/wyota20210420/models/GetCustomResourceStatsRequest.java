// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link GetCustomResourceStatsRequest} extends {@link RequestModel}
 *
 * <p>GetCustomResourceStatsRequest</p>
 */
public class GetCustomResourceStatsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MainBizType")
    private String mainBizType;

    private GetCustomResourceStatsRequest(Builder builder) {
        super(builder);
        this.mainBizType = builder.mainBizType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomResourceStatsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mainBizType
     */
    public String getMainBizType() {
        return this.mainBizType;
    }

    public static final class Builder extends Request.Builder<GetCustomResourceStatsRequest, Builder> {
        private String mainBizType; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomResourceStatsRequest request) {
            super(request);
            this.mainBizType = request.mainBizType;
        } 

        /**
         * MainBizType.
         */
        public Builder mainBizType(String mainBizType) {
            this.putBodyParameter("MainBizType", mainBizType);
            this.mainBizType = mainBizType;
            return this;
        }

        @Override
        public GetCustomResourceStatsRequest build() {
            return new GetCustomResourceStatsRequest(this);
        } 

    } 

}
