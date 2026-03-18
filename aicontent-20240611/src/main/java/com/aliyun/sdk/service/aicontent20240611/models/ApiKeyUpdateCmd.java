// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ApiKeyUpdateCmd} extends {@link TeaModel}
 *
 * <p>ApiKeyUpdateCmd</p>
 */
public class ApiKeyUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    private ApiKeyUpdateCmd(Builder builder) {
        this.name = builder.name;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiKeyUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String name; 
        private Integer status; 

        private Builder() {
        } 

        private Builder(ApiKeyUpdateCmd model) {
            this.name = model.name;
            this.status = model.status;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public ApiKeyUpdateCmd build() {
            return new ApiKeyUpdateCmd(this);
        } 

    } 

}
