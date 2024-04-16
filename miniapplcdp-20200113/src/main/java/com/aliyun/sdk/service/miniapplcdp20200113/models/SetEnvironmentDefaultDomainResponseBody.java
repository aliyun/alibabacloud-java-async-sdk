// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetEnvironmentDefaultDomainResponseBody} extends {@link TeaModel}
 *
 * <p>SetEnvironmentDefaultDomainResponseBody</p>
 */
public class SetEnvironmentDefaultDomainResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private SetEnvironmentDefaultDomainResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetEnvironmentDefaultDomainResponseBody create() {
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

        public SetEnvironmentDefaultDomainResponseBody build() {
            return new SetEnvironmentDefaultDomainResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ConfigChanged")
        private Boolean configChanged;

        @NameInMap("DefaultMasterDomain")
        private String defaultMasterDomain;

        @NameInMap("DefaultStaticDomain")
        private String defaultStaticDomain;

        @NameInMap("MasterDomain")
        private String masterDomain;

        @NameInMap("MasterDomainApplied")
        private Boolean masterDomainApplied;

        @NameInMap("StaticDomain")
        private String staticDomain;

        @NameInMap("StaticDomainApplied")
        private Boolean staticDomainApplied;

        private Data(Builder builder) {
            this.configChanged = builder.configChanged;
            this.defaultMasterDomain = builder.defaultMasterDomain;
            this.defaultStaticDomain = builder.defaultStaticDomain;
            this.masterDomain = builder.masterDomain;
            this.masterDomainApplied = builder.masterDomainApplied;
            this.staticDomain = builder.staticDomain;
            this.staticDomainApplied = builder.staticDomainApplied;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configChanged
         */
        public Boolean getConfigChanged() {
            return this.configChanged;
        }

        /**
         * @return defaultMasterDomain
         */
        public String getDefaultMasterDomain() {
            return this.defaultMasterDomain;
        }

        /**
         * @return defaultStaticDomain
         */
        public String getDefaultStaticDomain() {
            return this.defaultStaticDomain;
        }

        /**
         * @return masterDomain
         */
        public String getMasterDomain() {
            return this.masterDomain;
        }

        /**
         * @return masterDomainApplied
         */
        public Boolean getMasterDomainApplied() {
            return this.masterDomainApplied;
        }

        /**
         * @return staticDomain
         */
        public String getStaticDomain() {
            return this.staticDomain;
        }

        /**
         * @return staticDomainApplied
         */
        public Boolean getStaticDomainApplied() {
            return this.staticDomainApplied;
        }

        public static final class Builder {
            private Boolean configChanged; 
            private String defaultMasterDomain; 
            private String defaultStaticDomain; 
            private String masterDomain; 
            private Boolean masterDomainApplied; 
            private String staticDomain; 
            private Boolean staticDomainApplied; 

            /**
             * ConfigChanged.
             */
            public Builder configChanged(Boolean configChanged) {
                this.configChanged = configChanged;
                return this;
            }

            /**
             * DefaultMasterDomain.
             */
            public Builder defaultMasterDomain(String defaultMasterDomain) {
                this.defaultMasterDomain = defaultMasterDomain;
                return this;
            }

            /**
             * DefaultStaticDomain.
             */
            public Builder defaultStaticDomain(String defaultStaticDomain) {
                this.defaultStaticDomain = defaultStaticDomain;
                return this;
            }

            /**
             * MasterDomain.
             */
            public Builder masterDomain(String masterDomain) {
                this.masterDomain = masterDomain;
                return this;
            }

            /**
             * MasterDomainApplied.
             */
            public Builder masterDomainApplied(Boolean masterDomainApplied) {
                this.masterDomainApplied = masterDomainApplied;
                return this;
            }

            /**
             * StaticDomain.
             */
            public Builder staticDomain(String staticDomain) {
                this.staticDomain = staticDomain;
                return this;
            }

            /**
             * StaticDomainApplied.
             */
            public Builder staticDomainApplied(Boolean staticDomainApplied) {
                this.staticDomainApplied = staticDomainApplied;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
