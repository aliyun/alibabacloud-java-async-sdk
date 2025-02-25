// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetCallDetailRecordRequest} extends {@link RequestModel}
 *
 * <p>GetCallDetailRecordRequest</p>
 */
public class GetCallDetailRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetCallDetailRecordRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCallDetailRecordRequest create() {
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

    public static final class Builder extends Request.Builder<GetCallDetailRecordRequest, Builder> {
        private String contactId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCallDetailRecordRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-10963442671187****</p>
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetCallDetailRecordRequest build() {
            return new GetCallDetailRecordRequest(this);
        } 

    } 

}
