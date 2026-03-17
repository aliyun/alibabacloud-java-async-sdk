// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeBindableSmartAccessGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBindableSmartAccessGatewaysResponseBody</p>
 */
public class DescribeBindableSmartAccessGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmartAccessGateways")
    private SmartAccessGateways smartAccessGateways;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBindableSmartAccessGatewaysResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.smartAccessGateways = builder.smartAccessGateways;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBindableSmartAccessGatewaysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smartAccessGateways
     */
    public SmartAccessGateways getSmartAccessGateways() {
        return this.smartAccessGateways;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SmartAccessGateways smartAccessGateways; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBindableSmartAccessGatewaysResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.smartAccessGateways = model.smartAccessGateways;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9731C2F5-B9A4-42FD-AFD2-361A403E6E85</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the SAG instance.</p>
         */
        public Builder smartAccessGateways(SmartAccessGateways smartAccessGateways) {
            this.smartAccessGateways = smartAccessGateways;
            return this;
        }

        /**
         * <p>The total number of SAG instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBindableSmartAccessGatewaysResponseBody build() {
            return new DescribeBindableSmartAccessGatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBindableSmartAccessGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBindableSmartAccessGatewaysResponseBody</p>
     */
    public static class SmartAccessGateway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        @com.aliyun.core.annotation.NameInMap("SmartAGUid")
        private Long smartAGUid;

        private SmartAccessGateway(Builder builder) {
            this.name = builder.name;
            this.smartAGId = builder.smartAGId;
            this.smartAGUid = builder.smartAGUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmartAccessGateway create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        /**
         * @return smartAGUid
         */
        public Long getSmartAGUid() {
            return this.smartAGUid;
        }

        public static final class Builder {
            private String name; 
            private String smartAGId; 
            private Long smartAGUid; 

            private Builder() {
            } 

            private Builder(SmartAccessGateway model) {
                this.name = model.name;
                this.smartAGId = model.smartAGId;
                this.smartAGUid = model.smartAGUid;
            } 

            /**
             * <p>The name of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sdggd111</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-00uc4vgxch1zsu****</p>
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            /**
             * <p>The user ID (UID) of the Alibaba Cloud account to which the SAG instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>168840159596****</p>
             */
            public Builder smartAGUid(Long smartAGUid) {
                this.smartAGUid = smartAGUid;
                return this;
            }

            public SmartAccessGateway build() {
                return new SmartAccessGateway(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBindableSmartAccessGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBindableSmartAccessGatewaysResponseBody</p>
     */
    public static class SmartAccessGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmartAccessGateway")
        private java.util.List<SmartAccessGateway> smartAccessGateway;

        private SmartAccessGateways(Builder builder) {
            this.smartAccessGateway = builder.smartAccessGateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmartAccessGateways create() {
            return builder().build();
        }

        /**
         * @return smartAccessGateway
         */
        public java.util.List<SmartAccessGateway> getSmartAccessGateway() {
            return this.smartAccessGateway;
        }

        public static final class Builder {
            private java.util.List<SmartAccessGateway> smartAccessGateway; 

            private Builder() {
            } 

            private Builder(SmartAccessGateways model) {
                this.smartAccessGateway = model.smartAccessGateway;
            } 

            /**
             * SmartAccessGateway.
             */
            public Builder smartAccessGateway(java.util.List<SmartAccessGateway> smartAccessGateway) {
                this.smartAccessGateway = smartAccessGateway;
                return this;
            }

            public SmartAccessGateways build() {
                return new SmartAccessGateways(this);
            } 

        } 

    }
}
