// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditNewBuyStatusRequest} extends {@link RequestModel}
 *
 * <p>EditNewBuyStatusRequest</p>
 */
public class EditNewBuyStatusRequest extends Request {
    @Query
    @NameInMap("NewBuyStatus")
    private String newBuyStatus;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private EditNewBuyStatusRequest(Builder builder) {
        super(builder);
        this.newBuyStatus = builder.newBuyStatus;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditNewBuyStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newBuyStatus
     */
    public String getNewBuyStatus() {
        return this.newBuyStatus;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<EditNewBuyStatusRequest, Builder> {
        private String newBuyStatus; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(EditNewBuyStatusRequest request) {
            super(request);
            this.newBuyStatus = request.newBuyStatus;
            this.uid = request.uid;
        } 

        /**
         * newBuyStatus
         */
        public Builder newBuyStatus(String newBuyStatus) {
            this.putQueryParameter("NewBuyStatus", newBuyStatus);
            this.newBuyStatus = newBuyStatus;
            return this;
        }

        /**
         * uid
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public EditNewBuyStatusRequest build() {
            return new EditNewBuyStatusRequest(this);
        } 

    } 

}
