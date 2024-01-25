// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertSettingListRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertSettingListRequest</p>
 */
public class DeleteAlertSettingListRequest extends Request {
    @Body
    @NameInMap("CustomerIdsJson")
    private String customerIdsJson;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private DeleteAlertSettingListRequest(Builder builder) {
        super(builder);
        this.customerIdsJson = builder.customerIdsJson;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertSettingListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerIdsJson
     */
    public String getCustomerIdsJson() {
        return this.customerIdsJson;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<DeleteAlertSettingListRequest, Builder> {
        private String customerIdsJson; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertSettingListRequest request) {
            super(request);
            this.customerIdsJson = request.customerIdsJson;
            this.operaUid = request.operaUid;
        } 

        /**
         * CustomerIdsJson.
         */
        public Builder customerIdsJson(String customerIdsJson) {
            this.putBodyParameter("CustomerIdsJson", customerIdsJson);
            this.customerIdsJson = customerIdsJson;
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

        @Override
        public DeleteAlertSettingListRequest build() {
            return new DeleteAlertSettingListRequest(this);
        } 

    } 

}
