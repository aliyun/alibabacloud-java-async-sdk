// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetOrgAndFactoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrgAndFactoryResponseBody</p>
 */
public class GetOrgAndFactoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetOrgAndFactoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrgAndFactoryResponseBody create() {
        return builder().build();
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private java.util.List<Data> data; 
        private Integer httpCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The code returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>data</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOrgAndFactoryResponseBody build() {
            return new GetOrgAndFactoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOrgAndFactoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrgAndFactoryResponseBody</p>
     */
    public static class FactoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("factoryId")
        private String factoryId;

        @com.aliyun.core.annotation.NameInMap("factoryName")
        private String factoryName;

        private FactoryList(Builder builder) {
            this.factoryId = builder.factoryId;
            this.factoryName = builder.factoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FactoryList create() {
            return builder().build();
        }

        /**
         * @return factoryId
         */
        public String getFactoryId() {
            return this.factoryId;
        }

        /**
         * @return factoryName
         */
        public String getFactoryName() {
            return this.factoryName;
        }

        public static final class Builder {
            private String factoryId; 
            private String factoryName; 

            /**
             * <p>The site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pn_95</p>
             */
            public Builder factoryId(String factoryId) {
                this.factoryId = factoryId;
                return this;
            }

            /**
             * <p>The site name.</p>
             * 
             * <strong>example:</strong>
             * <p>Ledi Industrial Park 1</p>
             */
            public Builder factoryName(String factoryName) {
                this.factoryName = factoryName;
                return this;
            }

            public FactoryList build() {
                return new FactoryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrgAndFactoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrgAndFactoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliyunPk")
        private String aliyunPk;

        @com.aliyun.core.annotation.NameInMap("factoryList")
        private java.util.List<FactoryList> factoryList;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("organizationName")
        private String organizationName;

        private Data(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.factoryList = builder.factoryList;
            this.organizationId = builder.organizationId;
            this.organizationName = builder.organizationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunPk
         */
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return factoryList
         */
        public java.util.List<FactoryList> getFactoryList() {
            return this.factoryList;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
        }

        public static final class Builder {
            private String aliyunPk; 
            private java.util.List<FactoryList> factoryList; 
            private String organizationId; 
            private String organizationName; 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1319617584664960</p>
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * <p>The sites.</p>
             */
            public Builder factoryList(java.util.List<FactoryList> factoryList) {
                this.factoryList = factoryList;
                return this;
            }

            /**
             * <p>The enterprise ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6265f42XXXX2fec150</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * <p>The enterprise name.</p>
             * 
             * <strong>example:</strong>
             * <p>Ledi Industrial Park</p>
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
