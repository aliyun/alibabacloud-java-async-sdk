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
 * {@link DescribeBotPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeBotPriceRequest</p>
 */
public class DescribeBotPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BotInstanceLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String botInstanceLevel;

    private DescribeBotPriceRequest(Builder builder) {
        super(builder);
        this.botInstanceLevel = builder.botInstanceLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBotPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return botInstanceLevel
     */
    public String getBotInstanceLevel() {
        return this.botInstanceLevel;
    }

    public static final class Builder extends Request.Builder<DescribeBotPriceRequest, Builder> {
        private String botInstanceLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBotPriceRequest request) {
            super(request);
            this.botInstanceLevel = request.botInstanceLevel;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enterprise_bot</p>
         */
        public Builder botInstanceLevel(String botInstanceLevel) {
            this.putQueryParameter("BotInstanceLevel", botInstanceLevel);
            this.botInstanceLevel = botInstanceLevel;
            return this;
        }

        @Override
        public DescribeBotPriceRequest build() {
            return new DescribeBotPriceRequest(this);
        } 

    } 

}
