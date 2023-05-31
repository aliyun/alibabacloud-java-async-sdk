// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeCheckCustomConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeCheckCustomConfigResponseBody</p>
 */
public class ChangeCheckCustomConfigResponseBody extends TeaModel {
    @NameInMap("IllegalCustomConfigs")
    private java.util.List < IllegalCustomConfigs> illegalCustomConfigs;

    @NameInMap("RequestId")
    private String requestId;

    private ChangeCheckCustomConfigResponseBody(Builder builder) {
        this.illegalCustomConfigs = builder.illegalCustomConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCheckCustomConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return illegalCustomConfigs
     */
    public java.util.List < IllegalCustomConfigs> getIllegalCustomConfigs() {
        return this.illegalCustomConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < IllegalCustomConfigs> illegalCustomConfigs; 
        private String requestId; 

        /**
         * An array that consists of the invalid custom configuration items of the check item.
         */
        public Builder illegalCustomConfigs(java.util.List < IllegalCustomConfigs> illegalCustomConfigs) {
            this.illegalCustomConfigs = illegalCustomConfigs;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChangeCheckCustomConfigResponseBody build() {
            return new ChangeCheckCustomConfigResponseBody(this);
        } 

    } 

    public static class IllegalCustomConfigs extends TeaModel {
        @NameInMap("Name")
        private String name;

        private IllegalCustomConfigs(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IllegalCustomConfigs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * The name of the custom configuration item. The name of a custom configuration item is unique in a check item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public IllegalCustomConfigs build() {
                return new IllegalCustomConfigs(this);
            } 

        } 

    }
}
