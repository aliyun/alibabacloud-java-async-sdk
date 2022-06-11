// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEmonMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>GetEmonMonitorDataRequest</p>
 */
public class GetEmonMonitorDataRequest extends Request {
    @Path
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("body")
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
         * ProjectId.
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
