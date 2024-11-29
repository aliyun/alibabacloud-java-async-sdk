// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAutoThrottleRulesRequest} extends {@link RequestModel}
 *
 * <p>GetAutoThrottleRulesRequest</p>
 */
public class GetAutoThrottleRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    private GetAutoThrottleRulesRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoThrottleRulesRequest create() {
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

    public static final class Builder extends Request.Builder<GetAutoThrottleRulesRequest, Builder> {
        private String consoleContext; 
        private String instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(GetAutoThrottleRulesRequest request) {
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
         * <li><p>Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: <code>[\&quot;Instance ID1\&quot;,\&quot;Instance ID2\&quot;]</code>.</p>
         * </li>
         * <li><p>By default, if you leave this parameter empty, all database instances for which the automatic SQL throttling feature has been enabled within the current Alibaba Cloud account are returned. The following types of database instances are returned:</p>
         * <ul>
         * <li>Database instances for which the automatic SQL throttling feature is currently enabled.</li>
         * <li>Database instances for which the automatic SQL throttling feature was once enabled but is currently disabled. Released database instances are not included.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;rm-2ze8g2am97624****&quot;,&quot;rm-2vc54m2a6pd6p****&quot;,&quot;rm-2ze9xrhze0709****&quot;]</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public GetAutoThrottleRulesRequest build() {
            return new GetAutoThrottleRulesRequest(this);
        } 

    } 

}
