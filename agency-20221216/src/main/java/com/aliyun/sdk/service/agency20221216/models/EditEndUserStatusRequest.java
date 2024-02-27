// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditEndUserStatusRequest} extends {@link RequestModel}
 *
 * <p>EditEndUserStatusRequest</p>
 */
public class EditEndUserStatusRequest extends Request {
    @Query
    @NameInMap("CreditStatus")
    private String creditStatus;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private EditEndUserStatusRequest(Builder builder) {
        super(builder);
        this.creditStatus = builder.creditStatus;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditEndUserStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creditStatus
     */
    public String getCreditStatus() {
        return this.creditStatus;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<EditEndUserStatusRequest, Builder> {
        private String creditStatus; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(EditEndUserStatusRequest request) {
            super(request);
            this.creditStatus = request.creditStatus;
            this.uid = request.uid;
        } 

        /**
         * Shutdown Status</br>
         * <p>
         * 
         * - postPayFreeze, the account have been blocked</br>
         * 
         * - postPayThaw, the account have been unlocked</br>
         */
        public Builder creditStatus(String creditStatus) {
            this.putQueryParameter("CreditStatus", creditStatus);
            this.creditStatus = creditStatus;
            return this;
        }

        /**
         * UID
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public EditEndUserStatusRequest build() {
            return new EditEndUserStatusRequest(this);
        } 

    } 

}
