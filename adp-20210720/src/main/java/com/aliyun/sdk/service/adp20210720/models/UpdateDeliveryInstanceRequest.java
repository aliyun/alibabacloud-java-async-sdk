// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeliveryInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeliveryInstanceRequest</p>
 */
public class UpdateDeliveryInstanceRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Body
    @NameInMap("deliverableConfigUID")
    private String deliverableConfigUID;

    @Body
    @NameInMap("deliverableUID")
    private String deliverableUID;

    @Body
    @NameInMap("desc")
    private String desc;

    private UpdateDeliveryInstanceRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.deliverableConfigUID = builder.deliverableConfigUID;
        this.deliverableUID = builder.deliverableUID;
        this.desc = builder.desc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeliveryInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return deliverableConfigUID
     */
    public String getDeliverableConfigUID() {
        return this.deliverableConfigUID;
    }

    /**
     * @return deliverableUID
     */
    public String getDeliverableUID() {
        return this.deliverableUID;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    public static final class Builder extends Request.Builder<UpdateDeliveryInstanceRequest, Builder> {
        private String uid; 
        private String deliverableConfigUID; 
        private String deliverableUID; 
        private String desc; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeliveryInstanceRequest request) {
            super(request);
            this.uid = request.uid;
            this.deliverableConfigUID = request.deliverableConfigUID;
            this.deliverableUID = request.deliverableUID;
            this.desc = request.desc;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * deliverableConfigUID.
         */
        public Builder deliverableConfigUID(String deliverableConfigUID) {
            this.putBodyParameter("deliverableConfigUID", deliverableConfigUID);
            this.deliverableConfigUID = deliverableConfigUID;
            return this;
        }

        /**
         * deliverableUID.
         */
        public Builder deliverableUID(String deliverableUID) {
            this.putBodyParameter("deliverableUID", deliverableUID);
            this.deliverableUID = deliverableUID;
            return this;
        }

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.putBodyParameter("desc", desc);
            this.desc = desc;
            return this;
        }

        @Override
        public UpdateDeliveryInstanceRequest build() {
            return new UpdateDeliveryInstanceRequest(this);
        } 

    } 

}
