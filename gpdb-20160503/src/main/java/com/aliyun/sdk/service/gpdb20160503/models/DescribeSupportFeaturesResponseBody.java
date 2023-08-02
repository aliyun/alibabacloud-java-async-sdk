// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupportFeaturesResponseBody</p>
 */
public class DescribeSupportFeaturesResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportFeatureList")
    private String supportFeatureList;

    private DescribeSupportFeaturesResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.requestId = builder.requestId;
        this.supportFeatureList = builder.supportFeatureList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportFeaturesResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportFeatureList
     */
    public String getSupportFeatureList() {
        return this.supportFeatureList;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String requestId; 
        private String supportFeatureList; 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The features supported by the instance. Valid values:
         * <p>
         * 
         * *   sample_data: sample dataset. For more information, see [Sample dataset](~~452278~~).
         * *   diagnose_and_optimize: diagnostics and optimization. For more information, see [Diagnostics and optimization](~~323453~~).
         */
        public Builder supportFeatureList(String supportFeatureList) {
            this.supportFeatureList = supportFeatureList;
            return this;
        }

        public DescribeSupportFeaturesResponseBody build() {
            return new DescribeSupportFeaturesResponseBody(this);
        } 

    } 

}
