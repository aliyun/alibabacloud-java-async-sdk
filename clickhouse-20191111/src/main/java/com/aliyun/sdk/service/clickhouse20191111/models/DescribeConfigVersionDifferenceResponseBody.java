// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigVersionDifferenceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigVersionDifferenceResponseBody</p>
 */
public class DescribeConfigVersionDifferenceResponseBody extends TeaModel {
    @NameInMap("NewConfigXML")
    private String newConfigXML;

    @NameInMap("OldConfigXML")
    private String oldConfigXML;

    @NameInMap("RequestId")
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
         * NewConfigXML.
         */
        public Builder newConfigXML(String newConfigXML) {
            this.newConfigXML = newConfigXML;
            return this;
        }

        /**
         * OldConfigXML.
         */
        public Builder oldConfigXML(String oldConfigXML) {
            this.oldConfigXML = oldConfigXML;
            return this;
        }

        /**
         * RequestId.
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
