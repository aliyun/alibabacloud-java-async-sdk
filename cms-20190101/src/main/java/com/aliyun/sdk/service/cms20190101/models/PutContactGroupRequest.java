// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link PutContactGroupRequest} extends {@link RequestModel}
 *
 * <p>PutContactGroupRequest</p>
 */
public class PutContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactNames")
    private java.util.List<String> contactNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Describe")
    private String describe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSubscribed")
    private Boolean enableSubscribed;

    private PutContactGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupName = builder.contactGroupName;
        this.contactNames = builder.contactNames;
        this.describe = builder.describe;
        this.enableSubscribed = builder.enableSubscribed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutContactGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupName
     */
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    /**
     * @return contactNames
     */
    public java.util.List<String> getContactNames() {
        return this.contactNames;
    }

    /**
     * @return describe
     */
    public String getDescribe() {
        return this.describe;
    }

    /**
     * @return enableSubscribed
     */
    public Boolean getEnableSubscribed() {
        return this.enableSubscribed;
    }

    public static final class Builder extends Request.Builder<PutContactGroupRequest, Builder> {
        private String contactGroupName; 
        private java.util.List<String> contactNames; 
        private String describe; 
        private Boolean enableSubscribed; 

        private Builder() {
            super();
        } 

        private Builder(PutContactGroupRequest request) {
            super(request);
            this.contactGroupName = request.contactGroupName;
            this.contactNames = request.contactNames;
            this.describe = request.describe;
            this.enableSubscribed = request.enableSubscribed;
        } 

        /**
         * <p>The name of the alert contact group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Attendance system group</p>
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * <p>The name of the alert contact.</p>
         */
        public Builder contactNames(java.util.List<String> contactNames) {
            this.putQueryParameter("ContactNames", contactNames);
            this.contactNames = contactNames;
            return this;
        }

        /**
         * <p>The description of the alert contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert test</p>
         */
        public Builder describe(String describe) {
            this.putQueryParameter("Describe", describe);
            this.describe = describe;
            return this;
        }

        /**
         * <p>Specifies whether to enable the subscription feature. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSubscribed(Boolean enableSubscribed) {
            this.putQueryParameter("EnableSubscribed", enableSubscribed);
            this.enableSubscribed = enableSubscribed;
            return this;
        }

        @Override
        public PutContactGroupRequest build() {
            return new PutContactGroupRequest(this);
        } 

    } 

}
