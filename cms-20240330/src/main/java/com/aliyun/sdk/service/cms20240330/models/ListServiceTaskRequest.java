// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListServiceTaskRequest} extends {@link RequestModel}
 *
 * <p>ListServiceTaskRequest</p>
 */
public class ListServiceTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("searchCondition")
    private String searchCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListServiceTaskRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.serviceId = builder.serviceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchCondition = builder.searchCondition;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return searchCondition
     */
    public String getSearchCondition() {
        return this.searchCondition;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListServiceTaskRequest, Builder> {
        private String workspace; 
        private String serviceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String searchCondition; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceTaskRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.serviceId = request.serviceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.searchCondition = request.searchCondition;
            this.type = request.type;
        } 

        /**
         * <p>The workspace name. Example: default-cms-<uid>-<region>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1672753017899339-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>The application or service ID (pid).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ggxw4lnjuz@f2fd3a6265a254a052afb</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Valid values: 0 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Pass the nextToken value from the previous response as-is. This parameter is not required for the first request. The server returns an encrypted hexadecimal string (internal format: {md5}#{dbId}) with a maximum length of 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>d23d8f3f0f0cd1984566b1986c9343122fa0385a05c09694c17fe87709f3eb56d1a7ead56b4a2536</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The search condition. A JSON string with a maximum length of 1024 characters. For heapdump, this can be used to filter by IP address or other conditions. Example for pprof: {&quot;ip&quot;:&quot;10.0.0.1&quot;,&quot;start&quot;:1711843200000,&quot;end&quot;:1711846800000,&quot;profileType&quot;:1}.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ip&quot;:&quot;10.0.0.1&quot;}</p>
         */
        public Builder searchCondition(String searchCondition) {
            this.putQueryParameter("searchCondition", searchCondition);
            this.searchCondition = searchCondition;
            return this;
        }

        /**
         * <p>The task type. Valid values: heapdump (heap dump). LiveDebug Probe: live_debug_log_probe, live_debug_snapshot_probe, live_debug_metric_probe, live_debug_span_probe, live_debug_span_tag_probe. LiveDebug Command: live_debug_inspect_object, live_debug_search_type, live_debug_search_method, live_debug_decompile, live_debug_get_thread_info, live_debug_get_runtime_info, live_debug_get_memory_info, live_debug_evaluate_expression, live_debug_modify_logger_level. LiveDebug hot code replacement: live_debug_code_replace. The list operation additionally supports pprof.</p>
         * 
         * <strong>example:</strong>
         * <p>live_debug_log_probe</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListServiceTaskRequest build() {
            return new ListServiceTaskRequest(this);
        } 

    } 

}
