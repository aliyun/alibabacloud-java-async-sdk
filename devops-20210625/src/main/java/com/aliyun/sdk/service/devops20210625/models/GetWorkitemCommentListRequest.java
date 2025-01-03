// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link GetWorkitemCommentListRequest} extends {@link RequestModel}
 *
 * <p>GetWorkitemCommentListRequest</p>
 */
public class GetWorkitemCommentListRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workitemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemId;

    private GetWorkitemCommentListRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.workitemId = builder.workitemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkitemCommentListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return workitemId
     */
    public String getWorkitemId() {
        return this.workitemId;
    }

    public static final class Builder extends Request.Builder<GetWorkitemCommentListRequest, Builder> {
        private String organizationId; 
        private String workitemId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkitemCommentListRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.workitemId = request.workitemId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce2xxxx21580baxxxx633f13</p>
         */
        public Builder workitemId(String workitemId) {
            this.putPathParameter("workitemId", workitemId);
            this.workitemId = workitemId;
            return this;
        }

        @Override
        public GetWorkitemCommentListRequest build() {
            return new GetWorkitemCommentListRequest(this);
        } 

    } 

}
