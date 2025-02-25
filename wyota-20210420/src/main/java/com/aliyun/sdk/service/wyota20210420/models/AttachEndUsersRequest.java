// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachEndUsersRequest} extends {@link RequestModel}
 *
 * <p>AttachEndUsersRequest</p>
 */
public class AttachEndUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNo;

    private AttachEndUsersRequest(Builder builder) {
        super(builder);
        this.endUserIds = builder.endUserIds;
        this.serialNo = builder.serialNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachEndUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserIds
     */
    public String getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    public static final class Builder extends Request.Builder<AttachEndUsersRequest, Builder> {
        private String endUserIds; 
        private String serialNo; 

        private Builder() {
            super();
        } 

        private Builder(AttachEndUsersRequest request) {
            super(request);
            this.endUserIds = request.endUserIds;
            this.serialNo = request.serialNo;
        } 

        /**
         * EndUserIds.
         */
        public Builder endUserIds(String endUserIds) {
            this.putBodyParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        @Override
        public AttachEndUsersRequest build() {
            return new AttachEndUsersRequest(this);
        } 

    } 

}
