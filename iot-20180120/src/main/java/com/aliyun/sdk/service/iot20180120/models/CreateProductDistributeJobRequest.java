// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductDistributeJobRequest} extends {@link RequestModel}
 *
 * <p>CreateProductDistributeJobRequest</p>
 */
public class CreateProductDistributeJobRequest extends Request {
    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("SourceInstanceId")
    @Validation(required = true)
    private String sourceInstanceId;

    @Query
    @NameInMap("TargetAliyunId")
    private String targetAliyunId;

    @Query
    @NameInMap("TargetInstanceId")
    @Validation(required = true)
    private String targetInstanceId;

    @Query
    @NameInMap("TargetUid")
    private String targetUid;

    private CreateProductDistributeJobRequest(Builder builder) {
        super(builder);
        this.productKey = builder.productKey;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.targetAliyunId = builder.targetAliyunId;
        this.targetInstanceId = builder.targetInstanceId;
        this.targetUid = builder.targetUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductDistributeJobRequest create() {
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
     * @return targetAliyunId
     */
    public String getTargetAliyunId() {
        return this.targetAliyunId;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    /**
     * @return targetUid
     */
    public String getTargetUid() {
        return this.targetUid;
    }

    public static final class Builder extends Request.Builder<CreateProductDistributeJobRequest, Builder> {
        private String productKey; 
        private String sourceInstanceId; 
        private String targetAliyunId; 
        private String targetInstanceId; 
        private String targetUid; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductDistributeJobRequest response) {
            super(response);
            this.productKey = response.productKey;
            this.sourceInstanceId = response.sourceInstanceId;
            this.targetAliyunId = response.targetAliyunId;
            this.targetInstanceId = response.targetInstanceId;
            this.targetUid = response.targetUid;
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
         * TargetAliyunId.
         */
        public Builder targetAliyunId(String targetAliyunId) {
            this.putQueryParameter("TargetAliyunId", targetAliyunId);
            this.targetAliyunId = targetAliyunId;
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

        /**
         * TargetUid.
         */
        public Builder targetUid(String targetUid) {
            this.putQueryParameter("TargetUid", targetUid);
            this.targetUid = targetUid;
            return this;
        }

        @Override
        public CreateProductDistributeJobRequest build() {
            return new CreateProductDistributeJobRequest(this);
        } 

    } 

}
