// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVoicemailRecordingRequest} extends {@link RequestModel}
 *
 * <p>GetVoicemailRecordingRequest</p>
 */
public class GetVoicemailRecordingRequest extends Request {
    @Query
    @NameInMap("ContactId")
    @Validation(required = true)
    private String contactId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetVoicemailRecordingRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVoicemailRecordingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetVoicemailRecordingRequest, Builder> {
        private String contactId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetVoicemailRecordingRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetVoicemailRecordingRequest build() {
            return new GetVoicemailRecordingRequest(this);
        } 

    } 

}
