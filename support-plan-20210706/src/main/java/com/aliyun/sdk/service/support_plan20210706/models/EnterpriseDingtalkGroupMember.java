// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

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
 * {@link EnterpriseDingtalkGroupMember} extends {@link TeaModel}
 *
 * <p>EnterpriseDingtalkGroupMember</p>
 */
public class EnterpriseDingtalkGroupMember extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsAdmin")
    private Boolean isAdmin;

    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private EnterpriseDingtalkGroupMember(Builder builder) {
        this.isAdmin = builder.isAdmin;
        this.mobile = builder.mobile;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseDingtalkGroupMember create() {
        return builder().build();
    }

    /**
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private Boolean isAdmin; 
        private String mobile; 
        private String name; 

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * <p>代表资源组的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>130xxxxxxxx</p>
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public EnterpriseDingtalkGroupMember build() {
            return new EnterpriseDingtalkGroupMember(this);
        } 

    } 

}
