// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link SetAdbSecureRequest} extends {@link RequestModel}
 *
 * <p>SetAdbSecureRequest</p>
 */
public class SetAdbSecureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    private SetAdbSecureRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAdbSecureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetAdbSecureRequest, Builder> {
        private java.util.List<String> instanceIds; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(SetAdbSecureRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.status = request.status;
        } 

        /**
         * <p>The IDs of the cloud phone instances. You can specify a maximum of 50 cloud phone instances.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The status of the ADB authentication feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: The ADB authentication feature is disabled.</li>
         * <li>1: The ADB authentication feature is enabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetAdbSecureRequest build() {
            return new SetAdbSecureRequest(this);
        } 

    } 

}
