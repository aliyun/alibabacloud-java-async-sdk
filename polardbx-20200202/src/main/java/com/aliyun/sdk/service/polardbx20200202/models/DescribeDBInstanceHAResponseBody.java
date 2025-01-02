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
 * {@link DescribeDBInstanceHAResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceHAResponseBody</p>
 */
public class DescribeDBInstanceHAResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDBInstanceHAResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceHAResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDBInstanceHAResponseBody build() {
            return new DescribeDBInstanceHAResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceHAResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceHAResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrimaryAzoneId")
        private String primaryAzoneId;

        @com.aliyun.core.annotation.NameInMap("PrimaryRegionId")
        private String primaryRegionId;

        @com.aliyun.core.annotation.NameInMap("SecondaryAzoneId")
        private String secondaryAzoneId;

        @com.aliyun.core.annotation.NameInMap("SecondaryRegionId")
        private String secondaryRegionId;

        @com.aliyun.core.annotation.NameInMap("TopologyType")
        private String topologyType;

        private Data(Builder builder) {
            this.primaryAzoneId = builder.primaryAzoneId;
            this.primaryRegionId = builder.primaryRegionId;
            this.secondaryAzoneId = builder.secondaryAzoneId;
            this.secondaryRegionId = builder.secondaryRegionId;
            this.topologyType = builder.topologyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return primaryAzoneId
         */
        public String getPrimaryAzoneId() {
            return this.primaryAzoneId;
        }

        /**
         * @return primaryRegionId
         */
        public String getPrimaryRegionId() {
            return this.primaryRegionId;
        }

        /**
         * @return secondaryAzoneId
         */
        public String getSecondaryAzoneId() {
            return this.secondaryAzoneId;
        }

        /**
         * @return secondaryRegionId
         */
        public String getSecondaryRegionId() {
            return this.secondaryRegionId;
        }

        /**
         * @return topologyType
         */
        public String getTopologyType() {
            return this.topologyType;
        }

        public static final class Builder {
            private String primaryAzoneId; 
            private String primaryRegionId; 
            private String secondaryAzoneId; 
            private String secondaryRegionId; 
            private String topologyType; 

            /**
             * PrimaryAzoneId.
             */
            public Builder primaryAzoneId(String primaryAzoneId) {
                this.primaryAzoneId = primaryAzoneId;
                return this;
            }

            /**
             * PrimaryRegionId.
             */
            public Builder primaryRegionId(String primaryRegionId) {
                this.primaryRegionId = primaryRegionId;
                return this;
            }

            /**
             * SecondaryAzoneId.
             */
            public Builder secondaryAzoneId(String secondaryAzoneId) {
                this.secondaryAzoneId = secondaryAzoneId;
                return this;
            }

            /**
             * SecondaryRegionId.
             */
            public Builder secondaryRegionId(String secondaryRegionId) {
                this.secondaryRegionId = secondaryRegionId;
                return this;
            }

            /**
             * TopologyType.
             */
            public Builder topologyType(String topologyType) {
                this.topologyType = topologyType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
