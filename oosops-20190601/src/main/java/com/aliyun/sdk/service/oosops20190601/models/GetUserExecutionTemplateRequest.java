// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

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
 * {@link GetUserExecutionTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetUserExecutionTemplateRequest</p>
 */
public class GetUserExecutionTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetUserExecutionTemplateRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.executionId = builder.executionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserExecutionTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetUserExecutionTemplateRequest, Builder> {
        private String aliUid; 
        private String executionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserExecutionTemplateRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.executionId = request.executionId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetUserExecutionTemplateRequest build() {
            return new GetUserExecutionTemplateRequest(this);
        } 

    } 

}
