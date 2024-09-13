// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskOrderRequest</p>
 */
public class CreateTaskOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsUrgent")
    private Boolean isUrgent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Overview")
    @com.aliyun.core.annotation.Validation(required = true)
    private String overview;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrgentDescription")
    private String urgentDescription;

    private CreateTaskOrderRequest(Builder builder) {
        super(builder);
        this.createUserId = builder.createUserId;
        this.isUrgent = builder.isUrgent;
        this.openGroupId = builder.openGroupId;
        this.overview = builder.overview;
        this.productCode = builder.productCode;
        this.urgentDescription = builder.urgentDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return isUrgent
     */
    public Boolean getIsUrgent() {
        return this.isUrgent;
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    /**
     * @return overview
     */
    public String getOverview() {
        return this.overview;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return urgentDescription
     */
    public String getUrgentDescription() {
        return this.urgentDescription;
    }

    public static final class Builder extends Request.Builder<CreateTaskOrderRequest, Builder> {
        private String createUserId; 
        private Boolean isUrgent; 
        private String openGroupId; 
        private String overview; 
        private String productCode; 
        private String urgentDescription; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskOrderRequest request) {
            super(request);
            this.createUserId = request.createUserId;
            this.isUrgent = request.isUrgent;
            this.openGroupId = request.openGroupId;
            this.overview = request.overview;
            this.productCode = request.productCode;
            this.urgentDescription = request.urgentDescription;
        } 

        /**
         * CreateUserId.
         */
        public Builder createUserId(String createUserId) {
            this.putQueryParameter("CreateUserId", createUserId);
            this.createUserId = createUserId;
            return this;
        }

        /**
         * IsUrgent.
         */
        public Builder isUrgent(Boolean isUrgent) {
            this.putQueryParameter("IsUrgent", isUrgent);
            this.isUrgent = isUrgent;
            return this;
        }

        /**
         * OpenGroupId.
         */
        public Builder openGroupId(String openGroupId) {
            this.putQueryParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        /**
         * Overview.
         */
        public Builder overview(String overview) {
            this.putQueryParameter("Overview", overview);
            this.overview = overview;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * UrgentDescription.
         */
        public Builder urgentDescription(String urgentDescription) {
            this.putQueryParameter("UrgentDescription", urgentDescription);
            this.urgentDescription = urgentDescription;
            return this;
        }

        @Override
        public CreateTaskOrderRequest build() {
            return new CreateTaskOrderRequest(this);
        } 

    } 

}
