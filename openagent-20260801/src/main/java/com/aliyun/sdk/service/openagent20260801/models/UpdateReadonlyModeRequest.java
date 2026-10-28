// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openagent20260801.models;

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
 * {@link UpdateReadonlyModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateReadonlyModeRequest</p>
 */
public class UpdateReadonlyModeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private UpdateReadonlyModeRequest(Builder builder) {
        super(builder);
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateReadonlyModeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<UpdateReadonlyModeRequest, Builder> {
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateReadonlyModeRequest request) {
            super(request);
            this.value = request.value;
        } 

        /**
         * <p>Required. Pass the string true to enable read-only mode, or false to disable it. The value is case-insensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder value(String value) {
            this.putBodyParameter("value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateReadonlyModeRequest build() {
            return new UpdateReadonlyModeRequest(this);
        } 

    } 

}
