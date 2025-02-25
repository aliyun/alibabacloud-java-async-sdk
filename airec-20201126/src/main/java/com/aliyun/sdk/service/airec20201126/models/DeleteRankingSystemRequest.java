// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRankingSystemRequest} extends {@link RequestModel}
 *
 * <p>DeleteRankingSystemRequest</p>
 */
public class DeleteRankingSystemRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DeleteRankingSystemRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRankingSystemRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteRankingSystemRequest, Builder> {
        private String instanceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRankingSystemRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
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
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteRankingSystemRequest build() {
            return new DeleteRankingSystemRequest(this);
        } 

    } 

}
