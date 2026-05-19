// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetFileProtectClientRuleDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectClientRuleDashboardResponseBody</p>
 */
public class GetFileProtectClientRuleDashboardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileProtectClientRuleDashboardResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectClientRuleDashboardResponseBody create() {
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

        private Builder(GetFileProtectClientRuleDashboardResponseBody model) {
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
         * <p>69BFFCDE-37D6-5A49-A8BC-BB03AC83****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectClientRuleDashboardResponseBody build() {
            return new GetFileProtectClientRuleDashboardResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileProtectClientRuleDashboardResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileProtectClientRuleDashboardResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthTotal")
        private String authTotal;

        @com.aliyun.core.annotation.NameInMap("BindCount")
        private Integer bindCount;

        @com.aliyun.core.annotation.NameInMap("ProtectedDirectoriesCount")
        private Integer protectedDirectoriesCount;

        @com.aliyun.core.annotation.NameInMap("ProtectedInstancesCount")
        private Integer protectedInstancesCount;

        private Data(Builder builder) {
            this.authTotal = builder.authTotal;
            this.bindCount = builder.bindCount;
            this.protectedDirectoriesCount = builder.protectedDirectoriesCount;
            this.protectedInstancesCount = builder.protectedInstancesCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authTotal
         */
        public String getAuthTotal() {
            return this.authTotal;
        }

        /**
         * @return bindCount
         */
        public Integer getBindCount() {
            return this.bindCount;
        }

        /**
         * @return protectedDirectoriesCount
         */
        public Integer getProtectedDirectoriesCount() {
            return this.protectedDirectoriesCount;
        }

        /**
         * @return protectedInstancesCount
         */
        public Integer getProtectedInstancesCount() {
            return this.protectedInstancesCount;
        }

        public static final class Builder {
            private String authTotal; 
            private Integer bindCount; 
            private Integer protectedDirectoriesCount; 
            private Integer protectedInstancesCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authTotal = model.authTotal;
                this.bindCount = model.bindCount;
                this.protectedDirectoriesCount = model.protectedDirectoriesCount;
                this.protectedInstancesCount = model.protectedInstancesCount;
            } 

            /**
             * AuthTotal.
             */
            public Builder authTotal(String authTotal) {
                this.authTotal = authTotal;
                return this;
            }

            /**
             * BindCount.
             */
            public Builder bindCount(Integer bindCount) {
                this.bindCount = bindCount;
                return this;
            }

            /**
             * ProtectedDirectoriesCount.
             */
            public Builder protectedDirectoriesCount(Integer protectedDirectoriesCount) {
                this.protectedDirectoriesCount = protectedDirectoriesCount;
                return this;
            }

            /**
             * ProtectedInstancesCount.
             */
            public Builder protectedInstancesCount(Integer protectedInstancesCount) {
                this.protectedInstancesCount = protectedInstancesCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
