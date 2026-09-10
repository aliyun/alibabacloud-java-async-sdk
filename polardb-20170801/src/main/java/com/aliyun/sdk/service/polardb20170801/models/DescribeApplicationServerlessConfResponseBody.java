// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationServerlessConfResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationServerlessConfResponseBody</p>
 */
public class DescribeApplicationServerlessConfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerlessConfItems")
    private java.util.List<ServerlessConfItems> serverlessConfItems;

    private DescribeApplicationServerlessConfResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.requestId = builder.requestId;
        this.serverlessConfItems = builder.serverlessConfItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationServerlessConfResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverlessConfItems
     */
    public java.util.List<ServerlessConfItems> getServerlessConfItems() {
        return this.serverlessConfItems;
    }

    public static final class Builder {
        private String applicationId; 
        private String requestId; 
        private java.util.List<ServerlessConfItems> serverlessConfItems; 

        private Builder() {
        } 

        private Builder(DescribeApplicationServerlessConfResponseBody model) {
            this.applicationId = model.applicationId;
            this.requestId = model.requestId;
            this.serverlessConfItems = model.serverlessConfItems;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of serverless configurations.</p>
         */
        public Builder serverlessConfItems(java.util.List<ServerlessConfItems> serverlessConfItems) {
            this.serverlessConfItems = serverlessConfItems;
            return this;
        }

        public DescribeApplicationServerlessConfResponseBody build() {
            return new DescribeApplicationServerlessConfResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationServerlessConfResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationServerlessConfResponseBody</p>
     */
    public static class ServerlessConfItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("ScaleMax")
        private String scaleMax;

        @com.aliyun.core.annotation.NameInMap("ScaleMin")
        private String scaleMin;

        private ServerlessConfItems(Builder builder) {
            this.componentType = builder.componentType;
            this.scaleMax = builder.scaleMax;
            this.scaleMin = builder.scaleMin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessConfItems create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return scaleMax
         */
        public String getScaleMax() {
            return this.scaleMax;
        }

        /**
         * @return scaleMin
         */
        public String getScaleMin() {
            return this.scaleMin;
        }

        public static final class Builder {
            private String componentType; 
            private String scaleMax; 
            private String scaleMin; 

            private Builder() {
            } 

            private Builder(ServerlessConfItems model) {
                this.componentType = model.componentType;
                this.scaleMax = model.scaleMax;
                this.scaleMin = model.scaleMin;
            } 

            /**
             * <p>The type of the application sub-component.</p>
             * <p>For Supabase, valid values are:</p>
             * <ul>
             * <li><p>gateway</p>
             * </li>
             * <li><p>backend</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gateway</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The maximum scaling capacity for a single node. Valid values: 0 PCU to 16 PCU.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder scaleMax(String scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * <p>The minimum scaling capacity for a single node, measured in PolarDB Capacity Units (PCU). Valid values: 0 PCU to 16 PCU.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scaleMin(String scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            public ServerlessConfItems build() {
                return new ServerlessConfItems(this);
            } 

        } 

    }
}
