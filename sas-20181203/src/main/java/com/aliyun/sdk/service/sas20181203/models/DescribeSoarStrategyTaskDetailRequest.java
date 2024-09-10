// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarStrategyTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeSoarStrategyTaskDetailRequest</p>
 */
public class DescribeSoarStrategyTaskDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyTaskId;

    private DescribeSoarStrategyTaskDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.strategyTaskId = builder.strategyTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarStrategyTaskDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return strategyTaskId
     */
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

    public static final class Builder extends Request.Builder<DescribeSoarStrategyTaskDetailRequest, Builder> {
        private String lang; 
        private Long strategyTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSoarStrategyTaskDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.strategyTaskId = request.strategyTaskId;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the policy task.
         * <p>
         * 
         * >  You can call the [DescribeSoarStrategyTasks](~~DescribeSoarStrategyTasks~~) operation to obtain the ID.
         */
        public Builder strategyTaskId(Long strategyTaskId) {
            this.putQueryParameter("StrategyTaskId", strategyTaskId);
            this.strategyTaskId = strategyTaskId;
            return this;
        }

        @Override
        public DescribeSoarStrategyTaskDetailRequest build() {
            return new DescribeSoarStrategyTaskDetailRequest(this);
        } 

    } 

}
