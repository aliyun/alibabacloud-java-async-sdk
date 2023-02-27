// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreArchivedRecordingsRequest} extends {@link RequestModel}
 *
 * <p>RestoreArchivedRecordingsRequest</p>
 */
public class RestoreArchivedRecordingsRequest extends Request {
    @Query
    @NameInMap("ContactIds")
    private String contactIds;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private RestoreArchivedRecordingsRequest(Builder builder) {
        super(builder);
        this.contactIds = builder.contactIds;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreArchivedRecordingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactIds
     */
    public String getContactIds() {
        return this.contactIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<RestoreArchivedRecordingsRequest, Builder> {
        private String contactIds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(RestoreArchivedRecordingsRequest request) {
            super(request);
            this.contactIds = request.contactIds;
            this.instanceId = request.instanceId;
        } 

        /**
         * ContactIds.
         */
        public Builder contactIds(String contactIds) {
            this.putQueryParameter("ContactIds", contactIds);
            this.contactIds = contactIds;
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
        public RestoreArchivedRecordingsRequest build() {
            return new RestoreArchivedRecordingsRequest(this);
        } 

    } 

}
