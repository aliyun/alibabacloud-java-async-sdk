// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigVersionDifferenceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigVersionDifferenceResponseBody</p>
 */
public class DescribeConfigVersionDifferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NewConfigXML")
    private String newConfigXML;

    @com.aliyun.core.annotation.NameInMap("OldConfigXML")
    private String oldConfigXML;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeConfigVersionDifferenceResponseBody(Builder builder) {
        this.newConfigXML = builder.newConfigXML;
        this.oldConfigXML = builder.oldConfigXML;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigVersionDifferenceResponseBody create() {
        return builder().build();
    }

    /**
     * @return newConfigXML
     */
    public String getNewConfigXML() {
        return this.newConfigXML;
    }

    /**
     * @return oldConfigXML
     */
    public String getOldConfigXML() {
        return this.oldConfigXML;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String newConfigXML; 
        private String oldConfigXML; 
        private String requestId; 

        /**
         * The values of the configuration parameters after the values of the configuration parameters are changed.
         */
        public Builder newConfigXML(String newConfigXML) {
            this.newConfigXML = newConfigXML;
            return this;
        }

        /**
         * The values of the configuration parameters before the values of the configuration parameters are changed.
         */
        public Builder oldConfigXML(String oldConfigXML) {
            this.oldConfigXML = oldConfigXML;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConfigVersionDifferenceResponseBody build() {
            return new DescribeConfigVersionDifferenceResponseBody(this);
        } 

    } 

}
