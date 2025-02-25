// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSetStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataSetStatusResponseBody</p>
 */
public class GetDataSetStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("requestId")
    private String requestId;

    private GetDataSetStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.success = builder.success;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSetStatusResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
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
        private String msg; 
        private Boolean success; 
        private String requestId; 

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
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataSetStatusResponseBody build() {
            return new GetDataSetStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("createTime")
        private String createTime;

        @NameInMap("dataSetType")
        private Integer dataSetType;

        @NameInMap("datasetId")
        private Long datasetId;

        @NameInMap("idTypeDesc")
        private String idTypeDesc;

        @NameInMap("message")
        private String message;

        @NameInMap("name")
        private String name;

        @NameInMap("statusDesc")
        private String statusDesc;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSetType = builder.dataSetType;
            this.datasetId = builder.datasetId;
            this.idTypeDesc = builder.idTypeDesc;
            this.message = builder.message;
            this.name = builder.name;
            this.statusDesc = builder.statusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSetType
         */
        public Integer getDataSetType() {
            return this.dataSetType;
        }

        /**
         * @return datasetId
         */
        public Long getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return idTypeDesc
         */
        public String getIdTypeDesc() {
            return this.idTypeDesc;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public static final class Builder {
            private String createTime; 
            private Integer dataSetType; 
            private Long datasetId; 
            private String idTypeDesc; 
            private String message; 
            private String name; 
            private String statusDesc; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * dataSetType.
             */
            public Builder dataSetType(Integer dataSetType) {
                this.dataSetType = dataSetType;
                return this;
            }

            /**
             * datasetId.
             */
            public Builder datasetId(Long datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * idTypeDesc.
             */
            public Builder idTypeDesc(String idTypeDesc) {
                this.idTypeDesc = idTypeDesc;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * statusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
