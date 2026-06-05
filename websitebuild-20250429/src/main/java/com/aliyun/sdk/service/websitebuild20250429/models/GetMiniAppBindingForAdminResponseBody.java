// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetMiniAppBindingForAdminResponseBody} extends {@link TeaModel}
 *
 * <p>GetMiniAppBindingForAdminResponseBody</p>
 */
public class GetMiniAppBindingForAdminResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMiniAppBindingForAdminResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMiniAppBindingForAdminResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMiniAppBindingForAdminResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMiniAppBindingForAdminResponseBody build() {
            return new GetMiniAppBindingForAdminResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMiniAppBindingForAdminResponseBody} extends {@link TeaModel}
     *
     * <p>GetMiniAppBindingForAdminResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthStatus")
        private String authStatus;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("PlatformAppid")
        private String platformAppid;

        private Data(Builder builder) {
            this.authStatus = builder.authStatus;
            this.bizId = builder.bizId;
            this.platformAppid = builder.platformAppid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authStatus
         */
        public String getAuthStatus() {
            return this.authStatus;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return platformAppid
         */
        public String getPlatformAppid() {
            return this.platformAppid;
        }

        public static final class Builder {
            private String authStatus; 
            private String bizId; 
            private String platformAppid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authStatus = model.authStatus;
                this.bizId = model.bizId;
                this.platformAppid = model.platformAppid;
            } 

            /**
             * AuthStatus.
             */
            public Builder authStatus(String authStatus) {
                this.authStatus = authStatus;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * PlatformAppid.
             */
            public Builder platformAppid(String platformAppid) {
                this.platformAppid = platformAppid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
