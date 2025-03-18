// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link GetEndpointAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetEndpointAttributeResponseBody</p>
 */
public class GetEndpointAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetEndpointAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEndpointAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetEndpointAttributeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06273500-249F-5863-121D-74D51123****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEndpointAttributeResponseBody build() {
            return new GetEndpointAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEndpointAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEndpointAttributeResponseBody</p>
     */
    public static class CidrList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclStrategy")
        private String aclStrategy;

        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        private CidrList(Builder builder) {
            this.aclStrategy = builder.aclStrategy;
            this.cidr = builder.cidr;
            this.createTime = builder.createTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CidrList create() {
            return builder().build();
        }

        /**
         * @return aclStrategy
         */
        public String getAclStrategy() {
            return this.aclStrategy;
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        public static final class Builder {
            private String aclStrategy; 
            private String cidr; 
            private Long createTime; 

            private Builder() {
            } 

            private Builder(CidrList model) {
                this.aclStrategy = model.aclStrategy;
                this.cidr = model.cidr;
                this.createTime = model.createTime;
            } 

            /**
             * <p>The ACL policy. Valid values:</p>
             * <ul>
             * <li><strong>allow</strong>: indicates that the current endpoint allows access from the corresponding CIDR block. (Only allow is supported.)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder aclStrategy(String aclStrategy) {
                this.aclStrategy = aclStrategy;
                return this;
            }

            /**
             * <p>The CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>172.18.0.0/24</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1701951224000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            public CidrList build() {
                return new CidrList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEndpointAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEndpointAttributeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrList")
        private java.util.List<CidrList> cidrList;

        @com.aliyun.core.annotation.NameInMap("EndpointEnabled")
        private Boolean endpointEnabled;

        private Data(Builder builder) {
            this.cidrList = builder.cidrList;
            this.endpointEnabled = builder.endpointEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cidrList
         */
        public java.util.List<CidrList> getCidrList() {
            return this.cidrList;
        }

        /**
         * @return endpointEnabled
         */
        public Boolean getEndpointEnabled() {
            return this.endpointEnabled;
        }

        public static final class Builder {
            private java.util.List<CidrList> cidrList; 
            private Boolean endpointEnabled; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cidrList = model.cidrList;
                this.endpointEnabled = model.endpointEnabled;
            } 

            /**
             * <p>The list of CIDR block.</p>
             */
            public Builder cidrList(java.util.List<CidrList> cidrList) {
                this.cidrList = cidrList;
                return this;
            }

            /**
             * <p>Specifies whether the endpoint is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder endpointEnabled(Boolean endpointEnabled) {
                this.endpointEnabled = endpointEnabled;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
