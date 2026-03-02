// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MonitorContactUpdateCmd} extends {@link TeaModel}
 *
 * <p>MonitorContactUpdateCmd</p>
 */
public class MonitorContactUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("phone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phone;

    private MonitorContactUpdateCmd(Builder builder) {
        this.email = builder.email;
        this.id = builder.id;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorContactUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    public static final class Builder {
        private String email; 
        private Long id; 
        private String name; 
        private String phone; 

        private Builder() {
        } 

        private Builder(MonitorContactUpdateCmd model) {
            this.email = model.email;
            this.id = model.id;
            this.name = model.name;
            this.phone = model.phone;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@alibaba.com">xxx@alibaba.com</a></p>
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>尚仁</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15113456789</p>
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public MonitorContactUpdateCmd build() {
            return new MonitorContactUpdateCmd(this);
        } 

    } 

}
