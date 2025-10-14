// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeSqlAuditInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlAuditInfoResponseBody</p>
 */
public class DescribeSqlAuditInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSqlAuditInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlAuditInfoResponseBody create() {
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

        private Builder(DescribeSqlAuditInfoResponseBody model) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSqlAuditInfoResponseBody build() {
            return new DescribeSqlAuditInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlAuditInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlAuditInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Boolean isEnabled;

        @com.aliyun.core.annotation.NameInMap("SLSLogStore")
        private String SLSLogStore;

        @com.aliyun.core.annotation.NameInMap("SLSProject")
        private String SLSProject;

        private Data(Builder builder) {
            this.isEnabled = builder.isEnabled;
            this.SLSLogStore = builder.SLSLogStore;
            this.SLSProject = builder.SLSProject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isEnabled
         */
        public Boolean getIsEnabled() {
            return this.isEnabled;
        }

        /**
         * @return SLSLogStore
         */
        public String getSLSLogStore() {
            return this.SLSLogStore;
        }

        /**
         * @return SLSProject
         */
        public String getSLSProject() {
            return this.SLSProject;
        }

        public static final class Builder {
            private Boolean isEnabled; 
            private String SLSLogStore; 
            private String SLSProject; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.isEnabled = model.isEnabled;
                this.SLSLogStore = model.SLSLogStore;
                this.SLSProject = model.SLSProject;
            } 

            /**
             * IsEnabled.
             */
            public Builder isEnabled(Boolean isEnabled) {
                this.isEnabled = isEnabled;
                return this;
            }

            /**
             * SLSLogStore.
             */
            public Builder SLSLogStore(String SLSLogStore) {
                this.SLSLogStore = SLSLogStore;
                return this;
            }

            /**
             * SLSProject.
             */
            public Builder SLSProject(String SLSProject) {
                this.SLSProject = SLSProject;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
