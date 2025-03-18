// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribePopApiItemListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePopApiItemListResponseBody</p>
 */
public class DescribePopApiItemListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Names")
    private java.util.List<String> names;

    @com.aliyun.core.annotation.NameInMap("PopCode")
    private String popCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private DescribePopApiItemListResponseBody(Builder builder) {
        this.names = builder.names;
        this.popCode = builder.popCode;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePopApiItemListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return names
     */
    public java.util.List<String> getNames() {
        return this.names;
    }

    /**
     * @return popCode
     */
    public String getPopCode() {
        return this.popCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List<String> names; 
        private String popCode; 
        private String requestId; 
        private Long total; 
        private String version; 

        private Builder() {
        } 

        private Builder(DescribePopApiItemListResponseBody model) {
            this.names = model.names;
            this.popCode = model.popCode;
            this.requestId = model.requestId;
            this.total = model.total;
            this.version = model.version;
        } 

        /**
         * <p>The names of API operations.</p>
         */
        public Builder names(java.util.List<String> names) {
            this.names = names;
            return this;
        }

        /**
         * <p>The POP code of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>Sas</p>
         */
        public Builder popCode(String popCode) {
            this.popCode = popCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6336D603-7028-52DE-AD88-E34AA5248355</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The version number of the API for the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-03</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribePopApiItemListResponseBody build() {
            return new DescribePopApiItemListResponseBody(this);
        } 

    } 

}
