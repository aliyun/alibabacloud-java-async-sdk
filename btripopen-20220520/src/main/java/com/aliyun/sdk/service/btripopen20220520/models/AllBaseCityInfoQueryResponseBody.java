// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link AllBaseCityInfoQueryResponseBody} extends {@link TeaModel}
 *
 * <p>AllBaseCityInfoQueryResponseBody</p>
 */
public class AllBaseCityInfoQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private AllBaseCityInfoQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllBaseCityInfoQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>210f079e16603757182131635d866a</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public AllBaseCityInfoQueryResponseBody build() {
            return new AllBaseCityInfoQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AllBaseCityInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>AllBaseCityInfoQueryResponseBody</p>
     */
    public static class AllCityBaseInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adcode")
        private String adcode;

        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_level")
        private String cityLevel;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("cn_name_tree")
        private String cnNameTree;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("other_name_list")
        private java.util.List<String> otherNameList;

        private AllCityBaseInfoList(Builder builder) {
            this.adcode = builder.adcode;
            this.cityCode = builder.cityCode;
            this.cityLevel = builder.cityLevel;
            this.cityName = builder.cityName;
            this.cnNameTree = builder.cnNameTree;
            this.id = builder.id;
            this.otherNameList = builder.otherNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllCityBaseInfoList create() {
            return builder().build();
        }

        /**
         * @return adcode
         */
        public String getAdcode() {
            return this.adcode;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityLevel
         */
        public String getCityLevel() {
            return this.cityLevel;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return cnNameTree
         */
        public String getCnNameTree() {
            return this.cnNameTree;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return otherNameList
         */
        public java.util.List<String> getOtherNameList() {
            return this.otherNameList;
        }

        public static final class Builder {
            private String adcode; 
            private String cityCode; 
            private String cityLevel; 
            private String cityName; 
            private String cnNameTree; 
            private Long id; 
            private java.util.List<String> otherNameList; 

            /**
             * adcode.
             */
            public Builder adcode(String adcode) {
                this.adcode = adcode;
                return this;
            }

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_level.
             */
            public Builder cityLevel(String cityLevel) {
                this.cityLevel = cityLevel;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * cn_name_tree.
             */
            public Builder cnNameTree(String cnNameTree) {
                this.cnNameTree = cnNameTree;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * other_name_list.
             */
            public Builder otherNameList(java.util.List<String> otherNameList) {
                this.otherNameList = otherNameList;
                return this;
            }

            public AllCityBaseInfoList build() {
                return new AllCityBaseInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AllBaseCityInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>AllBaseCityInfoQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("all_city_base_info_list")
        private java.util.List<AllCityBaseInfoList> allCityBaseInfoList;

        private Module(Builder builder) {
            this.allCityBaseInfoList = builder.allCityBaseInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return allCityBaseInfoList
         */
        public java.util.List<AllCityBaseInfoList> getAllCityBaseInfoList() {
            return this.allCityBaseInfoList;
        }

        public static final class Builder {
            private java.util.List<AllCityBaseInfoList> allCityBaseInfoList; 

            /**
             * all_city_base_info_list.
             */
            public Builder allCityBaseInfoList(java.util.List<AllCityBaseInfoList> allCityBaseInfoList) {
                this.allCityBaseInfoList = allCityBaseInfoList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
