// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectRequest} extends {@link RequestModel}
 *
 * <p>DescribeProjectRequest</p>
 */
public class DescribeProjectRequest extends Request {
    @Path
    @NameInMap("code")
    @Validation(required = true)
    private Long code;

    @Query
    @NameInMap("workspaceId")
    @Validation(required = true)
    private String workspaceId;

    private DescribeProjectRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeProjectRequest, Builder> {
        private Long code; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProjectRequest request) {
            super(request);
            this.code = request.code;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * code.
         */
        public Builder code(Long code) {
            this.putPathParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DescribeProjectRequest build() {
            return new DescribeProjectRequest(this);
        } 

    } 

}
