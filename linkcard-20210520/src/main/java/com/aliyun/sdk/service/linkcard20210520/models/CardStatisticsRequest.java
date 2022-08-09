// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CardStatisticsRequest} extends {@link RequestModel}
 *
 * <p>CardStatisticsRequest</p>
 */
public class CardStatisticsRequest extends Request {
    private CardStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CardStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CardStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CardStatisticsRequest request) {
            super(request);
        } 

        @Override
        public CardStatisticsRequest build() {
            return new CardStatisticsRequest(this);
        } 

    } 

}
