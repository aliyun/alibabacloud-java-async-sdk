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
 * {@link GetAutoResourceOptimizeRulesRequest} extends {@link RequestModel}
 *
 * <p>GetAutoResourceOptimizeRulesRequest</p>
 */
public class GetAutoResourceOptimizeRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    private GetAutoResourceOptimizeRulesRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoResourceOptimizeRulesRequest create() {
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

    public static final class Builder extends Request.Builder<GetAutoResourceOptimizeRulesRequest, Builder> {
        private String consoleContext; 
        private String instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(GetAutoResourceOptimizeRulesRequest request) {
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
         * <p>The database instance IDs.</p>
         * <ul>
         * <li><p>Specify the parameter value as a JSON array, such as <code>[\&quot;Database account 1\&quot;,\&quot;Database account 2\&quot;]</code>. Separate database instance IDs with commas (,).</p>
         * </li>
         * <li><p>By default, if you leave this parameter empty, all database instances for which the automatic fragment recycling feature has been enabled within the current Alibaba Cloud account are returned. The following types of database instances are returned:</p>
         * <ul>
         * <li>Database instances for which the automatic fragment recycling feature is currently enabled.</li>
         * <li>Database instances for which the automatic fragment recycling feature was once enabled but is currently disabled, including those for which DAS Enterprise Edition has been disabled but excluding those that have been released.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;rm-2ze8g2am97624****&quot;,&quot;rm-2vc54m2a6pd6p****&quot;,&quot;rm-2ze9xrhze0709****&quot;,&quot;rm-2ze8g2am97627****&quot;]</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public GetAutoResourceOptimizeRulesRequest build() {
            return new GetAutoResourceOptimizeRulesRequest(this);
        } 

    } 

}
