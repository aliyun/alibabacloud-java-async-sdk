// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetApiSchemaUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetApiSchemaUsageResponseBody</p>
 */
public class GetApiSchemaUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceUsage")
    private Integer instanceUsage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Usages")
    private java.util.List<Usages> usages;

    private GetApiSchemaUsageResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.instanceUsage = builder.instanceUsage;
        this.requestId = builder.requestId;
        this.usages = builder.usages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiSchemaUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceUsage
     */
    public Integer getInstanceUsage() {
        return this.instanceUsage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usages
     */
    public java.util.List<Usages> getUsages() {
        return this.usages;
    }

    public static final class Builder {
        private String instanceId; 
        private Integer instanceUsage; 
        private String requestId; 
        private java.util.List<Usages> usages; 

        private Builder() {
        } 

        private Builder(GetApiSchemaUsageResponseBody model) {
            this.instanceId = model.instanceId;
            this.instanceUsage = model.instanceUsage;
            this.requestId = model.requestId;
            this.usages = model.usages;
        } 

        /**
         * <p>The plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-agknce3n****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of files uploaded for schema verification in the plan instance of the website.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder instanceUsage(Integer instanceUsage) {
            this.instanceUsage = instanceUsage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>952ea16b-1f05-4a76-bb32-420282d8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Usage details for websites.</p>
         */
        public Builder usages(java.util.List<Usages> usages) {
            this.usages = usages;
            return this;
        }

        public GetApiSchemaUsageResponseBody build() {
            return new GetApiSchemaUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApiSchemaUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiSchemaUsageResponseBody</p>
     */
    public static class Usages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Integer usage;

        private Usages(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usages create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return usage
         */
        public Integer getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private Integer usage; 

            private Builder() {
            } 

            private Builder(Usages model) {
                this.id = model.id;
                this.name = model.name;
                this.usage = model.usage;
            } 

            /**
             * <p>The website ID.</p>
             * 
             * <strong>example:</strong>
             * <p>40000449</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The website name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of files uploaded for the website.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder usage(Integer usage) {
                this.usage = usage;
                return this;
            }

            public Usages build() {
                return new Usages(this);
            } 

        } 

    }
}
