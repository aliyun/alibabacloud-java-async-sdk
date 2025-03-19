// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>GetEnvironmentRequest</p>
 */
public class GetEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("environmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withStatistics")
    private Boolean withStatistics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withVpcInfo")
    private Boolean withVpcInfo;

    private GetEnvironmentRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
        this.withStatistics = builder.withStatistics;
        this.withVpcInfo = builder.withVpcInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return withStatistics
     */
    public Boolean getWithStatistics() {
        return this.withStatistics;
    }

    /**
     * @return withVpcInfo
     */
    public Boolean getWithVpcInfo() {
        return this.withVpcInfo;
    }

    public static final class Builder extends Request.Builder<GetEnvironmentRequest, Builder> {
        private String environmentId; 
        private Boolean withStatistics; 
        private Boolean withVpcInfo; 

        private Builder() {
            super();
        } 

        private Builder(GetEnvironmentRequest request) {
            super(request);
            this.environmentId = request.environmentId;
            this.withStatistics = request.withStatistics;
            this.withVpcInfo = request.withVpcInfo;
        } 

        /**
         * <p>Environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cq7l5s5lhtgi6qasrdc0</p>
         */
        public Builder environmentId(String environmentId) {
            this.putPathParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>Indicates whether to return online resource info.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withStatistics(Boolean withStatistics) {
            this.putQueryParameter("withStatistics", withStatistics);
            this.withStatistics = withStatistics;
            return this;
        }

        /**
         * <p>Option for vpc info.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withVpcInfo(Boolean withVpcInfo) {
            this.putQueryParameter("withVpcInfo", withVpcInfo);
            this.withVpcInfo = withVpcInfo;
            return this;
        }

        @Override
        public GetEnvironmentRequest build() {
            return new GetEnvironmentRequest(this);
        } 

    } 

}
