// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link ListGlobalUserConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListGlobalUserConfigResponseBody</p>
 */
public class ListGlobalUserConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListGlobalUserConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGlobalUserConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGlobalUserConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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

        public ListGlobalUserConfigResponseBody build() {
            return new ListGlobalUserConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGlobalUserConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListGlobalUserConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalConfigSwitch")
        private Boolean globalConfigSwitch;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private Data(Builder builder) {
            this.globalConfigSwitch = builder.globalConfigSwitch;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return globalConfigSwitch
         */
        public Boolean getGlobalConfigSwitch() {
            return this.globalConfigSwitch;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private Boolean globalConfigSwitch; 
            private String moduleName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.globalConfigSwitch = model.globalConfigSwitch;
                this.moduleName = model.moduleName;
            } 

            /**
             * GlobalConfigSwitch.
             */
            public Builder globalConfigSwitch(Boolean globalConfigSwitch) {
                this.globalConfigSwitch = globalConfigSwitch;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
