// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUatDataListResponseBody} extends {@link TeaModel}
 *
 * <p>GetUatDataListResponseBody</p>
 */
public class GetUatDataListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rt")
    private Long rt;

    @NameInMap("Success")
    private Boolean success;

    private GetUatDataListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.rt = builder.rt;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUatDataListResponseBody create() {
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
    public java.util.List < Data> getData() {
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
     * @return rt
     */
    public Long getRt() {
        return this.rt;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Long rt; 
        private Boolean success; 

        /**
         * 结果码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 结果
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 结果描述
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求链路ID，如POP请求进来的requestId，返回时原样返回
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务端处理耗时，ms
         */
        public Builder rt(Long rt) {
            this.rt = rt;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUatDataListResponseBody build() {
            return new GetUatDataListResponseBody(this);
        } 

    } 

    public static class DsList extends TeaModel {
        @NameInMap("DsData")
        private Long dsData;

        @NameInMap("DsDay")
        private Long dsDay;

        private DsList(Builder builder) {
            this.dsData = builder.dsData;
            this.dsDay = builder.dsDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DsList create() {
            return builder().build();
        }

        /**
         * @return dsData
         */
        public Long getDsData() {
            return this.dsData;
        }

        /**
         * @return dsDay
         */
        public Long getDsDay() {
            return this.dsDay;
        }

        public static final class Builder {
            private Long dsData; 
            private Long dsDay; 

            /**
             * DsData.
             */
            public Builder dsData(Long dsData) {
                this.dsData = dsData;
                return this;
            }

            /**
             * DsDay.
             */
            public Builder dsDay(Long dsDay) {
                this.dsDay = dsDay;
                return this;
            }

            public DsList build() {
                return new DsList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DsList")
        private java.util.List < DsList> dsList;

        @NameInMap("SpecType")
        private String specType;

        private Data(Builder builder) {
            this.dsList = builder.dsList;
            this.specType = builder.specType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dsList
         */
        public java.util.List < DsList> getDsList() {
            return this.dsList;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        public static final class Builder {
            private java.util.List < DsList> dsList; 
            private String specType; 

            /**
             * DsList.
             */
            public Builder dsList(java.util.List < DsList> dsList) {
                this.dsList = dsList;
                return this;
            }

            /**
             * 规格类型
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
