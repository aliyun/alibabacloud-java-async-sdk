// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRankingSystemHistoryRequest} extends {@link RequestModel}
 *
 * <p>GetRankingSystemHistoryRequest</p>
 */
public class GetRankingSystemHistoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("operateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateId;

    private GetRankingSystemHistoryRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.operateId = builder.operateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRankingSystemHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operateId
     */
    public String getOperateId() {
        return this.operateId;
    }

    public static final class Builder extends Request.Builder<GetRankingSystemHistoryRequest, Builder> {
        private String instanceId; 
        private String name; 
        private String operateId; 

        private Builder() {
            super();
        } 

        private Builder(GetRankingSystemHistoryRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.operateId = request.operateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-a</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>u-s-a</p>
         */
        public Builder operateId(String operateId) {
            this.putPathParameter("operateId", operateId);
            this.operateId = operateId;
            return this;
        }

        @Override
        public GetRankingSystemHistoryRequest build() {
            return new GetRankingSystemHistoryRequest(this);
        } 

    } 

}
