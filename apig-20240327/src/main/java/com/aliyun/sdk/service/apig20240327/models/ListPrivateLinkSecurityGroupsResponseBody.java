// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListPrivateLinkSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateLinkSecurityGroupsResponseBody</p>
 */
public class ListPrivateLinkSecurityGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListPrivateLinkSecurityGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateLinkSecurityGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPrivateLinkSecurityGroupsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
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
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>479AE38F-A574-52F7-87EA-E91199999F9E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrivateLinkSecurityGroupsResponseBody build() {
            return new ListPrivateLinkSecurityGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateLinkSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateLinkSecurityGroupsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("securityGroupName")
        private String securityGroupName;

        @com.aliyun.core.annotation.NameInMap("serviceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Items(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
            this.serviceManaged = builder.serviceManaged;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private String securityGroupName; 
            private Boolean serviceManaged; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.securityGroupId = model.securityGroupId;
                this.securityGroupName = model.securityGroupName;
                this.serviceManaged = model.serviceManaged;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1ftp5sm9os***</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The security group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Product Center Cluster Security Group</p>
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            /**
             * <p>Specifies whether the resource is created by a service account. Valid values:</p>
             * <ul>
             * <li>0: The resource is not created by a service account.</li>
             * <li>1: The resource is created by a service account.</li>
             * </ul>
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf61resqa9am***</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrivateLinkSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateLinkSecurityGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("maxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("nextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.items = builder.items;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The source information.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The maximum number of results returned for this query.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token for the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
