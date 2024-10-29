// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateUsersStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateUsersStatusRequest</p>
 */
public class UpdateUsersStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaseUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > saseUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private UpdateUsersStatusRequest(Builder builder) {
        super(builder);
        this.saseUserIds = builder.saseUserIds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUsersStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return saseUserIds
     */
    public java.util.List < String > getSaseUserIds() {
        return this.saseUserIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateUsersStatusRequest, Builder> {
        private java.util.List < String > saseUserIds; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUsersStatusRequest request) {
            super(request);
            this.saseUserIds = request.saseUserIds;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder saseUserIds(java.util.List < String > saseUserIds) {
            this.putQueryParameter("SaseUserIds", saseUserIds);
            this.saseUserIds = saseUserIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateUsersStatusRequest build() {
            return new UpdateUsersStatusRequest(this);
        } 

    } 

}
