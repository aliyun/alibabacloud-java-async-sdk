// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CitySearchResponseBody} extends {@link TeaModel}
 *
 * <p>CitySearchResponseBody</p>
 */
public class CitySearchResponseBody extends TeaModel {
    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result_code")
    private Integer resultCode;

    @NameInMap("result_msg")
    private String resultMsg;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private CitySearchResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CitySearchResponseBody create() {
        return builder().build();
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
     * @return resultCode
     */
    public Integer getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
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
        private Module module; 
        private String requestId; 
        private Integer resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        /**
         * ����ֵ������˷��أ�û�н�������쳣�����ؿ�
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
         * �������
         */
        public Builder resultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ��ע������ı�ע����Խ����˵��
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * �ɹ���ʶ���ɷ�������ã������쳣ʱΪfalse�����Ϊnull����Ϊfalse��
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CitySearchResponseBody build() {
            return new CitySearchResponseBody(this);
        } 

    } 

    public static class Cities extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("name")
        private String name;

        @NameInMap("region")
        private Integer region;

        private Cities(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cities create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private Integer region; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * region.
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            public Cities build() {
                return new Cities(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("cities")
        private java.util.List < Cities> cities;

        private Module(Builder builder) {
            this.cities = builder.cities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return cities
         */
        public java.util.List < Cities> getCities() {
            return this.cities;
        }

        public static final class Builder {
            private java.util.List < Cities> cities; 

            /**
             * cities.
             */
            public Builder cities(java.util.List < Cities> cities) {
                this.cities = cities;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
