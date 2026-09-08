// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListOutboundNumbersOfUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListOutboundNumbersOfUserResponseBody</p>
 */
public class ListOutboundNumbersOfUserResponseBody extends TeaModel {
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

    private ListOutboundNumbersOfUserResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOutboundNumbersOfUserResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListOutboundNumbersOfUserResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOutboundNumbersOfUserResponseBody build() {
            return new ListOutboundNumbersOfUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOutboundNumbersOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListOutboundNumbersOfUserResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("ProviderCode")
        @Deprecated
        private String providerCode;

        @com.aliyun.core.annotation.NameInMap("ProviderDisplayName")
        @Deprecated
        private String providerDisplayName;

        @com.aliyun.core.annotation.NameInMap("ProviderShortName")
        private String providerShortName;

        @com.aliyun.core.annotation.NameInMap("ProviderType")
        private String providerType;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        private List(Builder builder) {
            this.city = builder.city;
            this.number = builder.number;
            this.provider = builder.provider;
            this.providerCode = builder.providerCode;
            this.providerDisplayName = builder.providerDisplayName;
            this.providerShortName = builder.providerShortName;
            this.providerType = builder.providerType;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return providerCode
         */
        public String getProviderCode() {
            return this.providerCode;
        }

        /**
         * @return providerDisplayName
         */
        public String getProviderDisplayName() {
            return this.providerDisplayName;
        }

        /**
         * @return providerShortName
         */
        public String getProviderShortName() {
            return this.providerShortName;
        }

        /**
         * @return providerType
         */
        public String getProviderType() {
            return this.providerType;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String city; 
            private String number; 
            private String provider; 
            private String providerCode; 
            private String providerDisplayName; 
            private String providerShortName; 
            private String providerType; 
            private String province; 

            private Builder() {
            } 

            private Builder(List model) {
                this.city = model.city;
                this.number = model.number;
                this.provider = model.provider;
                this.providerCode = model.providerCode;
                this.providerDisplayName = model.providerDisplayName;
                this.providerShortName = model.providerShortName;
                this.providerType = model.providerType;
                this.province = model.province;
            } 

            /**
             * <p>The city where the phone number is located.</p>
             * 
             * <strong>example:</strong>
             * <p>乐山</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>0830019****</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * Provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * ProviderCode.
             */
            public Builder providerCode(String providerCode) {
                this.providerCode = providerCode;
                return this;
            }

            /**
             * ProviderDisplayName.
             */
            public Builder providerDisplayName(String providerDisplayName) {
                this.providerDisplayName = providerDisplayName;
                return this;
            }

            /**
             * ProviderShortName.
             */
            public Builder providerShortName(String providerShortName) {
                this.providerShortName = providerShortName;
                return this;
            }

            /**
             * ProviderType.
             */
            public Builder providerType(String providerType) {
                this.providerType = providerType;
                return this;
            }

            /**
             * <p>The province where the phone number is located.</p>
             * 
             * <strong>example:</strong>
             * <p>四川</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOutboundNumbersOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListOutboundNumbersOfUserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>A list of phone numbers.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
