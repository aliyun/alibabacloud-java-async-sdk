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

    @com.aliyun.core.annotation.Body
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
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GetEmonMonitorDataRequest build() {
            return new GetEmonMonitorDataRequest(this);
        } 

    } 

}
