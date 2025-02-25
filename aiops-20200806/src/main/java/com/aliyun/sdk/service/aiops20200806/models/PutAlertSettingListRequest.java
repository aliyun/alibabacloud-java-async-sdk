// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutAlertSettingListRequest} extends {@link RequestModel}
 *
 * <p>PutAlertSettingListRequest</p>
 */
public class PutAlertSettingListRequest extends Request {
    @Body
    @NameInMap("AlertSettingEditRequestListJson")
    private String alertSettingEditRequestListJson;

    @Body
    @NameInMap("ContactGroupIdsJson")
    private String contactGroupIdsJson;

    @Body
    @NameInMap("ContactIdsJson")
    private String contactIdsJson;

    private PutAlertSettingListRequest(Builder builder) {
        super(builder);
        this.alertSettingEditRequestListJson = builder.alertSettingEditRequestListJson;
        this.contactGroupIdsJson = builder.contactGroupIdsJson;
        this.contactIdsJson = builder.contactIdsJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAlertSettingListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertSettingEditRequestListJson
     */
    public String getAlertSettingEditRequestListJson() {
        return this.alertSettingEditRequestListJson;
    }

    /**
     * @return contactGroupIdsJson
     */
    public String getContactGroupIdsJson() {
        return this.contactGroupIdsJson;
    }

    /**
     * @return contactIdsJson
     */
    public String getContactIdsJson() {
        return this.contactIdsJson;
    }

    public static final class Builder extends Request.Builder<PutAlertSettingListRequest, Builder> {
        private String alertSettingEditRequestListJson; 
        private String contactGroupIdsJson; 
        private String contactIdsJson; 

        private Builder() {
            super();
        } 

        private Builder(PutAlertSettingListRequest request) {
            super(request);
            this.alertSettingEditRequestListJson = request.alertSettingEditRequestListJson;
            this.contactGroupIdsJson = request.contactGroupIdsJson;
            this.contactIdsJson = request.contactIdsJson;
        } 

        /**
         * AlertSettingEditRequestListJson.
         */
        public Builder alertSettingEditRequestListJson(String alertSettingEditRequestListJson) {
            this.putBodyParameter("AlertSettingEditRequestListJson", alertSettingEditRequestListJson);
            this.alertSettingEditRequestListJson = alertSettingEditRequestListJson;
            return this;
        }

        /**
         * ContactGroupIdsJson.
         */
        public Builder contactGroupIdsJson(String contactGroupIdsJson) {
            this.putBodyParameter("ContactGroupIdsJson", contactGroupIdsJson);
            this.contactGroupIdsJson = contactGroupIdsJson;
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

        @Override
        public PutAlertSettingListRequest build() {
            return new PutAlertSettingListRequest(this);
        } 

    } 

}
