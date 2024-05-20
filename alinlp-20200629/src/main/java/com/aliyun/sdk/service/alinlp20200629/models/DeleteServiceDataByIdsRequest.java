// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceDataByIdsRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceDataByIdsRequest</p>
 */
public class DeleteServiceDataByIdsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > ids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceId;

    private DeleteServiceDataByIdsRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceDataByIdsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public java.util.List < String > getIds() {
        return this.ids;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceDataByIdsRequest, Builder> {
        private java.util.List < String > ids; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceDataByIdsRequest request) {
            super(request);
            this.ids = request.ids;
            this.serviceId = request.serviceId;
        } 

        /**
         * Ids.
         */
        public Builder ids(java.util.List < String > ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putBodyParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public DeleteServiceDataByIdsRequest build() {
            return new DeleteServiceDataByIdsRequest(this);
        } 

    } 

}
