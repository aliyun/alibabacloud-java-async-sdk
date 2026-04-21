// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link NormalServiceConfigResult} extends {@link TeaModel}
 *
 * <p>NormalServiceConfigResult</p>
 */
public class NormalServiceConfigResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("availableTime")
    private String availableTime;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("userAPICountInfos")
    private java.util.List<UserAPICountInfo> userAPICountInfos;

    private NormalServiceConfigResult(Builder builder) {
        this.availableTime = builder.availableTime;
        this.gmtCreate = builder.gmtCreate;
        this.status = builder.status;
        this.userAPICountInfos = builder.userAPICountInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NormalServiceConfigResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableTime
     */
    public String getAvailableTime() {
        return this.availableTime;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userAPICountInfos
     */
    public java.util.List<UserAPICountInfo> getUserAPICountInfos() {
        return this.userAPICountInfos;
    }

    public static final class Builder {
        private String availableTime; 
        private String gmtCreate; 
        private String status; 
        private java.util.List<UserAPICountInfo> userAPICountInfos; 

        private Builder() {
        } 

        private Builder(NormalServiceConfigResult model) {
            this.availableTime = model.availableTime;
            this.gmtCreate = model.gmtCreate;
            this.status = model.status;
            this.userAPICountInfos = model.userAPICountInfos;
        } 

        /**
         * availableTime.
         */
        public Builder availableTime(String availableTime) {
            this.availableTime = availableTime;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * userAPICountInfos.
         */
        public Builder userAPICountInfos(java.util.List<UserAPICountInfo> userAPICountInfos) {
            this.userAPICountInfos = userAPICountInfos;
            return this;
        }

        public NormalServiceConfigResult build() {
            return new NormalServiceConfigResult(this);
        } 

    } 

}
