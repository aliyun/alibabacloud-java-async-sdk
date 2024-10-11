// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRankingModelVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteRankingModelVersionRequest</p>
 */
public class DeleteRankingModelVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("versionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionId;

    private DeleteRankingModelVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRankingModelVersionRequest create() {
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
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DeleteRankingModelVersionRequest, Builder> {
        private String instanceId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRankingModelVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.versionId = request.versionId;
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
         * <p>1</p>
         */
        public Builder versionId(String versionId) {
            this.putPathParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DeleteRankingModelVersionRequest build() {
            return new DeleteRankingModelVersionRequest(this);
        } 

    } 

}
