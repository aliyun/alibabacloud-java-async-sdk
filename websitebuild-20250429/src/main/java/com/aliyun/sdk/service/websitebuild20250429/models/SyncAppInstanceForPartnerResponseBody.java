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
 * {@link SyncAppInstanceForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>SyncAppInstanceForPartnerResponseBody</p>
 */
public class SyncAppInstanceForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SyncAppInstanceForPartnerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncAppInstanceForPartnerResponseBody create() {
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

        private Builder(SyncAppInstanceForPartnerResponseBody model) {
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

        public SyncAppInstanceForPartnerResponseBody build() {
            return new SyncAppInstanceForPartnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SyncAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>SyncAppInstanceForPartnerResponseBody</p>
     */
    public static class AppInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        private AppInstance(Builder builder) {
            this.bizId = builder.bizId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInstance create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        public static final class Builder {
            private String bizId; 

            private Builder() {
            } 

            private Builder(AppInstance model) {
                this.bizId = model.bizId;
            } 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            public AppInstance build() {
                return new AppInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>SyncAppInstanceForPartnerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstance")
        private AppInstance appInstance;

        private Data(Builder builder) {
            this.appInstance = builder.appInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appInstance
         */
        public AppInstance getAppInstance() {
            return this.appInstance;
        }

        public static final class Builder {
            private AppInstance appInstance; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appInstance = model.appInstance;
            } 

            /**
             * AppInstance.
             */
            public Builder appInstance(AppInstance appInstance) {
                this.appInstance = appInstance;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
