// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRulengDistributeJobRequest} extends {@link RequestModel}
 *
 * <p>CreateRulengDistributeJobRequest</p>
 */
public class CreateRulengDistributeJobRequest extends Request {
    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("SourceInstanceId")
    @Validation(required = true)
    private String sourceInstanceId;

    @Query
    @NameInMap("TargetInstanceId")
    @Validation(required = true)
    private String targetInstanceId;

    private CreateRulengDistributeJobRequest(Builder builder) {
        super(builder);
        this.productKey = builder.productKey;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.targetInstanceId = builder.targetInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRulengDistributeJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public static final class Builder extends Request.Builder<CreateRulengDistributeJobRequest, Builder> {
        private String productKey; 
        private String sourceInstanceId; 
        private String targetInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRulengDistributeJobRequest response) {
            super(response);
            this.productKey = response.productKey;
            this.sourceInstanceId = response.sourceInstanceId;
            this.targetInstanceId = response.targetInstanceId;
        } 

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * SourceInstanceId.
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * TargetInstanceId.
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        @Override
        public CreateRulengDistributeJobRequest build() {
            return new CreateRulengDistributeJobRequest(this);
        } 

    } 

}
