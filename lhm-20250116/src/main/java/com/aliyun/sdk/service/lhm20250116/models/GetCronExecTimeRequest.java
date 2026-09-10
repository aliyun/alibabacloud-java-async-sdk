// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetCronExecTimeRequest} extends {@link RequestModel}
 *
 * <p>GetCronExecTimeRequest</p>
 */
public class GetCronExecTimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cronRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cronRule;

    private GetCronExecTimeRequest(Builder builder) {
        super(builder);
        this.cronRule = builder.cronRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCronExecTimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cronRule
     */
    public String getCronRule() {
        return this.cronRule;
    }

    public static final class Builder extends Request.Builder<GetCronExecTimeRequest, Builder> {
        private String cronRule; 

        private Builder() {
            super();
        } 

        private Builder(GetCronExecTimeRequest request) {
            super(request);
            this.cronRule = request.cronRule;
        } 

        /**
         * <p>The Cron expression. Replace spaces with plus signs <code>+</code> when passing the expression as a query parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0+0+0+<em>+</em>+?</p>
         */
        public Builder cronRule(String cronRule) {
            this.putQueryParameter("cronRule", cronRule);
            this.cronRule = cronRule;
            return this;
        }

        @Override
        public GetCronExecTimeRequest build() {
            return new GetCronExecTimeRequest(this);
        } 

    } 

}
