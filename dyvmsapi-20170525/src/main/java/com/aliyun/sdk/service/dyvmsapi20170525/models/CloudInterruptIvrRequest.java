// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudInterruptIvrRequest} extends {@link RequestModel}
 *
 * <p>CloudInterruptIvrRequest</p>
 */
public class CloudInterruptIvrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckName")
    private String checkName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckValue")
    private String checkValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserField")
    private String userField;

    private CloudInterruptIvrRequest(Builder builder) {
        super(builder);
        this.checkName = builder.checkName;
        this.checkValue = builder.checkValue;
        this.enterpriseId = builder.enterpriseId;
        this.uniqueId = builder.uniqueId;
        this.userField = builder.userField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudInterruptIvrRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkName
     */
    public String getCheckName() {
        return this.checkName;
    }

    /**
     * @return checkValue
     */
    public String getCheckValue() {
        return this.checkValue;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return uniqueId
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    /**
     * @return userField
     */
    public String getUserField() {
        return this.userField;
    }

    public static final class Builder extends Request.Builder<CloudInterruptIvrRequest, Builder> {
        private String checkName; 
        private String checkValue; 
        private Long enterpriseId; 
        private String uniqueId; 
        private String userField; 

        private Builder() {
            super();
        } 

        private Builder(CloudInterruptIvrRequest request) {
            super(request);
            this.checkName = request.checkName;
            this.checkValue = request.checkValue;
            this.enterpriseId = request.enterpriseId;
            this.uniqueId = request.uniqueId;
            this.userField = request.userField;
        } 

        /**
         * <p>根据变量名去通道变量中取对应的变量值</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        public Builder checkName(String checkName) {
            this.putQueryParameter("CheckName", checkName);
            this.checkName = checkName;
            return this;
        }

        /**
         * <p>当checkName代表的变量值与checkValue一致，才打断</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        public Builder checkValue(String checkValue) {
            this.putQueryParameter("CheckValue", checkValue);
            this.checkValue = checkValue;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>通话唯一标识；从通道唯一标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder uniqueId(String uniqueId) {
            this.putQueryParameter("UniqueId", uniqueId);
            this.uniqueId = uniqueId;
            return this;
        }

        /**
         * <p>自定义字段；json字符串</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder userField(String userField) {
            this.putQueryParameter("UserField", userField);
            this.userField = userField;
            return this;
        }

        @Override
        public CloudInterruptIvrRequest build() {
            return new CloudInterruptIvrRequest(this);
        } 

    } 

}
