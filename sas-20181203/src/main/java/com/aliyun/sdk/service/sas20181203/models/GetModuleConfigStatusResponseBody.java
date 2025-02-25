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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>843E4805-****-7EE12FA8DBFD</p>
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
             * <p>The name of the check item. Valid values:</p>
             * <ul>
             * <li><strong>Ransom</strong>: The anti-ransomware policy is enabled.</li>
             * <li><strong>WebLock</strong>: The web tamper proofing feature is enabled.</li>
             * <li><strong>Rasp</strong>: Applications are added to the application protection feature.</li>
             * <li><strong>Image</strong>: The container images that can be scanned are specified.</li>
             * <li><strong>Virus</strong>: The periodic virus scan policy is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ransom</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>Indicates whether the service module passed the status check. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
        private java.util.List<ModuleConfigResults> moduleConfigResults;

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
        public java.util.List<ModuleConfigResults> getModuleConfigResults() {
            return this.moduleConfigResults;
        }

        public static final class Builder {
            private java.util.List<ModuleConfigResults> moduleConfigResults; 

            /**
             * <p>The check results of the service modules.</p>
             */
            public Builder moduleConfigResults(java.util.List<ModuleConfigResults> moduleConfigResults) {
                this.moduleConfigResults = moduleConfigResults;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
