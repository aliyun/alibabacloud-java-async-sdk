// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > contactNames;

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
    public java.util.List < String > getContactNames() {
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
        private java.util.List < String > contactNames; 
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
         * The name of the alert contact group.
         * <p>
         * 
         * For information about how to obtain the name of an alert contact group, see [DescribeContactGroupList](~~114922~~).
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * ContactNames.
         */
        public Builder contactNames(java.util.List < String > contactNames) {
            this.putQueryParameter("ContactNames", contactNames);
            this.contactNames = contactNames;
            return this;
        }

        /**
         * The description of the alert contact group.
         */
        public Builder describe(String describe) {
            this.putQueryParameter("Describe", describe);
            this.describe = describe;
            return this;
        }

        /**
         * Specifies whether to enable the weekly report subscription feature. Valid values:
         * <p>
         * 
         * *   true: The weekly report subscription feature is enabled.
         * *   false: The weekly report subscription feature is disabled.
         * 
         * >  You can enable the weekly report subscription only for an Alibaba Cloud account that has at least five Elastic Compute Service (ECS) instances.
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
