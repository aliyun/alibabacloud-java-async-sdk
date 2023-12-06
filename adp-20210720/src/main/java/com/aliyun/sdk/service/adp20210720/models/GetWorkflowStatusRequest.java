// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkflowStatusRequest} extends {@link RequestModel}
 *
 * <p>GetWorkflowStatusRequest</p>
 */
public class GetWorkflowStatusRequest extends Request {
    @Query
    @NameInMap("workflowType")
    @Validation(required = true)
    private String workflowType;

    @Query
    @NameInMap("xuid")
    @Validation(required = true)
    private String xuid;

    private GetWorkflowStatusRequest(Builder builder) {
        super(builder);
        this.workflowType = builder.workflowType;
        this.xuid = builder.xuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workflowType
     */
    public String getWorkflowType() {
        return this.workflowType;
    }

    /**
     * @return xuid
     */
    public String getXuid() {
        return this.xuid;
    }

    public static final class Builder extends Request.Builder<GetWorkflowStatusRequest, Builder> {
        private String workflowType; 
        private String xuid; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkflowStatusRequest request) {
            super(request);
            this.workflowType = request.workflowType;
            this.xuid = request.xuid;
        } 

        /**
         * workflowType.
         */
        public Builder workflowType(String workflowType) {
            this.putQueryParameter("workflowType", workflowType);
            this.workflowType = workflowType;
            return this;
        }

        /**
         * xuid.
         */
        public Builder xuid(String xuid) {
            this.putQueryParameter("xuid", xuid);
            this.xuid = xuid;
            return this;
        }

        @Override
        public GetWorkflowStatusRequest build() {
            return new GetWorkflowStatusRequest(this);
        } 

    } 

}
