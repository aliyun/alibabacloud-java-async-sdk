// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainConfigRequest} extends {@link RequestModel}
 *
 * <p>GetDomainConfigRequest</p>
 */
public class GetDomainConfigRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductId")
    private Integer productId;

    private GetDomainConfigRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.eventId = builder.eventId;
        this.operaUid = builder.operaUid;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return productId
     */
    public Integer getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<GetDomainConfigRequest, Builder> {
        private String businessGroupId; 
        private String eventId; 
        private String operaUid; 
        private Integer productId; 

        private Builder() {
            super();
        } 

        private Builder(GetDomainConfigRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.eventId = request.eventId;
            this.operaUid = request.operaUid;
            this.productId = request.productId;
        } 

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Integer productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public GetDomainConfigRequest build() {
            return new GetDomainConfigRequest(this);
        } 

    } 

}
