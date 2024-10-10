// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetModuleConfigStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetModuleConfigStatusResponseBody</p>
 */
public class GetModuleConfigStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetModuleConfigStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleConfigStatusResponseBody create() {
        return builder().build();
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

        public GetModuleConfigStatusResponseBody build() {
            return new GetModuleConfigStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModuleConfigStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetModuleConfigStatusResponseBody</p>
     */
    public static class ModuleConfigResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("Pass")
        private Boolean pass;

        private ModuleConfigResults(Builder builder) {
            this.moduleName = builder.moduleName;
            this.pass = builder.pass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleConfigResults create() {
            return builder().build();
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return pass
         */
        public Boolean getPass() {
            return this.pass;
        }

        public static final class Builder {
            private String moduleName; 
            private Boolean pass; 

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * Pass.
             */
            public Builder pass(Boolean pass) {
                this.pass = pass;
                return this;
            }

            public ModuleConfigResults build() {
                return new ModuleConfigResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModuleConfigStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetModuleConfigStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleConfigResults")
        private java.util.List < ModuleConfigResults> moduleConfigResults;

        private Data(Builder builder) {
            this.moduleConfigResults = builder.moduleConfigResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return moduleConfigResults
         */
        public java.util.List < ModuleConfigResults> getModuleConfigResults() {
            return this.moduleConfigResults;
        }

        public static final class Builder {
            private java.util.List < ModuleConfigResults> moduleConfigResults; 

            /**
             * ModuleConfigResults.
             */
            public Builder moduleConfigResults(java.util.List < ModuleConfigResults> moduleConfigResults) {
                this.moduleConfigResults = moduleConfigResults;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
