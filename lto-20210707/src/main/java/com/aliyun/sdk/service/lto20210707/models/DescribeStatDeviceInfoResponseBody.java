// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link DescribeStatDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStatDeviceInfoResponseBody</p>
 */
public class DescribeStatDeviceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeStatDeviceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStatDeviceInfoResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeStatDeviceInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeStatDeviceInfoResponseBody build() {
            return new DescribeStatDeviceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStatDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStatDeviceInfoResponseBody</p>
     */
    public static class BizChainList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedCount")
        private Integer authorizedCount;

        @com.aliyun.core.annotation.NameInMap("BizChainName")
        private String bizChainName;

        private BizChainList(Builder builder) {
            this.authorizedCount = builder.authorizedCount;
            this.bizChainName = builder.bizChainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizChainList create() {
            return builder().build();
        }

        /**
         * @return authorizedCount
         */
        public Integer getAuthorizedCount() {
            return this.authorizedCount;
        }

        /**
         * @return bizChainName
         */
        public String getBizChainName() {
            return this.bizChainName;
        }

        public static final class Builder {
            private Integer authorizedCount; 
            private String bizChainName; 

            private Builder() {
            } 

            private Builder(BizChainList model) {
                this.authorizedCount = model.authorizedCount;
                this.bizChainName = model.bizChainName;
            } 

            /**
             * AuthorizedCount.
             */
            public Builder authorizedCount(Integer authorizedCount) {
                this.authorizedCount = authorizedCount;
                return this;
            }

            /**
             * BizChainName.
             */
            public Builder bizChainName(String bizChainName) {
                this.bizChainName = bizChainName;
                return this;
            }

            public BizChainList build() {
                return new BizChainList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeStatDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStatDeviceInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizChainList")
        private java.util.List<BizChainList> bizChainList;

        @com.aliyun.core.annotation.NameInMap("DistributableCount")
        private Integer distributableCount;

        @com.aliyun.core.annotation.NameInMap("TotalAuthorizedCount")
        private Integer totalAuthorizedCount;

        private Data(Builder builder) {
            this.bizChainList = builder.bizChainList;
            this.distributableCount = builder.distributableCount;
            this.totalAuthorizedCount = builder.totalAuthorizedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizChainList
         */
        public java.util.List<BizChainList> getBizChainList() {
            return this.bizChainList;
        }

        /**
         * @return distributableCount
         */
        public Integer getDistributableCount() {
            return this.distributableCount;
        }

        /**
         * @return totalAuthorizedCount
         */
        public Integer getTotalAuthorizedCount() {
            return this.totalAuthorizedCount;
        }

        public static final class Builder {
            private java.util.List<BizChainList> bizChainList; 
            private Integer distributableCount; 
            private Integer totalAuthorizedCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizChainList = model.bizChainList;
                this.distributableCount = model.distributableCount;
                this.totalAuthorizedCount = model.totalAuthorizedCount;
            } 

            /**
             * BizChainList.
             */
            public Builder bizChainList(java.util.List<BizChainList> bizChainList) {
                this.bizChainList = bizChainList;
                return this;
            }

            /**
             * DistributableCount.
             */
            public Builder distributableCount(Integer distributableCount) {
                this.distributableCount = distributableCount;
                return this;
            }

            /**
             * TotalAuthorizedCount.
             */
            public Builder totalAuthorizedCount(Integer totalAuthorizedCount) {
                this.totalAuthorizedCount = totalAuthorizedCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
