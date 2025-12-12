// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetKyuubiServiceRequest} extends {@link RequestModel}
 *
 * <p>GetKyuubiServiceRequest</p>
 */
public class GetKyuubiServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("kyuubiServiceId")
    private String kyuubiServiceId;

    private GetKyuubiServiceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.kyuubiServiceId = builder.kyuubiServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKyuubiServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return kyuubiServiceId
     */
    public String getKyuubiServiceId() {
        return this.kyuubiServiceId;
    }

    public static final class Builder extends Request.Builder<GetKyuubiServiceRequest, Builder> {
        private String workspaceId; 
        private String kyuubiServiceId; 

        private Builder() {
            super();
        } 

        private Builder(GetKyuubiServiceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.kyuubiServiceId = request.kyuubiServiceId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * kyuubiServiceId.
         */
        public Builder kyuubiServiceId(String kyuubiServiceId) {
            this.putPathParameter("kyuubiServiceId", kyuubiServiceId);
            this.kyuubiServiceId = kyuubiServiceId;
            return this;
        }

        @Override
        public GetKyuubiServiceRequest build() {
            return new GetKyuubiServiceRequest(this);
        } 

    } 

}
