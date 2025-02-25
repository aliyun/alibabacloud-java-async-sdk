// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetTraceAppConfigRequest} extends {@link RequestModel}
 *
 * <p>GetTraceAppConfigRequest</p>
 */
public class GetTraceAppConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    private GetTraceAppConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pid = builder.pid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceAppConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    public static final class Builder extends Request.Builder<GetTraceAppConfigRequest, Builder> {
        private String regionId; 
        private String pid; 

        private Builder() {
            super();
        } 

        private Builder(GetTraceAppConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pid = request.pid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The process ID (PID) of the application.</p>
         * <p>You can use one of the following methods to obtain the PID:</p>
         * <ul>
         * <li>API: Call the <a href="https://help.aliyun.com/document_detail/2588008.html">ListTraceApps</a> operation</li>
         * <li>Console: Log on to the Application Real-Time Monitoring Service (ARMS) console. In the left-side navigation pane, choose <strong>Application Monitoring</strong> &gt; <strong>Application List</strong>. On the Application List page, click the name of your application. The URL in the address bar contains the PID of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with an at sign (@) to obtain xxx@74xxx.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>To obtain the PID in the console, your application must be monitored by Application Monitoring rather than Managed Service for OpenTelemetry.</p>
         * </li>
         * <li><p>The GetTraceAppConfig operation can query only the custom settings of applications that are monitored by Application Monitoring.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2n80plglh@745eddxxx</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        @Override
        public GetTraceAppConfigRequest build() {
            return new GetTraceAppConfigRequest(this);
        } 

    } 

}
