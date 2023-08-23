// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMonoRecordingsRequest} extends {@link RequestModel}
 *
 * <p>ListMonoRecordingsRequest</p>
 */
public class ListMonoRecordingsRequest extends Request {
    @Query
    @NameInMap("ContactId")
    @Validation(required = true)
    private String contactId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ListMonoRecordingsRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMonoRecordingsRequest create() {
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

    public static final class Builder extends Request.Builder<ListMonoRecordingsRequest, Builder> {
        private String contactId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListMonoRecordingsRequest request) {
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
        public ListMonoRecordingsRequest build() {
            return new ListMonoRecordingsRequest(this);
        } 

    } 

}
