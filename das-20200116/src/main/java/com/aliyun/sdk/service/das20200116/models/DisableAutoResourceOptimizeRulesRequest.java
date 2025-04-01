// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DisableAutoResourceOptimizeRulesRequest} extends {@link RequestModel}
 *
 * <p>DisableAutoResourceOptimizeRulesRequest</p>
 */
public class DisableAutoResourceOptimizeRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    private DisableAutoResourceOptimizeRulesRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAutoResourceOptimizeRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<DisableAutoResourceOptimizeRulesRequest, Builder> {
        private String consoleContext; 
        private String instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DisableAutoResourceOptimizeRulesRequest request) {
            super(request);
            this.consoleContext = request.consoleContext;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * <p>The database instance ID.</p>
         * <blockquote>
         * <p> Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: <code>[\&quot;Instance ID1\&quot;, \&quot;Instance ID2\&quot;]</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;rm-2ze8g2am97624****&quot;,&quot;rm-2ze9xrhze0709****&quot;]</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public DisableAutoResourceOptimizeRulesRequest build() {
            return new DisableAutoResourceOptimizeRulesRequest(this);
        } 

    } 

}
