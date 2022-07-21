// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetProductCertInfoRequest} extends {@link RequestModel}
 *
 * <p>SetProductCertInfoRequest</p>
 */
public class SetProductCertInfoRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("IssueModel")
    @Validation(required = true)
    private Integer issueModel;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    private SetProductCertInfoRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.issueModel = builder.issueModel;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetProductCertInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return issueModel
     */
    public Integer getIssueModel() {
        return this.issueModel;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<SetProductCertInfoRequest, Builder> {
        private String iotInstanceId; 
        private Integer issueModel; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(SetProductCertInfoRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.issueModel = request.issueModel;
            this.productKey = request.productKey;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * IssueModel.
         */
        public Builder issueModel(Integer issueModel) {
            this.putQueryParameter("IssueModel", issueModel);
            this.issueModel = issueModel;
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

        @Override
        public SetProductCertInfoRequest build() {
            return new SetProductCertInfoRequest(this);
        } 

    } 

}
