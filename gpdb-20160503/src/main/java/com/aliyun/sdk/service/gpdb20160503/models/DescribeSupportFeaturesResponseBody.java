// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeSupportFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupportFeaturesResponseBody</p>
 */
public class DescribeSupportFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportFeatureList")
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
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>63E5BE60-91FF-57F1-B873-7F1EB734B93D_2724</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The features supported by the instance. Valid values:</p>
         * <ul>
         * <li>sample_data: sample dataset. For more information, see <a href="https://help.aliyun.com/document_detail/452278.html">Sample dataset</a>.</li>
         * <li>diagnose_and_optimize: diagnostics and optimization. For more information, see <a href="https://help.aliyun.com/document_detail/323453.html">Diagnostics and optimization</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[ &quot;sample_data&quot;, &quot;diagnose_and_optimize&quot; ]</p>
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
