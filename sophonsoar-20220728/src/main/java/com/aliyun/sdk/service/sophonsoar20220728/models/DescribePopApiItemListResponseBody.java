// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePopApiItemListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePopApiItemListResponseBody</p>
 */
public class DescribePopApiItemListResponseBody extends TeaModel {
    @NameInMap("Names")
    private java.util.List < String > names;

    @NameInMap("PopCode")
    private String popCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    @NameInMap("Version")
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

    /**
     * @return names
     */
    public java.util.List < String > getNames() {
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
        private java.util.List < String > names; 
        private String popCode; 
        private String requestId; 
        private Long total; 
        private String version; 

        /**
         * The names of API operations.
         */
        public Builder names(java.util.List < String > names) {
            this.names = names;
            return this;
        }

        /**
         * The POP code of the Alibaba Cloud service.
         */
        public Builder popCode(String popCode) {
            this.popCode = popCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * The version number of the API for the Alibaba Cloud service.
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
