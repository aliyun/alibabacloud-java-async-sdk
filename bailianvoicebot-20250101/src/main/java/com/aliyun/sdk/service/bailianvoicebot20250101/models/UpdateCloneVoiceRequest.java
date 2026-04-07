// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link UpdateCloneVoiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloneVoiceRequest</p>
 */
public class UpdateCloneVoiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloneVoiceId")
    private String cloneVoiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateCloneVoiceRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.cloneVoiceId = builder.cloneVoiceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloneVoiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * @return cloneVoiceId
     */
    public String getCloneVoiceId() {
        return this.cloneVoiceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateCloneVoiceRequest, Builder> {
        private String businessUnitId; 
        private String cloneVoiceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloneVoiceRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.cloneVoiceId = request.cloneVoiceId;
            this.name = request.name;
        } 

        /**
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * CloneVoiceId.
         */
        public Builder cloneVoiceId(String cloneVoiceId) {
            this.putBodyParameter("CloneVoiceId", cloneVoiceId);
            this.cloneVoiceId = cloneVoiceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateCloneVoiceRequest build() {
            return new UpdateCloneVoiceRequest(this);
        } 

    } 

}
