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
 * {@link GetPdpHistoryConfigRequest} extends {@link RequestModel}
 *
 * <p>GetPdpHistoryConfigRequest</p>
 */
public class GetPdpHistoryConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("historyConfigId")
    private Long historyConfigId;

    private GetPdpHistoryConfigRequest(Builder builder) {
        super(builder);
        this.historyConfigId = builder.historyConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPdpHistoryConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return historyConfigId
     */
    public Long getHistoryConfigId() {
        return this.historyConfigId;
    }

    public static final class Builder extends Request.Builder<GetPdpHistoryConfigRequest, Builder> {
        private Long historyConfigId; 

        private Builder() {
            super();
        } 

        private Builder(GetPdpHistoryConfigRequest request) {
            super(request);
            this.historyConfigId = request.historyConfigId;
        } 

        /**
         * historyConfigId.
         */
        public Builder historyConfigId(Long historyConfigId) {
            this.putPathParameter("historyConfigId", historyConfigId);
            this.historyConfigId = historyConfigId;
            return this;
        }

        @Override
        public GetPdpHistoryConfigRequest build() {
            return new GetPdpHistoryConfigRequest(this);
        } 

    } 

}
