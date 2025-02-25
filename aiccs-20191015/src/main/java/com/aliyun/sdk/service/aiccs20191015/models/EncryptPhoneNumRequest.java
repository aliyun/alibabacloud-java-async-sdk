// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link EncryptPhoneNumRequest} extends {@link RequestModel}
 *
 * <p>EncryptPhoneNumRequest</p>
 */
public class EncryptPhoneNumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNum;

    private EncryptPhoneNumRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.phoneNum = builder.phoneNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptPhoneNumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phoneNum
     */
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public static final class Builder extends Request.Builder<EncryptPhoneNumRequest, Builder> {
        private String instanceId; 
        private String phoneNum; 

        private Builder() {
            super();
        } 

        private Builder(EncryptPhoneNumRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.phoneNum = request.phoneNum;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>130****0000</p>
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        @Override
        public EncryptPhoneNumRequest build() {
            return new EncryptPhoneNumRequest(this);
        } 

    } 

}
