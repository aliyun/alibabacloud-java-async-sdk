// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link ModifyLangfuseUserAllowOrgCreationResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyLangfuseUserAllowOrgCreationResponseBody</p>
 */
public class ModifyLangfuseUserAllowOrgCreationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyLangfuseUserAllowOrgCreationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLangfuseUserAllowOrgCreationResponseBody create() {
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

        private Builder(ModifyLangfuseUserAllowOrgCreationResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyLangfuseUserAllowOrgCreationResponseBody build() {
            return new ModifyLangfuseUserAllowOrgCreationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyLangfuseUserAllowOrgCreationResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyLangfuseUserAllowOrgCreationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowOrgCreation")
        private Boolean allowOrgCreation;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        private Data(Builder builder) {
            this.allowOrgCreation = builder.allowOrgCreation;
            this.email = builder.email;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allowOrgCreation
         */
        public Boolean getAllowOrgCreation() {
            return this.allowOrgCreation;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        public static final class Builder {
            private Boolean allowOrgCreation; 
            private String email; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.allowOrgCreation = model.allowOrgCreation;
                this.email = model.email;
            } 

            /**
             * <p>Specifies whether the user is allowed to create organizations.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowOrgCreation(Boolean allowOrgCreation) {
                this.allowOrgCreation = allowOrgCreation;
                return this;
            }

            /**
             * <p>The email address of the user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:alice@company.com">alice@company.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
