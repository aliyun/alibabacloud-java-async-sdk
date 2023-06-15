// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmNotifyRequest} extends {@link RequestModel}
 *
 * <p>ConfirmNotifyRequest</p>
 */
public class ConfirmNotifyRequest extends Request {
    @Body
    @NameInMap("Confirmor")
    @Validation(required = true)
    private Long confirmor;

    @Body
    @NameInMap("NotifyIdList")
    @Validation(required = true)
    private java.util.List < Long > notifyIdList;

    private ConfirmNotifyRequest(Builder builder) {
        super(builder);
        this.confirmor = builder.confirmor;
        this.notifyIdList = builder.notifyIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmNotifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return confirmor
     */
    public Long getConfirmor() {
        return this.confirmor;
    }

    /**
     * @return notifyIdList
     */
    public java.util.List < Long > getNotifyIdList() {
        return this.notifyIdList;
    }

    public static final class Builder extends Request.Builder<ConfirmNotifyRequest, Builder> {
        private Long confirmor; 
        private java.util.List < Long > notifyIdList; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmNotifyRequest request) {
            super(request);
            this.confirmor = request.confirmor;
            this.notifyIdList = request.notifyIdList;
        } 

        /**
         * The ID of the Alibaba Cloud account that is used to confirm the notification. You can set this parameter to **0**, which indicates that the notification is confirmed by the system.
         */
        public Builder confirmor(Long confirmor) {
            this.putBodyParameter("Confirmor", confirmor);
            this.confirmor = confirmor;
            return this;
        }

        /**
         * The IDs of the notifications that needs to be confirmed. You can call the [QueryNotify](~~427959~~) operation to query notifications for an instance.
         */
        public Builder notifyIdList(java.util.List < Long > notifyIdList) {
            String notifyIdListShrink = shrink(notifyIdList, "NotifyIdList", "json");
            this.putBodyParameter("NotifyIdList", notifyIdListShrink);
            this.notifyIdList = notifyIdList;
            return this;
        }

        @Override
        public ConfirmNotifyRequest build() {
            return new ConfirmNotifyRequest(this);
        } 

    } 

}
