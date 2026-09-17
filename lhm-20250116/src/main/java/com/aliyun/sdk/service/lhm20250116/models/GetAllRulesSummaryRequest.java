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
 * {@link GetAllRulesSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetAllRulesSummaryRequest</p>
 */
public class GetAllRulesSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    private GetAllRulesSummaryRequest(Builder builder) {
        super(builder);
        this.source = builder.source;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllRulesSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<GetAllRulesSummaryRequest, Builder> {
        private String source; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(GetAllRulesSummaryRequest request) {
            super(request);
            this.source = request.source;
            this.target = request.target;
        } 

        /**
         * <p>The source dialect.</p>
         * 
         * <strong>example:</strong>
         * <p>postgresql</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The target dialect.</p>
         * 
         * <strong>example:</strong>
         * <p>hologres</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("target", target);
            this.target = target;
            return this;
        }

        @Override
        public GetAllRulesSummaryRequest build() {
            return new GetAllRulesSummaryRequest(this);
        } 

    } 

}
