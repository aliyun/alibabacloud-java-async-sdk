// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDeviceRequest} extends {@link RequestModel}
 *
 * <p>GenerateDeviceRequest</p>
 */
public class GenerateDeviceRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Long amount;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private GenerateDeviceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.productKey = builder.productKey;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GenerateDeviceRequest, Builder> {
        private Long amount; 
        private String productKey; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDeviceRequest request) {
            super(request);
            this.amount = request.amount;
            this.productKey = request.productKey;
            this.projectId = request.projectId;
        } 

        /**
         * Amount.
         */
        public Builder amount(Long amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GenerateDeviceRequest build() {
            return new GenerateDeviceRequest(this);
        } 

    } 

}
