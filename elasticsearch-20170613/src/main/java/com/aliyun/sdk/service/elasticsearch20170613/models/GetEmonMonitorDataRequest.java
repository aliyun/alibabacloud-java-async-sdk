// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link GetEmonMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>GetEmonMonitorDataRequest</p>
 */
public class GetEmonMonitorDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private GetEmonMonitorDataRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEmonMonitorDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetEmonMonitorDataRequest, Builder> {
        private String projectId; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(GetEmonMonitorDataRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.body = request.body;
        } 

        /**
         * <p>The project ID. The format is <code>es-current account ID</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-185320276651****</p>
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The Grafana metric monitoring query conditions, including the query start time, metric expression, and metric query list.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;start&quot;:1522127381471,&quot;queries&quot;:[{&quot;metric&quot;:&quot;elasticbuild.elasticsearch.source.total_doc_count&quot;,&quot;aggregator&quot;:&quot;sum&quot;,&quot;downsample&quot;:&quot;avg&quot;,&quot;tags&quot;:{&quot;taskName&quot;:&quot;et-testtsk&quot;,&quot;userId&quot;:&quot;123456&quot;},&quot;granularity&quot;:&quot;1m&quot;}],&quot;limit&quot;:&quot;&quot;,&quot;end&quot;:1522129151000}</p>
         */
        public Builder body(String body) {
            this.putQueryParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GetEmonMonitorDataRequest build() {
            return new GetEmonMonitorDataRequest(this);
        } 

    } 

}
