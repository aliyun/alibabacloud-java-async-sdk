// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link EnDisableScalingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>EnDisableScalingRulesResponseBody</p>
 */
public class EnDisableScalingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnDisableScalingRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnDisableScalingRulesResponseBody create() {
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

        private Builder(EnDisableScalingRulesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnDisableScalingRulesResponseBody build() {
            return new EnDisableScalingRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnDisableScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>EnDisableScalingRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("ScalingRulesEnable")
        private Boolean scalingRulesEnable;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.dbInstanceId = builder.dbInstanceId;
            this.scalingRulesEnable = builder.scalingRulesEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return scalingRulesEnable
         */
        public Boolean getScalingRulesEnable() {
            return this.scalingRulesEnable;
        }

        public static final class Builder {
            private String clusterId; 
            private String dbInstanceId; 
            private Boolean scalingRulesEnable; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterId = model.clusterId;
                this.dbInstanceId = model.dbInstanceId;
                this.scalingRulesEnable = model.scalingRulesEnable;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-pe33jc1nd01-be</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-7213cjv****</p>
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * <p>Indicates whether the scheduled scaling policy is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder scalingRulesEnable(Boolean scalingRulesEnable) {
                this.scalingRulesEnable = scalingRulesEnable;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
