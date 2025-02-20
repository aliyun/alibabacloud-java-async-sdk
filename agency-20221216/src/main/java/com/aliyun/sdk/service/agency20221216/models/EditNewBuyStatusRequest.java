// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EditNewBuyStatusRequest} extends {@link RequestModel}
 *
 * <p>EditNewBuyStatusRequest</p>
 */
public class EditNewBuyStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewBuyStatus")
    private String newBuyStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
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
         * <p>New Purchase Status</br></p>
         * <ul>
         * <li><p>cancelBan: Cancel the restriction for New Purchase request</br></p>
         * </li>
         * <li><p>ban: ban the New Purchase request</br></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cancelBan</p>
         */
        public Builder newBuyStatus(String newBuyStatus) {
            this.putQueryParameter("NewBuyStatus", newBuyStatus);
            this.newBuyStatus = newBuyStatus;
            return this;
        }

        /**
         * <p>Customer UID</p>
         * 
         * <strong>example:</strong>
         * <p>1133166938931507</p>
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
