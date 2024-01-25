// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>PutAlertContactGroupRequest</p>
 */
public class PutAlertContactGroupRequest extends Request {
    @Body
    @NameInMap("AlertContactGroupJson")
    private String alertContactGroupJson;

    @Body
    @NameInMap("ContactIdsJson")
    private String contactIdsJson;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private PutAlertContactGroupRequest(Builder builder) {
        super(builder);
        this.alertContactGroupJson = builder.alertContactGroupJson;
        this.contactIdsJson = builder.contactIdsJson;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAlertContactGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertContactGroupJson
     */
    public String getAlertContactGroupJson() {
        return this.alertContactGroupJson;
    }

    /**
     * @return contactIdsJson
     */
    public String getContactIdsJson() {
        return this.contactIdsJson;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<PutAlertContactGroupRequest, Builder> {
        private String alertContactGroupJson; 
        private String contactIdsJson; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(PutAlertContactGroupRequest request) {
            super(request);
            this.alertContactGroupJson = request.alertContactGroupJson;
            this.contactIdsJson = request.contactIdsJson;
            this.operaUid = request.operaUid;
        } 

        /**
         * AlertContactGroupJson.
         */
        public Builder alertContactGroupJson(String alertContactGroupJson) {
            this.putBodyParameter("AlertContactGroupJson", alertContactGroupJson);
            this.alertContactGroupJson = alertContactGroupJson;
            return this;
        }

        /**
         * ContactIdsJson.
         */
        public Builder contactIdsJson(String contactIdsJson) {
            this.putBodyParameter("ContactIdsJson", contactIdsJson);
            this.contactIdsJson = contactIdsJson;
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
        public PutAlertContactGroupRequest build() {
            return new PutAlertContactGroupRequest(this);
        } 

    } 

}
