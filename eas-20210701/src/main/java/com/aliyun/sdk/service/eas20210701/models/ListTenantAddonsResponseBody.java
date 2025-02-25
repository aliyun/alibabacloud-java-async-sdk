// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListTenantAddonsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTenantAddonsResponseBody</p>
 */
public class ListTenantAddonsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addons")
    private java.util.List<Addons> addons;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTenantAddonsResponseBody(Builder builder) {
        this.addons = builder.addons;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantAddonsResponseBody create() {
        return builder().build();
    }

    /**
     * @return addons
     */
    public java.util.List<Addons> getAddons() {
        return this.addons;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Addons> addons; 
        private String requestId; 

        /**
         * <p>The information about the plug-in.</p>
         */
        public Builder addons(java.util.List<Addons> addons) {
            this.addons = addons;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTenantAddonsResponseBody build() {
            return new ListTenantAddonsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTenantAddonsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTenantAddonsResponseBody</p>
     */
    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.Map<String, String> attributes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Addons(Builder builder) {
            this.attributes = builder.attributes;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addons create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.Map<String, String> attributes; 
            private String name; 

            /**
             * <p>The attributes of the plug-in.</p>
             */
            public Builder attributes(java.util.Map<String, String> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The name of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>prometheus_discovery</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Addons build() {
                return new Addons(this);
            } 

        } 

    }
}
