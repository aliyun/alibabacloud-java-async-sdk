// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the policy task.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> operation to obtain the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10585</p>
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
